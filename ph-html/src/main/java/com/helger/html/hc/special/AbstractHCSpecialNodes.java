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
package com.helger.html.hc.special;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.collection.multimap.IMultiMapSetBased;
import com.helger.commons.collection.multimap.MultiLinkedHashMapLinkedHashSetBased;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.css.media.CSSMediaList;
import com.helger.css.media.ICSSMediaList;
import com.helger.html.js.CollectingJSCodeProvider;
import com.helger.html.js.IHasJSCode;

/**
 * Abstract implementation of {@link IHCSpecialNodes}.
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
@NotThreadSafe
public abstract class AbstractHCSpecialNodes <IMPLTYPE extends AbstractHCSpecialNodes <IMPLTYPE>> implements IHCSpecialNodes
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (AbstractHCSpecialNodes.class);

  private final IMultiMapSetBased <ICSSMediaList, String> m_aExternalCSSs = new MultiLinkedHashMapLinkedHashSetBased <ICSSMediaList, String> ();
  private final Map <ICSSMediaList, StringBuilder> m_aInlineCSSBeforeExternal = new LinkedHashMap <ICSSMediaList, StringBuilder> ();
  private final Map <ICSSMediaList, StringBuilder> m_aInlineCSSAfterExternal = new LinkedHashMap <ICSSMediaList, StringBuilder> ();

  private final Set <String> m_aExternalJSs = new LinkedHashSet <String> ();
  private final CollectingJSCodeProvider m_aInlineJSBeforeExternal = new CollectingJSCodeProvider ();
  private final CollectingJSCodeProvider m_aInlineJSAfterExternal = new CollectingJSCodeProvider ();

  public AbstractHCSpecialNodes ()
  {}

  /**
   * Remove all contained content.
   */
  public void clear ()
  {
    m_aExternalCSSs.clear ();
    m_aInlineCSSBeforeExternal.clear ();
    m_aInlineCSSAfterExternal.clear ();
    m_aExternalJSs.clear ();
    m_aInlineJSBeforeExternal.reset ();
    m_aInlineJSAfterExternal.reset ();
  }

  @SuppressWarnings ("unchecked")
  @Nonnull
  protected final IMPLTYPE thisAsT ()
  {
    return (IMPLTYPE) this;
  }

  @Nonnull
  protected ICSSMediaList getSafeCSSMediaList (@Nullable final ICSSMediaList aMediaList)
  {
    if (aMediaList != null && !aMediaList.hasNoMediaOrAll ())
    {
      // A special media list is present that is neither null nor empty nor does
      // it contain the "all" keyword
      return aMediaList;
    }

    // Create a new one without any media
    return new CSSMediaList ();
  }

  @Nonnull
  public IMPLTYPE addExternalCSS (@Nullable final ICSSMediaList aMediaList, @Nonnull @Nonempty final String sCSSFile)
  {
    ValueEnforcer.notEmpty (sCSSFile, "CSSFile");

    final ICSSMediaList aRealMediaList = getSafeCSSMediaList (aMediaList);
    if (m_aExternalCSSs.putSingle (aRealMediaList, sCSSFile).isUnchanged ())
      s_aLogger.warn ("Duplicate CSS file '" + sCSSFile + "' with media list '" + aRealMediaList + "' ignored");
    return thisAsT ();
  }

  public boolean hasExternalCSSs ()
  {
    return !m_aExternalCSSs.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public Map <ICSSMediaList, List <String>> getAllExternalCSSs ()
  {
    final Map <ICSSMediaList, List <String>> ret = new LinkedHashMap <ICSSMediaList, List <String>> ();
    for (final Map.Entry <ICSSMediaList, Set <String>> aEntry : m_aExternalCSSs.entrySet ())
      ret.put (aEntry.getKey (), CollectionHelper.newList (aEntry.getValue ()));
    return ret;
  }

  @Nonnull
  public IMPLTYPE addInlineCSSBeforeExternal (@Nullable final ICSSMediaList aMediaList,
                                              @Nonnull final CharSequence aInlineCSS)
  {
    ValueEnforcer.notNull (aInlineCSS, "InlineCSS");

    final ICSSMediaList aRealMediaList = getSafeCSSMediaList (aMediaList);
    StringBuilder aSB = m_aInlineCSSBeforeExternal.get (aRealMediaList);
    if (aSB == null)
    {
      aSB = new StringBuilder ();
      m_aInlineCSSBeforeExternal.put (aRealMediaList, aSB);
    }
    aSB.append (aInlineCSS);
    return thisAsT ();
  }

  public boolean hasInlineCSSBeforeExternal ()
  {
    return !m_aInlineCSSBeforeExternal.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public Map <ICSSMediaList, StringBuilder> getAllInlineCSSBeforeExternal ()
  {
    return CollectionHelper.newOrderedMap (m_aInlineCSSBeforeExternal);
  }

  @Nonnull
  public IMPLTYPE addInlineCSSAfterExternal (@Nullable final ICSSMediaList aMediaList,
                                             @Nonnull final CharSequence aInlineCSS)
  {
    ValueEnforcer.notNull (aInlineCSS, "InlineCSS");

    final ICSSMediaList aRealMediaList = getSafeCSSMediaList (aMediaList);
    StringBuilder aSB = m_aInlineCSSAfterExternal.get (aRealMediaList);
    if (aSB == null)
    {
      aSB = new StringBuilder ();
      m_aInlineCSSAfterExternal.put (aRealMediaList, aSB);
    }
    aSB.append (aInlineCSS);
    return thisAsT ();
  }

  public boolean hasInlineCSSAfterExternal ()
  {
    return !m_aInlineCSSAfterExternal.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public Map <ICSSMediaList, StringBuilder> getAllInlineCSSAfterExternal ()
  {
    return CollectionHelper.newOrderedMap (m_aInlineCSSAfterExternal);
  }

  @Nonnull
  public IMPLTYPE addExternalJS (@Nonnull @Nonempty final String sJSFile)
  {
    ValueEnforcer.notEmpty (sJSFile, "JSFile");

    if (!m_aExternalJSs.add (sJSFile))
      s_aLogger.warn ("Duplicate JS file '" + sJSFile + "' ignored");
    return thisAsT ();
  }

  public boolean hasExternalJSs ()
  {
    return !m_aExternalJSs.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <String> getAllExternalJSs ()
  {
    return CollectionHelper.newList (m_aExternalJSs);
  }

  @Nonnull
  public IMPLTYPE addInlineJSBeforeExternal (@Nonnull final IHasJSCode aInlineJS)
  {
    ValueEnforcer.notNull (aInlineJS, "InlineJS");

    m_aInlineJSBeforeExternal.appendFlattened (aInlineJS);
    return thisAsT ();
  }

  public boolean hasInlineJSBeforeExternal ()
  {
    return m_aInlineJSBeforeExternal.isNotEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public CollectingJSCodeProvider getInlineJSBeforeExternal ()
  {
    return m_aInlineJSBeforeExternal.getClone ();
  }

  @Nonnull
  public IMPLTYPE addInlineJSAfterExternal (@Nonnull final IHasJSCode aInlineJS)
  {
    ValueEnforcer.notNull (aInlineJS, "InlineJS");

    m_aInlineJSAfterExternal.appendFlattened (aInlineJS);
    return thisAsT ();
  }

  public boolean hasInlineJSAfterExternal ()
  {
    return m_aInlineJSAfterExternal.isNotEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public CollectingJSCodeProvider getInlineJSAfterExternal ()
  {
    return m_aInlineJSAfterExternal.getClone ();
  }

  @Nonnull
  public IMPLTYPE addAll (@Nonnull final IHCSpecialNodes aSpecialNodes)
  {
    ValueEnforcer.notNull (aSpecialNodes, "SpecialNodes");

    // CSS
    for (final Map.Entry <ICSSMediaList, List <String>> aEntry : aSpecialNodes.getAllExternalCSSs ().entrySet ())
      for (final String sCSSFile : aEntry.getValue ())
        addExternalCSS (aEntry.getKey (), sCSSFile);
    for (final Map.Entry <ICSSMediaList, StringBuilder> aEntry : aSpecialNodes.getAllInlineCSSBeforeExternal ()
                                                                              .entrySet ())
      addInlineCSSBeforeExternal (aEntry.getKey (), aEntry.getValue ());
    for (final Map.Entry <ICSSMediaList, StringBuilder> aEntry : aSpecialNodes.getAllInlineCSSAfterExternal ()
                                                                              .entrySet ())
      addInlineCSSAfterExternal (aEntry.getKey (), aEntry.getValue ());

    // JS
    for (final String sJSFile : aSpecialNodes.getAllExternalJSs ())
      addExternalJS (sJSFile);
    addInlineJSBeforeExternal (aSpecialNodes.getInlineJSBeforeExternal ());
    addInlineJSAfterExternal (aSpecialNodes.getInlineJSAfterExternal ());

    return thisAsT ();
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final AbstractHCSpecialNodes <?> rhs = (AbstractHCSpecialNodes <?>) o;
    return m_aExternalCSSs.equals (rhs.m_aExternalCSSs) &&
           EqualsHelper.equals (m_aInlineCSSBeforeExternal, rhs.m_aInlineCSSBeforeExternal) &&
           EqualsHelper.equals (m_aInlineCSSAfterExternal, rhs.m_aInlineCSSAfterExternal) &&
           m_aExternalJSs.equals (rhs.m_aExternalJSs) &&
           m_aInlineJSBeforeExternal.equals (rhs.m_aInlineJSBeforeExternal) &&
           m_aInlineJSAfterExternal.equals (rhs.m_aInlineJSAfterExternal);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_aExternalCSSs)
                                       .append (m_aInlineCSSBeforeExternal)
                                       .append (m_aInlineCSSAfterExternal)
                                       .append (m_aExternalJSs)
                                       .append (m_aInlineJSBeforeExternal)
                                       .append (m_aInlineJSAfterExternal)
                                       .getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).appendIfNotEmpty ("externalCSS", m_aExternalCSSs)
                                       .append ("inlineCSSBeforeExternal", m_aInlineCSSBeforeExternal)
                                       .append ("inlineCSSAfterExternal", m_aInlineCSSAfterExternal)
                                       .appendIfNotEmpty ("externalJS", m_aExternalJSs)
                                       .append ("inlineJSBeforeExternal", m_aInlineJSBeforeExternal)
                                       .append ("inlineJSAfterExternal", m_aInlineJSBeforeExternal)
                                       .toString ();
  }
}
