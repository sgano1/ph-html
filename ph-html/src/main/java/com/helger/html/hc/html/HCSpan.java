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
package com.helger.html.hc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.html.hc.IHCNode;
import com.helger.html.hc.base.AbstractHCSpan;

/**
 * Represents an HTML &lt;SPAN&gt; element<br>
 * This file is automatically generated from com.helger.html.supplementary.main.MainCreateHCClasses so DO NOT EDIT!
 * 
 * @author Philip Helger
 */
public class HCSpan extends AbstractHCSpan <HCSpan>
{
  /**
   * Create a new SPAN element
   */
  public HCSpan ()
  {
    super ();
  }

  /**
   * Create a new SPAN element with the passed child text
   * @param sChild The child to be appended. May be <code>null</code>
   * @return The created HCSpan element and never <code>null</code>
   */
  @Nonnull
  @Deprecated
  public static HCSpan create (@Nullable final String sChild)
  {
    return new HCSpan ().addChild (sChild);
  }

  /**
   * Create a new SPAN element with the passed child texts
   * @param aChildren The child texts to be appended. May be <code>null</code>
   * @return The created HCSpan element and never <code>null</code>
   */
  @Nonnull
  @Deprecated
  public static HCSpan create (@Nullable final String... aChildren)
  {
    return new HCSpan ().addChildren (aChildren);
  }

  /**
   * Create a new SPAN element with the passed child node
   * @param aChild The child node to be appended. May be <code>null</code>
   * @return The created HCSpan element and never <code>null</code>
   */
  @Nonnull
  @Deprecated
  public static HCSpan create (@Nullable final IHCNode aChild)
  {
    return new HCSpan ().addChild (aChild);
  }

  /**
   * Create a new SPAN element with the passed child nodes
   * @param aChildren The child nodes to be appended. May be <code>null</code>
   * @return The created HCSpan element and never <code>null</code>
   */
  @Nonnull
  @Deprecated
  public static HCSpan create (@Nullable final IHCNode... aChildren)
  {
    return new HCSpan ().addChildren (aChildren);
  }

  /**
   * Create a new SPAN element with the passed child nodes
   * @param aChildren The child nodes to be appended. May be <code>null</code>
   * @return The created HCSpan element and never <code>null</code>
   */
  @Nonnull
  @Deprecated
  public static HCSpan create (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    return new HCSpan ().addChildren (aChildren);
  }
}
