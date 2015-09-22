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
package com.helger.html.hc.config;

import java.nio.charset.Charset;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.debug.GlobalDebug;
import com.helger.commons.lang.ServiceLoaderHelper;
import com.helger.commons.system.ENewLineMode;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.IHCConversionSettings;

/**
 * Global HC settings
 *
 * @author Philip Helger
 */
@ThreadSafe
public final class HCSettings
{
  /** Default auto-complete for password fields: only in debug mode */
  public static final boolean DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS = !GlobalDebug.isDebugMode ();

  /** By default inline scripts are emitted in mode "wrap in comment" */
  public static final EHCScriptInlineMode DEFAULT_SCRIPT_INLINE_MODE = EHCScriptInlineMode.PLAIN_TEXT_WRAPPED_IN_COMMENT;

  /** By default plain text without escape is used */
  public static final EHCStyleInlineMode DEFAULT_STYLE_MODE = EHCStyleInlineMode.PLAIN_TEXT_NO_ESCAPE;

  private static final Logger s_aLogger = LoggerFactory.getLogger (HCSettings.class);

  private static final ReadWriteLock s_aRWLock = new ReentrantReadWriteLock ();

  /** HC to MicroNode converter settings */
  @GuardedBy ("s_aRWLock")
  private static HCConversionSettings s_aConversionSettings = new HCConversionSettings (EHTMLVersion.DEFAULT);

  /**
   * For security reasons, the password should not be auto-filled by the browser
   * in the release-version
   */
  @GuardedBy ("s_aRWLock")
  private static boolean s_bAutoCompleteOffForPasswordEdits = DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS;

  /** The "on document ready" code provider */
  @GuardedBy ("s_aRWLock")
  private static IHCOnDocumentReadyProvider s_aOnDocumentReadyProvider = new DefaultHCOnDocumentReadyProvider ();

  @GuardedBy ("s_aRWLock")
  private static EHCScriptInlineMode s_eScriptInlineMode = DEFAULT_SCRIPT_INLINE_MODE;

  @GuardedBy ("s_aRWLock")
  private static EHCStyleInlineMode s_eStyleInlineMode = DEFAULT_STYLE_MODE;

  @GuardedBy ("s_aRWLock")
  private static ENewLineMode s_eNewLineMode = ENewLineMode.DEFAULT;

  @GuardedBy ("s_aRWLock")
  private static boolean s_bOOBDebugging = false;

  @GuardedBy ("s_aRWLock")
  private static boolean s_bScriptsInBody = true;

  @GuardedBy ("s_aRWLock")
  private static boolean s_bUseRegularResources = GlobalDebug.isDebugMode ();

  static
  {
    // Apply all SPI settings providers
    for (final IHCSettingsProviderSPI aSPI : ServiceLoaderHelper.getAllSPIImplementations (IHCSettingsProviderSPI.class))
      aSPI.initHCSettings ();
  }

  private HCSettings ()
  {}

  /**
   * Set the global conversion settings.
   *
   * @param aConversionSettings
   *        The object to be used. May not be <code>null</code>.
   */
  public static void setConversionSettings (@Nonnull final HCConversionSettings aConversionSettings)
  {
    ValueEnforcer.notNull (aConversionSettings, "ConversionSettings");

    s_aRWLock.writeLock ().lock ();
    try
    {
      s_aConversionSettings = aConversionSettings;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return The global mutable conversion settings. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableObject ("design")
  public static HCConversionSettings getMutableConversionSettings ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_aConversionSettings;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  /**
   * @return The global read-only non-<code>null</code> conversion settings
   */
  @Nonnull
  public static IHCConversionSettings getConversionSettings ()
  {
    return getMutableConversionSettings ();
  }

  /**
   * @return The global read-only non-<code>null</code> conversion settings with
   *         XML namespaces disabled
   */
  @Nonnull
  public static HCConversionSettings getConversionSettingsWithoutNamespaces ()
  {
    // Create a copy!!
    final HCConversionSettings aCS = getMutableConversionSettings ().getClone ();
    // And modify the copied XML settings
    aCS.getXMLWriterSettings ().setEmitNamespaces (false);
    return aCS;
  }

  /**
   * Get the {@link Charset} that is used to create the HTML code.
   *
   * @return The non-<code>null</code> Charset object
   */
  @Nonnull
  public static Charset getHTMLCharset ()
  {
    return getConversionSettings ().getXMLWriterSettings ().getCharsetObj ();
  }

  /**
   * Set the default HTML version to use. This sets the HTML version in the
   * {@link HCSettings} class and performs some additional modifications
   * depending on the chosen version.
   *
   * @param eHTMLVersion
   *        The HTML version to use. May not be <code>null</code>.
   */
  public static void setDefaultHTMLVersion (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    ValueEnforcer.notNull (eHTMLVersion, "HTMLVersion");

    // Update the HCSettings
    getMutableConversionSettings ().setHTMLVersion (eHTMLVersion);

    // Update the XMLWriterSettings
    getMutableConversionSettings ().setXMLWriterSettings (HCConversionSettings.createDefaultXMLWriterSettings (eHTMLVersion));

    if (eHTMLVersion.isAtLeastHTML5 ())
    {
      // No need to put anything in a comment
      setScriptInlineMode (EHCScriptInlineMode.PLAIN_TEXT_NO_ESCAPE);
    }
    else
    {
      // Use default mode
      setScriptInlineMode (DEFAULT_SCRIPT_INLINE_MODE);
    }
  }

  public static boolean isAutoCompleteOffForPasswordEdits ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_bAutoCompleteOffForPasswordEdits;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  public static void setAutoCompleteOffForPasswordEdits (final boolean bOff)
  {
    s_aRWLock.writeLock ().lock ();
    try
    {
      s_bAutoCompleteOffForPasswordEdits = bOff;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  @Nonnull
  public static IHCOnDocumentReadyProvider getOnDocumentReadyProvider ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_aOnDocumentReadyProvider;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  public static void setOnDocumentReadyProvider (@Nonnull final IHCOnDocumentReadyProvider aOnDocumentReadyProvider)
  {
    ValueEnforcer.notNull (aOnDocumentReadyProvider, "OnDocumentReadyProvider");

    s_aRWLock.writeLock ().lock ();
    try
    {
      s_aOnDocumentReadyProvider = aOnDocumentReadyProvider;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return The default masking mode to emit script content. Never
   *         <code>null</code>.
   */
  @Nonnull
  public static EHCScriptInlineMode getScriptInlineMode ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_eScriptInlineMode;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  /**
   * Set how the content of script elements should be emitted. This only affects
   * new built objects, and does not alter existing objects! The default mode is
   * {@link #DEFAULT_SCRIPT_INLINE_MODE}.
   *
   * @param eMode
   *        The new masking mode to set. May not be <code>null</code>.
   */
  public static void setScriptInlineMode (@Nonnull final EHCScriptInlineMode eMode)
  {
    ValueEnforcer.notNull (eMode, "Mode");

    s_aRWLock.writeLock ().lock ();
    try
    {
      if (s_eScriptInlineMode != eMode)
      {
        s_eScriptInlineMode = eMode;
        s_aLogger.info ("Default <script> mode set to " + eMode);
      }
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return The default mode to emit style content. Never <code>null</code>.
   */
  @Nonnull
  public static EHCStyleInlineMode getStyleInlineMode ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_eStyleInlineMode;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  /**
   * Set how the content of style elements should be emitted. This only affects
   * new built objects, and does not alter existing objects! The default mode is
   * {@link #DEFAULT_STYLE_MODE}.
   *
   * @param eStyleInlineMode
   *        The new mode to set. May not be <code>null</code>.
   */
  public static void setStyleInlineMode (@Nonnull final EHCStyleInlineMode eStyleInlineMode)
  {
    ValueEnforcer.notNull (eStyleInlineMode, "mode");

    s_aRWLock.writeLock ().lock ();
    try
    {
      s_eStyleInlineMode = eStyleInlineMode;
      s_aLogger.info ("Default <style> mode set to " + eStyleInlineMode);
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  @Nonnull
  public static ENewLineMode getNewLineMode ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_eNewLineMode;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  public static void setNewLineMode (@Nonnull final ENewLineMode eNewLineMode)
  {
    ValueEnforcer.notNull (eNewLineMode, "NewLineMode");

    s_aRWLock.writeLock ().lock ();
    try
    {
      s_eNewLineMode = eNewLineMode;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  public static boolean isOutOfBandDebuggingEnabled ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_bOOBDebugging;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  public static void setOutOfBandDebuggingEnabled (final boolean bEnabled)
  {
    s_aRWLock.writeLock ().lock ();
    try
    {
      s_bOOBDebugging = bEnabled;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return <code>true</code> if &lt;script&gt; elements should be placed in
   *         the &lt;body&gt;, <code>false</code> if they should be placed in
   *         the &lt;head&gt;. Default is <code>true</code>.
   */
  public static boolean isScriptsInBody ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_bScriptsInBody;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  public static void setScriptsInBody (final boolean bEnabled)
  {
    s_aRWLock.writeLock ().lock ();
    try
    {
      s_bScriptsInBody = bEnabled;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return <code>true</code> to include regular, non-minified resources or
   *         <code>false</code> to include minified resources (JS + CSS).
   */
  public static boolean isUseRegularResources ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_bUseRegularResources;
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  public static void setUseRegularResources (final boolean bUseRegularResources)
  {
    s_aRWLock.writeLock ().lock ();
    try
    {
      s_bUseRegularResources = bUseRegularResources;
    }
    finally
    {
      s_aRWLock.writeLock ().unlock ();
    }
  }
}
