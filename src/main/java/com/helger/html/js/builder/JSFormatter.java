/**
 * Copyright (C) 2014 Philip Helger (www.helger.com)
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
package com.helger.html.js.builder;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collection;

import javax.annotation.Nonnull;
import javax.annotation.WillCloseWhenClosed;

import com.helger.commons.ValueEnforcer;

/**
 * This is a utility class for managing indentation and other basic formatting
 * for {@link PrintWriter}.
 *
 * @author Philip Helger
 */
public class JSFormatter implements Closeable
{
  public static final String DEFAULT_INDENT = "  ";

  /**
   * String to be used for each indentation. Defaults to four spaces.
   */
  private final String m_sIndentSpace;

  /**
   * Stream associated with this JFormatter
   */
  private final PrintWriter m_aPW;
  /**
   * Current number of indentation strings to print
   */
  private int m_nIndentLevel;
  private String m_sIndentCache = "";
  private boolean m_bAtBeginningOfLine = true;
  private boolean m_bIndentAndAlign = true;
  private boolean m_bGenerateTypeNames = true;
  private boolean m_bGenerateComments = true;

  /**
   * Creates a formatter with default incremental indentations of 2 spaces.
   *
   * @param aWriter
   *        Writer to use
   */
  public JSFormatter (@Nonnull @WillCloseWhenClosed final Writer aWriter)
  {
    this (aWriter instanceof PrintWriter ? (PrintWriter) aWriter : new PrintWriter (aWriter));
  }

  /**
   * Creates a formatter with default incremental indentations of 2 spaces.
   *
   * @param aPrintWriter
   *        {@link PrintWriter} to be used
   */
  public JSFormatter (@Nonnull @WillCloseWhenClosed final PrintWriter aPrintWriter)
  {
    this (aPrintWriter, DEFAULT_INDENT);
  }

  /**
   * Creates a JFormatter.
   *
   * @param aPrintWriter
   *        PrintWriter to use.
   * @param sIndentSpace
   *        Incremental indentation string, similar to tab value.
   */
  public JSFormatter (@Nonnull @WillCloseWhenClosed final PrintWriter aPrintWriter, @Nonnull final String sIndentSpace)
  {
    m_aPW = ValueEnforcer.notNull (aPrintWriter, "PrintWriter");
    m_sIndentSpace = ValueEnforcer.notNull (sIndentSpace, "IndentSpace");
  }

  public boolean indentAndAlign ()
  {
    return m_bIndentAndAlign;
  }

  @Nonnull
  public JSFormatter indentAndAlign (final boolean bIndentAndAlign)
  {
    m_bIndentAndAlign = bIndentAndAlign;
    return this;
  }

  public boolean generateTypeNames ()
  {
    return m_bGenerateTypeNames;
  }

  @Nonnull
  public JSFormatter generateTypeNames (final boolean bGenerateTypeNames)
  {
    m_bGenerateTypeNames = bGenerateTypeNames;
    return this;
  }

  public boolean generateComments ()
  {
    return m_bGenerateComments;
  }

  @Nonnull
  public JSFormatter generateComments (final boolean bGenerateComments)
  {
    m_bGenerateComments = bGenerateComments;
    return this;
  }

  /**
   * Closes this formatter.
   */
  public void close () throws IOException
  {
    m_aPW.close ();
  }

  /**
   * Decrement the indentation level if {@link #indentAndAlign()} is on
   *
   * @return this
   */
  @Nonnull
  public JSFormatter outdent ()
  {
    if (m_bIndentAndAlign)
      outdentFix ();
    return this;
  }

  /**
   * Decrement the indentation level.
   *
   * @return this
   */
  @Nonnull
  public JSFormatter outdentFix ()
  {
    if (m_nIndentLevel == 0)
      throw new IllegalStateException ("Nothing left to outdent!");
    m_nIndentLevel--;
    m_sIndentCache = m_sIndentCache.substring (0, m_nIndentLevel * m_sIndentSpace.length ());
    return this;
  }

  /**
   * Increment the indentation level if {@link #indentAndAlign()} is on
   *
   * @return this
   */
  @Nonnull
  public JSFormatter indent ()
  {
    if (m_bIndentAndAlign)
      indentFix ();
    return this;
  }

  /**
   * Increment the indentation level.
   *
   * @return this
   */
  @Nonnull
  public JSFormatter indentFix ()
  {
    m_nIndentLevel++;
    m_sIndentCache += m_sIndentSpace;
    return this;
  }

  private void _spaceIfNeeded ()
  {
    if (m_bAtBeginningOfLine)
    {
      if (m_nIndentLevel > 0)
        m_aPW.print (m_sIndentCache);
      m_bAtBeginningOfLine = false;
    }
  }

  /**
   * Print a char into the stream
   *
   * @param cChar
   *        the char
   * @return this
   */
  @Nonnull
  public JSFormatter plain (final char cChar)
  {
    _spaceIfNeeded ();
    m_aPW.print (cChar);
    return this;
  }

  /**
   * Print a {@link String} into the stream
   *
   * @param sText
   *        the {@link String}
   * @return this
   */
  @Nonnull
  public JSFormatter plain (@Nonnull final String sText)
  {
    _spaceIfNeeded ();
    m_aPW.print (sText);
    return this;
  }

  /**
   * Print a type name.
   *
   * @param aType
   *        The type whose name is to be printed
   * @return this
   */
  @Nonnull
  public JSFormatter type (@Nonnull final AbstractJSType aType)
  {
    plain (aType.name ());
    return this;
  }

  /**
   * Print a new line into the stream if {@link #indentAndAlign()} is on
   *
   * @return this
   */
  @Nonnull
  public JSFormatter nl ()
  {
    if (m_bIndentAndAlign)
      nlFix ();
    return this;
  }

  /**
   * Print a new line into the stream
   *
   * @return this
   */
  @Nonnull
  public JSFormatter nlFix ()
  {
    m_aPW.print ('\n');
    m_bAtBeginningOfLine = true;
    return this;
  }

  /**
   * Cause the {@link IJSGeneratable} object to generate source for itself
   *
   * @param aGeneratable
   *        the {@link IJSGeneratable} object
   * @return this
   */
  @Nonnull
  public JSFormatter generatable (@Nonnull final IJSGeneratable aGeneratable)
  {
    aGeneratable.generate (this);
    return this;
  }

  /**
   * Produces {@link IJSGeneratable}s separated by ','
   *
   * @param aCont
   *        contained of {@link IJSGeneratable}
   * @return this
   */
  @Nonnull
  public JSFormatter generatable (@Nonnull final Collection <? extends IJSGeneratable> aCont)
  {
    boolean bFirst = true;
    for (final IJSGeneratable aItem : aCont)
    {
      if (bFirst)
        bFirst = false;
      else
        plain (',');
      generatable (aItem);
    }
    return this;
  }

  /**
   * Cause the {@link IJSDeclaration} to generate source for itself
   *
   * @param aDeclaration
   *        the {@link IJSDeclaration} object
   * @return this
   */
  @Nonnull
  public JSFormatter decl (@Nonnull final IJSDeclaration aDeclaration)
  {
    aDeclaration.declare (this);
    return this;
  }

  /**
   * Cause the {@link IJSStatement} to generate source for itself
   *
   * @param aStatement
   *        the {@link IJSStatement} object
   * @return this
   */
  @Nonnull
  public JSFormatter stmt (@Nonnull final IJSStatement aStatement)
  {
    aStatement.state (this);
    return this;
  }

  /**
   * Cause the {@link JSVar} to generate source for itself
   *
   * @param aVar
   *        the {@link JSVar} object
   * @return this
   */
  @Nonnull
  public JSFormatter var (@Nonnull final JSVar aVar)
  {
    aVar.bind (this);
    return this;
  }
}
