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
package com.helger.html.hc.html.textlevel;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.mime.IMimeType;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.hc.IHCHasName;
import com.helger.html.hc.html.HC_Target;
import com.helger.html.hc.html.IHCElementWithChildren;
import com.helger.html.hc.html.IHCHasMedia;
import com.helger.html.js.IHasJSCode;

/**
 * Interface for As
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCA <THISTYPE extends IHCA <THISTYPE>> extends IHCElementWithChildren <THISTYPE>, IHCHasMedia <THISTYPE>, IHCHasName <THISTYPE>
{
  @Nullable
  ISimpleURL getHref ();

  @Nonnull
  @Deprecated
  THISTYPE setHref (@Nonnull String sHref);

  @Nonnull
  THISTYPE setHref (@Nonnull ISimpleURL aHref);

  @Nullable
  HC_Target getTarget ();

  boolean hasTarget ();

  @Nonnull
  THISTYPE setTarget (@Nullable HC_Target aTarget);

  @Nonnull
  THISTYPE setTargetBlank ();

  @Nullable
  IMimeType getType ();

  @Nonnull
  THISTYPE setType (@Nullable IMimeType aType);

  @Nonnull
  THISTYPE setOnClick (@Nullable IHasJSCode aOnClick);

  @Nonnull
  THISTYPE addOnClick (@Nullable IHasJSCode aOnClick);
}
