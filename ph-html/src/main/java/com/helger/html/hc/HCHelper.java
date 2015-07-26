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
package com.helger.html.hc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mutable.MutableBoolean;
import com.helger.commons.state.EFinish;
import com.helger.commons.wrapper.Wrapper;
import com.helger.html.EHTMLElement;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.customize.IHCCustomizer;
import com.helger.html.hc.impl.HCTextNode;

@Immutable
public final class HCHelper
{
  private HCHelper ()
  {}

  /**
   * Helper method to enforce correct element nesting. See
   * http://www.w3.org/TR/xhtml1#prohibitions
   *
   * @param aOwner
   *        Owner to start searching
   * @param aElements
   *        The tag names to search. May not be <code>null</code>.
   * @return The first element with the passed tag name on any level, or
   *         <code>null</code> if no such element exists.
   */
  @Nullable
  public static IHCElement <?> recursiveGetFirstChildWithTagName (@Nonnull final IHCHasChildren aOwner,
                                                                  @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    ValueEnforcer.notNull (aOwner, "Owner");
    ValueEnforcer.notEmpty (aElements, "Elements");

    final Wrapper <IHCElement <?>> ret = new Wrapper <IHCElement <?>> ();
    iterateChildren (aOwner, new IHCIteratorCallback ()
    {
      @Nullable
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCElement <?>)
        {
          final IHCElement <?> aCurrentElement = (IHCElement <?>) aChildNode;
          final String sCurrentTagName = aCurrentElement.getTagName ();
          for (final EHTMLElement aElement : aElements)
            if (sCurrentTagName.equalsIgnoreCase (aElement.getElementName ()))
            {
              ret.set (aCurrentElement);
              return EFinish.FINISHED;
            }
        }
        return EFinish.UNFINISHED;
      }
    });
    return ret.get ();
  }

  public static boolean recursiveContainsChildWithTagName (@Nonnull final IHCHasChildren aOwner,
                                                           @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    return recursiveGetFirstChildWithTagName (aOwner, aElements) != null;
  }

  /**
   * Helper method to enforce correct element nesting. See
   * http://www.w3.org/TR/xhtml1#prohibitions
   *
   * @param aOwner
   *        Owner where to start searching
   * @param aElements
   *        The tag names to search. May not be <code>null</code>.
   * @return All elements with the passed element name on any level. Never
   *         <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCElement <?>> recursiveGetAllChildrenWithTagName (@Nonnull final IHCHasChildren aOwner,
                                                                          @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    ValueEnforcer.notNull (aOwner, "Owner");
    ValueEnforcer.notEmpty (aElements, "Elements");

    final List <IHCElement <?>> ret = new ArrayList <IHCElement <?>> ();
    iterateChildren (aOwner, new IHCIteratorCallback ()
    {
      @Nullable
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCElement <?>)
        {
          final IHCElement <?> aCurrentElement = (IHCElement <?>) aChildNode;
          final String sCurrentTagName = aCurrentElement.getTagName ();
          for (final EHTMLElement aElement : aElements)
            if (sCurrentTagName.equalsIgnoreCase (aElement.getElementName ()))
            {
              ret.add (aCurrentElement);
              break;
            }
        }
        return EFinish.UNFINISHED;
      }
    });
    return ret;
  }

  /**
   * Helper method to enforce correct element nesting. See
   * http://www.w3.org/TR/xhtml1#prohibitions
   *
   * @param aOwner
   *        Owner where to start searching
   * @param aElements
   *        The tag names to search. May not be <code>null</code>.
   * @return The first element with a different than the passed tag name on any
   *         level, or <code>null</code> if no such element exists.
   */
  @Nullable
  public static IHCElement <?> recursiveGetFirstChildWithDifferentTagName (@Nonnull final IHCHasChildren aOwner,
                                                                           @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    ValueEnforcer.notNull (aOwner, "Owner");
    ValueEnforcer.notEmpty (aElements, "Elements");

    final Wrapper <IHCElement <?>> ret = new Wrapper <IHCElement <?>> ();
    iterateChildren (aOwner, new IHCIteratorCallback ()
    {
      @Nullable
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCElement <?>)
        {
          final IHCElement <?> aCurrentElement = (IHCElement <?>) aChildNode;
          final String sCurrentTagName = aCurrentElement.getTagName ();
          boolean bFound = false;
          for (final EHTMLElement aElement : aElements)
            if (sCurrentTagName.equalsIgnoreCase (aElement.getElementName ()))
            {
              bFound = true;
              break;
            }
          if (!bFound)
          {
            ret.set (aCurrentElement);
            return EFinish.FINISHED;
          }
        }
        return EFinish.UNFINISHED;
      }
    });
    return ret.get ();
  }

  public static boolean recursiveContainsChildWithDifferentTagName (@Nonnull final IHCHasChildren aOwner,
                                                                    @Nonnull @Nonempty final EHTMLElement... aElements)
  {
    return recursiveGetFirstChildWithDifferentTagName (aOwner, aElements) != null;
  }

  public static boolean recursiveContainsAtLeastOneTextNode (@Nullable final IHCNode aStartNode)
  {
    if (aStartNode == null)
      return false;

    if (aStartNode instanceof HCTextNode)
      return true;

    if (aStartNode instanceof IHCHasChildren)
    {
      final MutableBoolean ret = new MutableBoolean (false);
      iterateChildren ((IHCHasChildren) aStartNode, new IHCIteratorCallback ()
      {
        @Nullable
        public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
        {
          if (aChildNode instanceof HCTextNode)
          {
            ret.set (true);
            return EFinish.FINISHED;
          }
          return EFinish.UNFINISHED;
        }
      });
      return ret.booleanValue ();
    }

    return false;
  }

  @Nonnull
  private static EFinish _recursiveIterateTree (@Nonnull final IHCHasChildren aNode,
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
        if (aChild instanceof IHCHasChildren)
          if (_recursiveIterateTree ((IHCHasChildren) aChild, aCallback).isFinished ())
            return EFinish.FINISHED;
      }
    }
    return EFinish.UNFINISHED;
  }

  /**
   * Recursively iterate the node and all child nodes of the passed node. The
   * difference to {@link #iterateChildren(IHCHasChildren, IHCIteratorCallback)}
   * is, that the callback is also invoked on the passed node.
   *
   * @param aNode
   *        The node to be iterated.
   * @param aCallback
   *        The callback to be invoked on every child
   */
  public static void iterateTree (@Nonnull final IHCHasChildren aNode, @Nonnull final IHCIteratorCallback aCallback)
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
  public static void iterateChildren (@Nonnull final IHCHasChildren aNode, @Nonnull final IHCIteratorCallback aCallback)
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

    IMicroElement aChild = aElement.getFirstChildElement (eHTMLElement.getElementName ());
    if (aChild == null)
      aChild = aElement.getFirstChildElement (eHTMLElement.getElementNameUpperCase ());
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
    ret.addAll (aElement.getAllChildElements (eHTMLElement.getElementName ()));
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
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
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
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
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

    if (aNode instanceof IHCHasChildren)
    {
      // E.g. HCNodeList
      final IHCHasChildren aParent = (IHCHasChildren) aNode;
      if (aParent.hasChildren ())
        for (final IHCNode aChild : aParent.getAllChildren ())
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

    if (aNode instanceof IHCControl <?>)
      aTargetList.add ((IHCControl <?>) aNode);

    if (aNode instanceof IHCHasChildren)
    {
      // E.g. HCNodeList
      final IHCHasChildren aParent = (IHCHasChildren) aNode;
      if (aParent.hasChildren ())
        for (final IHCNode aChild : aParent.getAllChildren ())
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

  /**
   * Customize the passed base node and all child nodes recursively.
   *
   * @param aStartNode
   *        Base node to start customizing (incl.). May not be <code>null</code>
   *        .
   * @param aTargetNode
   *        The target node where new nodes should be appended to. May not be
   *        <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to use. May not be <code>null</code>.
   */
  public static void customizeNodes (@Nonnull final IHCHasChildren aStartNode,
                                     @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode,
                                     @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    ValueEnforcer.notNull (aStartNode, "NodeToBeCustomized");
    ValueEnforcer.notNull (aTargetNode, "TargetNode");
    ValueEnforcer.notNull (aConversionSettings, "ConversionSettings");

    final IHCCustomizer aCustomizer = aConversionSettings.getCustomizer ();
    final EHTMLVersion eHTMLVersion = aConversionSettings.getHTMLVersion ();

    // Customize element, before extracting out-of-band nodes, in case the
    // customizer adds some out-of-band nodes as well
    iterateTree (aStartNode, new IHCIteratorCallback ()
    {
      @Nonnull
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        // Run the global customizer
        aChildNode.customizeNode (aCustomizer, eHTMLVersion, aTargetNode);
        return EFinish.UNFINISHED;
      }
    });
  }

  public static void finalizeAndRegisterResources (@Nonnull final IHCHasChildren aStartNode,
                                                   @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode,
                                                   @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    iterateTree (aStartNode, new IHCIteratorCallback ()
    {
      @SuppressWarnings ("unchecked")
      @Nonnull
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        IHCHasChildrenMutable <?, ? super IHCNode> aRealTargetNode;
        if (aParentNode instanceof IHCHasChildrenMutable <?, ?>)
          aRealTargetNode = (IHCHasChildrenMutable <?, IHCNode>) aParentNode;
        else
          aRealTargetNode = aTargetNode;

        aChildNode.finalizeNodeState (aConversionSettings, aRealTargetNode);
        aChildNode.registerExternalResources (aConversionSettings);
        return EFinish.UNFINISHED;
      }
    });
  }
}
