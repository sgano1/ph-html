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
package com.helger.html.hc.html;

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
import com.helger.html.hc.EHCNodeState;
import com.helger.html.hc.HCHelper;
import com.helger.html.hc.IHCHasChildren;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.api.EHCTextDirection;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCElement;
import com.helger.html.hc.special.HCSpecialNodeHandler;

/**
 * The node that represents a full HTML document.
 *
 * @author Philip Helger
 */
public class HCHtml extends AbstractHCElement <HCHtml>implements IHCHasChildren
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

  @Nonnull
  @ReturnsMutableCopy
  public List <? extends IHCNode> getAllChildren ()
  {
    return CollectionHelper.newList (m_aHead, m_aBody);
  }

  @Nullable
  public IHCNode getChildAtIndex (final int nIndex)
  {
    if (nIndex == 0)
      return m_aHead;
    if (nIndex == 1)
      return m_aBody;
    return null;
  }

  @Nonnull
  public IHCNode getFirstChild ()
  {
    return m_aHead;
  }

  @Nonnull
  public IHCNode getLastChild ()
  {
    return m_aBody;
  }

  public boolean hasChildren ()
  {
    return false;
  }

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

  @Nullable
  public IMicroNode customizeAndConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (getNodeState ().equals (EHCNodeState.INITIAL))
    {
      // 1. Apply customization to the whole tree
      HCHelper.customizeNodes (this, m_aBody, aConversionSettings);

      // 2. Finish node creation
      HCHelper.finalizeAndRegisterResources (this, m_aBody, aConversionSettings);

      // Extract all out-of-band nodes
      if (aConversionSettings.isExtractOutOfBandNodes ())
      {
        // Extract all out-of-band nodes
        final List <IHCNode> aExtractedOutOfBandNodes = HCSpecialNodeHandler.recursiveExtractAndRemoveOutOfBandNodes (m_aBody);

        // Call out-of-band node handler
        aConversionSettings.getCustomizer ().handleOutOfBandNodes (aExtractedOutOfBandNodes, m_aHead, m_aBody);
      }
    }

    // 3. Convert to micro node
    return convertToMicroNode (aConversionSettings);
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
