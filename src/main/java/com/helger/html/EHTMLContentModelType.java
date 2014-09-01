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
package com.helger.html;

/**
 * Contains the potential element meta types.<br>
 * See http://dev.w3.org/html5/markup/common-models.html#common-models
 * 
 * @author Philip Helger
 */
public enum EHTMLContentModelType
{
  FLOW (CHTMLContentModel.VALUE_FLOW | CHTMLContentModel.VALUE_PHRASING),
  FLOW_METADATA (CHTMLContentModel.VALUE_METADATA | CHTMLContentModel.VALUE_FLOW | CHTMLContentModel.VALUE_PHRASING),
  PHRASING_METADATA (CHTMLContentModel.VALUE_METADATA | CHTMLContentModel.VALUE_PHRASING),
  METADATA (CHTMLContentModel.VALUE_METADATA),
  PHRASING (CHTMLContentModel.VALUE_PHRASING),
  EMPTY (0),
  CHILD (0),
  SPECIAL (0),
  UNDEFINED (0),
  LEGACY_PHRASING (CHTMLContentModel.VALUE_PHRASING);

  private final int m_nValue;

  private EHTMLContentModelType (final int nValue)
  {
    m_nValue = nValue;
  }

  public boolean isFlowElement ()
  {
    return (m_nValue & CHTMLContentModel.VALUE_FLOW) > 0;
  }

  public boolean isMetadataElement ()
  {
    return (m_nValue & CHTMLContentModel.VALUE_METADATA) > 0;
  }

  public boolean isPhrasingElement ()
  {
    return (m_nValue & CHTMLContentModel.VALUE_PHRASING) > 0;
  }
}
