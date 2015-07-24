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
package com.helger.html.hc.customize;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.debug.GlobalDebug;

/**
 * Default settings for HTML controls
 *
 * @author Philip Helger
 */
@NotThreadSafe
public final class HCDefaultSettings
{
  /** Default auto-complete for password fields: false */
  public static final boolean DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS = false;

  static final Logger s_aLogger = LoggerFactory.getLogger (HCDefaultSettings.class);

  // For security reasons, the password should not be auto-filled by the browser
  // in the release-version
  private static boolean s_bAutoCompleteOffForPasswordEdits = DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS;

  /*
   * Dummy implementation that returns the code as is.
   */
  private static IHCOnDocumentReadyProvider s_aOnDocumentReadyProvider = new DefaultHCOnDocumentReadyProvider ();

  private HCDefaultSettings ()
  {}

  public static boolean isAutoCompleteOffForPasswordEdits ()
  {
    // Extremely annoying for development...
    return s_bAutoCompleteOffForPasswordEdits && !GlobalDebug.isDebugMode ();
  }

  public static void setAutoCompleteOffForPasswordEdits (final boolean bOff)
  {
    s_bAutoCompleteOffForPasswordEdits = bOff;
  }

  @Nonnull
  public static IHCOnDocumentReadyProvider getOnDocumentReadyProvider ()
  {
    return s_aOnDocumentReadyProvider;
  }

  public static void setOnDocumentReadyProvider (@Nonnull final IHCOnDocumentReadyProvider aOnDocumentReadyProvider)
  {
    ValueEnforcer.notNull (aOnDocumentReadyProvider, "OnDocumentReadyProvider");
    s_aOnDocumentReadyProvider = aOnDocumentReadyProvider;
  }
}
