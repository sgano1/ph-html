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
package com.helger.html.hc.html.forms;

import javax.annotation.Nonnull;

import com.helger.html.annotation.SinceHTML5;
import com.helger.html.hc.html.IHCElementWithChildren;

/**
 * Interface for METERs
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
@SinceHTML5
public interface IHCMeter <THISTYPE extends IHCMeter <THISTYPE>> extends IHCElementWithChildren <THISTYPE>
{
  double getValue ();

  @Nonnull
  THISTYPE setValue (double dValue);

  double getMin ();

  @Nonnull
  THISTYPE setMin (double dMin);

  double getMax ();

  @Nonnull
  THISTYPE setMax (double dMax);

  double getLow ();

  @Nonnull
  THISTYPE setLow (double dLow);

  double getHigh ();

  @Nonnull
  THISTYPE setHigh (double dHigh);

  double getOptimum ();

  @Nonnull
  THISTYPE setOptimum (double dOptimum);
}
