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
package com.helger.html.hc.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.CGlobal;
import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.annotation.ReturnsMutableObject;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.collection.ext.CommonsArrayList;
import com.helger.commons.collection.ext.ICommonsList;
import com.helger.commons.microdom.IMicroContainer;
import com.helger.commons.microdom.MicroContainer;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCNode;

/**
 * This class is an abstract HC node that represents a list of nodes without
 * creating an HTML element by itself.
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 * @param <CHILDTYPE>
 *        Child type
 */
@NotThreadSafe
public abstract class AbstractHCHasChildrenMutable <THISTYPE extends AbstractHCHasChildrenMutable <THISTYPE, CHILDTYPE>, CHILDTYPE extends IHCNode>
                                                   extends AbstractHCNode
                                                   implements IHCHasChildrenMutable <THISTYPE, CHILDTYPE>
{
  private ICommonsList <CHILDTYPE> m_aChildren;

  public AbstractHCHasChildrenMutable ()
  {}

  @Override
  public final boolean hasChildren ()
  {
    return CollectionHelper.isNotEmpty (m_aChildren);
  }

  /**
   * Callback
   *
   * @param aChild
   *        The child that was added
   */
  @OverrideOnDemand
  protected void beforeAddChild (@Nonnull final CHILDTYPE aChild)
  {}

  /**
   * Callback
   *
   * @param nIndex
   *        Index where the child was added. Always &ge; 0.
   * @param aChild
   *        The child that was added
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void afterAddChild (@Nonnegative final int nIndex, @Nonnull final CHILDTYPE aChild)
  {}

  private void _internalAddChild (@CheckForSigned final int nIndex, @Nullable final CHILDTYPE aChild)
  {
    if (aChild == this)
      throw new IllegalArgumentException ("Cannot append child to self: " + aChild);

    if (aChild != null)
    {
      beforeAddChild (aChild);
      if (m_aChildren == null)
        m_aChildren = new CommonsArrayList <> ();
      int nAddIndex;
      if (nIndex < 0)
      {
        nAddIndex = m_aChildren.size ();
        m_aChildren.add (aChild);
      }
      else
      {
        nAddIndex = nIndex;
        m_aChildren.add (nIndex, aChild);
      }
      afterAddChild (nAddIndex, aChild);
    }
  }

  @Nonnull
  public final THISTYPE addChild (@Nullable final CHILDTYPE aChild)
  {
    _internalAddChild (CGlobal.ILLEGAL_UINT, aChild);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE addChild (@Nonnegative final int nIndex, @Nullable final CHILDTYPE aChild)
  {
    ValueEnforcer.isBetweenInclusive (nIndex, "Index", 0, getChildCount ());
    _internalAddChild (nIndex, aChild);
    return thisAsT ();
  }

  /**
   * Invoked after an element was removed.
   *
   * @param nIndex
   *        The index where the element was removed from. Always &ge; 0. This is
   *        the OLD index and now contains a different or no child.
   * @param aChild
   *        The child that was removed. Never <code>null</code>.
   */
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void afterRemoveChild (@Nonnegative final int nIndex, @Nonnull final CHILDTYPE aChild)
  {}

  @Nonnull
  public final THISTYPE removeChild (@Nullable final CHILDTYPE aChild)
  {
    if (aChild != null && m_aChildren != null)
    {
      final int nChildIndex = m_aChildren.indexOf (aChild);
      if (nChildIndex >= 0)
        removeChild (nChildIndex);
    }
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeChild (@Nonnegative final int nIndex)
  {
    final CHILDTYPE aRemovedChild = CollectionHelper.removeAndReturnElementAtIndex (m_aChildren, nIndex);
    if (aRemovedChild != null)
      afterRemoveChild (nIndex, aRemovedChild);
    return thisAsT ();
  }

  @Nonnull
  public final THISTYPE removeAllChildren ()
  {
    if (m_aChildren != null)
    {
      while (m_aChildren.isNotEmpty ())
        removeChild (0);
      m_aChildren = null;
    }
    return thisAsT ();
  }

  @Override
  @Nonnegative
  public final int getChildCount ()
  {
    return CollectionHelper.getSize (m_aChildren);
  }

  @Nullable
  @ReturnsMutableObject ("speed")
  protected final ICommonsList <CHILDTYPE> directGetChildren ()
  {
    return m_aChildren;
  }

  @Override
  @Nonnull
  @ReturnsMutableCopy
  public final ICommonsList <CHILDTYPE> getAllChildren ()
  {
    return CollectionHelper.newList (m_aChildren);
  }

  @Override
  @Nullable
  public final CHILDTYPE getChildAtIndex (@Nonnegative final int nIndex)
  {
    return CollectionHelper.getAtIndex (m_aChildren, nIndex, null);
  }

  @Override
  @Nullable
  public final CHILDTYPE getFirstChild ()
  {
    return CollectionHelper.getFirstElement (m_aChildren);
  }

  @Override
  @Nullable
  public final CHILDTYPE getLastChild ()
  {
    return CollectionHelper.getLastElement (m_aChildren);
  }

  @Nonnull
  public final THISTYPE sortAllChildren (@Nonnull final Comparator <? super CHILDTYPE> aComparator)
  {
    ValueEnforcer.notNull (aComparator, "Comparator");
    if (m_aChildren != null)
      Collections.sort (m_aChildren, aComparator);
    return thisAsT ();
  }

  @Nonnull
  public final HCNodeList getAllChildrenAsNodeList ()
  {
    return new HCNodeList ().addChildren (m_aChildren);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  public boolean canConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    if (hasChildren ())
    {
      // If at least one child is present and can be converted to a node, the
      // whole list can be converted to a node
      for (final CHILDTYPE aChild : m_aChildren)
        if (aChild.canConvertToMicroNode (aConversionSettings))
          return true;
    }
    // No children, or all children cannot be converted -> cannot convert this
    // list
    return false;
  }

  /**
   * Helper method that returns the elements in the correct order for emitting.
   * This can e.g. be used for sorting or ordering.
   *
   * @param aChildren
   *        The children to be emitted. Is a direct reference to the container
   *        where the children are stored. So handle with care!
   * @return The non-<code>null</code> list with all child elements to be
   *         emitted.
   */
  @Nonnull
  @Nonempty
  @OverrideOnDemand
  protected List <? extends CHILDTYPE> getChildrenFormEmitting (@Nonnull @Nonempty final List <CHILDTYPE> aChildren)
  {
    return aChildren;
  }

  @Nonnull
  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected IMicroContainer internalConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    final IMicroContainer ret = new MicroContainer ();
    if (hasChildren ())
      for (final CHILDTYPE aNode : getChildrenFormEmitting (m_aChildren))
        ret.appendChild (aNode.convertToMicroNode (aConversionSettings));
    return ret;
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    if (!hasChildren ())
      return "";

    final StringBuilder ret = new StringBuilder ();
    for (final CHILDTYPE aChild : getChildrenFormEmitting (m_aChildren))
    {
      final String sPlainText = aChild.getPlainText ();
      if (StringHelper.hasText (sPlainText))
      {
        if (ret.length () > 0)
          ret.append (' ');
        ret.append (sPlainText);
      }
    }
    return ret.toString ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("children", m_aChildren).toString ();
  }
}
