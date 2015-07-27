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

  private final void _ensureNodeState (@Nonnull final EHCNodeState eNodeState)
  {
    ValueEnforcer.notNull (eNodeState, "NodeState");
    if (false)
      if (!m_eNodeState.equals (eNodeState))
        throw new IllegalStateException ("Expected node state " +
                                         eNodeState +
                                         " but having node state " +
                                         m_eNodeState +
                                         " in " +
                                         toString ());
  }

  /**
   * Change the node state internally. Handle with care!
   *
   * @param eNodeState
   *        The new node state. May not be <code>null</code>.
   */
  private void _setNodeState (@Nonnull final EHCNodeState eNodeState)
  {
    ValueEnforcer.notNull (eNodeState, "NodeState");
    if (m_eNodeState.isAfter (eNodeState))
      throw new IllegalStateException ("The new node state is invalid. Got " +
                                       eNodeState +
                                       " but having " +
                                       m_eNodeState);
    m_eNodeState = eNodeState;
  }

  @OverrideOnDemand
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
    // Customize only once
    if (m_eNodeState.isBefore (EHCNodeState.CUSTOMIZED))
    {
      _ensureNodeState (EHCNodeState.INITIAL);
      onCustomizeNode (aCustomizer, eHTMLVersion, aTargetNode);
      _setNodeState (EHCNodeState.CUSTOMIZED);
    }
  }

  /**
   * @param aConversionSettings
   *        HC conversion settings
   * @param aTargetNode
   *        The target node where additional nodes should be added
   */
  @OverrideOnDemand
  protected void onFinalizeNodeState (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                      @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {}

  public final void finalizeNodeState (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                       @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    // finalize only once
    if (m_eNodeState.isBefore (EHCNodeState.FINALIZED))
    {
      _ensureNodeState (EHCNodeState.CUSTOMIZED);
      onFinalizeNodeState (aConversionSettings, aTargetNode);
      _setNodeState (EHCNodeState.FINALIZED);
    }
  }

  @OverrideOnDemand
  public boolean canConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return true;
  }

  /**
   * @param aConversionSettings
   *        HC conversion settings
   * @param bForceRegistration
   *        <code>true</code> if the registration is forced by the caller.
   */
  @OverrideOnDemand
  protected void onRegisterExternalResources (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                              final boolean bForceRegistration)
  {}

  public final void registerExternalResources (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                               final boolean bForceRegistration)
  {
    // register resources only once
    if (m_eNodeState.isBefore (EHCNodeState.RESOURCES_REGISTERED))
    {
      _ensureNodeState (EHCNodeState.FINALIZED);
      // Register resources only, if forced or if it can be converted to a micro
      // node
      if (bForceRegistration || canConvertToMicroNode (aConversionSettings))
        onRegisterExternalResources (aConversionSettings, bForceRegistration);
      _setNodeState (EHCNodeState.RESOURCES_REGISTERED);
    }
  }

  @Nonnull
  @OverrideOnDemand
  protected abstract IMicroNode internalConvertToMicroNode (@Nonnull IHCConversionSettingsToNode aConversionSettings);

  @Nullable
  public final IMicroNode convertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    _ensureNodeState (EHCNodeState.RESOURCES_REGISTERED);

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
