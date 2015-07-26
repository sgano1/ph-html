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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.EHCNodeState;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.conversion.HCConsistencyChecker;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.customize.IHCCustomizer;

/**
 * Default implementation of the {@link IHCNode} interface.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public abstract class AbstractHCNode implements IHCNode
{
  private EHCNodeState m_eNodeState = EHCNodeState.INITIAL;

  @Nonnull
  public EHCNodeState getNodeState ()
  {
    return m_eNodeState;
  }

  private final void setNodeState (@Nonnull final EHCNodeState eNodeState)
  {
    ValueEnforcer.notNull (eNodeState, "NodeState");
    if (eNodeState.getID () != m_eNodeState.getID () + 1)
      throw new IllegalStateException ("The new node state is invalid. Got " +
                                       eNodeState +
                                       " but having " +
                                       m_eNodeState);
    m_eNodeState = eNodeState;
  }

  protected void onCustomizeNode (@Nonnull final IHCCustomizer aCustomizer,
                                  @Nonnull final EHTMLVersion eHTMLVersion,
                                  @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    aCustomizer.customizeNode (this, eHTMLVersion, aTargetNode);
  }

  public final void customizeNode (@Nonnull final IHCCustomizer aCustomizer,
                                   @Nonnull final EHTMLVersion eHTMLVersion,
                                   @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    onCustomizeNode (aCustomizer, eHTMLVersion, aTargetNode);
    setNodeState (EHCNodeState.CUSTOMIZED);
  }

  /**
   * @param aConversionSettings
   *        HC conversion settings
   * @param aTargetNode
   *        The target node where additional nodes should be added
   */
  protected void onFinalizeNodeState (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                      @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {}

  public final void finalizeNodeState (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                       @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    onFinalizeNodeState (aConversionSettings, aTargetNode);
    setNodeState (EHCNodeState.FINALIZED);
  }

  /**
   * @param aConversionSettings
   *        HC conversion settings
   */
  protected void onRegisterExternalResources (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {}

  public final void registerExternalResources (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    onRegisterExternalResources (aConversionSettings);
    setNodeState (EHCNodeState.RESOURCES_REGISTERED);
  }

  @OverrideOnDemand
  public boolean canConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return true;
  }

  @Nonnull
  @OverrideOnDemand
  protected abstract IMicroNode internalConvertToMicroNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  @Nullable
  public final IMicroNode convertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // XXX enable
    HCConsistencyChecker.consistencyAssert (m_eNodeState.equals (EHCNodeState.RESOURCES_REGISTERED) ||
                                            m_eNodeState.equals (EHCNodeState.INITIAL),
                                            "Invalid node state present. Having " + m_eNodeState);

    // Can this node be converted to a MicroNode?
    if (!canConvertToMicroNode (aConversionSettings))
      return null;

    // Main conversion
    final IMicroNode ret = internalConvertToMicroNode (aConversionSettings);
    return ret;
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
    return new ToStringGenerator (this).append ("nodeState", m_eNodeState).toString ();
  }
}
