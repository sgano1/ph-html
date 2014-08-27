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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

import com.helger.commons.collections.ContainerHelper;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.IHCNodeBuilder;

/**
 * Test class for class {@link HCH6} This file is automatically generated from
 * com.helger.html.supplementary.main.MainCreateHCClasses so DO NOT EDIT!
 *
 * @author Philip Helger
 */
public final class HCH6Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH6 ().hasChildren ());
    assertEquals (0, HCH6.create ((IHCNodeBuilder) null).getChildCount ());
    assertEquals (0, HCH6.create ((IHCNodeBuilder) null, (IHCNodeBuilder) null).getChildCount ());
    assertEquals (1, HCH6.create ("Text").getChildCount ());
    assertEquals (0, HCH6.create ((String) null).getChildCount ());
    assertEquals (1, HCH6.create (HCB.create ("Bold")).getChildCount ());
    assertEquals (0, HCH6.create ((IHCNode) null).getChildCount ());
    assertEquals (3, HCH6.create ("Hallo", "Welt", "!!!").getChildCount ());
    assertEquals (0, HCH6.create (new String [0]).getChildCount ());
    assertEquals (0, HCH6.create ((String []) null).getChildCount ());
    assertEquals (2, HCH6.create (HCB.create ("Bold"), HCI.create ("Italic")).getChildCount ());
    assertEquals (0, HCH6.create (new IHCNode [0]).getChildCount ());
    assertEquals (0, HCH6.create ((IHCNode []) null).getChildCount ());
    assertEquals (2, HCH6.create (ContainerHelper.newList (HCB.create ("Bold"), HCI.create ("Italic")))
                  .getChildCount ());
    assertEquals (0, HCH6.create (new ArrayList <IHCNode> ()).getChildCount ());
  }
}
