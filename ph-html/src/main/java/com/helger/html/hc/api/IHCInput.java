/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
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
package com.helger.html.hc.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.html.hc.IHCControl;

/**
 * Base interface for controls base on &lt;input&gt; area.
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
public interface IHCInput <IMPLTYPE extends IHCInput <IMPLTYPE>> extends IHCControl <IMPLTYPE>
{
  /**
   * @return The type used for this <code>input</code> element.
   */
  @Nonnull
  EHCInputType getType ();

  /**
   * @return The current value of the HTML <code>placeholder</code> attribute.
   *         May be <code>null</code>.
   */
  @Nullable
  String getPlaceholder ();

  /**
   * Set the new value for the HTML <code>placeholder</code> attribute.
   * 
   * @param sPlaceholder
   *        The new value. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE setPlaceholder (@Nullable String sPlaceholder);
}
