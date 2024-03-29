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
package com.helger.html.hc.html.embedded;

import java.util.EnumSet;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.CGlobal;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.css.ECSSUnit;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.html.AbstractHCElementWithChildren;
import com.helger.html.hc.html.EHCScrolling;

/**
 * Represents an HTML &lt;iframe&gt; element
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCIFrame <THISTYPE extends AbstractHCIFrame <THISTYPE>>
                                       extends AbstractHCElementWithChildren <THISTYPE> implements IHCIFrame <THISTYPE>
{
  /** Default scrolling is auto */
  public static final EHCScrolling DEFAULT_SCROLLING = EHCScrolling.AUTO;
  /** By default a frame border is visible */
  public static final boolean DEFAULT_FRAME_BORDER = true;
  /** By default sandbox is disabled */
  public static final boolean DEFAULT_SANDBOX = false;

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
  private boolean m_bSandbox = DEFAULT_SANDBOX;
  private final EnumSet <EHCSandboxAllow> m_aSandboxAllows = EnumSet.noneOf (EHCSandboxAllow.class);

  public AbstractHCIFrame ()
  {
    super (EHTMLElement.IFRAME);
  }

  @Nullable
  public final ISimpleURL getSrc ()
  {
    return m_aSrc;
  }

  @Nonnull
  public final THISTYPE setSrc (@Nullable final ISimpleURL aSrc)
  {
    m_aSrc = aSrc;
    return thisAsT ();
  }

  @Nullable
  public final String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final THISTYPE setName (@Nullable final String sName)
  {
    m_sName = sName;
    return thisAsT ();
  }

  @Nullable
  public final String getLongDesc ()
  {
    return m_sLongDesc;
  }

  @Nonnull
  public final THISTYPE setLongDesc (@Nullable final String sLongDesc)
  {
    m_sLongDesc = sLongDesc;
    return thisAsT ();
  }

  @Nullable
  public final EHCScrolling getScrolling ()
  {
    return m_eScrolling;
  }

  @Nonnull
  public final THISTYPE setScrolling (@Nullable final EHCScrolling eScrolling)
  {
    m_eScrolling = eScrolling;
    return thisAsT ();
  }

  @Nullable
  public final EHCIFrameAlign getAlign ()
  {
    return m_eAlign;
  }

  @Nonnull
  public final THISTYPE setAlign (@Nullable final EHCIFrameAlign eAlign)
  {
    m_eAlign = eAlign;
    return thisAsT ();
  }

  public final boolean isFrameBorder ()
  {
    return m_bFrameBorder;
  }

  @Nonnull
  public final THISTYPE setFrameBorder (final boolean bFrameBorder)
  {
    m_bFrameBorder = bFrameBorder;
    return thisAsT ();
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
  public final THISTYPE setWidth (final int nWidth)
  {
    if (nWidth >= 0)
      m_sWidth = Integer.toString (nWidth);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setWidthPercentage (final double dPercentage)
  {
    m_sWidth = ECSSUnit.perc (dPercentage);
    return thisAsT ();
  }

  @Nullable
  public final String getHeight ()
  {
    return m_sWidth;
  }

  @Nonnull
  public final THISTYPE setHeight (final int nHeight)
  {
    if (nHeight >= 0)
      m_sHeight = Integer.toString (nHeight);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE setHeightPercentage (final double dPercentage)
  {
    m_sHeight = ECSSUnit.perc (dPercentage);
    return thisAsT ();
  }

  public final int getMarginWidth ()
  {
    return m_nMarginWidth;
  }

  @Nonnull
  public final THISTYPE setMarginWidth (final int nMarginWidth)
  {
    m_nMarginWidth = nMarginWidth;
    return thisAsT ();
  }

  public final int getMarginHeight ()
  {
    return m_nMarginHeight;
  }

  @Nonnull
  public final THISTYPE setMarginHeight (final int nMarginHeight)
  {
    m_nMarginHeight = nMarginHeight;
    return thisAsT ();
  }

  public final boolean isSandbox ()
  {
    return m_bSandbox;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final EnumSet <EHCSandboxAllow> getSandboxAllow ()
  {
    return EnumSet.copyOf (m_aSandboxAllows);
  }

  @Nonnull
  public final THISTYPE setSandbox (final boolean bSandbox, @Nullable final EHCSandboxAllow... aSandboxAllows)
  {
    m_bSandbox = bSandbox;
    m_aSandboxAllows.clear ();
    if (aSandboxAllows != null)
      for (final EHCSandboxAllow eAllow : aSandboxAllows)
        m_aSandboxAllows.add (eAllow);
    return thisAsT ();
  }

  @Override
  protected void fillMicroElement (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (aElement, aConversionSettings);
    if (m_aSrc != null)
      aElement.setAttribute (CHTMLAttributes.SRC,
                             m_aSrc.getAsStringWithEncodedParameters (aConversionSettings.getCharset ()));
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
    if (m_bSandbox)
    {
      final StringBuilder aValue = new StringBuilder ();
      for (final EHCSandboxAllow eAllow : m_aSandboxAllows)
      {
        if (aValue.length () > 0)
          aValue.append (' ');
        aValue.append (eAllow.getAttrValue ());
      }
      aElement.setAttribute (CHTMLAttributes.SANDBOX, aValue.toString ());
    }
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
