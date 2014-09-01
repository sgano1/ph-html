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

import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotations.PresentForCodeCoverage;

/**
 * Source:
 * http://www.w3.org/html/wg/drafts/html/master/dom.html#kinds-of-content
 * 
 * @author Philip Helger
 */
@Immutable
public final class CHTMLContentKind
{
  public static final int VALUE_METADATA = 0x01;
  public static final int VALUE_FLOW = 0x02;
  public static final int VALUE_SECTIONING = 0x04;
  public static final int VALUE_HEADING = 0x08;
  public static final int VALUE_PHRASING = 0x10;
  public static final int VALUE_EMBEDDED = 0x20;
  public static final int VALUE_INTERACTIVE = 0x40;

  @SuppressWarnings ("unused")
  @PresentForCodeCoverage
  private static final CHTMLContentKind s_aInstance = new CHTMLContentKind ();

  private CHTMLContentKind ()
  {}
}
