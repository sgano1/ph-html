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
package com.helger.html.hc.impl;

import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.microdom.serialize.MicroWriter;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.hc.IHCHasChildren;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;

/**
 * Default implementation of the {@link IHCNode} interface.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public abstract class AbstractHCNode implements IHCNode
{
  private boolean m_bCustomized = false;
  private boolean m_bBeforeConvertToMicroNodeCalled = false;

  public void onAdded (@Nonnegative final int nIndex, @Nonnull final IHCHasChildrenMutable <?, ?> aParent)
  {}

  public void onRemoved (@Nonnegative final int nIndex, @Nonnull final IHCHasChildrenMutable <?, ?> aParent)
  {}

  public final boolean isCustomized ()
  {
    return m_bCustomized;
  }

  public final void applyCustomization (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                        @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aParentNode)
  {
    if (!m_bCustomized)
    {
      m_bCustomized = true;

      // Run the global customizer
      aConversionSettings.getCustomizer ().customizeNode (aParentNode, this, aConversionSettings.getHTMLVersion ());

      if (this instanceof IHCHasChildren)
      {
        final List <? extends IHCNode> aChildNodes = ((IHCHasChildren) this).getAllChildren ();
        if (aChildNodes != null)
          for (final IHCNode aChildNode : aChildNodes)
            aChildNode.applyCustomization (aConversionSettings, aParentNode);
      }
    }
  }

  public final boolean isConvertedToMicroNode ()
  {
    return m_bBeforeConvertToMicroNodeCalled;
  }

  @OverrideOnDemand
  public boolean canConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return true;
  }

  /**
   * This method is called only once for each instance. It is called before the
   * node itself is created. Overwrite this method to perform actions that can
   * only be done when the node is build finally.<br>
   * Things <b>to do</b> in this method are:
   * <ul>
   * <li>Propagate the call to
   * {@link #beforeConvertToMicroNode(IHCConversionSettingsToNode)} to all child
   * nodes.</li>
   * <li>Add special child elements depending on certain states</li>
   * </ul>
   * Things <b>NOT to do</b> in this method are:
   * <ul>
   * <li>Register external resources like JS or CSS files because this would be
   * to late, because this is already part of the HTML serialization to a
   * String! Use {@link #onAdded(int, IHCHasChildrenMutable)} instead to
   * register external resources.</li>
   * </ul>
   *
   * @param aConversionSettings
   *        The conversion settings to be used
   */
  @OverrideOnDemand
  protected void beforeConvertToMicroNodeOnce (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {}

  @OverridingMethodsMustInvokeSuper
  public void beforeConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Prepare object once per instance - before first rendering (implementation
    // dependent)
    if (!m_bBeforeConvertToMicroNodeCalled)
    {
      m_bBeforeConvertToMicroNodeCalled = true;

      // Call internal method exactly once
      beforeConvertToMicroNodeOnce (aConversionSettings);
    }
  }

  @Nonnull
  @OverrideOnDemand
  protected abstract IMicroNode internalConvertToMicroNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  /**
   * Called after the main conversion. Can be used to modify the created micro
   * node somehow. The default implementation just returns the passed node.
   *
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @param aCreatedNode
   *        The created node from
   *        {@link #internalConvertToMicroNode(IHCConversionSettingsToNode)}
   * @return The result of
   *         {@link #convertToMicroNode(IHCConversionSettingsToNode)}
   */
  @Nullable
  @OverrideOnDemand
  protected IMicroNode afterConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                                @Nullable final IMicroNode aCreatedNode)
  {
    return aCreatedNode;
  }

  @Nullable
  public final IMicroNode convertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // Can this node be converted to a MicroNode?
    if (!canConvertToMicroNode (aConversionSettings))
      return null;

    // Before convert
    beforeConvertToMicroNode (aConversionSettings);

    // Main conversion
    final IMicroNode aOriginalNode = internalConvertToMicroNode (aConversionSettings);

    // After convert
    final IMicroNode ret = afterConvertToMicroNode (aConversionSettings, aOriginalNode);

    return ret;
  }

  @Nonnull
  public final String getAsHTMLString (@Nonnull final IHCConversionSettings aConversionSettings)
  {
    final IMicroNode aNode = convertToMicroNode (aConversionSettings);
    if (aNode == null)
      return "";
    return MicroWriter.getNodeAsString (aNode, aConversionSettings.getXMLWriterSettings ());
  }

  @OverrideOnDemand
  @Nonnull
  public String getPlainText ()
  {
    return "";
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("customized", m_bCustomized)
                                       .append ("beforeConvertToMicroNodeCalled", m_bBeforeConvertToMicroNodeCalled)
                                       .toString ();
  }
}
