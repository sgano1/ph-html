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
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.CHTMLAttributes;
import com.helger.html.hc.api.EHCInputType;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCInput;

/**
 * Base class for an HTML &lt;input&gt; element to be used as an edit
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        The implementing type
 */
public abstract class AbstractHCEdit <THISTYPE extends AbstractHCEdit <THISTYPE>> extends AbstractHCInput <THISTYPE>
{
  private int m_nMaxLength = CGlobal.ILLEGAL_UINT;
  private int m_nSize = CGlobal.ILLEGAL_UINT;

  protected AbstractHCEdit (@Nonnull final EHCInputType eType)
  {
    super (eType);
  }

  protected AbstractHCEdit (@Nonnull final EHCInputType eType, @Nullable final String sName)
  {
    super (eType);
    setName (sName);
  }

  /**
   * @return The currently set max length.
   */
  public final int getMaxLength ()
  {
    return m_nMaxLength;
  }

  /**
   * Set the maximum number of characters to be entered.
   *
   * @param nMaxLength
   *        The max length. Should be &gt; 0.
   * @return this
   */
  @Nonnull
  public final THISTYPE setMaxLength (final int nMaxLength)
  {
    m_nMaxLength = nMaxLength;
    return thisAsT ();
  }

  /**
   * @return The currently set max length.
   */
  public final int getSize ()
  {
    return m_nSize;
  }

  /**
   * Sets the visible size of the edit. Should not be necessary in most cases,
   * as styling via CSS is the preferred way. If you want to limit the number of
   * available characters use {@link #setMaxLength(int)} instead.
   *
   * @param nSize
   *        The width of the edit in characters.
   * @return this
   */
  @Nonnull
  public final THISTYPE setSize (final int nSize)
  {
    m_nSize = nSize;
    return thisAsT ();
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_nMaxLength > 0)
      aElement.setAttribute (CHTMLAttributes.MAXLENGTH, m_nMaxLength);
    if (m_nSize > 0)
      aElement.setAttribute (CHTMLAttributes.SIZE, m_nSize);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("maxLength", m_nMaxLength)
                            .append ("size", m_nSize)
                            .toString ();
  }
}
