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

import javax.annotation.Nonnull;

import com.helger.commons.annotation.Nonempty;
import com.helger.html.hc.html.IHCHasHTMLAttributeValue;

/**
 * Enumeration for the possible "alignment" values in HTML
 * {@link com.helger.html.hc.html.embedded.HCObject} tags.
 *
 * @author Philip Helger
 */
public enum EHCObjectAlign implements IHCHasHTMLAttributeValue
{
  TOP ("top"),
  MIDDLE ("middle"),
  BOTTOM ("bottom"),
  LEFT ("left"),
  RIGHT ("right");

  private final String m_sAttrValue;

  private EHCObjectAlign (@Nonnull @Nonempty final String sAttrValue)
  {
    m_sAttrValue = sAttrValue;
  }

  @Nonnull
  @Nonempty
  public String getAttrValue ()
  {
    return m_sAttrValue;
  }
}
