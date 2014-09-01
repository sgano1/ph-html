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
package com.helger.html.request;

import javax.annotation.Nullable;

/**
 * Special request field for check boxes and radio buttons.
 * 
 * @author Philip Helger, Boris Gregorcic
 */
public interface IHCRequestFieldBoolean extends IHCRequestField
{
  /**
   * @return <code>true</code> if the check-box is checked or if no such request
   *         parameter is present and the fall-back is <code>true</code>,
   *         <code>false</code> otherwise.
   */
  boolean isChecked ();

  /**
   * @param sFieldValue
   *        In case of multiple check-boxes sharing the same request parameter,
   *        pass the value set on the specific field to identify which check-box
   *        to check
   * @return <code>true</code> if the check-box is checked or if no such request
   *         parameter is present and the fall-back is <code>true</code>,
   *         <code>false</code> otherwise.
   */
  boolean isChecked (@Nullable String sFieldValue);
}
