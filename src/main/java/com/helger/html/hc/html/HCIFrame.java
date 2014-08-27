/**
 * Copyright (C) 2006-2014 phloc systems (www.phloc.com)
 * Copyright (C) 2014 Philip Helger (www.helger.com)
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.CGlobal;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.css.ECSSUnit;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.api.EHCIFrameAlign;
import com.helger.html.hc.api.EHCScrolling;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;iframe&gt; element
 *
 * @author Philip Helger
 */
public class HCIFrame extends AbstractHCElementWithChildren <HCIFrame>
{
  /** Default scrolling is auto */
  public static final EHCScrolling DEFAULT_SCROLLING = EHCScrolling.AUTO;
  /** By default a frame border is visible */
  public static final boolean DEFAULT_FRAME_BORDER = true;

  private ISimpleURL m_aSrc;
  private String m_sName;
  private String m_sLongDesc;
  private EHCScrolling m_eScrolling = DEFAULT_SCROLLING;
  private EHCIFrameAlign m_eAlign;
  private boolean m_bFrameBorder = DEFAULT_FRAME_BORDER;
  private String m_sWidth;
  private String m_sHeight;
  private int m_nMarginWidth = CGlobal.ILLEGAL_UINT;
  private int m_nMarginHeight = CGlobal.ILLEGAL_UINT;

  public HCIFrame ()
  {
    super (EHTMLElement.IFRAME);
  }

  @Nullable
  public final ISimpleURL getSrc ()
  {
    return m_aSrc;
  }

  @Nonnull
  public final HCIFrame setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return this;
  }

  @Nullable
  public final String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final HCIFrame setName (@Nullable final String sName)
  {
    m_sName = sName;
    return this;
  }

  @Nullable
  public final String getLongDesc ()
  {
    return m_sLongDesc;
  }

  @Nonnull
  public final HCIFrame setLongDesc (@Nullable final String sLongDesc)
  {
    m_sLongDesc = sLongDesc;
    return this;
  }

  @Nullable
  public final EHCScrolling getScrolling ()
  {
    return m_eScrolling;
  }

  @Nonnull
  public final HCIFrame setScrolling (@Nullable final EHCScrolling eScrolling)
  {
    m_eScrolling = eScrolling;
    return this;
  }

  @Nullable
  public final EHCIFrameAlign getAlign ()
  {
    return m_eAlign;
  }

  @Nonnull
  public final HCIFrame setAlign (@Nullable final EHCIFrameAlign eAlign)
  {
    m_eAlign = eAlign;
    return this;
  }

  public final boolean isFrameBorder ()
  {
    return m_bFrameBorder;
  }

  @Nonnull
  public final HCIFrame setFrameBorder (final boolean bFrameBorder)
  {
    m_bFrameBorder = bFrameBorder;
    return this;
  }

  @Nullable
  public final String getWidth ()
  {
    return m_sWidth;
  }

  /**
   * Set the width in pixel
   *
   * @param nWidth
   *        the width in pixel
   * @return this
   */
  @Nonnull
  public final HCIFrame setWidth (final int nWidth)
  {
    if (nWidth >= 0)
      m_sWidth = Integer.toString (nWidth);
    return this;
  }

  @Nonnull
  public final HCIFrame setWidthPercentage (final double dPercentage)
  {
    m_sWidth = ECSSUnit.perc (dPercentage);
    return this;
  }

  @Nullable
  public final String getHeight ()
  {
    return m_sWidth;
  }

  @Nonnull
  public final HCIFrame setHeight (final int nHeight)
  {
    if (nHeight >= 0)
      m_sHeight = Integer.toString (nHeight);
    return this;
  }

  @Nonnull
  public final HCIFrame setHeightPercentage (final double dPercentage)
  {
    m_sHeight = ECSSUnit.perc (dPercentage);
    return this;
  }

  public final int getMarginWidth ()
  {
    return m_nMarginWidth;
  }

  @Nonnull
  public final HCIFrame setMarginWidth (final int nMarginWidth)
  {
    m_nMarginWidth = nMarginWidth;
    return this;
  }

  public final int getMarginHeight ()
  {
    return m_nMarginHeight;
  }

  @Nonnull
  public final HCIFrame setMarginHeight (final int nMarginHeight)
  {
    m_nMarginHeight = nMarginHeight;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC, m_aSrc.getAsString ());
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sLongDesc))
      aElement.setAttribute (CHTMLAttributes.LONGDESC, m_sLongDesc);
    if (m_eScrolling != null)
      aElement.setAttribute (CHTMLAttributes.SCROLLING, m_eScrolling);
    if (m_eAlign != null)
      aElement.setAttribute (CHTMLAttributes.ALIGN, m_eAlign);
    aElement.setAttribute (CHTMLAttributes.FRAMEBORDER, m_bFrameBorder ? "1" : "0");
    if (StringHelper.hasText (m_sWidth))
      aElement.setAttribute (CHTMLAttributes.WIDTH, m_sWidth);
    if (StringHelper.hasText (m_sHeight))
      aElement.setAttribute (CHTMLAttributes.HEIGHT, m_sHeight);
    if (m_nMarginWidth >= 0)
      aElement.setAttribute (CHTMLAttributes.MARGINWIDTH, m_nMarginWidth);
    if (m_nMarginHeight >= 0)
      aElement.setAttribute (CHTMLAttributes.MARGINHEIGHT, m_nMarginHeight);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("src", m_aSrc)
                            .appendIfNotNull ("src", m_aSrc)
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("longDesc", m_sLongDesc)
                            .appendIfNotNull ("scrolling", m_eScrolling)
                            .appendIfNotNull ("align", m_eAlign)
                            .append ("frameBorder", m_bFrameBorder)
                            .appendIfNotNull ("width", m_sWidth)
                            .appendIfNotNull ("height", m_sHeight)
                            .append ("marginWidth", m_nMarginWidth)
                            .append ("marginHeight", m_nMarginHeight)
                            .toString ();
  }
}
