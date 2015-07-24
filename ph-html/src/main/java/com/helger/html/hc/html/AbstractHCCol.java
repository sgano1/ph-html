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

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.helger.commons.CGlobal;
import com.helger.commons.ValueEnforcer;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.css.ECSSUnit;
import com.helger.html.CHTMLAttributeValues;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.api.IHCCol;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCElement;

/**
 * Represents an HTML &lt;col&gt; element
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        The implementation type.
 */
public abstract class AbstractHCCol <IMPLTYPE extends AbstractHCCol <IMPLTYPE>> extends AbstractHCElement <IMPLTYPE>implements IHCCol <IMPLTYPE>
{
  private String m_sWidth;
  private int m_nSpan = CGlobal.ILLEGAL_UINT;

  public AbstractHCCol ()
  {
    super (EHTMLElement.COL);
  }

  public AbstractHCCol (@Nonnegative final int nWidth)
  {
    this ();
    setWidth (nWidth);
  }

  /**
   * @return <code>true</code> if this is a star column (width == "*")
   */
  public boolean isStar ()
  {
    return CHTMLAttributeValues.STAR.equals (m_sWidth);
  }

  /**
   * @return The width definition of the column or <code>null</code> if no width
   *         is present.
   */
  @Nullable
  public String getWidth ()
  {
    return m_sWidth;
  }

  /**
   * Set the width in pixel.
   *
   * @param nWidth
   *        Pixel width.
   * @return this
   */
  @Nonnull
  public IMPLTYPE setWidth (@Nonnegative final int nWidth)
  {
    ValueEnforcer.isGE0 (nWidth, "Width");
    return setWidth (Integer.toString (nWidth));
  }

  /**
   * Set the width in percent.
   *
   * @param dPerc
   *        percentage width.
   * @return this
   */
  @Nonnull
  public IMPLTYPE setWidthPerc (@Nonnegative final double dPerc)
  {
    return setWidth (ECSSUnit.perc (dPerc));
  }

  /**
   * Set the width as string. May either be a pure integer or e.g. a percentage
   * value (like "50%") or "*" for "any".
   *
   * @param sWidth
   *        The width as a string. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  public IMPLTYPE setWidth (@Nullable final String sWidth)
  {
    m_sWidth = sWidth;
    return thisAsT ();
  }

  @CheckForSigned
  public int getSpan ()
  {
    return m_nSpan;
  }

  @Nonnull
  public IMPLTYPE setSpan (final int nSpan)
  {
    m_nSpan = nSpan;
    return thisAsT ();
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sWidth))
      aElement.setAttribute (CHTMLAttributes.WIDTH, m_sWidth);
    if (m_nSpan > 0)
      aElement.setAttribute (CHTMLAttributes.SPAN, m_nSpan);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("width", m_sWidth)
                            .append ("span", m_nSpan)
                            .toString ();
  }
}
