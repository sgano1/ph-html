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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.state.EChange;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.IHCCustomizer;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCNode;

/**
 * An implementation of {@link IHCCustomizer} that handles a list of multiple
 * customizers.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class HCCustomizerList extends AbstractHCCustomizer
{
  private final List <IHCCustomizer> m_aCustomizers = new ArrayList <IHCCustomizer> ();

  public HCCustomizerList (@Nullable final IHCCustomizer... aCustomizers)
  {
    if (aCustomizers != null)
      for (final IHCCustomizer aCustomizer : aCustomizers)
        addCustomizer (aCustomizer);
  }

  public HCCustomizerList (@Nullable final Iterable <? extends IHCCustomizer> aCustomizers)
  {
    if (aCustomizers != null)
      for (final IHCCustomizer aCustomizer : aCustomizers)
        addCustomizer (aCustomizer);
  }

  @Nonnull
  public HCCustomizerList addCustomizer (@Nonnull final IHCCustomizer aCustomizer)
  {
    ValueEnforcer.notNull (aCustomizer, "Customizer");
    m_aCustomizers.add (aCustomizer);
    return this;
  }

  @Nonnull
  public EChange removeCustomizer (@Nullable final IHCCustomizer aCustomizer)
  {
    return EChange.valueOf (m_aCustomizers.add (aCustomizer));
  }

  @Nonnull
  public EChange removeAllCustomizersOfClass (@Nonnull final Class <? extends IHCCustomizer> aCustomizerClass)
  {
    ValueEnforcer.notNull (aCustomizerClass, "CustomizerClass");

    EChange eChange = EChange.UNCHANGED;
    for (final IHCCustomizer aCustomizer : CollectionHelper.newList (m_aCustomizers))
      if (aCustomizer.getClass ().equals (aCustomizerClass))
        if (m_aCustomizers.remove (aCustomizer))
          eChange = EChange.CHANGED;
    return eChange;
  }

  @Nonnegative
  public int getCustomizerCount ()
  {
    return m_aCustomizers.size ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHCCustomizer> getAllCustomizers ()
  {
    return CollectionHelper.newList (m_aCustomizers);
  }

  public void customizeNode (@Nonnull final IHCNode aNode,
                             @Nonnull final EHTMLVersion eHTMLVersion,
                             @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    for (final IHCCustomizer aCustomizer : m_aCustomizers)
      aCustomizer.customizeNode (aNode, eHTMLVersion, aTargetNode);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final HCCustomizerList rhs = (HCCustomizerList) o;
    return m_aCustomizers.equals (rhs.m_aCustomizers);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aCustomizers).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ()).append ("Customizers", m_aCustomizers).toString ();
  }
}
