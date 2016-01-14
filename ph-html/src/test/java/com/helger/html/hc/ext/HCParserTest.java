/**
 * Copyright (C) 2014-2016 Philip Helger (www.helger.com)
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
package com.helger.html.hc.ext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.microdom.IMicroContainer;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.microdom.IMicroNode;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.impl.HCDOMWrapper;
import com.helger.html.hc.impl.HCTextNode;
import com.helger.html.hc.render.HCRenderer;

/**
 * Test class for class {@link HCParser}.
 *
 * @author Philip Helger
 */
public final class HCParserTest
{
  @Test
  public void testconvertToXHTMLOnDemand ()
  {
    final HCParser aParser = new HCParser ();

    IHCNode aNode = aParser.convertToXHTMLFragmentOnDemand ("<b>Hallo</b>");
    assertTrue (aNode instanceof HCDOMWrapper);
    IMicroNode aMicroNode = HCRenderer.getAsNode (aNode);
    assertTrue (aMicroNode instanceof IMicroContainer);
    assertTrue (((IMicroContainer) aMicroNode).getChildAtIndex (0) instanceof IMicroElement);

    aNode = aParser.convertToXHTMLFragmentOnDemand ("<b>Hallo<br/>helger</b>");
    assertTrue (aNode instanceof HCDOMWrapper);
    aMicroNode = HCRenderer.getAsNode (aNode);
    assertTrue (aMicroNode instanceof IMicroContainer);
    assertTrue (((IMicroContainer) aMicroNode).getChildAtIndex (0) instanceof IMicroElement);

    aNode = aParser.convertToXHTMLFragmentOnDemand ("<b>Hallo");
    assertTrue (aNode instanceof HCTextNode);
    assertEquals ("<b>Hallo", ((HCTextNode) aNode).getText ());

    aNode = aParser.convertToXHTMLFragmentOnDemand ("Hallo</b>");
    assertTrue (aNode instanceof HCTextNode);
    assertEquals ("Hallo</b>", ((HCTextNode) aNode).getText ());

    aNode = aParser.convertToXHTMLFragmentOnDemand ("&");
    assertTrue (aNode instanceof HCTextNode);
    assertEquals ("&", ((HCTextNode) aNode).getText ());
  }
}
