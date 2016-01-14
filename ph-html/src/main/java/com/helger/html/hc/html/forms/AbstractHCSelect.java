/**
 * Copyright (C) 2014-2016 Philip Helger (www.helger.com)
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.CGlobal;
import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.CHTMLAttributeValues;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.impl.HCTextNode;
import com.helger.html.request.IHCRequestField;

/**
 * Represents an HTML &lt;select&gt; element
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        the implementation type
 */
public abstract class AbstractHCSelect <THISTYPE extends AbstractHCSelect <THISTYPE>>
                                       extends AbstractHCControl <THISTYPE> implements IHCSelect <THISTYPE>
{
  /** By default multi select is disabled */
  public static final boolean DEFAULT_MULTIPLE = false;

  // autofocus is inherited
  // disabled is inherited
  private String m_sForm;
  private boolean m_bMultiple = DEFAULT_MULTIPLE;
  // name is inherited
  // required is inherited
  private int m_nSize = CGlobal.ILLEGAL_UINT;

  private List <IHCNode> m_aOptions;
  private Set <String> m_aPreselectedValues;

  public AbstractHCSelect ()
  {
    super (EHTMLElement.SELECT);
  }

  public AbstractHCSelect (@Nullable final Collection <String> aPreselectedValues)
  {
    this ();
    m_aPreselectedValues = CollectionHelper.newSet (aPreselectedValues);
  }

  public AbstractHCSelect (@Nonnull final IHCRequestField aRF)
  {
    this (aRF.getRequestValueAsList ());
    setName (aRF.getFieldName ());
  }

  @Nullable
  public final String getForm ()
  {
    return m_sForm;
  }

  @Nonnull
  public final THISTYPE setForm (@Nullable final String sForm)
  {
    m_sForm = sForm;
    return thisAsT ();
  }

  public final boolean isMultiple ()
  {
    return m_bMultiple;
  }

  @Nonnull
  public final THISTYPE setMultiple (final boolean bMultiple)
  {
    m_bMultiple = bMultiple;
    return thisAsT ();
  }

  public final int getSize ()
  {
    return m_nSize;
  }

  @Nonnull
  public final THISTYPE setSize (final int nSize)
  {
    m_nSize = nSize;
    return thisAsT ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public Set <String> getAllPreselectedValues ()
  {
    return CollectionHelper.newSet (m_aPreselectedValues);
  }

  public boolean isPreselectedValue (@Nullable final String sValue)
  {
    return m_aPreselectedValues != null && m_aPreselectedValues.contains (sValue);
  }

  /**
   * Callback
   *
   * @param aOption
   *        The added option. Never <code>null</code>.
   */
  @OverrideOnDemand
  protected void onAddOption (@Nonnull final HCOption aOption)
  {}

  @Nonnull
  public final HCOption addOption (@Nonnull final HCOption aOption)
  {
    ValueEnforcer.notNull (aOption, "Option");

    // Ensure list is present
    if (m_aOptions == null)
      m_aOptions = new ArrayList <IHCNode> ();

    // Handle preselection (if no manual selection state was defined so far)
    if (!aOption.isSelectionDefined ())
      aOption.setSelected (isPreselectedValue (aOption.getValue ()));

    onAddOption (aOption);
    m_aOptions.add (aOption);
    return aOption;
  }

  @Nonnull
  public final HCOption addOptionAtIndex (@Nonnegative final int nIndex, @Nonnull final HCOption aOption)
  {
    ValueEnforcer.notNull (aOption, "Option");

    // Ensure list is present
    if (m_aOptions == null)
      m_aOptions = new ArrayList <> ();

    // Handle preselection (if no manual selection state was defined so far)
    if (!aOption.isSelectionDefined ())
      aOption.setSelected (isPreselectedValue (aOption.getValue ()));

    onAddOption (aOption);
    m_aOptions.add (nIndex, aOption);
    return aOption;
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sText)
  {
    return addOption (sText, sText);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sText, final boolean bSelected)
  {
    return addOption (sText, sText, bSelected);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue, @Nullable final String sText)
  {
    final HCOption aOption = new HCOption ().setValue (sValue).addChild (HCTextNode.createOnDemand (sText));
    return addOption (aOption);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue, @Nullable final String sText, final boolean bSelected)
  {
    return addOption (sValue, sText).setSelected (bSelected);
  }

  @Nonnull
  public final HCOption addOption (@Nullable final String sValue,
                                   @Nullable final String sText,
                                   @Nullable final String sSelectedValue)
  {
    return addOption (sValue, sText, EqualsHelper.equals (sValue, sSelectedValue));
  }

  @Nonnull
  public final HCOption addOptionAtIndex (@Nonnegative final int nIndex,
                                          @Nullable final String sValue,
                                          @Nullable final String sText)
  {
    final HCOption aOption = new HCOption ().setValue (sValue).addChild (HCTextNode.createOnDemand (sText));
    return addOptionAtIndex (nIndex, aOption);
  }

  @Nonnull
  public final THISTYPE addOptionGroup (@Nullable final HCOptGroup aOptGroup)
  {
    if (aOptGroup != null)
    {
      // Ensure list is present
      if (m_aOptions == null)
        m_aOptions = new ArrayList <IHCNode> ();
      m_aOptions.add (aOptGroup);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllOptions ()
  {
    if (m_aOptions != null)
    {
      final List <IHCNode> aRest = new ArrayList <IHCNode> ();
      for (final IHCNode aChild : m_aOptions)
        if (!(aChild instanceof HCOption))
          aRest.add (aChild);
      m_aOptions = aRest;
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllOptionGroups ()
  {
    if (m_aOptions != null)
    {
      final List <IHCNode> aRest = new ArrayList <IHCNode> ();
      for (final IHCNode aChild : m_aOptions)
        if (!(aChild instanceof HCOptGroup))
          aRest.add (aChild);
      m_aOptions = aRest;
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeOptionAtIndex (@Nonnegative final int nIndex)
  {
    if (m_aOptions != null)
    {
      int nMatch = 0;
      int nTotalIndex = 0;
      for (final IHCNode aChild : m_aOptions)
      {
        if (aChild instanceof HCOption)
          if (nMatch++ == nIndex)
          {
            m_aOptions.remove (nTotalIndex);
            break;
          }
        ++nTotalIndex;
      }
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeOptionGroupAtIndex (@Nonnegative final int nIndex)
  {
    if (m_aOptions != null)
    {
      int nMatch = 0;
      int nTotalIndex = 0;
      for (final IHCNode aChild : m_aOptions)
      {
        if (aChild instanceof HCOptGroup)
          if (nMatch++ == nIndex)
          {
            m_aOptions.remove (nTotalIndex);
            break;
          }
        ++nTotalIndex;
      }
    }
    return thisAsT ();
  }

  @Nonnegative
  public final int getOptionCount ()
  {
    int ret = 0;
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption)
          ret++;
    return ret;
  }

  @Nonnegative
  public final int getOptionGroupCount ()
  {
    int ret = 0;
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOptGroup)
          ret++;
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCOption> getAllOptions ()
  {
    final List <HCOption> ret = new ArrayList <HCOption> ();
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption)
          ret.add ((HCOption) aChild);
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCOptGroup> getAllOptionGroups ()
  {
    final List <HCOptGroup> ret = new ArrayList <HCOptGroup> ();
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOptGroup)
          ret.add ((HCOptGroup) aChild);
    return ret;
  }

  @Nullable
  public final HCOption getOptionAtIndex (@Nonnegative final int nIndex)
  {
    HCOption ret = null;
    if (m_aOptions != null)
    {
      int nMatch = 0;
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption)
          if (nMatch++ == nIndex)
          {
            ret = (HCOption) aChild;
            break;
          }
    }
    return ret;
  }

  @Nullable
  public final HCOptGroup getOptionGroupAtIndex (@Nonnegative final int nIndex)
  {
    HCOptGroup ret = null;
    if (m_aOptions != null)
    {
      int nMatch = 0;
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOptGroup)
          if (nMatch++ == nIndex)
          {
            ret = (HCOptGroup) aChild;
            break;
          }
    }
    return ret;
  }

  public final boolean hasOptions ()
  {
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption)
          return true;
    return false;
  }

  public final boolean hasOptionGroups ()
  {
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOptGroup)
          return true;
    return false;
  }

  @Nonnull
  @ReturnsMutableCopy
  public final List <HCOption> getAllSelectedOptions ()
  {
    final List <HCOption> ret = new ArrayList <HCOption> ();
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption && ((HCOption) aChild).isSelected ())
          ret.add ((HCOption) aChild);
    return ret;
  }

  @Nonnegative
  public final int getSelectedOptionCount ()
  {
    int ret = 0;
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption && ((HCOption) aChild).isSelected ())
          ++ret;
    return ret;
  }

  public final boolean hasSelectedOption ()
  {
    if (m_aOptions != null)
      for (final IHCNode aChild : m_aOptions)
        if (aChild instanceof HCOption && ((HCOption) aChild).isSelected ())
          return true;
    return false;
  }

  @Override
  @Nullable
  public List <? extends IHCNode> getAllChildren ()
  {
    return CollectionHelper.newList (m_aOptions);
  }

  @Override
  @Nullable
  public IHCNode getChildAtIndex (final int nIndex)
  {
    return CollectionHelper.getSafe (m_aOptions, nIndex);
  }

  @Override
  @Nullable
  public IHCNode getFirstChild ()
  {
    return CollectionHelper.getFirstElement (m_aOptions);
  }

  @Override
  @Nullable
  public IHCNode getLastChild ()
  {
    return CollectionHelper.getLastElement (m_aOptions);
  }

  @Override
  public boolean hasChildren ()
  {
    return CollectionHelper.isNotEmpty (m_aOptions);
  }

  @Override
  public int getChildCount ()
  {
    return CollectionHelper.getSize (m_aOptions);
  }

  @Override
  protected void fillMicroElement (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.fillMicroElement (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sForm))
      aElement.setAttribute (CHTMLAttributes.FORM, m_sForm);
    if (m_bMultiple)
      aElement.setAttribute (CHTMLAttributes.MULTIPLE, CHTMLAttributeValues.MULTIPLE);
    if (m_nSize > 1)
      aElement.setAttribute (CHTMLAttributes.SIZE, m_nSize);

    if (CollectionHelper.isNotEmpty (m_aOptions))
    {
      for (final IHCNode aOption : m_aOptions)
        aElement.appendChild (aOption.convertToMicroNode (aConversionSettings));
    }
    else
    {
      // Special check, as this is not derived from
      // AbstractHCElementWithChildren
      if (!getElement ().mayBeSelfClosed ())
        aElement.appendText ("");
    }
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("form", m_sForm)
                            .append ("multiple", m_bMultiple)
                            .append ("size", m_nSize)
                            .appendIfNotNull ("options", m_aOptions)
                            .appendIfNotNull ("preselectedValues", m_aPreselectedValues)
                            .toString ();
  }
}
