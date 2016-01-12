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
package com.helger.html.meta;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.concurrent.SimpleReadWriteLock;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.ICloneable;
import com.helger.commons.state.EChange;
import com.helger.commons.string.ToStringGenerator;

/**
 * This class manages a list of meta elements.
 *
 * @author Philip Helger
 */
@ThreadSafe
public class MetaElementList implements ICloneable <MetaElementList>, IMetaElementList
{
  private final SimpleReadWriteLock m_aRWLock = new SimpleReadWriteLock ();
  @GuardedBy ("m_aRWLock")
  private final Map <String, IMetaElement> m_aItems = new LinkedHashMap <String, IMetaElement> ();

  public MetaElementList ()
  {}

  public MetaElementList (@Nonnull final MetaElementList aOther)
  {
    ValueEnforcer.notNull (aOther, "Other");
    m_aItems.putAll (aOther.m_aItems);
  }

  public MetaElementList (@Nonnull final Collection <? extends IMetaElement> aMetaElementList)
  {
    ValueEnforcer.notNull (aMetaElementList, "MetaElementList");
    for (final IMetaElement aMetaElement : aMetaElementList)
      addMetaElement (aMetaElement);
  }

  @Nonnull
  public MetaElementList addMetaElement (@Nonnull final IMetaElement aMetaElement)
  {
    ValueEnforcer.notNull (aMetaElement, "MetaElement");

    m_aRWLock.writeLocked ( () -> {
      m_aItems.put (aMetaElement.getName (), aMetaElement);
    });
    return this;
  }

  @Nonnull
  public MetaElementList addMetaElements (@Nonnull final Collection <? extends IMetaElement> aMetaElementList)
  {
    ValueEnforcer.notNull (aMetaElementList, "MetaElementList");
    for (final IMetaElement aMetaElement : aMetaElementList)
      addMetaElement (aMetaElement);
    return this;
  }

  @Nonnull
  public MetaElementList addMetaElements (@Nonnull final MetaElementList aMetaElementList)
  {
    ValueEnforcer.notNull (aMetaElementList, "MetaElementList");

    m_aRWLock.writeLocked ( () -> {
      m_aItems.putAll (aMetaElementList.m_aItems);
    });
    return this;
  }

  @Nonnull
  public EChange removeMetaElement (@Nullable final String sMetaElementName)
  {
    return EChange.valueOf (m_aRWLock.writeLocked ( () -> m_aItems.remove (sMetaElementName) != null));
  }

  @Nonnull
  public EChange removeAllMetaElements ()
  {
    return m_aRWLock.writeLocked ( () -> {
      if (m_aItems.isEmpty ())
        return EChange.UNCHANGED;
      m_aItems.clear ();
      return EChange.CHANGED;
    });
  }

  @Nonnull
  @ReturnsMutableCopy
  public Set <String> getAllMetaElementNames ()
  {
    return m_aRWLock.readLocked ( () -> CollectionHelper.newOrderedSet (m_aItems.keySet ()));
  }

  public void getAllMetaElements (@Nonnull final Collection <? super IMetaElement> aTarget)
  {
    ValueEnforcer.notNull (aTarget, "Target");

    m_aRWLock.readLocked ( () -> {
      aTarget.addAll (m_aItems.values ());
    });
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IMetaElement> getAllMetaElements ()
  {
    return m_aRWLock.readLocked ( () -> CollectionHelper.newList (m_aItems.values ()));
  }

  @Nullable
  public IMetaElement getMetaElementOfName (@Nullable final String sName)
  {
    return m_aRWLock.readLocked ( () -> m_aItems.get (sName));
  }

  public boolean containsMetaElementWithName (@Nullable final String sName)
  {
    return m_aRWLock.readLocked ( () -> m_aItems.containsKey (sName));
  }

  @Nonnegative
  public int getMetaElementCount ()
  {
    return m_aRWLock.readLocked ( () -> m_aItems.size ());
  }

  public boolean hasMetaElements ()
  {
    return m_aRWLock.readLocked ( () -> !m_aItems.isEmpty ());
  }

  @Nonnull
  public Iterator <IMetaElement> iterator ()
  {
    return m_aRWLock.readLocked ( () -> m_aItems.values ().iterator ());
  }

  @Nonnull
  @ReturnsMutableCopy
  public MetaElementList getClone ()
  {
    return m_aRWLock.readLocked ( () -> new MetaElementList (this));
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final MetaElementList rhs = (MetaElementList) o;
    return m_aItems.equals (rhs.m_aItems);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aItems).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("items", m_aItems).toString ();
  }
}
