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
package com.helger.html.hc.html.forms;

import java.util.List;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.ReturnsMutableCopy;

/**
 * Interface for definition items
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCSelect <THISTYPE extends IHCSelect <THISTYPE>> extends IHCControl <THISTYPE>
{
  boolean isAutoFocus ();

  @Nonnull
  THISTYPE setAutoFocus (final boolean bAutoFocus);

  @Nullable
  String getForm ();

  @Nonnull
  THISTYPE setForm (@Nullable String sForm);

  boolean isMultiple ();

  @Nonnull
  THISTYPE setMultiple (final boolean bMultiple);

  int getSize ();

  @Nonnull
  THISTYPE setSize (final int nSize);

  @Nonnull
  @ReturnsMutableCopy
  Set <String> getAllPreselectedValues ();

  boolean isPreselectedValue (@Nullable String sValue);

  @Nonnull
  HCOption addOption (@Nonnull HCOption aOption);

  @Nonnull
  HCOption addOptionAtIndex (@Nonnegative int nIndex, @Nonnull HCOption aOption);

  @Nonnull
  HCOption addOption (@Nullable String sText);

  @Nonnull
  HCOption addOption (@Nullable String sText, boolean bSelected);

  @Nonnull
  HCOption addOption (@Nullable String sValue, @Nullable String sText);

  @Nonnull
  HCOption addOption (@Nullable String sValue, @Nullable String sText, boolean bSelected);

  @Nonnull
  HCOption addOption (@Nullable String sValue, @Nullable String sText, @Nullable String sSelectedValue);

  @Nonnull
  HCOption addOptionAtIndex (final int nIndex, String sValue, String sText);

  @Nonnull
  THISTYPE addOptionGroup (@Nullable HCOptGroup aOptGroup);

  @Nonnull
  THISTYPE removeAllOptions ();

  @Nonnull
  THISTYPE removeAllOptionGroups ();

  @Nonnull
  THISTYPE removeOptionAtIndex (@Nonnegative int nIndex);

  @Nonnull
  THISTYPE removeOptionGroupAtIndex (@Nonnegative int nIndex);

  /**
   * @return The number of available options.
   */
  @Nonnegative
  int getOptionCount ();

  /**
   * @return The number of available option groups.
   */
  @Nonnegative
  int getOptionGroupCount ();

  /**
   * @return A non-<code>null</code> list of all available options.
   */
  @Nonnull
  @ReturnsMutableCopy
  List <HCOption> getAllOptions ();

  /**
   * @return A non-<code>null</code> list of all available option groups.
   */
  @Nonnull
  @ReturnsMutableCopy
  List <HCOptGroup> getAllOptionGroups ();

  /**
   * Get the option at the specified index
   *
   * @param nIndex
   *        The index to retrieve. Should always be &ge; 0.
   * @return <code>null</code> if no option is available for the specified
   *         index.
   */
  @Nullable
  HCOption getOptionAtIndex (@Nonnegative int nIndex);

  /**
   * Get the option group at the specified index
   *
   * @param nIndex
   *        The index to retrieve. Should always be &ge; 0.
   * @return <code>null</code> if no option group is available for the specified
   *         index.
   */
  @Nullable
  HCOptGroup getOptionGroupAtIndex (@Nonnegative int nIndex);

  /**
   * @return <code>true</code> if this select has at least one option.
   */
  boolean hasOptions ();

  /**
   * @return <code>true</code> if this select has at least one option group.
   */
  boolean hasOptionGroups ();

  /**
   * @return A non-<code>null</code> list of all selected options.
   */
  @Nonnull
  @ReturnsMutableCopy
  List <HCOption> getAllSelectedOptions ();

  /**
   * @return The number of selected options. Always &ge; 0.
   */
  @Nonnegative
  int getSelectedOptionCount ();

  /**
   * Check if this select has at least one selected option
   *
   * @return <code>true</code> if at least one option is selected
   */
  boolean hasSelectedOption ();
}
