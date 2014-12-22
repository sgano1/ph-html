package com.helger.html.hc.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotations.ReturnsMutableCopy;
import com.helger.commons.collections.ContainerHelper;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.html.css.ICSSClassProvider;
import com.helger.html.hc.IHCHasCSSClasses;

/**
 * Stand alone implementation of {@link IHCHasCSSClasses}
 *
 * @author Philip Helger
 * @since 4.5.2
 */
public class HCHasCSSClasses implements IHCHasCSSClasses <HCHasCSSClasses>
{
  // Must be a LinkedHashSet:
  private Set <ICSSClassProvider> m_aCSSClassProviders;

  public boolean containsClass (@Nullable final ICSSClassProvider aCSSClassProvider)
  {
    return aCSSClassProvider != null &&
           m_aCSSClassProviders != null &&
           m_aCSSClassProviders.contains (aCSSClassProvider);
  }

  @Nonnull
  public HCHasCSSClasses addClass (@Nullable final ICSSClassProvider aCSSClassProvider)
  {
    if (aCSSClassProvider != null)
    {
      if (m_aCSSClassProviders == null)
        m_aCSSClassProviders = new LinkedHashSet <ICSSClassProvider> ();
      m_aCSSClassProviders.add (aCSSClassProvider);
    }
    return this;
  }

  @Deprecated
  @Nonnull
  public HCHasCSSClasses addClasses (@Nullable final ICSSClassProvider aCSSClassProvider)
  {
    return addClass (aCSSClassProvider);
  }

  @Nonnull
  public HCHasCSSClasses addClasses (@Nullable final ICSSClassProvider... aCSSClassProviders)
  {
    if (aCSSClassProviders != null)
      for (final ICSSClassProvider aProvider : aCSSClassProviders)
        addClass (aProvider);
    return this;
  }

  @Nonnull
  public HCHasCSSClasses addClasses (@Nullable final Iterable <? extends ICSSClassProvider> aCSSClassProviders)
  {
    if (aCSSClassProviders != null)
      for (final ICSSClassProvider aProvider : aCSSClassProviders)
        addClass (aProvider);
    return this;
  }

  @Nonnull
  public HCHasCSSClasses removeClass (@Nullable final ICSSClassProvider aCSSClassProvider)
  {
    if (m_aCSSClassProviders != null && aCSSClassProvider != null)
      m_aCSSClassProviders.remove (aCSSClassProvider);
    return this;
  }

  @Nonnull
  public HCHasCSSClasses removeAllClasses ()
  {
    if (m_aCSSClassProviders != null)
      m_aCSSClassProviders.clear ();
    return this;
  }

  @Nonnull
  @ReturnsMutableCopy
  public Set <ICSSClassProvider> getAllClasses ()
  {
    return ContainerHelper.newOrderedSet (m_aCSSClassProviders);
  }

  @Nonnull
  @ReturnsMutableCopy
  public Set <String> getAllClassNames ()
  {
    final Set <String> ret = new LinkedHashSet <String> ();
    if (m_aCSSClassProviders != null)
      for (final ICSSClassProvider aCSSClassProvider : m_aCSSClassProviders)
      {
        final String sCSSClass = aCSSClassProvider.getCSSClass ();
        if (StringHelper.hasText (sCSSClass))
          ret.add (sCSSClass);
      }
    return ret;
  }

  @Nullable
  public String getAllClassesAsString ()
  {
    if (m_aCSSClassProviders == null || m_aCSSClassProviders.isEmpty ())
      return null;

    final StringBuilder aSB = new StringBuilder ();
    for (final ICSSClassProvider aCSSClassProvider : m_aCSSClassProviders)
    {
      final String sCSSClass = aCSSClassProvider.getCSSClass ();
      if (StringHelper.hasText (sCSSClass))
      {
        if (aSB.length () > 0)
          aSB.append (' ');
        aSB.append (sCSSClass);
      }
    }
    return aSB.toString ();
  }

  public boolean hasAnyClass ()
  {
    return m_aCSSClassProviders != null && !m_aCSSClassProviders.isEmpty ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).appendIfNotEmpty ("CSSClassProviders", m_aCSSClassProviders).toString ();
  }
}
