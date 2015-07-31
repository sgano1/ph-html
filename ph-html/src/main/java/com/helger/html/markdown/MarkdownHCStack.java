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
package com.helger.html.markdown;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.collection.impl.NonBlockingStack;
import com.helger.commons.string.StringHelper;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.IHCNodeWithChildren;
import com.helger.html.hc.impl.HCNodeList;
import com.helger.html.hc.impl.HCTextNode;
import com.helger.html.hchtml.IHCDefinitionItem;
import com.helger.html.hchtml.IHCMediaElementChild;
import com.helger.html.hchtml.embedded.IHCMediaElement;
import com.helger.html.hchtml.forms.HCOptGroup;
import com.helger.html.hchtml.forms.HCOption;
import com.helger.html.hchtml.grouping.HCDL;
import com.helger.html.hchtml.grouping.HCLI;
import com.helger.html.hchtml.grouping.IHCList;
import com.helger.html.hchtml.tabular.HCCol;
import com.helger.html.hchtml.tabular.HCColGroup;
import com.helger.html.hchtml.tabular.HCRow;
import com.helger.html.hchtml.tabular.HCTBody;
import com.helger.html.hchtml.tabular.HCTFoot;
import com.helger.html.hchtml.tabular.HCTHead;
import com.helger.html.hchtml.tabular.IHCCell;
import com.helger.html.hchtml.tabular.IHCTable;
import com.helger.html.hchtml.tabular.IHCTablePart;
import com.helger.html.hchtml.textlevel.HCRuby;
import com.helger.html.hchtml.textlevel.IHCRubyChild;

@NotThreadSafe
final class MarkdownHCStack
{
  private final NonBlockingStack <IHCNode> m_aStack = new NonBlockingStack <IHCNode> ();

  public MarkdownHCStack ()
  {
    m_aStack.push (new HCNodeList ());
  }

  public void push (@Nonnull final IHCNode aNode)
  {
    append (aNode);
    m_aStack.push (aNode);
  }

  @Nonnull
  public <T extends IHCNodeWithChildren <T>> T push (@Nonnull final T aNode)
  {
    append (aNode);
    m_aStack.push (aNode);
    return aNode;
  }

  public void pop ()
  {
    // Never pop the fixed nodelist
    if (m_aStack.size () == 1)
      throw new MarkdownException ("Can't pop from empty stack");
    m_aStack.pop ();
  }

  @Nonnull
  public HCNodeList getRoot ()
  {
    return (HCNodeList) m_aStack.get (0);
  }

  public void reset ()
  {
    // Ensure to create a new node list in case the object was appended!
    m_aStack.clear ();
    m_aStack.push (new HCNodeList ());
  }

  public void append (final char c)
  {
    append (new HCTextNode (c));
  }

  public void append (@Nullable final String s)
  {
    if (StringHelper.hasText (s))
      append (new HCTextNode (s));
  }

  public void append (@Nonnull final IHCNode aNode)
  {
    ValueEnforcer.notNull (aNode, "Node");

    final IHCNode aParent = m_aStack.peek ();

    // Handle special cases
    if (aParent instanceof IHCList <?> && aNode instanceof HCLI)
      ((IHCList <?>) aParent).addItem ((HCLI) aNode);
    else
      if (aParent instanceof IHCMediaElement <?> && aNode instanceof IHCMediaElementChild <?>)
        ((IHCMediaElement <?>) aParent).addChild ((IHCMediaElementChild <?>) aNode);
      else
        if (aParent instanceof HCColGroup && aNode instanceof HCCol)
          ((HCColGroup) aParent).addChild ((HCCol) aNode);
        else
          if (aParent instanceof HCDL && aNode instanceof IHCDefinitionItem <?>)
            ((HCDL) aParent).addChild ((IHCDefinitionItem <?>) aNode);
          else
            if (aParent instanceof HCOptGroup && aNode instanceof HCOption)
              ((HCOptGroup) aParent).addChild ((HCOption) aNode);
            else
              if (aParent instanceof HCOption && aNode instanceof HCTextNode)
                ((HCOption) aParent).addChild ((HCTextNode) aNode);
              else
                if (aParent instanceof IHCTable <?>)
                {
                  if (aNode instanceof HCTHead)
                    ((IHCTable <?>) aParent).setHead ((HCTHead) aNode);
                  else
                    if (aNode instanceof HCTBody)
                      ((IHCTable <?>) aParent).setBody ((HCTBody) aNode);
                    else
                      if (aNode instanceof HCTFoot)
                        ((IHCTable <?>) aParent).setFoot ((HCTFoot) aNode);
                      else
                        if (aNode instanceof HCRow)
                          ((IHCTable <?>) aParent).addBodyRow ((HCRow) aNode);
                        else
                          throw new MarkdownException ("Cannot add node " + aNode + " to " + aParent);
                }
                else
                  if (aParent instanceof IHCTablePart <?> && aNode instanceof HCRow)
                    ((IHCTablePart <?>) aParent).addChild ((HCRow) aNode);
                  else
                    if (aParent instanceof HCRow && aNode instanceof IHCCell <?>)
                      ((HCRow) aParent).addCell (aNode);
                    else
                      if (aParent instanceof HCRuby && aNode instanceof IHCRubyChild <?>)
                        ((HCRuby) aParent).addChild ((IHCRubyChild <?>) aNode);
                      else
                        if (aParent instanceof IHCNodeWithChildren <?>)
                        {
                          final IHCNodeWithChildren <?> aRealParent = ((IHCNodeWithChildren <?>) aParent);
                          if (aNode instanceof HCTextNode && aRealParent.getLastChild () instanceof HCTextNode)
                            ((HCTextNode) aRealParent.getLastChild ()).appendText (((HCTextNode) aNode).getText ());
                          else
                            aRealParent.addChild (aNode);
                        }
                        else
                          throw new MarkdownException ("Cannot add node " + aNode + " to " + aParent);
  }
}
