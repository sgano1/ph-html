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
package com.helger.html.js.tostring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.collection.CollectionHelper;
import com.helger.html.js.UnparsedJSCodeProvider;
import com.helger.html.js.tostring.JSListType;
import com.helger.html.js.tostring.JSMapType;
import com.helger.html.js.tostring.JSToString;
import com.helger.html.js.tostring.JSType;

/**
 * JUnit test for class {@link JSToString}.
 *
 * @author Philip Helger
 */
public final class JSToStringTest
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (JSToStringTest.class);
  private static final int COUNT = 5;

  private static void _chk (final Object aSrcObject, final JSType aType, final String sExpected)
  {
    if (s_aLogger.isDebugEnabled ())
      s_aLogger.debug ("Testing " + aSrcObject.getClass ().getName () + ": " + aSrcObject.toString ());

    final String sJS = JSToString.objectToJSString (aSrcObject, aType, true);
    assertNotNull (sJS);
    assertTrue (sJS.length () > 0);
    if (sExpected != null)
      assertEquals (sExpected, sJS);

    // now, try with auto-detect
    // Note: results may differ depending on the usage of the explicit types!
    assertNotNull (JSToString.objectToJSString (aSrcObject));
  }

  @Test
  public void testBasic ()
  {
    // test HTML
    _chk ("<b>Hallo Welt</b>", JSType.HTML, "<b>Hallo Welt</b>");
    _chk ("Hallo Welt", JSType.STRING, "'Hallo Welt'");
    _chk (Integer.valueOf (1), JSType.INT, "1");
    _chk (Double.valueOf (12.3456), JSType.DOUBLE, "12.3456");
    _chk (Double.valueOf (12.3456), JSType.INT, "12");
  }

  @Test
  public void testList ()
  {
    // list integer
    {
      final List <Integer> aList = new ArrayList <Integer> ();
      for (int i = 1; i < COUNT; ++i)
        aList.add (Integer.valueOf (i));
      _chk (aList, new JSListType (JSType.INT), null);
    }
    // list string
    {
      final List <String> aList = new ArrayList <String> ();
      for (int i = 1; i < COUNT; ++i)
        aList.add ("String " + i);
      _chk (aList, new JSListType (JSType.STRING), null);
    }
    // list list string
    {
      final List <List <String>> aList = new ArrayList <List <String>> ();
      for (int i = 1; i < COUNT; ++i)
      {
        final List <String> aSubList = new ArrayList <String> ();
        aList.add (aSubList);
        for (int j = 1; j < COUNT; ++j)
          aSubList.add ("String " + i + " " + j);
      }
      _chk (aList, new JSListType (new JSListType (JSType.STRING)), null);
    }
  }

  @Test
  public void testMap ()
  {
    // map integer,double
    {
      final Map <Integer, Double> aMap = new HashMap <Integer, Double> ();
      for (int i = 1; i < COUNT; ++i)
        aMap.put (Integer.valueOf (i), Double.valueOf (i + 0.1));
      _chk (aMap, new JSMapType (JSType.INT, JSType.DOUBLE), null);
    }
    // map list integer,list double
    {
      final Map <List <Integer>, List <Double>> aMap = new HashMap <List <Integer>, List <Double>> ();
      for (int i = 1; i < COUNT; ++i)
      {
        // create key
        final List <Integer> aKey = new ArrayList <Integer> ();
        aKey.add (Integer.valueOf (i));
        aKey.add (Integer.valueOf (i + 1));

        // create value
        final List <Double> aValue = new ArrayList <Double> ();
        aValue.add (Double.valueOf (i + 0.3));
        aValue.add (Double.valueOf (i + 1.3));

        // put in map
        aMap.put (aKey, aValue);
      }
      _chk (aMap, new JSMapType (new JSListType (JSType.INT), new JSListType (JSType.DOUBLE)), null);
    }
  }

  @Test
  public void testFixedList ()
  {
    assertEquals ("[]", JSToString.objectToJSString (new ArrayList <String> (), new JSListType (JSType.STRING), false));
    assertEquals ("['x']",
                  JSToString.objectToJSString (CollectionHelper.newList ("x"), new JSListType (JSType.STRING), false));
    assertEquals ("['x','y']",
                  JSToString.objectToJSString (CollectionHelper.newList ("x", "y"),
                                               new JSListType (JSType.STRING),
                                               false));
    assertEquals ("[1,9]",
                  JSToString.objectToJSString (CollectionHelper.newList (Integer.valueOf (1), Integer.valueOf (9)),
                                               new JSListType (JSType.INT),
                                               false));
    assertEquals ("[1.1,9.8]",
                  JSToString.objectToJSString (CollectionHelper.newList (Double.valueOf (1.1), Double.valueOf (9.8)),
                                               new JSListType (JSType.DOUBLE),
                                               false));
  }

  @Test
  public void testTypeAutoDetect ()
  {
    // Base types
    assertEquals ("true", JSToString.objectToJSString (Boolean.TRUE));
    assertEquals ("5", JSToString.objectToJSString (Byte.valueOf ((byte) 5)));
    assertEquals ("'a'", JSToString.objectToJSString (Character.valueOf ('a')));
    assertEquals ("5.1", JSToString.objectToJSString (Double.valueOf (5.1)));
    assertEquals ("5.1", JSToString.objectToJSString (Float.valueOf (5.1f)));
    assertEquals ("5", JSToString.objectToJSString (Integer.valueOf (5)));
    assertEquals ("5", JSToString.objectToJSString (Long.valueOf (5)));
    assertEquals ("5", JSToString.objectToJSString (Short.valueOf ((short) 5)));

    // Special values
    assertEquals ("null", JSToString.objectToJSString (null));
    assertEquals ("i=17;", JSToString.objectToJSString (new UnparsedJSCodeProvider ("i=17;")));

    // Strings
    assertEquals ("'abc'", JSToString.objectToJSString ("abc"));
    assertEquals ("'a\\'bc'", JSToString.objectToJSString ("a'bc"));
    assertEquals ("'a\\'bc'", JSToString.objectToJSString (new StringBuffer ("a'bc")));
    assertEquals ("'a\\'bc'", JSToString.objectToJSString (new StringBuilder ("a'bc")));

    // Arrays
    assertEquals ("[1,'xx','y']",
                  JSToString.objectToJSString (new Object [] { Integer.valueOf (1), "xx", Character.valueOf ('y') }));

    // Collections
    assertEquals ("[1,'xx','y']",
                  JSToString.objectToJSString (CollectionHelper.<Object> newList (Integer.valueOf (1),
                                                                                  "xx",
                                                                                  Character.valueOf ('y'))));
    Map <Object, Object> aMap = new LinkedHashMap <Object, Object> ();
    aMap.put (Integer.valueOf (1), "xx");
    aMap.put (Integer.valueOf (2), Character.valueOf ('y'));
    assertEquals ("{1:'xx',2:'y'}", JSToString.objectToJSString (aMap));

    aMap = new LinkedHashMap <Object, Object> ();
    aMap.put (Integer.valueOf (1),
              CollectionHelper.<Object> newList (Integer.valueOf (1), "xx", Character.valueOf ('y')));
    aMap.put (Integer.valueOf (2), Character.valueOf ('y'));
    assertEquals ("{1:[1,'xx','y'],2:'y'}", JSToString.objectToJSString (aMap));
  }
}
