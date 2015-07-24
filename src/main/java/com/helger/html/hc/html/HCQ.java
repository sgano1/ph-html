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

import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.IHCNodeBuilder;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;Q&gt; element<br>
 * This file is automatically generated from
 * com.helger.html.supplementary.main.MainCreateHCClasses so DO NOT EDIT!
 *
 * @author Philip Helger
 */
public class HCQ extends AbstractHCElementWithChildren <HCQ>
{
  /**
   * Create a new Q element
   */
  public HCQ ()
  {
    super (EHTMLElement.Q);
  }

  /**
   * Create a new Q element with the passed child text
   * 
   * @param sChild
   *        The child to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final String sChild)
  {
    return new HCQ ().addChild (sChild);
  }

  /**
   * Create a new Q element with the passed child texts
   * 
   * @param aChildren
   *        The child texts to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final String... aChildren)
  {
    return new HCQ ().addChildren (aChildren);
  }

  /**
   * Create a new Q element with the passed child node
   * 
   * @param aChild
   *        The child node to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final IHCNodeBuilder aChild)
  {
    return new HCQ ().buildAndAddChild (aChild);
  }

  /**
   * Create a new Q element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final IHCNodeBuilder... aChildren)
  {
    return new HCQ ().buildAndAddChildren (aChildren);
  }

  /**
   * Create a new Q element with the passed child node
   * 
   * @param aChild
   *        The child node to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final IHCNode aChild)
  {
    return new HCQ ().addChild (aChild);
  }

  /**
   * Create a new Q element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final IHCNode... aChildren)
  {
    return new HCQ ().addChildren (aChildren);
  }

  /**
   * Create a new Q element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCQ element and never <code>null</code>
   */
  @Nonnull
  public static HCQ create (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    return new HCQ ().addChildren (aChildren);
  }
}
