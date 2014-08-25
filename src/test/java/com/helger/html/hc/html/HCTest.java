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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.helger.commons.mime.CMimeType;
import com.helger.commons.url.SimpleURL;
import com.helger.html.EHTMLRole;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.api.EHCLinkType;
import com.helger.html.hc.conversion.HCSettings;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.hc.html.HCA;
import com.helger.html.hc.html.HCA_Target;
import com.helger.html.hc.html.HCAbbr;
import com.helger.html.hc.html.HCAddress;
import com.helger.html.hc.html.HCB;
import com.helger.html.hc.html.HCBDO;
import com.helger.html.hc.html.HCBlockQuote;
import com.helger.html.hc.html.HCBody;
import com.helger.html.hc.html.HCButton;
import com.helger.html.hc.html.HCButton_Reset;
import com.helger.html.hc.html.HCButton_Submit;
import com.helger.html.hc.html.HCCenter;
import com.helger.html.hc.html.HCCheckBox;
import com.helger.html.hc.html.HCCite;
import com.helger.html.hc.html.HCCode;
import com.helger.html.hc.html.HCCol;
import com.helger.html.hc.html.HCDD;
import com.helger.html.hc.html.HCDFN;
import com.helger.html.hc.html.HCDL;
import com.helger.html.hc.html.HCDT;
import com.helger.html.hc.html.HCDel;
import com.helger.html.hc.html.HCDiv;
import com.helger.html.hc.html.HCEM;
import com.helger.html.hc.html.HCEdit;
import com.helger.html.hc.html.HCEditFile;
import com.helger.html.hc.html.HCEditPassword;
import com.helger.html.hc.html.HCEmbed;
import com.helger.html.hc.html.HCFieldSet;
import com.helger.html.hc.html.HCForm;
import com.helger.html.hc.html.HCFrame;
import com.helger.html.hc.html.HCFrameset;
import com.helger.html.hc.html.HCH1;
import com.helger.html.hc.html.HCH2;
import com.helger.html.hc.html.HCH3;
import com.helger.html.hc.html.HCH4;
import com.helger.html.hc.html.HCH5;
import com.helger.html.hc.html.HCH6;
import com.helger.html.hc.html.HCHR;
import com.helger.html.hc.html.HCHiddenField;
import com.helger.html.hc.html.HCHtml;
import com.helger.html.hc.html.HCI;
import com.helger.html.hc.html.HCIFrame;
import com.helger.html.hc.html.HCImg;
import com.helger.html.hc.html.HCIns;
import com.helger.html.hc.html.HCKBD;
import com.helger.html.hc.html.HCLabel;
import com.helger.html.hc.html.HCLegend;
import com.helger.html.hc.html.HCLink;
import com.helger.html.hc.html.HCMenu;
import com.helger.html.hc.html.HCNoScript;
import com.helger.html.hc.html.HCOL;
import com.helger.html.hc.html.HCObject;
import com.helger.html.hc.html.HCOptGroup;
import com.helger.html.hc.html.HCP;
import com.helger.html.hc.html.HCParam;
import com.helger.html.hc.html.HCPre;
import com.helger.html.hc.html.HCQ;
import com.helger.html.hc.html.HCRadioButton;
import com.helger.html.hc.html.HCS;
import com.helger.html.hc.html.HCSamp;
import com.helger.html.hc.html.HCScript;
import com.helger.html.hc.html.HCScriptFile;
import com.helger.html.hc.html.HCSelect;
import com.helger.html.hc.html.HCSpan;
import com.helger.html.hc.html.HCStrong;
import com.helger.html.hc.html.HCStyle;
import com.helger.html.hc.html.HCSub;
import com.helger.html.hc.html.HCSup;
import com.helger.html.hc.html.HCTable;
import com.helger.html.hc.html.HCTextArea;
import com.helger.html.hc.html.HCUL;
import com.helger.html.hc.html.HCVar;
import com.helger.html.js.builder.JSExpr;

/**
 * Instantiate and generate code for all HTML elements available
 * 
 * @author Philip Helger
 */
public final class HCTest
{
  @Test
  public void testMainHC ()
  {
    final HCHtml h = new HCHtml ();
    final HCBody b = h.getBody ();
    b.addChild (new HCA (new SimpleURL ("http://www.phloc.com")).setTarget (HCA_Target.SELF).addChild ("phloc"));
    b.addChild (new HCAbbr ().addChild ("abbr"));
    b.addChild (new HCAddress ().addChild ("address"));
    b.addChild (new HCB ().addChild ("echt fett"));
    b.addChild (new HCBDO ().addChild ("bdo"));
    b.addChild (new HCBlockQuote ().addChild ("blockQuote"));
    b.addChild (new HCButton_Reset ("Abbrechen"));
    b.addChild (new HCButton_Submit ("OK"));
    b.addChild (new HCButton ("Knopf"));
    b.addChild (new HCCenter ());
    b.addChild (new HCCenter ().addChild ("Zentriert"));
    b.addChild (new HCCheckBox ("cb1", true));
    b.addChild (new HCCite ());
    b.addChild (new HCCite ().addChild ("Zitiert"));
    b.addChild (new HCCode ());
    b.addChild (new HCCode ().addChild ("var i = 0;"));
    b.addChild (new HCDFN ());
    b.addChild (new HCDFN ().addChild ("<a> ist ein XML Tag"));
    final HCDL aDL = b.addAndReturnChild (new HCDL ());
    aDL.addItem (new HCDD ());
    aDL.addItem (new HCDD ().addChild ("def"));
    aDL.addItem (new HCDT ());
    aDL.addItem (new HCDT ().addChild ("term"));
    b.addChild (new HCDel ());
    b.addChild (new HCDel ().addChild ("gelöscht"));
    b.addChild (new HCDiv ());
    b.addChild (new HCDiv ().addChild ("Absatz"));
    b.addChild (new HCEdit ("filename", "autoexec.bat"));
    b.addChild (new HCEditFile ("upload"));
    b.addChild (new HCEditPassword ("password"));
    b.addChild (new HCEM ());
    b.addChild (new HCEM ().addChild ("emphasised"));
    b.addChild (new HCEmbed ().setSrc (new SimpleURL ("myfile.txt")));
    b.addChild (new HCFieldSet ());
    b.addChild (new HCFieldSet ("Gruppe"));
    b.addChild (new HCForm ("?").setSubmitPressingEnter (false));
    b.addChild (new HCForm (new SimpleURL ()).setSubmitPressingEnter (false));
    b.addChild (new HCFrame ("frame1"));
    b.addChild (new HCFrameset ());
    b.addChild (new HCH1 ());
    b.addChild (new HCH1 ().addChild ("Ü1"));
    b.addChild (new HCH2 ());
    b.addChild (new HCH2 ().addChild ("Ü2"));
    b.addChild (new HCH3 ());
    b.addChild (new HCH3 ().addChild ("Ü3"));
    b.addChild (new HCH4 ());
    b.addChild (new HCH4 ().addChild ("Ü4"));
    b.addChild (new HCH5 ());
    b.addChild (new HCH5 ().addChild ("Ü5"));
    b.addChild (new HCH6 ());
    b.addChild (new HCH6 ().addChild ("Ü6"));
    b.addChild (new HCHiddenField ("action", "value"));
    b.addChild (new HCHiddenField ("action", 4711));
    b.addChild (new HCHiddenField ("action", false));
    b.addChild (new HCHR ());
    b.addChild (new HCIFrame ());
    b.addChild (new HCImg ().setSrc ("test1.png"));
    b.addChild (new HCIns ());
    b.addChild (new HCIns ().addChild ("Das wäre also ein Beispiel"));
    b.addChild (new HCI ());
    b.addChild (new HCI ().addChild ("Das wäre also ein Beispiel"));
    b.addChild (new HCKBD ());
    b.addChild (new HCKBD ().addChild ("Das wäre also ein Beispiel"));
    b.addChild (new HCLabel ());
    b.addChild (new HCLabel ().addChild ("Feldname"));
    b.addChild (new HCLegend ());
    b.addChild (new HCLegend ().addChild ("Legend"));
    b.addChild (new HCLink ().setRel (EHCLinkType.ALTERNATE)
                             .setType (CMimeType.TEXT_HTML)
                             .setHref (new SimpleURL ("any.html")));
    final HCMenu aMenu = new HCMenu ();
    aMenu.addItem ("File");
    aMenu.addItem ("Settings");
    b.addChild (aMenu);
    b.addChild (new HCNoScript ().addChild ("JS missing"));
    final HCObject aObject = new HCObject ().setType (CMimeType.APPLICATION_SHOCKWAVE_FLASH)
                                            .setClassID ("classID{567}");
    aObject.addChild (new HCParam ("par1"));
    b.addChild (aObject);
    final HCOL aOL = new HCOL ();
    aOL.addItem ("First");
    aOL.addItem ("Seconf");
    b.addChild (aOL);
    b.addChild (new HCOptGroup ());
    b.addChild (new HCP ());
    b.addChild (new HCP ().addChild ("List"));
    b.addChild (new HCPre ());
    b.addChild (new HCPre ().addChild ("List"));
    b.addChild (new HCQ ());
    b.addChild (new HCQ ().addChild ("List"));
    b.addChild (new HCRadioButton ("rb1"));
    b.addChild (new HCS ());
    b.addChild (new HCS ().addChild ("Das wäre also ein Beispiel"));
    b.addChild (new HCSamp ());
    b.addChild (new HCSamp ().addChild ("List"));
    b.addChild (new HCScript (JSExpr.ref ("i").assign (17)));
    b.addChild (HCScriptFile.create (new SimpleURL ("a.js")));
    final HCSelect aSelect = new HCSelect ("x");
    aSelect.addOption ("y", "Ypsilon");
    aSelect.addOption ("z", "Zet");
    b.addChild (aSelect);
    b.addChild (new HCSpan ());
    b.addChild (new HCSpan ().addChild ("List"));
    b.addChild (new HCStrong ());
    b.addChild (new HCStrong ().addChild ("Das wäre also ein Beispiel"));
    b.addChild (new HCS ());
    b.addChild (new HCS ().addChild ("Das wäre also ein Beispiel"));
    b.addChild (new HCStyle ("div{color:red;}"));
    b.addChild (new HCSub ());
    b.addChild (new HCSub ().addChild ("unter"));
    b.addChild (new HCSup ());
    b.addChild (new HCSup ().addChild ("unter"));
    final HCTable aTable = b.addAndReturnChild (new HCTable (new HCCol (50), new HCCol (20)).setBodyID ("ID"));
    aTable.addHeaderRow ().addCells ("Name", "Wert");
    aTable.addBodyRow ().addCells ("abc", "def");
    aTable.addFooterRow ().addCells ("", "OK!");
    b.addChild (new HCTextArea ("name", "value"));
    final HCUL aUL = new HCUL ();
    aUL.addItem ("bla");
    aUL.addItem ("foo");
    b.addChild (aUL);
    b.addChild (new HCVar ());
    b.addChild (new HCVar ().addChild ("zzz"));

    final IHCConversionSettings aCS = HCSettings.getConversionSettings (true).getClone (EHTMLVersion.DEFAULT);
    assertNotNull (h.convertToNode (aCS));
    if (false)
      System.out.print (h.getAsHTMLString (aCS));
  }

  @Test
  public void testRole ()
  {
    final HCDiv aDiv = new HCDiv ();
    assertNull (aDiv.getRole ());
    aDiv.setRole (EHTMLRole.DIALOG);
    assertEquals (EHTMLRole.DIALOG, aDiv.getRole ());
    assertEquals ("<div role=\"dialog\" xmlns=\"http://www.w3.org/1999/xhtml\"></div>",
                  HCSettings.getAsHTMLString (aDiv));
  }
}
