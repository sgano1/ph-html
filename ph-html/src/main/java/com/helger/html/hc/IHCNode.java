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

import java.io.Serializable;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.text.IHasPlainText;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Base interface for a main HC node.
 *
 * @author Philip Helger
 */
public interface IHCNode extends IHasPlainText, Serializable
{
  /**
   * Callback to be invoked, after this child was added to a node.<br>
   * Common use cases for this method are:
   * <ul>
   * <li>Register external resources like JS or CSS files</li>
   * <li>Add additional nodes that are part of this node (e.g. &lt;script&gt;)
   * to the parent.</li>
   * </ul>
   *
   * @param nIndex
   *        The index where the element was added. Always &ge; 0.
   * @param aParent
   *        The parent node this node was added to. Never <code>null</code>.
   */
  void onAdded (@Nonnegative int nIndex, @Nonnull IHCHasChildrenMutable <?, ?> aParent);

  /**
   * Callback to be invoked, after this child was removed from a node.<br>
   * When implementing this method, it should ideally undo the actions performed
   * in {@link #onAdded(int, IHCHasChildrenMutable)}.
   *
   * @param nIndex
   *        The index where the element was removed from. Always &ge; 0. This is
   *        the OLD index and now contains a different or no child.
   * @param aParent
   *        The parent node this node was removed from. Never <code>null</code>.
   */
  void onRemoved (@Nonnegative int nIndex, @Nonnull IHCHasChildrenMutable <?, ?> aParent);

  /**
   * @return <code>true</code> if the customizer was already run on this node,
   *         <code>false</code> if not.
   */
  boolean isCustomized ();

  /**
   * Apply customization as defined by
   * {@link IHCConversionSettingsToNode#getCustomizer()}. Customization is
   * applied only once per node.
   *
   * @param aConversionSettings
   *        The conversion settings to use. May not be <code>null</code>.
   * @param aParentNode
   *        The parent node where additional elements should be added (that's
   *        why it must be mutable). May not be <code>null</code>.
   */
  void applyCustomization (@Nonnull IHCConversionSettingsToNode aConversionSettings,
                           @Nonnull IHCHasChildrenMutable <?, ? super IHCNode> aParentNode);

  /**
   * @return <code>true</code> if this node was already converted to a micro
   *         node, <code>false</code> if not
   */
  boolean isConvertedToMicroNode ();

  /**
   * This method checks whether the node is suitable for conversion to an
   * {@link IMicroNode}. If this node cannot be converted, no child node will be
   * converted as well!
   *
   * @param aConversionSettings
   *        The conversion settings to be used
   * @return <code>true</code> if the node can be converted to a node,
   *         <code>false</code> otherwise.
   */
  boolean canConvertToMicroNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * This method is called only once for each instance. It is called before the
   * node itself is created from within
   * {@link #convertToMicroNode(IHCConversionSettingsToNode)}.
   *
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  void beforeConvertToMicroNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * The main conversion to a micro node.<br>
   * Note: return type cannot by IMicroElement since the checkbox object
   * delivers an IMicroNodeList!
   *
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  IMicroNode convertToMicroNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * Convert the passed node to it's HTML representation. First this HC-node is
   * converted to a micro node, which is than
   *
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as HTML string and never null.
   */
  @Nonnull
  String getAsHTMLString (@Nonnull IHCConversionSettings aConversionSettings);
}
