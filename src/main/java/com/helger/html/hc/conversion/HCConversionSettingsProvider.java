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
package com.helger.html.hc.conversion;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotations.OverrideOnDemand;
import com.helger.commons.xml.serialize.EXMLSerializeIndent;
import com.helger.commons.xml.serialize.IXMLWriterSettings;
import com.helger.css.writer.CSSWriterSettings;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.customize.IHCCustomizer;

/**
 * Default implementation of {@link IHCConversionSettingsProvider} using a
 * provided {@link EHTMLVersion}.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class HCConversionSettingsProvider implements IHCConversionSettingsProvider
{
  private final HCConversionSettings m_aCSPrettyPrint;
  private HCConversionSettings m_aCSOptimized;

  public HCConversionSettingsProvider (@Nonnull final EHTMLVersion eHTMLVersion)
  {
    ValueEnforcer.notNull (eHTMLVersion, "HTMLVersion");
    m_aCSPrettyPrint = new HCConversionSettings (eHTMLVersion);
  }

  @Nonnull
  public EHTMLVersion getHTMLVersion ()
  {
    return m_aCSPrettyPrint.getHTMLVersion ();
  }

  /**
   * @param aCSOptimized
   *        The settings to be modified for optimized output. Never
   *        <code>null</code>.
   */
  @OverrideOnDemand
  protected void modifyOptimizedConversionSettings (@Nonnull final HCConversionSettings aCSOptimized)
  {
    aCSOptimized.getXMLWriterSettings ().setIndent (EXMLSerializeIndent.NONE);
    aCSOptimized.getCSSWriterSettings ().setOptimizedOutput (true).setRemoveUnnecessaryCode (true);
    aCSOptimized.setConsistencyChecksEnabled (false);
  }

  @Nonnull
  private HCConversionSettings _getOrCreateOptimized ()
  {
    if (m_aCSOptimized == null)
    {
      // Lazily create optimized version
      m_aCSOptimized = m_aCSPrettyPrint.getClone ();
      // Modify settings
      modifyOptimizedConversionSettings (m_aCSOptimized);
    }
    return m_aCSOptimized;
  }

  @Nonnull
  public HCConversionSettings getConversionSettings ()
  {
    return getConversionSettings (HCSettings.isDefaultPrettyPrint ());
  }

  @Nonnull
  public HCConversionSettings getConversionSettings (final boolean bPrettyPrint)
  {
    return bPrettyPrint ? m_aCSPrettyPrint : _getOrCreateOptimized ();
  }

  @Nonnull
  public HCConversionSettingsProvider setXMLWriterSettings (@Nonnull final IXMLWriterSettings aXMLWriterSettings)
  {
    m_aCSPrettyPrint.setXMLWriterSettings (aXMLWriterSettings);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setCSSWriterSettings (@Nonnull final CSSWriterSettings aCSSWriterSettings)
  {
    m_aCSPrettyPrint.setCSSWriterSettings (aCSSWriterSettings);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setConsistencyChecksEnabled (final boolean bConsistencyChecksEnabled)
  {
    m_aCSPrettyPrint.setConsistencyChecksEnabled (bConsistencyChecksEnabled);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setExtractOutOfBandNodes (final boolean bExtractOutOfBandNodes)
  {
    m_aCSPrettyPrint.setExtractOutOfBandNodes (bExtractOutOfBandNodes);
    m_aCSOptimized = null;
    return this;
  }

  @Nonnull
  public HCConversionSettingsProvider setCustomizer (@Nonnull final IHCCustomizer aCustomizer)
  {
    m_aCSPrettyPrint.setCustomizer (aCustomizer);
    m_aCSOptimized = null;
    return this;
  }
}
