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
package com.helger.html.hc.html.textlevel;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mime.IMimeType;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.config.HCConsistencyChecker;
import com.helger.html.hc.html.AbstractHCElementWithChildren;
import com.helger.html.hc.html.HCHTMLHelper;
import com.helger.html.hc.html.HC_Target;

/**
 * Represents an HTML &lt;a&gt; element
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCA <THISTYPE extends AbstractHCA <THISTYPE>>
                                  extends AbstractHCElementWithChildren <THISTYPE> implements IHCA <THISTYPE>
{
  private ISimpleURL m_aHref;
  private HC_Target m_aTarget;
  private String m_sName;
  private IMimeType m_aType;
  private String m_sMediaQuery;

  public AbstractHCA ()
  {
    super (EHTMLElement.A);
  }

  public AbstractHCA (@Nonnull final ISimpleURL aHref)
  {
    this ();
    setHref (aHref);
  }

  @Nullable
  public ISimpleURL getHref ()
  {
    return m_aHref;
  }

  @Nonnull
  public final THISTYPE setHref (@Nonnull final ISimpleURL aHref)
  {
    ValueEnforcer.notNull (aHref, "href");

    m_aHref = aHref;
    return thisAsT ();
  }

  @Nullable
  public HC_Target getTarget ()
  {
    return m_aTarget;
  }

  @Nonnull
  public THISTYPE setTarget (@Nullable final HC_Target aTarget)
  {
    m_aTarget = aTarget;
    return thisAsT ();
  }

  @Nullable
  public String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public THISTYPE setName (@Nullable final String sName)
  {
    m_sName = sName;
    return thisAsT ();
  }

  @Nullable
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public THISTYPE setType (@Nullable final IMimeType aType)
  {
    m_aType = aType;
    return thisAsT ();
  }

  @Nullable
  public String getMedia ()
  {
    return m_sMediaQuery;
  }

  @Nonnull
  public THISTYPE setMedia (@Nullable final String sMediaQuery)
  {
    m_sMediaQuery = sMediaQuery;
    return thisAsT ();
  }

  @Override
  protected void onConsistencyCheck (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.onConsistencyCheck (aConversionSettings);
    if (HCHTMLHelper.recursiveContainsChildWithTagName (this, EHTMLElement.A))
      HCConsistencyChecker.consistencyError ("<A> may never contain other links!");
    if (HCHTMLHelper.recursiveContainsChildWithTagName (this, EHTMLElement.SELECT))
      HCConsistencyChecker.consistencyError ("<A> contains invalid child element!");
  }

  @Override
  @OverridingMethodsMustInvokeSuper
  protected void fillMicroElement (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (aElement, aConversionSettings);
    if (m_aHref != null)
      aElement.setAttribute (CHTMLAttributes.HREF,
                             m_aHref.getAsStringWithEncodedParameters (aConversionSettings.getCharset ()));
    if (m_aTarget != null)
    {
      // Note: attribute "target" is not allowed in XHTML 1.0 strict (but in
      // 1.1)
      aElement.setAttribute (CHTMLAttributes.TARGET, m_aTarget);
    }
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (m_aType != null)
      aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    // HTML5 only:
    if (StringHelper.hasText (m_sMediaQuery))
      aElement.setAttribute (CHTMLAttributes.MEDIA, m_sMediaQuery);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("href", m_aHref)
                            .appendIfNotNull ("target", m_aTarget)
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("type", m_aType)
                            .appendIfNotNull ("mediaQuery", m_sMediaQuery)
                            .toString ();
  }
}
