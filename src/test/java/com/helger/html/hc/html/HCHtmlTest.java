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
package com.helger.html.hc.html;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.helger.html.hc.conversion.HCSettings;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.js.provider.UnparsedJSCodeProvider;
import com.helger.html.meta.MetaElement;

/**
 * Test class for class {@link HCHtml}
 *
 * @author Philip Helger
 */
public final class HCHtmlTest
{
  @Test
  public void testOutOfBandNodes1 ()
  {
    final IHCConversionSettings aCS = HCSettings.getConversionSettings (false);
    final HCHtml aHtml = new HCHtml ();
    aHtml.getBody ().addChild (new HCH1 ().addChild ("Test"));
    aHtml.getBody ().addChild (new HCStyle ("h1{color:red;}"));

    assertEquals ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">"
                      + "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">"
                      + "<head><style type=\"text/css\">h1{color:red;}</style></head>"
                      + "<body><h1>Test</h1></body>"
                      + "</html>",
                  aHtml.getAsHTMLString (aCS));
    // Do it again and check for node consistency
    assertEquals ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">"
                      + "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">"
                      + "<head><style type=\"text/css\">h1{color:red;}</style></head>"
                      + "<body><h1>Test</h1></body>"
                      + "</html>",
                  aHtml.getAsHTMLString (aCS));
  }

  @Test
  public void testOutOfBandNodes2 ()
  {
    final IHCConversionSettings aCS = HCSettings.getConversionSettings (false);
    final HCHtml aHtml = new HCHtml ();
    aHtml.getHead ().addMetaElement (new MetaElement ("foo", "bar"));
    aHtml.getBody ().addChild (new HCH1 ().addChild ("Test"));
    aHtml.getBody ().addChild (new HCScriptOnDocumentReady (new UnparsedJSCodeProvider ("a=b;")));
    aHtml.getBody ().addChild (new HCScriptOnDocumentReady (new UnparsedJSCodeProvider ("c=d;")));
    final String sCRLF = HCScript.getDefaultLineSeparator ();
    assertEquals ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                      "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
                      "<head><meta name=\"foo\" content=\"bar\" /></head>" +
                      "<body><h1>Test</h1>" +
                      "<script type=\"text/javascript\"><!--" +
                      sCRLF +
                      "$(document).ready(function(){a=b;c=d;});" +
                      sCRLF +
                      "//--></script>" +
                      "</body>" +
                      "</html>",
                  aHtml.getAsHTMLString (aCS));
    // Do it again and check for node consistency
    assertEquals ("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">" +
                      "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
                      "<head><meta name=\"foo\" content=\"bar\" /></head>" +
                      "<body><h1>Test</h1>" +
                      "<script type=\"text/javascript\"><!--" +
                      sCRLF +
                      "$(document).ready(function(){a=b;c=d;});" +
                      sCRLF +
                      "//--></script>" +
                      "</body>" +
                      "</html>",
                  aHtml.getAsHTMLString (aCS));
  }
}
