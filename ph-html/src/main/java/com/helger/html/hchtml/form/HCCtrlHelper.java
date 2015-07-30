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
package com.helger.html.hchtml.form;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.html.hcapi.IHCNode;

@Immutable
public final class HCCtrlHelper
{
  private HCCtrlHelper ()
  {}

  /**
   * Find the first instance of {@link IHCControl} that is either the passed
   * element or a child of the passed element.
   *
   * @param aNode
   *        The source node to start searching. May be <code>null</code>.
   * @return <code>null</code> if no {@link IHCControl} can be found below the
   *         passed node.
   */
  @Nullable
  public static IHCControl <?> getFirstHCControl (@Nullable final IHCNode aNode)
  {
    if (aNode instanceof IHCControl <?>)
      return (IHCControl <?>) aNode;

    if (aNode != null)
    {
      if (aNode.hasChildren ())
        for (final IHCNode aChild : aNode.getAllChildren ())
        {
          final IHCControl <?> aNestedCtrl = getFirstHCControl (aChild);
          if (aNestedCtrl != null)
            return aNestedCtrl;
        }
    }

    return null;
  }

  /**
   * Recursively determine all {@link IHCControl} elements from and incl. the
   * passed node
   *
   * @param aNode
   *        The start node. May be <code>null</code>.
   * @param aTargetList
   *        The target list to be filled. May not be <code>null</code>.
   */
  public static void getAllHCControls (@Nullable final IHCNode aNode,
                                       @Nonnull final List <? super IHCControl <?>> aTargetList)
  {
    ValueEnforcer.notNull (aTargetList, "TargetList");

    if (aNode != null)
    {
      if (aNode instanceof IHCControl <?>)
        aTargetList.add ((IHCControl <?>) aNode);

      // E.g. HCNodeList
      if (aNode.hasChildren ())
        for (final IHCNode aChild : aNode.getAllChildren ())
          getAllHCControls (aChild, aTargetList);
    }
  }

  /**
   * Recursively determine all {@link IHCControl} elements from and incl. the
   * passed node
   *
   * @param aNode
   *        The start node. May be <code>null</code>.
   * @return The filled list with all controls. Never <code>null</code> but
   *         maybe empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCControl <?>> getAllHCControls (@Nullable final IHCNode aNode)
  {
    final List <IHCControl <?>> ret = new ArrayList <IHCControl <?>> ();
    getAllHCControls (aNode, ret);
    return ret;
  }

  /**
   * Recursively determine all {@link IHCControl} elements from and incl. the
   * passed nodes
   *
   * @param aNodes
   *        The start nodes. May be <code>null</code>.
   * @param aTargetList
   *        The target list to be filled. May not be <code>null</code>.
   */
  public static void getAllHCControls (@Nullable final Iterable <? extends IHCNode> aNodes,
                                       @Nonnull final List <? super IHCControl <?>> aTargetList)
  {
    ValueEnforcer.notNull (aTargetList, "TargetList");

    if (aNodes != null)
      for (final IHCNode aNode : aNodes)
        getAllHCControls (aNode, aTargetList);
  }

  /**
   * Recursively determine all {@link IHCControl} elements from and incl. the
   * passed nodes
   *
   * @param aNodes
   *        The start nodes. May be <code>null</code>.
   * @return The filled list with all controls. Never <code>null</code> but
   *         maybe empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCControl <?>> getAllHCControls (@Nullable final Iterable <? extends IHCNode> aNodes)
  {
    final List <IHCControl <?>> ret = new ArrayList <IHCControl <?>> ();
    getAllHCControls (aNodes, ret);
    return ret;
  }
}
