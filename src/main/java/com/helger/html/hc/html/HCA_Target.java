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

import com.helger.commons.annotations.Nonempty;

/**
 * Represents the value of the "target" attribute of an HTML &lt;a&gt; element
 *
 * @author Philip Helger
 */
@Deprecated
public class HCA_Target extends HC_Target
{
  public HCA_Target (@Nonnull @Nonempty final String sName)
  {
    super (sName);
  }
}
