/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.html.hchtml.base;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.microdom.IMicroDocument;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.microdom.MicroDocument;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.EHTMLElement;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.special.HCSpecialNodeHandler;
import com.helger.html.hcapi.IHCConversionSettingsToNode;
import com.helger.html.hcapi.IHCNode;
import com.helger.html.hchtml.AbstractHCElement;
import com.helger.html.hchtml.EHCTextDirection;
import com.helger.html.hchtml.metadata.HCHead;
import com.helger.html.hchtml.metadata.HCLink;
import com.helger.html.hchtml.script.IHCScriptInline;
import com.helger.html.hchtml.sections.HCBody;

/**
 * The node that represents a full HTML document.
 *
 * @author Philip Helger
 */
public class HCHtml extends AbstractHCElement <HCHtml>
{
  private final HCHead m_aHead;
  private final HCBody m_aBody;

  /**
   * Create a new HTML object
   */
  public HCHtml ()
  {
    this (new HCHead (), new HCBody ());
  }

  public HCHtml (@Nonnull final HCHead aHead, @Nonnull final HCBody aBody)
  {
    super (EHTMLElement.HTML);
    m_aHead = ValueEnforcer.notNull (aHead, "Head");
    m_aBody = ValueEnforcer.notNull (aBody, "Body");

    // Set default direction
    setDirection (EHCTextDirection.LTR);
  }

  @Nonnull
  public final HCHead getHead ()
  {
    return m_aHead;
  }

  @Nonnull
  public final HCBody getBody ()
  {
    return m_aBody;
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public List <? extends IHCNode> getAllChildren ()
  {
    return CollectionHelper.<IHCNode> newList (m_aHead, m_aBody);
  }

  @Override
  @Nullable
  public IHCNode getChildAtIndex (final int nIndex)
  {
    if (nIndex == 0)
      return m_aHead;
    if (nIndex == 1)
      return m_aBody;
    return null;
  }

  @Override
  @Nonnull
  public IHCNode getFirstChild ()
  {
    return m_aHead;
  }

  @Override
  @Nonnull
  public IHCNode getLastChild ()
  {
    return m_aBody;
  }

  @Override
  public boolean hasChildren ()
  {
    return true;
  }

  @Override
  public int getChildCount ()
  {
    return 2;
  }

  @Override
  @Nonnull
  protected final IMicroDocument internalConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    final EHTMLVersion eHTMLVersion = aConversionSettings.getHTMLVersion ();

    // Note: we need to clone the doctype, because otherwise the object would
    // already have a parent assigned if "getAsNode" is called more than once!
    final IMicroDocument aDoc = new MicroDocument (eHTMLVersion.getDocType ().getClone ());
    final IMicroElement aRoot = aDoc.appendElement (eHTMLVersion.getNamespaceURI (),
                                                    eHTMLVersion.getDocType ().getQualifiedName ());
    fillMicroElement (aRoot, aConversionSettings);

    // Use the getter, to ensure the elements are not null
    final IMicroNode eBody = m_aBody.convertToMicroNode (aConversionSettings);
    aRoot.appendChild (eBody);

    // Create head after body but insert it before the body
    final IMicroNode eHead = m_aHead.convertToMicroNode (aConversionSettings);
    aRoot.insertAtIndex (0, eHead);

    // Done!
    return aDoc;
  }

  public void extractAndReorderOutOfBandNodes ()
  {
    // Extract all out-of-band nodes
    final List <IHCNode> aExtractedOutOfBandNodes = HCSpecialNodeHandler.recursiveExtractAndRemoveOutOfBandNodes (m_aBody);

    // Remember the body index where to append OOB nodes to
    int nBodyNodeIndex = m_aBody.getChildCount ();

    // Add all existing JS and CSS nodes from the head, as they are known to be
    // out-of-band
    final List <IHCNode> aCompleteOOBList = new ArrayList <IHCNode> ();
    aCompleteOOBList.addAll (m_aHead.getAllAndRemoveAllJSNodes ());
    aCompleteOOBList.addAll (m_aHead.getAllAndRemoveAllCSSNodes ());
    aCompleteOOBList.addAll (aExtractedOutOfBandNodes);

    // First merge all JS and CSS nodes (and keep document.ready() as it is)
    final boolean bKeepOnDocumentReady = true;
    final List <IHCNode> aMergedOOBNodes = HCSpecialNodeHandler.getMergedInlineCSSAndJSNodes (aCompleteOOBList,
                                                                                              bKeepOnDocumentReady);

    // And now move either to head or body
    for (final IHCNode aNode : aMergedOOBNodes)
    {
      // Node for the body?
      if (HCSpecialNodeHandler.isJSNode (aNode))
      {
        // It's a body node
        if (aNode instanceof IHCScriptInline <?> && !((IHCScriptInline <?>) aNode).isEmitAfterFiles ())
        {
          // Add inline code before files
          m_aBody.addChild (nBodyNodeIndex, aNode);
          nBodyNodeIndex++;
        }
        else
        {
          // Append in order
          m_aBody.addChild (aNode);
        }
      }
      else
      {
        // It's a head node
        if (HCSpecialNodeHandler.isCSSNode (aNode))
          m_aHead.addCSS (aNode);
        else
          if (HCSpecialNodeHandler.isJSNode (aNode))
            m_aHead.addJS (aNode);
          else
            if (aNode instanceof HCLink)
            {
              // Manually add all non-stylesheet LINK elements
              m_aHead.addLink ((HCLink) aNode);
            }
            else
              throw new IllegalStateException ("Found illegal out-of-band head node: " + aNode);
      }
    }
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return StringHelper.getConcatenatedOnDemand (m_aHead.getPlainText (), " ", m_aBody.getPlainText ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("head", m_aHead)
                            .appendIfNotNull ("body", m_aBody)
                            .toString ();
  }
}