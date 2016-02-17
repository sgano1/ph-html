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

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.OverridingMethodsMustInvokeSuper;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.annotation.OverrideOnDemand;
import com.helger.commons.collection.ext.ICommonsList;
import com.helger.commons.microdom.IMicroNode;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.EHCNodeState;
import com.helger.html.hc.IHCConversionSettingsToNode;
import com.helger.html.hc.IHCCustomizer;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.IHCWrappingNode;

/**
 * Abstract implementation of {@link IHCWrappingNode}.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public abstract class AbstractHCWrappingNode extends AbstractHCNode implements IHCWrappingNode
{
  @Override
  @Nonnull
  public EHCNodeState getNodeState ()
  {
    return getWrappedNode ().getNodeState ();
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void onCustomizeNode (@Nonnull final IHCCustomizer aCustomizer,
                                  @Nonnull final EHTMLVersion eHTMLVersion,
                                  @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    getWrappedNode ().customizeNode (aCustomizer, eHTMLVersion, aTargetNode);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void onFinalizeNodeState (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                      @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    super.onFinalizeNodeState (aConversionSettings, aTargetNode);
    getWrappedNode ().finalizeNodeState (aConversionSettings, aTargetNode);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void onConsistencyCheck (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    super.onConsistencyCheck (aConversionSettings);
    getWrappedNode ().consistencyCheck (aConversionSettings);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected void onRegisterExternalResources (@Nonnull final IHCConversionSettingsToNode aConversionSettings,
                                              final boolean bForceRegistration)
  {
    getWrappedNode ().registerExternalResources (aConversionSettings, bForceRegistration);
  }

  @Override
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  public boolean canConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return getWrappedNode ().canConvertToMicroNode (aConversionSettings);
  }

  @Override
  @Nullable
  @OverrideOnDemand
  @OverridingMethodsMustInvokeSuper
  protected IMicroNode internalConvertToMicroNode (@Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    return getWrappedNode ().convertToMicroNode (aConversionSettings);
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return getWrappedNode ().getPlainText ();
  }

  @Override
  @Nullable
  public ICommonsList <? extends IHCNode> getAllChildren ()
  {
    return getWrappedNode ().getAllChildren ();
  }

  @Override
  @Nullable
  public IHCNode getChildAtIndex (final int nIndex)
  {
    return getWrappedNode ().getChildAtIndex (nIndex);
  }

  @Override
  @Nullable
  public IHCNode getFirstChild ()
  {
    return getWrappedNode ().getFirstChild ();
  }

  @Override
  @Nullable
  public IHCNode getLastChild ()
  {
    return getWrappedNode ().getLastChild ();
  }

  @Override
  public boolean hasChildren ()
  {
    return getWrappedNode ().hasChildren ();
  }

  @Override
  @Nonnegative
  public int getChildCount ()
  {
    return getWrappedNode ().getChildCount ();
  }
}
