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
package com.helger.html.hc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.html.annotation.SinceHTML5;

@SinceHTML5
public interface IHCHasMedia <IMPLTYPE extends IHCHasMedia <IMPLTYPE>>
{
  /**
   * @return The currently set media query. May be <code>null</code>.
   */
  @Nullable
  String getMedia ();

  /**
   * Change media query
   *
   * @param sMediaQuery
   *        The CSS3 media query to be used. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE setMedia (String sMediaQuery);
}
