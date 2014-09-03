/**
 * Copyright (C) 2014 Philip Helger (www.helger.com)
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
package com.helger.html.resource.css;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotations.Nonempty;
import com.helger.commons.annotations.ReturnsMutableCopy;
import com.helger.commons.hash.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.css.CSSFilenameHelper;
import com.helger.css.media.CSSMediaList;

/**
 * Implementation of {@link ICSSPathProvider} with constant paths.
 *
 * @author Philip Helger
 */
public final class ConstantCSSPathProvider implements ICSSPathProvider
{
  private final String m_sPath;
  private final String m_sMinifiedPath;
  private final CSSMediaList m_aCSSMediaList;

  public ConstantCSSPathProvider (@Nonnull @Nonempty final String sPath)
  {
    this (sPath, CSSFilenameHelper.getMinifiedCSSFilename (sPath));
  }

  public ConstantCSSPathProvider (@Nonnull @Nonempty final String sPath, @Nullable final CSSMediaList aMediaList)
  {
    this (sPath, CSSFilenameHelper.getMinifiedCSSFilename (sPath), aMediaList);
  }

  public ConstantCSSPathProvider (@Nonnull @Nonempty final String sPath, @Nonnull @Nonempty final String sMinifiedPath)
  {
    this (sPath, sMinifiedPath, (CSSMediaList) null);
  }

  public ConstantCSSPathProvider (@Nonnull @Nonempty final String sPath,
                                  @Nonnull @Nonempty final String sMinifiedPath,
                                  @Nullable final CSSMediaList aMediaList)
  {
    ValueEnforcer.notEmpty (sPath, "Path");
    if (!CSSFilenameHelper.isCSSFilename (sPath))
      throw new IllegalArgumentException ("path");
    ValueEnforcer.notEmpty (sMinifiedPath, "MinifiedPath");
    if (!CSSFilenameHelper.isCSSFilename (sMinifiedPath))
      throw new IllegalArgumentException ("minified path");
    m_sPath = sPath;
    m_sMinifiedPath = sMinifiedPath;
    // Use clone in ph-css > 3.8.0
    m_aCSSMediaList = aMediaList == null ? new CSSMediaList () : new CSSMediaList (aMediaList.getAllMedia ());
  }

  @Nonnull
  @Nonempty
  public String getCSSItemPath (final boolean bRegular)
  {
    return bRegular ? m_sPath : m_sMinifiedPath;
  }

  @Nonnull
  @ReturnsMutableCopy
  public CSSMediaList getMediaList ()
  {
    // Use clone in ph-css > 3.8.0
    return new CSSMediaList (m_aCSSMediaList.getAllMedia ());
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!(o instanceof ConstantCSSPathProvider))
      return false;
    final ConstantCSSPathProvider rhs = (ConstantCSSPathProvider) o;
    return m_sPath.equals (rhs.m_sPath) && m_sMinifiedPath.equals (rhs.m_sMinifiedPath);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sPath).append (m_sMinifiedPath).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("path", m_sPath).append ("minifiedPath", m_sMinifiedPath).toString ();
  }
}
