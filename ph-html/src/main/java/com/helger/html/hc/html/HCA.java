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
package com.helger.html.hc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.string.StringHelper;
import com.helger.commons.url.ISimpleURL;
import com.helger.commons.url.URLValidator;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.base.AbstractHCA;
import com.helger.html.hc.impl.HCTextNode;

/**
 * Represents an HTML &lt;a&gt; element
 *
 * @author Philip Helger
 */
public class HCA extends AbstractHCA <HCA>
{
  public HCA ()
  {}

  public HCA (@Nonnull final String sHref)
  {
    super (sHref);
  }

  public HCA (@Nonnull final ISimpleURL aHref)
  {
    super (aHref);
  }

  @Nullable
  public static IHCNode createLinkedWebsite (@Nullable final String sWebsite)
  {
    return createLinkedWebsite (sWebsite, (HC_Target) null);
  }

  @Nullable
  public static IHCNode createLinkedWebsite (@Nullable final String sWebsite, @Nullable final HC_Target aTarget)
  {
    if (StringHelper.hasNoText (sWebsite))
      return null;

    if (!URLValidator.isValid (sWebsite))
      return new HCTextNode (sWebsite);

    return new HCA (sWebsite).setTarget (aTarget).addChild (sWebsite);
  }
}
