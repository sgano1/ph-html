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
package com.helger.html.hc.base;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.dimension.SizeInt;
import com.helger.commons.url.ISimpleURL;

/**
 * Interface for IMGs
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCImg <THISTYPE extends IHCImg <THISTYPE>> extends IHCMediaElementChild <THISTYPE>
{
  @Nullable
  String getSrc ();

  @Nonnull
  THISTYPE setSrc (@Nullable ISimpleURL aSrc);

  @Nonnull
  THISTYPE setSrc (@Nullable String sSrc);

  @Nullable
  String getSrcSet ();

  @Nonnull
  THISTYPE setSrcSet (@Nullable String sSrcSet);

  @Nullable
  String getSizes ();

  @Nonnull
  THISTYPE setSizes (@Nullable String sSizes);

  boolean hasExtent ();

  int getWidth (final int nDefaultValue);

  int getHeight (final int nDefaultValue);

  @Nullable
  SizeInt getExtent ();

  @Nonnull
  THISTYPE setExtent (@Nullable SizeInt aImageData);

  @Nonnull
  THISTYPE setExtent (@Nonnegative int nWidth, @Nonnegative int nHeight);

  @Nonnull
  THISTYPE scaleToWidth (@Nonnegative int nNewWidth);

  @Nonnull
  THISTYPE scaleToHeight (@Nonnegative int nNewHeight);

  /**
   * Scales the image so that neither with nor height are exceeded, keeping the
   * aspect ratio.
   *
   * @param nMaxWidth
   *        Maximum with
   * @param nMaxHeight
   *        Maximum height
   * @return the correctly resized image tag
   */
  @Nonnull
  THISTYPE scaleBestMatching (@Nonnegative int nMaxWidth, @Nonnegative int nMaxHeight);

  @Nullable
  String getAlt ();

  @Nonnull
  THISTYPE setAlt (@Nullable String sAlt);
}
