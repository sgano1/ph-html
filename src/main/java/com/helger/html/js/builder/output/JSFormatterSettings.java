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
package com.helger.html.js.builder.output;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.ICloneable;
import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotations.Nonempty;
import com.helger.commons.annotations.ReturnsMutableCopy;

/**
 * Settings for the textual representation of JSDOM objects
 *
 * @author Philip Helger
 */
@NotThreadSafe
public final class JSFormatterSettings implements IJSFormatterSettings, ICloneable <JSFormatterSettings>
{
  private boolean m_bIndentAndAlign;
  private boolean m_bGenerateTypeNames;
  private boolean m_bGenerateComments;
  private String m_sIndent;

  public JSFormatterSettings ()
  {
    m_bIndentAndAlign = JSFormatterDefaultSettings.isIndentAndAlign ();
    m_bGenerateTypeNames = JSFormatterDefaultSettings.isGenerateTypeNames ();
    m_bGenerateComments = JSFormatterDefaultSettings.isGenerateComments ();
    m_sIndent = JSFormatterDefaultSettings.getIndent ();
  }

  public JSFormatterSettings (@Nonnull final IJSFormatterSettings aOther)
  {
    ValueEnforcer.notNull (aOther, "Other");
    m_bIndentAndAlign = aOther.isIndentAndAlign ();
    m_bGenerateTypeNames = aOther.isGenerateTypeNames ();
    m_bGenerateComments = aOther.isGenerateComments ();
    m_sIndent = aOther.getIndent ();
  }

  public boolean isIndentAndAlign ()
  {
    return m_bIndentAndAlign;
  }

  @Nonnull
  public IJSFormatterSettings setIndentAndAlign (final boolean bIndentAndAlign)
  {
    m_bIndentAndAlign = bIndentAndAlign;
    return this;
  }

  public boolean isGenerateTypeNames ()
  {
    return m_bGenerateTypeNames;
  }

  @Nonnull
  public IJSFormatterSettings setGenerateTypeNames (final boolean bGenerateTypeNames)
  {
    m_bGenerateTypeNames = bGenerateTypeNames;
    return this;
  }

  public boolean isGenerateComments ()
  {
    return m_bGenerateComments;
  }

  @Nonnull
  public IJSFormatterSettings setGenerateComments (final boolean bGenerateComments)
  {
    m_bGenerateComments = bGenerateComments;
    return this;
  }

  /**
   * This is a wrapper around {@link #setIndentAndAlign(boolean)},
   * {@link #setGenerateTypeNames(boolean)} and
   * {@link #setGenerateComments(boolean)}
   *
   * @param bMinimumCodeSize
   *        true for minimum code size
   * @return this
   */
  @Nonnull
  public IJSFormatterSettings setMinimumCodeSize (final boolean bMinimumCodeSize)
  {
    setIndentAndAlign (!bMinimumCodeSize);
    setGenerateTypeNames (!bMinimumCodeSize);
    setGenerateComments (!bMinimumCodeSize);
    return this;
  }

  @Nonnull
  @Nonempty
  public String getIndent ()
  {
    return m_sIndent;
  }

  @Nonnull
  public IJSFormatterSettings setIndent (@Nonnull @Nonempty final String sIndent)
  {
    m_sIndent = ValueEnforcer.notEmpty (sIndent, "Indent");
    return this;
  }

  @Nonnull
  @ReturnsMutableCopy
  public JSFormatterSettings getClone ()
  {
    return new JSFormatterSettings (this);
  }
}
