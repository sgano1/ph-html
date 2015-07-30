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
package com.helger.html.hchtml.grouping;

import javax.annotation.Nonnull;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.config.HCConsistencyChecker;
import com.helger.html.hcapi.IHCConversionSettingsToNode;
import com.helger.html.hchtml.AbstractHCElementWithChildren;
import com.helger.html.hchtml.HCHTMLHelper;
import com.helger.html.hchtml.IHCElement;

/**
 * Represents an HTML &lt;pre&gt; element with open semantics.
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public abstract class AbstractHCPre <THISTYPE extends AbstractHCPre <THISTYPE>> extends AbstractHCElementWithChildren <THISTYPE>implements IHCPre <THISTYPE>
{
  public AbstractHCPre ()
  {
    super (EHTMLElement.PRE);
  }

  @Override
  protected void onConsistencyCheck (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.onConsistencyCheck (aConversionSettings);
    final IHCElement <?> aChild = HCHTMLHelper.recursiveGetFirstChildWithTagName (this,
                                                                                  EHTMLElement.IMG,
                                                                                  EHTMLElement.OBJECT,
                                                                                  EHTMLElement.SMALL,
                                                                                  EHTMLElement.SUB,
                                                                                  EHTMLElement.SUP);
    if (aChild != null)
      HCConsistencyChecker.consistencyError ("PRE elements contains forbidden tag " + aChild.getElement ());
  }
}