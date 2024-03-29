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
package com.helger.html.hc.impl;

import javax.annotation.Nonnull;

import com.helger.commons.microdom.IMicroText;
import com.helger.commons.microdom.MicroText;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.IHCTextNode;

/**
 * Represents a single text node as HC node.
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
public abstract class AbstractHCTextNode <IMPLTYPE extends AbstractHCTextNode <IMPLTYPE>> extends AbstractHCNode
                                         implements IHCTextNode <IMPLTYPE>
{
  private String m_sText;
  private boolean m_bEscape = MicroText.DEFAULT_ESCAPE;

  public AbstractHCTextNode ()
  {}

  @Nonnull
  public String getText ()
  {
    return m_sText;
  }

  @Nonnull
  public IMPLTYPE setText (final String sText)
  {
    m_sText = StringHelper.getNotNull (sText);
    return thisAsT ();
  }

  @Nonnull
  public IMPLTYPE prependText (final String sText)
  {
    if (StringHelper.hasText (sText))
      m_sText = sText + m_sText;
    return thisAsT ();
  }

  @Nonnull
  public IMPLTYPE appendText (final String sText)
  {
    if (StringHelper.hasText (sText))
      m_sText = m_sText + sText;
    return thisAsT ();
  }

  @Nonnull
  public IMPLTYPE setEscape (final boolean bEscape)
  {
    m_bEscape = bEscape;
    return thisAsT ();
  }

  /**
   * @return <code>true</code> if XML escaping is enabled, <code>false</code> if
   *         it is disabled
   */
  public boolean isEscape ()
  {
    return m_bEscape;
  }

  @Override
  @Nonnull
  protected IMicroText internalConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return new MicroText (m_sText).setEscape (m_bEscape);
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return m_sText;
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .append ("text", m_sText)
                            .append ("escape", m_bEscape)
                            .toString ();
  }
}
