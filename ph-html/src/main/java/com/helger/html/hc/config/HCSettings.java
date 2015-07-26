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
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.debug.GlobalDebug;
import com.helger.commons.lang.ServiceLoaderHelper;
import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.microdom.serialize.MicroWriter;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.conversion.HCConversionSettings;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.hc.customize.IHCOnDocumentReadyProvider;
import com.helger.html.hc.html.HCHtml;
import com.helger.html.hc.html.HCScript;

/**
 * Global HC settings
 *
 * @author Philip Helger
 */
@ThreadSafe
public final class HCSettings
{
  /** Default auto-complete for password fields: false */
  public static final boolean DEFAULT_AUTO_COMPLETE_OFF_FOR_PASSWORD_EDITS = false;

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
   * Convert the passed HC node to a micro node using the default conversion
   * settings.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCNode aHCNode)
  {
    return aHCNode.convertToMicroNode (getConversionSettings ());
  }

  /**
   * Convert the passed node to it's HTML representation. First this HC-node is
   * converted to a micro node, which is than
   *
   * @param aHCNode
   *        The HC node to be converted to an HTML string. May not be
   *        <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as HTML string. Never <code>null</code>.
   */
  @Nonnull
  public final static String getAsHTMLString (@Nonnull final IHCNode aHCNode,
                                              @Nonnull final IHCConversionSettings aConversionSettings)
  {
    IMicroNode aMicroNode;
    if (aHCNode instanceof HCHtml)
    {
      // Apply customizer first
      aMicroNode = ((HCHtml) aHCNode).customizeAndConvertToMicroNode (aConversionSettings);
    }
    else
      aMicroNode = aHCNode.convertToMicroNode (aConversionSettings);
    if (aMicroNode == null)
      return "";
    return MicroWriter.getNodeAsString (aMicroNode, aConversionSettings.getXMLWriterSettings ());
  }

  /**
   * Convert the passed HC node to an HTML string using the default conversion
   * settings.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCNode aHCNode)
  {
    return getAsHTMLString (aHCNode, getConversionSettings ());
  }

  /**
   * Convert the passed HC node to an HTML string without namespaces. Indent and
   * align status is determined from {@link GlobalDebug#isDebugMode()}
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLStringWithoutNamespaces (@Nonnull final IHCNode aHCNode)
  {
    return getAsHTMLStringWithoutNamespaces (aHCNode, getConversionSettings ());
  }

  /**
   * Convert the passed HC node to an HTML string without namespaces.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLStringWithoutNamespaces (@Nonnull final IHCNode aHCNode,
                                                         @Nonnull final IHCConversionSettings aConversionSettings)
  {
    // Create a copy
    final HCConversionSettings aRealCS = new HCConversionSettings (aConversionSettings);
    // And modify the copied XML settings
    aRealCS.getXMLWriterSettings ().setEmitNamespaces (false);
    return getAsHTMLString (aHCNode, aRealCS);
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
      HCScript.setDefaultMode (HCScript.EMode.PLAIN_TEXT_NO_ESCAPE);
    }
    else
    {
      // Use default mode
      HCScript.setDefaultMode (HCScript.DEFAULT_MODE);
    }
  }

  public static boolean isAutoCompleteOffForPasswordEdits ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      // Extremely annoying for development...
      return s_bAutoCompleteOffForPasswordEdits && !GlobalDebug.isDebugMode ();
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
}
