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
package com.helger.html.hc.html.embedded;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.dimension.SizeInt;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.config.HCConsistencyChecker;
import com.helger.html.hc.html.AbstractHCMediaElementChild;

/**
 * Represents an HTML &lt;img&gt; element
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        The implementation type.
 */
public abstract class AbstractHCImg <THISTYPE extends AbstractHCImg <THISTYPE>> extends AbstractHCMediaElementChild <THISTYPE>implements IHCImg <THISTYPE>
{
  // Must be a String to allow for inline images
  private String m_sSrc;
  private String m_sSrcSet;
  private String m_sSizes;
  private SizeInt m_aExtent;
  private String m_sAlt;

  public AbstractHCImg ()
  {
    super (EHTMLElement.IMG);
  }

  @Nullable
  public final String getSrc ()
  {
    return m_sSrc;
  }

  @Nonnull
  public THISTYPE setSrc (@Nullable final ISimpleURL aSrc)
  {
    return setSrc (aSrc == null ? null : aSrc.getAsString ());
  }

  @Nonnull
  public THISTYPE setSrc (@Nullable final String sSrc)
  {
    HCConsistencyChecker.checkIfLinkIsMasked (sSrc);
    m_sSrc = sSrc;
    return thisAsT ();
  }

  @Nullable
  public String getSrcSet ()
  {
    return m_sSrcSet;
  }

  @Nonnull
  public THISTYPE setSrcSet (@Nullable final String sSrcSet)
  {
    m_sSrcSet = sSrcSet;
    return thisAsT ();
  }

  @Nullable
  public String getSizes ()
  {
    return m_sSizes;
  }

  @Nonnull
  public THISTYPE setSizes (@Nullable final String sSizes)
  {
    m_sSizes = sSizes;
    return thisAsT ();
  }

  public final boolean hasExtent ()
  {
    return m_aExtent != null;
  }

  public final int getWidth (final int nDefaultValue)
  {
    return m_aExtent != null ? m_aExtent.getWidth () : nDefaultValue;
  }

  public final int getHeight (final int nDefaultValue)
  {
    return m_aExtent != null ? m_aExtent.getHeight () : nDefaultValue;
  }

  @Nullable
  public final SizeInt getExtent ()
  {
    return m_aExtent;
  }

  @Nonnull
  public final THISTYPE setExtent (@Nullable final SizeInt aImageData)
  {
    m_aExtent = aImageData;
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setExtent (@Nonnegative final int nWidth, @Nonnegative final int nHeight)
  {
    return setExtent (new SizeInt (nWidth, nHeight));
  }

  @Nonnull
  public final THISTYPE scaleToWidth (@Nonnegative final int nNewWidth)
  {
    if (m_aExtent != null)
      m_aExtent = m_aExtent.getScaledToWidth (nNewWidth);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE scaleToHeight (@Nonnegative final int nNewHeight)
  {
    if (m_aExtent != null)
      m_aExtent = m_aExtent.getScaledToHeight (nNewHeight);
    return thisAsT ();
  }

  /**
   * Scales the image so that neither with nor height are exceeded, keeping the
   * aspect ratio.
   *
   * @param nMaxWidth
   *        Maximum with
   * @param nMaxHeight
   *        Maximum height
   * @return the correctly resized image tag
   */
  @Nonnull
  public final THISTYPE scaleBestMatching (@Nonnegative final int nMaxWidth, @Nonnegative final int nMaxHeight)
  {
    if (m_aExtent != null)
      m_aExtent = m_aExtent.getBestMatchingSize (nMaxWidth, nMaxHeight);
    return thisAsT ();
  }

  @Nullable
  public final String getAlt ()
  {
    return m_sAlt;
  }

  @Nonnull
  public final THISTYPE setAlt (@Nullable final String sAlt)
  {
    m_sAlt = sAlt;
    return thisAsT ();
  }

  @Override
  protected void fillMicroElement (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sSrc))
      aElement.setAttribute (CHTMLAttributes.SRC, m_sSrc);
    if (StringHelper.hasText (m_sSrcSet))
      aElement.setAttribute (CHTMLAttributes.SRCSET, m_sSrcSet);
    if (StringHelper.hasText (m_sSizes))
      aElement.setAttribute (CHTMLAttributes.SIZES, m_sSizes);
    if (m_aExtent != null)
    {
      aElement.setAttribute (CHTMLAttributes.WIDTH, m_aExtent.getWidth ());
      aElement.setAttribute (CHTMLAttributes.HEIGHT, m_aExtent.getHeight ());
    }

    // Ensure that the alt attribute is present
    final String sTitle = getTitle ();
    final String sRealAlt = StringHelper.hasText (m_sAlt) ? m_sAlt : sTitle;
    aElement.setAttribute (CHTMLAttributes.ALT, sRealAlt);

    // If the title is empty, but the alternative text is present, use the
    // alternative text as title
    // The default "title" attribute is set in a base class!
    if (StringHelper.hasNoText (sTitle) && StringHelper.hasText (m_sAlt))
      aElement.setAttribute (CHTMLAttributes.TITLE, m_sAlt);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("src", m_sSrc)
                            .appendIfNotNull ("extent", m_aExtent)
                            .appendIfNotNull ("alt", m_sAlt)
                            .toString ();
  }
}
