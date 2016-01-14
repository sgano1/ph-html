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
package com.helger.html.hc.html.script;

import javax.annotation.Nonnull;

import com.helger.html.hc.html.IHCElementWithChildren;

/**
 * Interface for CANVASs
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCCanvas <THISTYPE extends IHCCanvas <THISTYPE>> extends IHCElementWithChildren <THISTYPE>
{
  long getHeight ();

  @Nonnull
  THISTYPE setHeight (long nHeight);

  long getWidth ();

  @Nonnull
  THISTYPE setWidth (long nWidth);
}
