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

import com.helger.commons.xml.serialize.IXMLWriterSettings;
import com.helger.css.ICSSWriterSettings;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.customize.IHCCustomizer;
import com.helger.html.js.builder.output.IJSFormatterSettings;

/**
 * Provider interface for {@link HCConversionSettings} objects.
 *
 * @author Philip Helger
 */
public interface IHCConversionSettingsProvider
{
  /**
   * @return The HTML version to use. May not be <code>null</code>.
   */
  @Nonnull
  EHTMLVersion getHTMLVersion ();

  /**
   * Get the conversion settings using default pretty print mode.
   *
   * @return The non-<code>null</code> conversion settings object.
   */
  @Nonnull
  IHCConversionSettings getConversionSettings ();

  /**
   * Get the conversion settings.
   *
   * @param bPrettyPrint
   *        Should the output be indented and aligned (pretty printed)?
   * @return The non-<code>null</code> conversion settings object.
   */
  @Nonnull
  IHCConversionSettings getConversionSettings (boolean bPrettyPrint);

  @Nonnull
  IHCConversionSettingsProvider setXMLWriterSettings (@Nonnull IXMLWriterSettings aXMLWriterSettings);

  @Nonnull
  IHCConversionSettingsProvider setCSSWriterSettings (@Nonnull ICSSWriterSettings aCSSWriterSettings);

  @Nonnull
  IHCConversionSettingsProvider setJSFormatterSettings (@Nonnull IJSFormatterSettings aJSFormatterSettings);

  @Nonnull
  IHCConversionSettingsProvider setConsistencyChecksEnabled (boolean bConsistencyChecksEnabled);

  @Nonnull
  IHCConversionSettingsProvider setExtractOutOfBandNodes (boolean bExtractOutOfBandNodes);

  @Nonnull
  IHCConversionSettingsProvider setCustomizer (@Nonnull IHCCustomizer aCustomizer);
}
