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
package com.helger.html.js;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.state.EChange;
import com.helger.commons.string.ToStringGenerator;

/**
 * This class represents a map from an {@link EJSEvent} to an {@link IHasJSCode}
 * that represents the code. This is mainly meant for managing HTML element JS
 * event handler.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class JSEventMap implements Serializable
{
  private final Map <EJSEvent, CollectingJSCodeProvider> m_aEvents = new EnumMap <EJSEvent, CollectingJSCodeProvider> (EJSEvent.class);

  /**
   * Add an additional handler for the given JS event. If an existing handler is
   * present, the new handler is appended at the end.
   *
   * @param eJSEvent
   *        The JS event. May not be <code>null</code>.
   * @param aNewHandler
   *        The new handler to be added. May not be <code>null</code>.
   */
  public void addHandler (@Nonnull final EJSEvent eJSEvent, @Nonnull final IHasJSCode aNewHandler)
  {
    ValueEnforcer.notNull (eJSEvent, "JSEvent");
    ValueEnforcer.notNull (aNewHandler, "NewHandler");

    CollectingJSCodeProvider aCode = m_aEvents.get (eJSEvent);
    if (aCode == null)
    {
      aCode = new CollectingJSCodeProvider ();
      m_aEvents.put (eJSEvent, aCode);
    }
    aCode.appendFlattened (aNewHandler);
  }

  /**
   * Add an additional handler for the given JS event. If an existing handler is
   * present, the new handler is appended at front.
   *
   * @param eJSEvent
   *        The JS event. May not be <code>null</code>.
   * @param aNewHandler
   *        The new handler to be added. May not be <code>null</code>.
   */
  public void prependHandler (@Nonnull final EJSEvent eJSEvent, @Nonnull final IHasJSCode aNewHandler)
  {
    ValueEnforcer.notNull (eJSEvent, "JSEvent");
    ValueEnforcer.notNull (aNewHandler, "NewHandler");

    CollectingJSCodeProvider aCode = m_aEvents.get (eJSEvent);
    if (aCode == null)
    {
      aCode = new CollectingJSCodeProvider ();
      m_aEvents.put (eJSEvent, aCode);
    }
    aCode.prepend (aNewHandler);
  }

  /**
   * Set a handler for the given JS event. If an existing handler is present, it
   * is automatically overridden.
   *
   * @param eJSEvent
   *        The JS event. May not be <code>null</code>.
   * @param aNewHandler
   *        The new handler to be added. May not be <code>null</code>.
   */
  public void setHandler (@Nonnull final EJSEvent eJSEvent, @Nonnull final IHasJSCode aNewHandler)
  {
    ValueEnforcer.notNull (eJSEvent, "JSEvent");
    ValueEnforcer.notNull (aNewHandler, "NewHandler");

    // Set only the new handler and remove any existing handler
    m_aEvents.put (eJSEvent, new CollectingJSCodeProvider ().appendFlattened (aNewHandler));
  }

  @Nonnull
  public EChange removeHandler (@Nullable final EJSEvent eJSEvent)
  {
    if (eJSEvent == null)
      return EChange.UNCHANGED;

    return EChange.valueOf (m_aEvents.remove (eJSEvent) != null);
  }

  @Nullable
  public CollectingJSCodeProvider getHandler (@Nullable final EJSEvent eJSEvent)
  {
    return eJSEvent == null ? null : m_aEvents.get (eJSEvent);
  }

  public boolean containsHandler (@Nullable final EJSEvent eJSEvent)
  {
    return eJSEvent != null && m_aEvents.containsKey (eJSEvent);
  }

  @Nonnull
  @ReturnsMutableCopy
  public Map <EJSEvent, CollectingJSCodeProvider> getAllEventHandler ()
  {
    return new EnumMap <EJSEvent, CollectingJSCodeProvider> (m_aEvents);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("events", m_aEvents).toString ();
  }
}
