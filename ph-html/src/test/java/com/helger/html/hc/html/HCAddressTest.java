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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.Test;

import com.helger.commons.collection.CollectionHelper;
import com.helger.html.hc.IHCNode;

/**
 * Test class for class {@link HCAddress}
 * This file is automatically generated from com.helger.html.supplementary.main.MainCreateHCClasses so DO NOT EDIT!
 * 
 * @author Philip Helger
 */
@SuppressWarnings ("deprecation")
public final class HCAddressTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCAddress ().hasChildren ());
    assertEquals (1, HCAddress.create ("Text").getChildCount ());
    assertEquals (0, HCAddress.create ((String) null).getChildCount ());
    assertEquals (1, HCAddress.create (HCB.create ("Bold")).getChildCount ());
    assertEquals (0, HCAddress.create ((IHCNode) null).getChildCount ());
    assertEquals (3, HCAddress.create ("Hallo", "Welt", "!!!").getChildCount ());
    assertEquals (0, HCAddress.create (new String [0]).getChildCount ());
    assertEquals (0, HCAddress.create ((String []) null).getChildCount ());
    assertEquals (2, HCAddress.create (HCB.create ("Bold"), HCI.create ("Italic")).getChildCount ());
    assertEquals (0, HCAddress.create (new IHCNode [0]).getChildCount ());
    assertEquals (0, HCAddress.create ((IHCNode []) null).getChildCount ());
    assertEquals (2, HCAddress.create (CollectionHelper.newList (HCB.create ("Bold"), HCI.create ("Italic")))
                         .getChildCount ());
    assertEquals (0, HCAddress.create (new ArrayList <IHCNode> ()).getChildCount ());
  }
}
