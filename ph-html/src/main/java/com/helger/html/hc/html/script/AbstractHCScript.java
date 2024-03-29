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
package com.helger.html.hc.html.script;

import java.nio.charset.Charset;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mime.CMimeType;
import com.helger.commons.mime.IMimeType;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.html.AbstractHCElement;

/**
 * Represents an HTML &lt;script&gt; element
 *
 * @author Philip Helger
 * @see HCScriptInline
 * @see HCScriptFile
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCScript <THISTYPE extends AbstractHCScript <THISTYPE>>
                                       extends AbstractHCElement <THISTYPE> implements IHCScript <THISTYPE>
{
  /** Default MIME type: text/javascript */
  public static final IMimeType DEFAULT_TYPE = CMimeType.TEXT_JAVASCRIPT;

  private IMimeType m_aType = DEFAULT_TYPE;
  private String m_sCharset;

  public AbstractHCScript ()
  {
    super (EHTMLElement.SCRIPT);
  }

  @Nonnull
  public IMimeType getType ()
  {
    return m_aType;
  }

  @Nonnull
  public THISTYPE setType (@Nonnull final IMimeType aType)
  {
    m_aType = ValueEnforcer.notNull (aType, "Type");
    return thisAsT ();
  }

  @Nullable
  public String getCharset ()
  {
    return m_sCharset;
  }

  @Nonnull
  public THISTYPE setCharset (@Nullable final Charset aCharset)
  {
    return setCharset (aCharset == null ? null : aCharset.name ());
  }

  @Nonnull
  public THISTYPE setCharset (@Nullable final String sCharset)
  {
    m_sCharset = sCharset;
    return thisAsT ();
  }

  @Override
  protected void fillMicroElement (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (aElement, aConversionSettings);
    aElement.setAttribute (CHTMLAttributes.TYPE, m_aType.getAsString ());
    if (StringHelper.hasText (m_sCharset))
      aElement.setAttribute (CHTMLAttributes.CHARSET, m_sCharset);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("type", m_aType)
                            .appendIfNotNull ("charset", m_sCharset)
                            .toString ();
  }
}
