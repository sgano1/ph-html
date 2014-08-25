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

import com.helger.commons.ValueEnforcer;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.CHTMLAttributeValues;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCButton;
import com.helger.html.hc.api.EHCButtonType;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;
import com.helger.html.js.EJSEvent;
import com.helger.html.js.IJSCodeProvider;
import com.helger.html.js.builder.html.JSHtml;

/**
 * Represents an HTML &lt;button&gt; element with type "button"
 * 
 * @author Philip Helger
 */
public abstract class AbstractHCButton <IMPLTYPE extends AbstractHCButton <IMPLTYPE>> extends AbstractHCElementWithChildren <IMPLTYPE> implements IHCButton <IMPLTYPE>
{
  private EHCButtonType m_eType = EHCButtonType.BUTTON;
  private String m_sName;
  private String m_sValue;
  private boolean m_bDisabled = false;

  public AbstractHCButton ()
  {
    super (EHTMLElement.BUTTON);
  }

  public AbstractHCButton (@Nullable final String sLabel)
  {
    this ();
    addChild (sLabel);
  }

  public AbstractHCButton (@Nullable final String sLabel, @Nullable final IJSCodeProvider aOnClick)
  {
    this (sLabel);
    setOnClick (aOnClick);
  }

  public final String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final IMPLTYPE setName (@Nullable final String sName)
  {
    m_sName = sName;
    return thisAsT ();
  }

  public final String getValue ()
  {
    return m_sValue;
  }

  @Nonnull
  public final IMPLTYPE setValue (@Nullable final String sValue)
  {
    m_sValue = sValue;
    return thisAsT ();
  }

  public final boolean isDisabled ()
  {
    return m_bDisabled;
  }

  @Nonnull
  public final IMPLTYPE setDisabled (final boolean bDisabled)
  {
    m_bDisabled = bDisabled;
    return thisAsT ();
  }

  @Nonnull
  public final EHCButtonType getType ()
  {
    return m_eType;
  }

  @Nonnull
  public IMPLTYPE setType (@Nonnull final EHCButtonType eType)
  {
    m_eType = ValueEnforcer.notNull (eType, "Type");
    return thisAsT ();
  }

  @Nonnull
  public IMPLTYPE setOnClick (@Nullable final IJSCodeProvider aOnClick)
  {
    return setEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  @Nonnull
  public IMPLTYPE setOnClick (@Nonnull final ISimpleURL aURL)
  {
    return setOnClick (JSHtml.windowLocationHref (aURL));
  }

  @Nonnull
  public IMPLTYPE addOnClick (@Nullable final IJSCodeProvider aOnClick)
  {
    return addEventHandler (EJSEvent.ONCLICK, aOnClick);
  }

  @Nonnull
  public IMPLTYPE addOnClick (@Nonnull final ISimpleURL aURL)
  {
    return addOnClick (JSHtml.windowLocationHref (aURL));
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_eType);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sValue))
      aElement.setAttribute (CHTMLAttributes.VALUE, m_sValue);
    if (m_bDisabled)
      aElement.setAttribute (CHTMLAttributes.DISABLED, CHTMLAttributeValues.DISABLED);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("type", m_eType)
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("value", m_sValue)
                            .append ("disabled", m_bDisabled)
                            .toString ();
  }
}
