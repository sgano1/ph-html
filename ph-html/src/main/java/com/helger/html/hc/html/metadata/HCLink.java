/**
 * Copyright (C) 2014-2016 Philip Helger (www.helger.com)
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
package com.helger.html.hc.html.metadata;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mime.CMimeType;
import com.helger.commons.mime.IMimeType;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.css.media.CSSMediaList;
import com.helger.css.media.ECSSMedium;
import com.helger.css.media.ICSSMediaList;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.annotation.OutOfBandNode;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.html.AbstractHCElement;
import com.helger.html.hc.html.HC_Target;
import com.helger.html.resource.css.ICSSPathProvider;

/**
 * Represents an HTML &lt;link&gt; element
 *
 * @author Philip Helger
 */
@OutOfBandNode
public class HCLink extends AbstractHCElement <HCLink>
{
  private IHCLinkType m_aRel;
  private IHCLinkType m_aRev;
  private IMimeType m_aType;
  private ISimpleURL m_aHref;
  private String m_sHrefLang;
  private HC_Target m_aTarget;
  private String m_sCharset;
  private CSSMediaList m_aMediaList;
  private String m_sSizes;
  private ICSSPathProvider m_aCSSPathProvider;

  public HCLink ()
  {
    super (EHTMLElement.LINK);
  }

  /**
   * @return <code>true</code> if this &lt;link&gt;-element is a CSS Stylesheet,
   *         <code>false</code> if not
   */
  public boolean isCSSLink ()
  {
    return EHCLinkType.STYLESHEET.equals (m_aRel);
  }

  @Nullable
  public IHCLinkType getRel ()
  {
    return m_aRel;
  }

  @Nonnull
  public HCLink setRel (@Nullable final IHCLinkType aRel)
  {
    m_aRel = aRel;
    return this;
  }

  @Nullable
  public IHCLinkType getRev ()
  {
    return m_aRev;
  }

  @Nonnull
  public HCLink setRev (@Nullable final IHCLinkType aRev)
  {
    m_aRev = aRev;
    return this;
  }

  @Nullable
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public HCLink setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return this;
  }

  @Nullable
  public ISimpleURL getHref ()
  {
    return m_aHref;
  }

  @Nonnull
  public HCLink setHref (@Nullable final ISimpleURL aHref)
  {
    m_aHref = aHref;
    return this;
  }

  @Nullable
  public String getHrefLang ()
  {
    return m_sHrefLang;
  }

  @Nonnull
  public HCLink setHrefLang (@Nullable final String sHrefLang)
  {
    m_sHrefLang = sHrefLang;
    return this;
  }

  @Nullable
  @DeprecatedInHTML5
  public HC_Target getTarget ()
  {
    return m_aTarget;
  }

  @Nonnull
  @DeprecatedInHTML5
  public HCLink setTarget (@Nullable final HC_Target aTarget)
  {
    m_aTarget = aTarget;
    return this;
  }

  @Nullable
  public String getCharset ()
  {
    return m_sCharset;
  }

  @Nonnull
  public HCLink setCharset (@Nullable final String sCharset)
  {
    m_sCharset = sCharset;
    return this;
  }

  @Nullable
  public ICSSMediaList getMedia ()
  {
    return m_aMediaList;
  }

  @Nonnull
  public HCLink setMedia (@Nullable final ICSSMediaList aMediaList)
  {
    m_aMediaList = aMediaList == null ? null : new CSSMediaList (aMediaList);
    return this;
  }

  @Nonnull
  private CSSMediaList _ensureMediaListPresent ()
  {
    if (m_aMediaList == null)
      m_aMediaList = new CSSMediaList ();
    return m_aMediaList;
  }

  @Nonnull
  public HCLink addMedium (@Nonnull final ECSSMedium eMedium)
  {
    _ensureMediaListPresent ().addMedium (eMedium);
    return this;
  }

  @Nonnull
  public HCLink addMedia (@Nonnull final ICSSMediaList aMediaList)
  {
    ValueEnforcer.notNull (aMediaList, "MediaList");
    _ensureMediaListPresent ();
    for (final ECSSMedium eMedium : aMediaList.getAllMedia ())
      m_aMediaList.addMedium (eMedium);
    return this;
  }

  @Nonnull
  public HCLink addMedia (@Nonnull final Iterable <ECSSMedium> aMediaList)
  {
    ValueEnforcer.notNull (aMediaList, "MediaList");
    _ensureMediaListPresent ();
    for (final ECSSMedium eMedium : aMediaList)
      m_aMediaList.addMedium (eMedium);
    return this;
  }

  @Nonnull
  public HCLink addMedia (@Nonnull final ECSSMedium... aMediaList)
  {
    ValueEnforcer.notNull (aMediaList, "MediaList");
    _ensureMediaListPresent ();
    for (final ECSSMedium eMedium : aMediaList)
      m_aMediaList.addMedium (eMedium);
    return this;
  }

  @Nonnull
  public HCLink removeAllMedia ()
  {
    m_aMediaList = null;
    return this;
  }

  @Nullable
  public String getSizes ()
  {
    return m_sSizes;
  }

  @Nonnull
  public HCLink setSizes (@Nullable final String sSizes)
  {
    m_sSizes = sSizes;
    return this;
  }

  @Nullable
  public ICSSPathProvider getPathProvider ()
  {
    return m_aCSSPathProvider;
  }

  @Nonnull
  public HCLink setPathProvider (@Nullable final ICSSPathProvider aCSSPathProvider)
  {
    m_aCSSPathProvider = aCSSPathProvider;
    return this;
  }

  @Override
  protected void fillMicroElement (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (aElement, aConversionSettings);
    if (m_aRel != null)
      aElement.setAttribute (CHTMLAttributes.REL, m_aRel);
    if (m_aRev != null)
      aElement.setAttribute (CHTMLAttributes.REV, m_aRev);
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    if (m_aHref != null)
      aElement.setAttribute (CHTMLAttributes.HREF,
                             m_aHref.getAsStringWithEncodedParameters (aConversionSettings.getCharset ()));
    if (StringHelper.hasText (m_sHrefLang))
      aElement.setAttribute (CHTMLAttributes.HREFLANG, m_sHrefLang);
    if (m_aTarget != null)
      aElement.setAttribute (CHTMLAttributes.TARGET, m_aTarget);
    if (StringHelper.hasText (m_sCharset))
      aElement.setAttribute (CHTMLAttributes.CHARSET, m_sCharset);
    if (m_aMediaList != null && m_aMediaList.hasAnyMedia ())
      aElement.setAttribute (CHTMLAttributes.MEDIA, m_aMediaList.getMediaString ());
    if (StringHelper.hasText (m_sSizes))
      aElement.setAttribute (CHTMLAttributes.SIZES, m_sSizes);

    if (aConversionSettings.getHTMLVersion ().isPriorToHTML5 ())
    {
      // May not be self-closed for IE
      aElement.appendText ("");
    }
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("Rel", m_aRel)
                            .appendIfNotNull ("Rev", m_aRev)
                            .appendIfNotNull ("Type", m_aType)
                            .appendIfNotNull ("Href", m_aHref)
                            .appendIfNotNull ("HrefLang", m_sHrefLang)
                            .appendIfNotNull ("Target", m_aTarget)
                            .appendIfNotNull ("Charset", m_sCharset)
                            .appendIfNotNull ("MediaList", m_aMediaList)
                            .appendIfNotNull ("Sizes", m_sSizes)
                            .appendIfNotNull ("CSSPathProvider", m_aCSSPathProvider)
                            .toString ();
  }

  /**
   * Shortcut to create a &lt;link&gt; element specific to CSS
   *
   * @param aCSSURL
   *        The CSS URL to be referenced
   * @return Never <code>null</code>.
   */
  @Nonnull
  public static HCLink createCSSLink (@Nonnull final ISimpleURL aCSSURL)
  {
    return new HCLink ().setRel (EHCLinkType.STYLESHEET).setType (CMimeType.TEXT_CSS).setHref (aCSSURL);
  }
}
