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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mutable.MutableBoolean;
import com.helger.commons.state.EFinish;
import com.helger.html.EHTMLElement;

/**
 * Helper class for common {@link IHCNode} related elements.
 *
 * @author Philip Helger
 */
@Immutable
public final class HCHelper
{
  private HCHelper ()
  {}

  public static boolean recursiveContainsAtLeastOneTextNode (@Nullable final IHCNode aStartNode)
  {
    if (aStartNode == null)
      return false;

    if (aStartNode instanceof IHCTextNode <?>)
      return true;

    final MutableBoolean ret = new MutableBoolean (false);
    iterateChildren (aStartNode, (aParentNode, aChildNode) -> {
      if (aChildNode instanceof IHCTextNode <?>)
      {
        ret.set (true);
        return EFinish.FINISHED;
      }
      return EFinish.UNFINISHED;
    });
    return ret.booleanValue ();
  }

  @Nonnull
  private static EFinish _recursiveIterateTree (@Nonnull final IHCNode aNode,
                                                @Nonnull final IHCIteratorCallback aCallback)
  {
    if (aNode.hasChildren ())
    {
      for (final IHCNode aChild : aNode.getAllChildren ())
      {
        // call callback
        if (aCallback.call (aNode, aChild).isFinished ())
          return EFinish.FINISHED;

        // does the node has children
        if (_recursiveIterateTree (aChild, aCallback).isFinished ())
          return EFinish.FINISHED;
      }
    }
    return EFinish.UNFINISHED;
  }

  /**
   * Recursively iterate the node and all child nodes of the passed node. The
   * difference to {@link #iterateChildren(IHCNode, IHCIteratorCallback)} is,
   * that the callback is also invoked on the passed node.
   *
   * @param aNode
   *        The node to be iterated.
   * @param aCallback
   *        The callback to be invoked on every child
   */
  public static void iterateTree (@Nonnull final IHCNode aNode, @Nonnull final IHCIteratorCallback aCallback)
  {
    ValueEnforcer.notNull (aNode, "node");
    ValueEnforcer.notNull (aCallback, "callback");

    // call callback on start node
    if (aCallback.call (null, aNode).isUnfinished ())
      _recursiveIterateTree (aNode, aCallback);
  }

  /**
   * Recursively iterate all child nodes of the passed node.
   *
   * @param aNode
   *        The node who's children should be iterated.
   * @param aCallback
   *        The callback to be invoked on every child
   */
  public static void iterateChildren (@Nonnull final IHCNode aNode, @Nonnull final IHCIteratorCallback aCallback)
  {
    ValueEnforcer.notNull (aNode, "node");
    ValueEnforcer.notNull (aCallback, "callback");

    _recursiveIterateTree (aNode, aCallback);
  }

  /**
   * Find the first HTML child element within a start element. This check
   * considers both lower- and upper-case element names. Mixed case is not
   * supported!
   *
   * @param aElement
   *        The element to search in
   * @param eHTMLElement
   *        The HTML element to search.
   * @return <code>null</code> if no such child element is present.
   */
  @Nullable
  public static IMicroElement getFirstChildElement (@Nonnull final IMicroElement aElement,
                                                    @Nonnull final EHTMLElement eHTMLElement)
  {
    ValueEnforcer.notNull (aElement, "element");
    ValueEnforcer.notNull (eHTMLElement, "HTMLElement");

    // First try with lower case name
    IMicroElement aChild = aElement.getFirstChildElement (eHTMLElement.getElementName ());
    if (aChild == null)
    {
      // Fallback: try with upper case name
      aChild = aElement.getFirstChildElement (eHTMLElement.getElementNameUpperCase ());
    }
    return aChild;
  }

  /**
   * Get a list of all HTML child elements of the given element. This methods
   * handles lower- and upper-cased elements.
   *
   * @param aElement
   *        The element to search in
   * @param eHTMLElement
   *        The HTML element to search
   * @return A non-<code>null</code> list where the lower-case elements are
   *         listed before the upper-case elements.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IMicroElement> getChildElements (@Nonnull final IMicroElement aElement,
                                                       @Nonnull final EHTMLElement eHTMLElement)
  {
    ValueEnforcer.notNull (aElement, "element");
    ValueEnforcer.notNull (eHTMLElement, "HTMLElement");

    final List <IMicroElement> ret = new ArrayList <IMicroElement> ();
    ret.addAll (aElement.getAllChildElements (eHTMLElement.getElementName ()));
    ret.addAll (aElement.getAllChildElements (eHTMLElement.getElementNameUpperCase ()));
    return ret;
  }

  private static void _recursiveAddFlattened (@Nullable final IHCNode aNode, @Nonnull final List <IHCNode> aRealList)
  {
    ValueEnforcer.notNull (aRealList, "RealList");

    if (aNode != null)
    {
      // Only check IHCNodeList and not IHCNodeWithChildren because other
      // surrounding elements would not be handled correctly!
      if (aNode instanceof IHCNodeList <?>)
      {
        final IHCNodeList <?> aNodeList = (IHCNodeList <?>) aNode;
        if (aNodeList.hasChildren ())
          for (final IHCNode aChild : aNodeList.getAllChildren ())
            _recursiveAddFlattened (aChild, aRealList);
      }
      else
        aRealList.add (aNode);
    }
  }

  /**
   * Inline all contained node lists so that a "flat" list results. This only
   * flattens something if the passed node is an
   * {@link com.helger.html.hc.impl.HCNodeList} and all node-lists directly
   * contained in the other node lists. Node-lists that are hidden deep inside
   * the tree are not considered!
   *
   * @param aNode
   *        The source node. May be <code>null</code>.
   * @return A non-<code>null</code> flattened list.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> getAsFlattenedList (@Nullable final IHCNode aNode)
  {
    final List <IHCNode> ret = new ArrayList <> ();
    _recursiveAddFlattened (aNode, ret);
    return ret;
  }

  /**
   * Inline all contained node lists so that a "flat" list results. This only
   * flattens something if the passed node is an
   * {@link com.helger.html.hc.impl.HCNodeList} and all node-lists directly
   * contained in the other node lists. Node-lists that are hidden deep inside
   * the tree are not considered!
   *
   * @param aNodes
   *        The source nodes. May be <code>null</code> or empty.
   * @return A non-<code>null</code> flattened list.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> getAsFlattenedList (@Nullable final Iterable <? extends IHCNode> aNodes)
  {
    final List <IHCNode> ret = new ArrayList <> ();
    if (aNodes != null)
      for (final IHCNode aNode : aNodes)
        _recursiveAddFlattened (aNode, ret);
    return ret;
  }

  /**
   * Resolve all wrappings via {@link IHCWrappingNode} of the passed node. This
   * is usually either an HCOutOfBandNode or a HCConditionalCommentNode.
   *
   * @param aHCNode
   *        The node to be unwrapped. May be <code>null</code>.
   * @return The unwrapped node. May be the same as the parameter, if the node
   *         is not wrapped. May be <code>null</code> if the parameter node is
   *         <code>null</code>.
   */
  @Nullable
  public static IHCNode getUnwrappedNode (@Nullable final IHCNode aHCNode)
  {
    if (isWrappedNode (aHCNode))
      return getUnwrappedNode (((IHCWrappingNode) aHCNode).getWrappedNode ());

    return aHCNode;
  }

  /**
   * Check if the passed node is a wrapped node by checking if it implements
   * {@link IHCWrappingNode}.
   *
   * @param aHCNode
   *        The node to be checked. May be <code>null</code>.
   * @return <code>true</code> if the node is not <code>null</code> and if it
   *         implements {@link IHCWrappingNode}.
   */
  public static boolean isWrappedNode (@Nullable final IHCNode aHCNode)
  {
    return aHCNode instanceof IHCWrappingNode;
  }
}
