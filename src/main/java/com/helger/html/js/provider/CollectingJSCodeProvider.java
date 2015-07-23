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
package com.helger.html.js.provider;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.lang.ICloneable;
import com.helger.commons.lang.IHasSize;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.js.IHasJSCode;
import com.helger.html.js.writer.IHasJSCodeWithSettings;
import com.helger.html.js.writer.IJSWriterSettings;

/**
 * A JSCode provider that encapsulates a list of {@link IHasJSCode} elements and
 * itself implements {@link IHasJSCode}.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class CollectingJSCodeProvider implements IHasJSCodeWithSettings, IHasSize, ICloneable <CollectingJSCodeProvider>
{
  private final List <IHasJSCode> m_aList = new ArrayList <IHasJSCode> ();

  public CollectingJSCodeProvider ()
  {}

  public CollectingJSCodeProvider (@Nullable final IHasJSCode... aProviders)
  {
    if (aProviders != null)
      for (final IHasJSCode aProvider : aProviders)
        if (aProvider != null)
          append (aProvider);
  }

  public CollectingJSCodeProvider (@Nullable final Iterable <? extends IHasJSCode> aProviders)
  {
    if (aProviders != null)
      for (final IHasJSCode aProvider : aProviders)
        if (aProvider != null)
          append (aProvider);
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <IHasJSCode> getAll ()
  {
    return CollectionHelper.newList (m_aList);
  }

  @Nonnull
  public CollectingJSCodeProvider addAtIndex (@Nonnegative final int nIndex, @Nullable final IHasJSCode aProvider)
  {
    if (aProvider != null)
      m_aList.add (nIndex, aProvider);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider addAtIndexFlattened (@Nonnegative final int nIndex,
                                                       @Nullable final IHasJSCode aProvider)
  {
    if (aProvider != null)
      if (aProvider instanceof CollectingJSCodeProvider)
        m_aList.addAll (nIndex, ((CollectingJSCodeProvider) aProvider).m_aList);
      else
        m_aList.add (nIndex, aProvider);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider append (@Nullable final IHasJSCode aProvider)
  {
    if (aProvider != null)
      m_aList.add (aProvider);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider appendFlattened (@Nullable final IHasJSCode aProvider)
  {
    if (aProvider != null)
      if (aProvider instanceof CollectingJSCodeProvider)
        m_aList.addAll (((CollectingJSCodeProvider) aProvider).m_aList);
      else
        m_aList.add (aProvider);
    return this;
  }

  @Nonnull
  public CollectingJSCodeProvider prepend (@Nullable final IHasJSCode aProvider)
  {
    return addAtIndex (0, aProvider);
  }

  @Nonnull
  public CollectingJSCodeProvider prependFlattened (@Nullable final IHasJSCode aProvider)
  {
    return addAtIndexFlattened (0, aProvider);
  }

  @Nonnull
  public CollectingJSCodeProvider removeAtIndex (@Nonnegative final int nIndex)
  {
    if (nIndex >= 0 && nIndex < m_aList.size ())
      m_aList.remove (nIndex);
    return this;
  }

  public void reset ()
  {
    m_aList.clear ();
  }

  public boolean isEmpty ()
  {
    return m_aList.isEmpty ();
  }

  public boolean isNotEmpty ()
  {
    return !m_aList.isEmpty ();
  }

  @Nonnegative
  public int getSize ()
  {
    return m_aList.size ();
  }

  @Nonnull
  public String getJSCode ()
  {
    return getJSCode ((IJSWriterSettings) null);
  }

  @Nonnull
  public String getJSCode (@Nullable final IJSWriterSettings aSettings)
  {
    final StringBuilder aSB = new StringBuilder ();
    for (final IHasJSCode aJSCodeProvider : m_aList)
    {
      String sJSCode;
      if (aJSCodeProvider instanceof IHasJSCodeWithSettings)
        sJSCode = ((IHasJSCodeWithSettings) aJSCodeProvider).getJSCode (aSettings);
      else
        sJSCode = aJSCodeProvider.getJSCode ();
      aSB.append (sJSCode);
    }
    return aSB.toString ();
  }

  @Nonnull
  public CollectingJSCodeProvider getClone ()
  {
    return new CollectingJSCodeProvider (m_aList);
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final CollectingJSCodeProvider rhs = (CollectingJSCodeProvider) o;
    return m_aList.equals (rhs.m_aList);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aList).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).appendIfNotEmpty ("list", m_aList).toString ();
  }
}
