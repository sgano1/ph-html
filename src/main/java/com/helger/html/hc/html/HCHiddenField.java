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

import java.util.Locale;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.CHTMLAttributes;
import com.helger.html.hc.CHCParam;
import com.helger.html.hc.api.EHCInputType;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCInput;
import com.helger.html.request.IHCRequestField;

/**
 * Represents an HTML &lt;input&gt; element with type "hidden"
 *
 * @author Philip Helger
 */
public class HCHiddenField extends AbstractHCInput <HCHiddenField>
{
  private String m_sValue;

  public HCHiddenField ()
  {
    super (EHCInputType.HIDDEN);
  }

  public HCHiddenField (@Nullable final String sName, @Nullable final String sValue)
  {
    this ();
    setName (sName);
    setValue (sValue);
  }

  public HCHiddenField (@Nullable final String sName, final int nValue)
  {
    this ();
    setName (sName);
    setValue (nValue);
  }

  public HCHiddenField (@Nullable final String sName, final long nValue)
  {
    this ();
    setName (sName);
    setValue (nValue);
  }

  public HCHiddenField (@Nullable final String sName, @Nonnull final Locale aLocale)
  {
    this (sName, aLocale.toString ());
  }

  public HCHiddenField (@Nullable final String sName, final boolean bValue)
  {
    this (sName, bValue ? CHCParam.VALUE_CHECKED : CHCParam.VALUE_UNCHECKED);
  }

  public HCHiddenField (@Nonnull final IHCRequestField aRF)
  {
    this (aRF.getFieldName (), aRF.getRequestValue ());
  }

  @Nullable
  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final HCHiddenField setValue (final int nValue)
  {
    return setValue (Integer.toString (nValue));
  }

  @Nonnull
  public final HCHiddenField setValue (final long nValue)
  {
    return setValue (Long.toString (nValue));
  }

  @Nonnull
  public final HCHiddenField setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_sValue != null)
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).appendIfNotNull ("value", m_sValue).toString ();
  }
}
