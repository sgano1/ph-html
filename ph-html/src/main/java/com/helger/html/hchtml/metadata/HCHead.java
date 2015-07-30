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
package com.helger.html.hchtml.metadata;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mime.CMimeType;
import com.helger.commons.state.EChange;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.config.HCConsistencyChecker;
import com.helger.html.hc.special.HCSpecialNodeHandler;
import com.helger.html.hcapi.IHCConversionSettingsToNode;
import com.helger.html.hcapi.IHCNode;
import com.helger.html.hchtml.AbstractHCElement;
import com.helger.html.hchtml.HC_Target;
import com.helger.html.hchtml.IHCCSSNode;
import com.helger.html.meta.IMetaElement;
import com.helger.html.meta.MetaElementList;

/**
 * Represents an HTML &lt;head&gt; element
 *
 * @author Philip Helger
 */
public class HCHead extends AbstractHCElement <HCHead>
{
  private String m_sProfile;
  private final HCTitle m_aPageTitle = new HCTitle ();
  private final HCBase m_aBase = new HCBase ();
  private final MetaElementList m_aMetaElements = new MetaElementList ();
  private final List <HCLink> m_aLinks = new ArrayList <HCLink> ();
  private final List <IHCNode> m_aCSS = new ArrayList <IHCNode> ();
  private final List <IHCNode> m_aJS = new ArrayList <IHCNode> ();

  public HCHead ()
  {
    super (EHTMLElement.HEAD);
  }

  //
  // Head fields/attributes
  //

  @Nullable
  public String getProfile ()
  {
    return m_sProfile;
  }

  @Nonnull
  public HCHead setProfile (@Nullable final String sProfile)
  {
    m_sProfile = sProfile;
    return this;
  }

  @Nullable
  public String getPageTitle ()
  {
    return m_aPageTitle.getContent ();
  }

  @Nonnull
  public HCHead setPageTitle (@Nullable final String sPageTitle)
  {
    m_aPageTitle.setContent (sPageTitle);
    return this;
  }

  @Nullable
  public String getBaseHref ()
  {
    return m_aBase.getHref ();
  }

  @Nonnull
  public HCHead setBaseHref (@Nullable final String sBaseHref)
  {
    m_aBase.setHref (sBaseHref);
    return this;
  }

  @Nullable
  public HC_Target getBaseTarget ()
  {
    return m_aBase.getTarget ();
  }

  @Nonnull
  public HCHead setBaseTarget (@Nullable final HC_Target aTarget)
  {
    m_aBase.setTarget (aTarget);
    return this;
  }

  //
  // Meta element handling
  //

  @Nonnull
  @ReturnsMutableObject ("design")
  public MetaElementList getMetaElementList ()
  {
    return m_aMetaElements;
  }

  //
  // Link handling
  //

  @Nonnull
  public HCHead setShortcutIconHref (@Nullable final ISimpleURL aShortcutIconHref)
  {
    if (aShortcutIconHref == null)
    {
      // Remove the 2 link types again
      removeLinkOfRel (EHCLinkType.SHORTCUT_ICON);
      removeLinkOfRel (EHCLinkType.ICON);
    }
    else
    {
      addLink (new HCLink ().setRel (EHCLinkType.SHORTCUT_ICON).setHref (aShortcutIconHref));
      // Required for IE:
      addLink (new HCLink ().setRel (EHCLinkType.ICON).setType (CMimeType.IMAGE_ICON).setHref (aShortcutIconHref));
    }
    return this;
  }

  /**
   * Add a link object to the head.
   *
   * @param aLink
   *        The link to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addLink (@Nonnull final HCLink aLink)
  {
    ValueEnforcer.notNull (aLink, "Link");
    m_aLinks.add (aLink);
    return this;
  }

  /**
   * Add a link object to the head at the specified position.
   *
   * @param nIndex
   *        The index where the links should be added (counting link elements
   *        only)
   * @param aLink
   *        The link to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addLink (@Nonnegative final int nIndex, @Nonnull final HCLink aLink)
  {
    ValueEnforcer.notNull (aLink, "Link");
    m_aLinks.add (nIndex, aLink);
    return this;
  }

  @Nonnull
  public EChange removeLinkOfRel (@Nonnull final IHCLinkType aLinkType)
  {
    int i = 0;
    for (final HCLink aLink : m_aLinks)
    {
      if (aLink.getRel ().equals (aLinkType))
      {
        m_aLinks.remove (i);
        return EChange.CHANGED;
      }
      ++i;
    }
    return EChange.UNCHANGED;
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <HCLink> getAllLinks ()
  {
    return CollectionHelper.newList (m_aLinks);
  }

  @Nonnegative
  public int getLinkCount ()
  {
    return m_aLinks.size ();
  }

  //
  // CSS handling
  //

  @Nonnull
  public HCHead addCSS (@Nonnull final IHCNode aCSS)
  {
    ValueEnforcer.notNull (aCSS, "CSS");
    if (!HCSpecialNodeHandler.isCSSNode (aCSS))
      throw new IllegalArgumentException (aCSS + " is not a valid CSS node!");
    m_aCSS.add (aCSS);
    return this;
  }

  @Nonnull
  public HCHead addCSS (@Nonnegative final int nIndex, @Nonnull final IHCNode aCSS)
  {
    ValueEnforcer.notNull (aCSS, "CSS");
    if (!HCSpecialNodeHandler.isCSSNode (aCSS))
      throw new IllegalArgumentException (aCSS + " is not a valid CSS node!");
    m_aCSS.add (nIndex, aCSS);
    return this;
  }

  @Nonnegative
  public int getCSSCount ()
  {
    return m_aCSS.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllCSSNodes ()
  {
    return CollectionHelper.newList (m_aCSS);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllAndRemoveAllCSSNodes ()
  {
    final List <IHCNode> ret = CollectionHelper.newList (m_aCSS);
    m_aCSS.clear ();
    return ret;
  }

  @Nonnull
  public HCHead removeAllCSS ()
  {
    m_aCSS.clear ();
    return this;
  }

  //
  // JS handling
  //

  /**
   * Append some JavaScript code
   *
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addJS (@Nonnull final IHCNode aJS)
  {
    ValueEnforcer.notNull (aJS, "JS");
    if (!HCSpecialNodeHandler.isJSNode (aJS))
      throw new IllegalArgumentException (aJS + " is not a valid JS node!");
    m_aJS.add (aJS);
    return this;
  }

  /**
   * Append some JavaScript code at the specified index
   *
   * @param nIndex
   *        The index where the JS should be added (counting only JS elements)
   * @param aJS
   *        The JS to be added. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  public HCHead addJS (@Nonnegative final int nIndex, @Nonnull final IHCNode aJS)
  {
    ValueEnforcer.notNull (aJS, "JS");
    if (!HCSpecialNodeHandler.isJSNode (aJS))
      throw new IllegalArgumentException (aJS + " is not a valid JS node!");
    m_aJS.add (nIndex, aJS);
    return this;
  }

  /**
   * @return The number of contained JS elements
   */
  @Nonnegative
  public int getJSCount ()
  {
    return m_aJS.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllJSNodes ()
  {
    return CollectionHelper.newList (m_aJS);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCNode> getAllAndRemoveAllJSNodes ()
  {
    final List <IHCNode> ret = CollectionHelper.newList (m_aJS);
    m_aJS.clear ();
    return ret;
  }

  @Nonnull
  public HCHead removeAllJS ()
  {
    m_aJS.clear ();
    return this;
  }

  //
  // Code generation
  //

  @OverrideOnDemand
  protected void emitLinks (@Nonnull final IMicroElement eHead,
                            @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final HCLink aLink : m_aLinks)
      eHead.appendChild (aLink.convertToMicroNode (aConversionSettings));
  }

  @OverrideOnDemand
  protected void emitCSS (@Nonnull final IMicroElement eHead,
                          @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    int nCSSExternals = 0;
    for (final IHCNode aCSS : m_aCSS)
    {
      if (aCSS instanceof IHCCSSNode && !((IHCCSSNode) aCSS).isInlineCSS ())
        ++nCSSExternals;
      eHead.appendChild (aCSS.convertToMicroNode (aConversionSettings));
    }

    if (aConversionSettings.areConsistencyChecksEnabled ())
    {
      // This check must be done here because not all elements where available
      // at the time of regular consistency checking
      HCConsistencyChecker.checkForMaximumCSSResources (nCSSExternals);
    }
  }

  @OverrideOnDemand
  protected void emitJS (@Nonnull final IMicroElement eHead,
                         @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    for (final IHCNode aJS : m_aJS)
      eHead.appendChild (aJS.convertToMicroNode (aConversionSettings));
  }

  @Override
  protected void fillMicroElement (@Nonnull final IMicroElement eHead,
                                   @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (eHead, aConversionSettings);

    if (StringHelper.hasText (m_sProfile))
      eHead.setAttribute (CHTMLAttributes.PROFILE, m_sProfile);

    // Append meta element first for charset encoding!
    for (final IMetaElement aMetaElement : m_aMetaElements.getAllMetaElements ())
      eHead.appendChild (aMetaElement.convertToNode (aConversionSettings));

    // page title
    eHead.appendChild (m_aPageTitle.convertToMicroNode (aConversionSettings));

    // base
    eHead.appendChild (m_aBase.convertToMicroNode (aConversionSettings));

    // links
    emitLinks (eHead, aConversionSettings);

    // CSS stuff
    emitCSS (eHead, aConversionSettings);

    // JS files
    emitJS (eHead, aConversionSettings);

    // Ensure tag is not self-closed
    if (!eHead.hasChildren () && EHTMLElement.HEAD.mayNotBeSelfClosed ())
      eHead.appendText ("");
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    // Use the page title as plain text
    return m_aPageTitle.getPlainText ();
  }

  @Override
  @Nullable
  public List <? extends IHCNode> getAllChildren ()
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    ret.add (m_aPageTitle);
    ret.add (m_aBase);
    ret.addAll (m_aLinks);
    ret.addAll (m_aCSS);
    ret.addAll (m_aJS);
    return ret;
  }

  @Override
  @Nullable
  public IHCNode getChildAtIndex (@Nonnegative final int nIndex)
  {
    if (nIndex == 0)
      return m_aPageTitle;
    if (nIndex == 1)
      return m_aBase;

    int nStart = 2;
    int nEnd = nStart + m_aLinks.size ();
    if (nIndex >= nStart && nIndex < nEnd)
      return m_aLinks.get (nIndex - nStart);

    nStart = nEnd;
    nEnd = nStart + m_aCSS.size ();
    if (nIndex >= nStart && nIndex < nEnd)
      return m_aCSS.get (nIndex - nStart);

    nStart = nEnd;
    nEnd = nStart + m_aJS.size ();
    if (nIndex >= nStart && nIndex < nEnd)
      return m_aJS.get (nIndex - nStart);

    return null;
  }

  @Override
  @Nullable
  public IHCNode getFirstChild ()
  {
    return m_aPageTitle;
  }

  @Override
  @Nullable
  public IHCNode getLastChild ()
  {
    if (!m_aJS.isEmpty ())
      return CollectionHelper.getLastElement (m_aJS);
    if (!m_aCSS.isEmpty ())
      return CollectionHelper.getLastElement (m_aCSS);
    if (!m_aLinks.isEmpty ())
      return CollectionHelper.getLastElement (m_aLinks);
    return m_aBase;
  }

  @Override
  public boolean hasChildren ()
  {
    return true;
  }

  @Override
  public int getChildCount ()
  {
    return 1 + 1 + m_aLinks.size () + m_aCSS.size () + m_aJS.size ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("profile", m_sProfile)
                            .append ("pageTitle", m_aPageTitle)
                            .append ("base", m_aBase)
                            .appendIfNotNull ("metaElements", m_aMetaElements)
                            .appendIfNotNull ("links", m_aLinks)
                            .appendIfNotNull ("CSS", m_aCSS)
                            .appendIfNotNull ("JS", m_aJS)
                            .toString ();
  }
}
