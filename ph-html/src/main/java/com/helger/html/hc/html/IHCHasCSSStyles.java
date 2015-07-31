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

import java.util.Collection;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.DevelopersNote;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.css.ICSSWriterSettings;
import com.helger.css.property.ECSSProperty;
import com.helger.css.propertyvalue.ICSSValue;

/**
 * Base interface for objects having CSS styles
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCHasCSSStyles <THISTYPE extends IHCHasCSSStyles <THISTYPE>>
{
  /**
   * Add an element specific style (that is not consistency checked).
   *
   * @param eProperty
   *        The CSS property to be added. May not be <code>null</code>.
   * @param sPropertyValue
   *        The property value to be used. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyle (@Nonnull ECSSProperty eProperty, @Nonnull @Nonempty String sPropertyValue);

  /**
   * Add an element specific style.
   *
   * @param aValue
   *        The value to be added. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyle (@Nullable ICSSValue aValue);

  @Nonnull
  @Deprecated
  @DevelopersNote ("Use addStyle instead!")
  THISTYPE addStyles (@Nullable ICSSValue aValue);

  /**
   * Add element specific styles.
   *
   * @param aValues
   *        The values to be added. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyles (@Nullable final ICSSValue... aValues);

  /**
   * Add element specific styles.
   *
   * @param aValues
   *        The values to be added. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE addStyles (@Nullable final Iterable <? extends ICSSValue> aValues);

  /**
   * Remove the specified style from the element
   *
   * @param eProperty
   *        The style property to remove
   * @return this
   */
  @Nonnull
  THISTYPE removeStyle (@Nonnull ECSSProperty eProperty);

  /**
   * Remove all styles from the element
   *
   * @return this
   */
  @Nonnull
  THISTYPE removeAllStyles ();

  /**
   * @return A copy of all contained styles. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  Map <ECSSProperty, ICSSValue> getAllStyles ();

  /**
   * @return All style values. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  Collection <ICSSValue> getAllStyleValues ();

  /**
   * Find the style value associated to a single property.
   * 
   * @param eProperty
   *        The property to search. May be <code>null</code>.
   * @return <code>null</code> if no such style is contained.
   */
  @Nullable
  ICSSValue getStyleValue (@Nullable ECSSProperty eProperty);

  /**
   * Check if a style value is associated to a single property.
   * 
   * @param eProperty
   *        The property to search. May be <code>null</code>.
   * @return <code>true</code> if a respective style is present,
   *         <code>false</code> otherwise.
   */
  boolean containsStyle (@Nullable ECSSProperty eProperty);

  /**
   * Check if the style property is contained, and the value matches.
   *
   * @param aValue
   *        The value to be checked
   * @return <code>true</code> if such a CSS value is contained,
   *         <code>false</code> otherwise
   */
  boolean hasStyle (@Nullable ICSSValue aValue);

  /**
   * @return <code>true</code> if at least one CSS style is assigned,
   *         <code>false</code> otherwise.
   */
  boolean hasAnyStyle ();

  /**
   * The value to be set to the HTML style attribute
   *
   * @param aCSSSettings
   *        The CSS settings to use
   * @return <code>null</code> if no styles are present
   */
  @Nullable
  String getAllStylesAsString (@Nonnull ICSSWriterSettings aCSSSettings);
}
