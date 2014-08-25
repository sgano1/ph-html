/**
 * Copyright (C) 2006-2014 phloc systems (www.phloc.com)
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
package com.helger.html.hc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.text.IPredefinedLocaleTextProvider;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCElement;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.IHCNodeBuilder;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;label&gt; element
 * 
 * @author Philip Helger
 */
public class HCLabel extends AbstractHCElementWithChildren <HCLabel>
{
  private String m_sFor;
  private String m_sForm;

  public HCLabel ()
  {
    super (EHTMLElement.LABEL);
  }

  @Nullable
  public String getFor ()
  {
    return m_sFor;
  }

  /**
   * Indicates that this label is used as the description for another object.
   * 
   * @param sFor
   *        The HTML ID of the other object.
   * @return this
   */
  @Nonnull
  public HCLabel setFor (@Nullable final String sFor)
  {
    m_sFor = sFor;
    return this;
  }

  /**
   * Indicates that this label is used as the description for another object.
   * 
   * @param aFor
   *        The HTML of the other object.
   * @return this
   */
  @Nonnull
  public HCLabel setFor (@Nullable final IHCElement <?> aFor)
  {
    if (aFor == null)
      m_sFor = null;
    else
      m_sFor = aFor.ensureID ().getID ();
    return this;
  }

  @Nullable
  public String getForm ()
  {
    return m_sForm;
  }

  /**
   * The value of the id attribute on the form with which to associate the
   * element.
   * 
   * @param sForm
   *        The HTML ID of the form.
   * @return this
   */
  @Nonnull
  public HCLabel setForm (@Nullable final String sForm)
  {
    m_sForm = sForm;
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sFor))
      aElement.setAttribute (CHTMLAttributes.FOR, m_sFor);
    if (StringHelper.hasText (m_sForm))
      aElement.setAttribute (CHTMLAttributes.FORM, m_sForm);
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("for", m_sFor)
                            .appendIfNotNull ("form", m_sForm)
                            .toString ();
  }

  /**
   * Create a new LABEL element with the passed child text
   * 
   * @param aChild
   *        The child text provider to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IPredefinedLocaleTextProvider aChild)
  {
    return new HCLabel ().addChild (aChild);
  }

  /**
   * Create a new LABEL element with the passed child texts
   * 
   * @param aChildren
   *        The child texts to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IPredefinedLocaleTextProvider... aChildren)
  {
    return new HCLabel ().addChildren (aChildren);
  }

  /**
   * Create a new LABEL element with the passed child text
   * 
   * @param sChild
   *        The child to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final String sChild)
  {
    return new HCLabel ().addChild (sChild);
  }

  /**
   * Create a new LABEL element with the passed child texts
   * 
   * @param aChildren
   *        The child texts to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final String... aChildren)
  {
    return new HCLabel ().addChildren (aChildren);
  }

  /**
   * Create a new LABEL element with the passed child node
   * 
   * @param aChild
   *        The child node to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IHCNodeBuilder aChild)
  {
    return new HCLabel ().addChild (aChild);
  }

  /**
   * Create a new LABEL element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IHCNodeBuilder... aChildren)
  {
    return new HCLabel ().addChildren (aChildren);
  }

  /**
   * Create a new LABEL element with the passed child node
   * 
   * @param aChild
   *        The child node to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IHCNode aChild)
  {
    return new HCLabel ().addChild (aChild);
  }

  /**
   * Create a new LABEL element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final IHCNode... aChildren)
  {
    return new HCLabel ().addChildren (aChildren);
  }

  /**
   * Create a new LABEL element with the passed child nodes
   * 
   * @param aChildren
   *        The child nodes to be appended. May be <code>null</code>
   * @return The created HCLabel element and never <code>null</code>
   */
  @Nonnull
  public static HCLabel create (@Nullable final Iterable <? extends IHCNode> aChildren)
  {
    return new HCLabel ().addChildren (aChildren);
  }
}
