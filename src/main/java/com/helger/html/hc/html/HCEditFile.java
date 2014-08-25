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

import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mime.IMimeType;
import com.helger.html.CHTMLAttributeValues;
import com.helger.html.CHTMLAttributes;
import com.helger.html.hc.api.EHCInputType;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Represents an HTML &lt;input&gt; element with type "file"
 * 
 * @author Philip Helger
 */
public class HCEditFile extends AbstractHCEdit <HCEditFile>
{
  /** By default a single file can be selected */
  public static final boolean DEFAULT_MULTIPLE = false;

  private boolean m_bMultiple = DEFAULT_MULTIPLE;
  private IMimeType m_aAccept;

  public HCEditFile ()
  {
    super (EHCInputType.FILE);
  }

  public HCEditFile (@Nullable final String sName)
  {
    super (EHCInputType.FILE, sName);
  }

  public boolean isMultiple ()
  {
    return m_bMultiple;
  }

  @Nonnull
  public HCEditFile setMultiple (final boolean bMultiple)
  {
    m_bMultiple = bMultiple;
    return this;
  }

  @Nullable
  public IMimeType getAccept ()
  {
    return m_aAccept;
  }

  @Nonnull
  public HCEditFile setAccept (@Nullable final IMimeType aAccept)
  {
    m_aAccept = aAccept;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (m_bMultiple)
      aElement.setAttribute (CHTMLAttributes.MULTIPLE, CHTMLAttributeValues.MULTIPLE);
    if (m_aAccept != null)
      aElement.setAttribute (CHTMLAttributes.ACCEPT, m_aAccept.getAsString ());
  }
}
