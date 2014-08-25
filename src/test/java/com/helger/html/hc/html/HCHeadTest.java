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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.state.EChange;
import com.helger.commons.url.SimpleURL;
import com.helger.html.hc.conversion.HCSettings;
import com.helger.html.hc.html.HCA_Target;
import com.helger.html.hc.html.HCHead;
import com.helger.html.hc.html.HCLink;
import com.helger.html.hc.html.HCScriptFile;
import com.helger.html.meta.MetaElement;

/**
 * Test class for class {@link HCHead}
 * 
 * @author Philip Helger
 */
public final class HCHeadTest
{
  @Test
  public void testBasic ()
  {
    final HCHead aHead = new HCHead ();
    assertNull (aHead.getProfile ());
    assertNull (aHead.getPageTitle ());
    assertNull (aHead.getBaseHref ());
    assertNull (aHead.getBaseTarget ());
    assertTrue (aHead.getAllMetaElements ().isEmpty ());
    assertEquals (0, aHead.getMetaElementCount ());
    assertTrue (aHead.getAllLinks ().isEmpty ());
    assertEquals (0, aHead.getLinkCount ());
    assertTrue (aHead.getAllCSSNodes ().isEmpty ());
    assertTrue (aHead.getAllJSNodes ().isEmpty ());
    assertEquals ("", aHead.getPlainText ());

    assertSame (aHead, aHead.setProfile ("any"));
    assertEquals ("any", aHead.getProfile ());
    assertEquals ("<head profile=\"any\" xmlns=\"http://www.w3.org/1999/xhtml\"></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    assertSame (aHead, aHead.setPageTitle ("Title"));
    assertEquals ("Title", aHead.getPageTitle ());
    assertEquals ("<head profile=\"any\" xmlns=\"http://www.w3.org/1999/xhtml\"><title>Title</title></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    assertSame (aHead, aHead.setBaseHref ("/"));
    assertEquals ("/", aHead.getBaseHref ());
    assertEquals ("<head profile=\"any\" xmlns=\"http://www.w3.org/1999/xhtml\"><title>Title</title><base href=\"/\" /></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    assertSame (aHead, aHead.setBaseTarget (HCA_Target.BLANK));
    assertEquals (HCA_Target.BLANK, aHead.getBaseTarget ());
    assertEquals ("<head profile=\"any\" xmlns=\"http://www.w3.org/1999/xhtml\"><title>Title</title><base href=\"/\" target=\"_blank\" /></head>",
                  HCSettings.getAsHTMLString (aHead, false));
    assertNotNull (aHead.toString ());
  }

  @Test
  public void testMetaElements ()
  {
    final HCHead aHead = new HCHead ();
    assertTrue (aHead.getAllMetaElements ().isEmpty ());
    assertEquals (0, aHead.getMetaElementCount ());

    assertSame (aHead, aHead.addMetaElement (new MetaElement ("foo", "bar")));
    assertFalse (aHead.getAllMetaElements ().isEmpty ());
    assertEquals (1, aHead.getMetaElementCount ());
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\">" + "<meta name=\"foo\" content=\"bar\" />" + "</head>",
                  HCSettings.getAsHTMLString (aHead, false));

    assertSame (aHead, aHead.addMetaElement (new MetaElement ("goo", true, "car")));
    assertEquals (2, aHead.getMetaElementCount ());
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\">"
                  + "<meta name=\"foo\" content=\"bar\" />"
                  + "<meta http-equiv=\"goo\" content=\"car\" />"
                  + "</head>", HCSettings.getAsHTMLString (aHead, false));

    assertEquals (EChange.UNCHANGED, aHead.removeMetaElement ("any"));
    assertEquals (2, aHead.getMetaElementCount ());
    assertEquals (EChange.CHANGED, aHead.removeMetaElement ("foo"));
    assertEquals (1, aHead.getMetaElementCount ());
    assertEquals (EChange.UNCHANGED, aHead.removeMetaElement ("foo"));
    assertEquals (1, aHead.getMetaElementCount ());
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\">"
                  + "<meta http-equiv=\"goo\" content=\"car\" />"
                  + "</head>", HCSettings.getAsHTMLString (aHead, false));
    assertEquals (EChange.CHANGED, aHead.removeMetaElement ("goo"));
    assertEquals (0, aHead.getMetaElementCount ());
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"></head>", HCSettings.getAsHTMLString (aHead, false));
  }

  @Test
  public void testGenerate ()
  {
    final HCHead aHead = new HCHead ();
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"></head>", HCSettings.getAsHTMLString (aHead, false));

    aHead.setPageTitle ("phloc");
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    aHead.setBaseHref ("/root");
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title><base href=\"/root\" /></head>",
                  HCSettings.getAsHTMLString (aHead, false));
    aHead.setBaseHref (null);
    aHead.setBaseTarget (HCA_Target.BLANK);
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title><base target=\"_blank\" /></head>",
                  HCSettings.getAsHTMLString (aHead, false));
    aHead.setBaseTarget (null);
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    aHead.setShortcutIconHref (new SimpleURL ("/favicon.ico"));
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title><link rel=\"shortcut icon\" href=\"/favicon.ico\"></link><link rel=\"icon\" type=\"image/icon\" href=\"/favicon.ico\"></link></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    aHead.setShortcutIconHref (null);
    aHead.addJS (HCScriptFile.create (new SimpleURL ("/my.js")));
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title><script type=\"text/javascript\" src=\"/my.js\"></script></head>",
                  HCSettings.getAsHTMLString (aHead, false));

    aHead.addCSS (HCLink.createCSSLink (new SimpleURL ("/my.css")));
    assertEquals ("<head xmlns=\"http://www.w3.org/1999/xhtml\"><title>phloc</title><link rel=\"stylesheet\" type=\"text/css\" href=\"/my.css\"></link><script type=\"text/javascript\" src=\"/my.js\"></script></head>",
                  HCSettings.getAsHTMLString (aHead, false));
  }
}
