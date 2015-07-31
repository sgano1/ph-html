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
package com.helger.html.hc.html.tabular;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.html.hc.html.IHCElement;

/**
 * Base interface for a table column.
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
public interface IHCCol <IMPLTYPE extends IHCCol <IMPLTYPE>> extends IHCElement <IMPLTYPE>
{
  /**
   * @return <code>true</code> if this is a star column (width == "*")
   */
  boolean isStar ();

  /**
   * @return The width definition of the column as a string or <code>null</code>
   *         if no width is present.
   */
  @Nullable
  String getWidth ();

  /**
   * Set the width in pixel.
   *
   * @param nWidth
   *        Pixel width.
   * @return this
   */
  @Nonnull
  IMPLTYPE setWidth (@Nonnegative int nWidth);

  /**
   * Set the width in percent.
   *
   * @param dPerc
   *        percentage width.
   * @return this
   */
  @Nonnull
  IMPLTYPE setWidthPerc (@Nonnegative double dPerc);

  /**
   * Set the width as string. May either be a pure integer or e.g. a percentage
   * value (like "50%") or "*" for "any".
   *
   * @param sWidth
   *        The width as a string. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE setWidth (@Nullable String sWidth);

  @CheckForSigned
  int getSpan ();

  @Nonnull
  IMPLTYPE setSpan (int nSpan);
}
