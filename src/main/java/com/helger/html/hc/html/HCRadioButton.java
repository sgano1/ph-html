/**
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

import com.helger.commons.equals.EqualsUtils;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.CHTMLAttributeValues;
import com.helger.html.CHTMLAttributes;
import com.helger.html.hc.api.EHCInputType;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCInput;
import com.helger.html.request.IHCRequestField;
import com.helger.html.request.IHCRequestFieldBoolean;

/**
 * Represents an HTML &lt;input&gt; element of type "radio"
 *
 * @author Philip Helger
 */
public class HCRadioButton extends AbstractHCInput <HCRadioButton>
{
  /** By default the radio button is not checked */
  public static final boolean DEFAULT_CHECKED = false;

  private String m_sValue;
  private boolean m_bChecked = DEFAULT_CHECKED;

  public HCRadioButton (@Nullable final String sName)
  {
    super (EHCInputType.RADIO);
    setName (sName);
  }

  public HCRadioButton (@Nullable final String sName, @Nullable final String sValue)
  {
    this (sName);
    setValue (sValue);
  }

  public HCRadioButton (@Nullable final String sName, final boolean bChecked)
  {
    this (sName);
    setChecked (bChecked);
  }

  public HCRadioButton (@Nullable final String sName, @Nullable final String sValue, final boolean bChecked)
  {
    this (sName, sValue);
    setChecked (bChecked);
  }

  public HCRadioButton (@Nonnull final IHCRequestFieldBoolean aRF)
  {
    this (aRF.getFieldName (), aRF.isChecked ());
  }

  public HCRadioButton (@Nonnull final IHCRequestFieldBoolean aRF, @Nullable final String sValue)
  {
    this (aRF);
    setValue (sValue);
  }

  public HCRadioButton (@Nonnull final IHCRequestField aRF)
  {
    this (aRF.getFieldName (), aRF.getRequestValue ());
  }

  public HCRadioButton (@Nonnull final IHCRequestField aRF, final boolean bChecked)
  {
    this (aRF);
    setChecked (bChecked);
  }

  public HCRadioButton (@Nonnull final IHCRequestField aRF, @Nullable final String sValue)
  {
    this (aRF.getFieldName (), sValue, EqualsUtils.equals (sValue, aRF.getRequestValue ()));
  }

  @Nullable
  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final HCRadioButton setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  public final boolean isChecked ()
  {
    return m_bChecked;
  }

  @Nonnull
  public final HCRadioButton setChecked (final boolean bChecked)
  {
    m_bChecked = bChecked;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_bChecked)
      aElement.setAttribute (CHTMLAttributes.CHECKED, CHTMLAttributeValues.CHECKED);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("value", m_sValue)
                            .append ("checked", m_bChecked)
                            .toString ();
  }
}
