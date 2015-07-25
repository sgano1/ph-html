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
package com.helger.html.mock;

import javax.annotation.Nonnull;
import javax.annotation.OverridingMethodsMustInvokeSuper;

import org.junit.rules.ExternalResource;

import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.html.hc.config.DefaultHCOnDocumentReadyProvider;
import com.helger.html.hc.config.HCSettings;
import com.helger.html.hc.customize.IHCOnDocumentReadyProvider;
import com.helger.html.js.IHasJSCode;
import com.helger.html.js.provider.UnparsedJSCodeProvider;

/**
 * A JUnit test rule that ensures that optimized HTML, CSS and JS output is
 * created.
 *
 * @author Philip Helger
 * @since 4.7.0
 */
public class HCTestRuleOptimized extends ExternalResource
{
  public HCTestRuleOptimized ()
  {}

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  public void before ()
  {
    HCSettings.getConversionSettingsProvider ().setToOptimized ();
    HCSettings.setOnDocumentReadyProvider (new IHCOnDocumentReadyProvider ()
    {
      @Nonnull
      public IHasJSCode createOnDocumentReady (@Nonnull final IHasJSCode aJSCodeProvider)
      {
        // Fake jQuery style code :)
        return new UnparsedJSCodeProvider ("$(document).ready(function(){" + aJSCodeProvider.getJSCode () + "});");
      }
    });
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  public void after ()
  {
    HCSettings.setOnDocumentReadyProvider (new DefaultHCOnDocumentReadyProvider ());
    HCSettings.getConversionSettingsProvider ().setToDefault ();
  }
}
