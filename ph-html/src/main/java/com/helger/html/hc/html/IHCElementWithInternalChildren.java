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

import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCNode;

/**
 * Interface for elements having children of a certain type.
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 * @param <CHILDTYPE>
 *        Contained child type
 */
public interface IHCElementWithInternalChildren <IMPLTYPE extends IHCElementWithInternalChildren <IMPLTYPE, CHILDTYPE>, CHILDTYPE extends IHCNode>
                                                extends
                                                IHCElement <IMPLTYPE>,
                                                IHCHasChildrenMutable <IMPLTYPE, CHILDTYPE>
{
  /** empty */
}
