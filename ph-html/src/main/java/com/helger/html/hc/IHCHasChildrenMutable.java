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
package com.helger.html.hc;

import java.util.Comparator;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.DevelopersNote;
import com.helger.commons.traits.IGenericImplTrait;

/**
 * Base interface for HC nodes that have mutable children.
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 * @param <CHILDTYPE>
 *        Desired child type
 */
public interface IHCHasChildrenMutable <IMPLTYPE extends IHCHasChildrenMutable <IMPLTYPE, CHILDTYPE>, CHILDTYPE extends IHCNode>
                                       extends IHCNode, IGenericImplTrait <IMPLTYPE>
{
  /**
   * @param aNode
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE addChild (@Nullable CHILDTYPE aNode);

  /**
   * @param nIndex
   *        The index to where the element should be inserted.
   * @param aNode
   *        Child to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE addChild (@Nonnegative int nIndex, @Nullable CHILDTYPE aNode);

  /**
   * Use {@link #addChild(IHCNode)} instead.
   *
   * @param aChild
   *        The child to add. May be <code>null</code>.
   * @return this
   */
  @Deprecated
  @DevelopersNote ("Use addChild instead")
  default IMPLTYPE addChildren (@Nullable final CHILDTYPE aChild)
  {
    return addChild (aChild);
  }

  /**
   * Use {@link #addChild(IHCNode)} instead.
   *
   * @param nIndex
   *        The index to where the element should be inserted.
   * @param aChild
   *        The child to add. May be <code>null</code>.
   * @return this
   */
  @Deprecated
  @DevelopersNote ("Use addChild instead")
  default IMPLTYPE addChildren (@Nonnegative final int nIndex, @Nullable final CHILDTYPE aChild)
  {
    ValueEnforcer.isBetweenInclusive (nIndex, "Index", 0, getChildCount ());
    return addChild (nIndex, aChild);
  }

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  @SuppressWarnings ("unchecked")
  default IMPLTYPE addChildren (@Nullable final CHILDTYPE... aChildren)
  {
    if (aChildren != null)
      for (final CHILDTYPE aChild : aChildren)
        addChild (aChild);
    return thisAsT ();
  }

  /**
   * @param nIndex
   *        The index to where the elements should be inserted.
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  @SuppressWarnings ("unchecked")
  default IMPLTYPE addChildren (@Nonnegative final int nIndex, @Nullable final CHILDTYPE... aChildren)
  {
    ValueEnforcer.isBetweenInclusive (nIndex, "Index", 0, getChildCount ());
    if (aChildren != null)
    {
      int nRealIndex = nIndex;
      for (final CHILDTYPE aChild : aChildren)
        addChild (nRealIndex++, aChild);
    }
    return thisAsT ();
  }

  /**
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  default IMPLTYPE addChildren (@Nullable final Iterable <? extends CHILDTYPE> aChildren)
  {
    if (aChildren != null)
      for (final CHILDTYPE aChild : aChildren)
        addChild (aChild);
    return thisAsT ();
  }

  /**
   * @param nIndex
   *        The index to where the elements should be inserted.
   * @param aChildren
   *        Children to add. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  default IMPLTYPE addChildren (@Nonnegative final int nIndex, @Nullable final Iterable <? extends CHILDTYPE> aChildren)
  {
    ValueEnforcer.isBetweenInclusive (nIndex, "Index", 0, getChildCount ());
    if (aChildren != null)
    {
      int nRealIndex = nIndex;
      for (final CHILDTYPE aChild : aChildren)
        addChild (nRealIndex++, aChild);
    }
    return thisAsT ();
  }

  /**
   * @param aChild
   *        Child to add. May be <code>null</code>.
   * @param <V>
   *        The type to add. Needs to be a IHCNode or a sub class.
   * @return the added child
   */
  @Nullable
  @CheckReturnValue
  default <V extends CHILDTYPE> V addAndReturnChild (@Nullable final V aChild)
  {
    addChild (aChild);
    return aChild;
  }

  /**
   * @param nIndex
   *        The index where the element should be added. Always &ge; 0.
   * @param aChild
   *        Child to add. May be <code>null</code>.
   * @param <V>
   *        The type to add. Needs to be a IHCNode or a sub class.
   * @return the added child
   */
  @Nullable
  @CheckReturnValue
  default <V extends CHILDTYPE> V addAndReturnChild (@Nonnegative final int nIndex, @Nullable final V aChild)
  {
    addChild (nIndex, aChild);
    return aChild;
  }

  /**
   * Remove the child at the specified index.
   *
   * @param nIndex
   *        The index to use. Must be &ge; 0.
   * @return this
   */
  @Nonnull
  IMPLTYPE removeChild (@Nonnegative int nIndex);

  /**
   * Remove the passed direct child object.
   *
   * @param aNode
   *        The node to be removed. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE removeChild (@Nullable CHILDTYPE aNode);

  /**
   * Remove all children of this object.
   *
   * @return this
   */
  @Nonnull
  IMPLTYPE removeAllChildren ();

  /**
   * Sort all children with the passed comparator
   *
   * @param aComparator
   *        The comparator to be used. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  IMPLTYPE sortAllChildren (@Nonnull Comparator <? super CHILDTYPE> aComparator);

  /**
   * @return A new node list with all contained children. Never
   *         <code>null</code> but maybe empty.
   */
  @Nonnull
  IHCNodeList <?> getAllChildrenAsNodeList ();
}
