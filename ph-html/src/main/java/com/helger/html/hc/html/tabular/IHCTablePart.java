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
package com.helger.html.hc.html.tabular;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import com.helger.html.hc.html.IHCElementWithInternalChildren;

/**
 * Interface for thead, tbody and tfoot
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCTablePart <THISTYPE extends IHCTablePart <THISTYPE>>
                              extends IHCElementWithInternalChildren <THISTYPE, HCRow>
{
  boolean isHeaderOrFooter ();

  @Nonnull
  HCRow addRow ();

  @Nonnull
  HCRow addRow (@Nonnegative int nIndex);
}
