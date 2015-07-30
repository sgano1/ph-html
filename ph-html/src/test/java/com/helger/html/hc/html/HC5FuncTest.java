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

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.helger.commons.url.SimpleURL;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.config.HCSettings;
import com.helger.html.hc.render.HCRenderer;
import com.helger.html.hcapi.config.IHCConversionSettings;
import com.helger.html.hchtml.base.HCCommand;
import com.helger.html.hchtml.base.HCHtml;
import com.helger.html.hchtml.deprecated.HCHGroup;
import com.helger.html.hchtml.embedded.HCAudio;
import com.helger.html.hchtml.embedded.HCSource;
import com.helger.html.hchtml.embedded.HCTrack;
import com.helger.html.hchtml.embedded.HCVideo;
import com.helger.html.hchtml.forms.HCKeyGen;
import com.helger.html.hchtml.forms.HCMeter;
import com.helger.html.hchtml.forms.HCProgress;
import com.helger.html.hchtml.grouping.HCFigure;
import com.helger.html.hchtml.script.HCCanvas;
import com.helger.html.hchtml.sections.HCArticle;
import com.helger.html.hchtml.sections.HCAside;
import com.helger.html.hchtml.sections.HCBody;
import com.helger.html.hchtml.sections.HCFooter;
import com.helger.html.hchtml.sections.HCHeader;
import com.helger.html.hchtml.sections.HCNav;
import com.helger.html.hchtml.sections.HCSection;
import com.helger.html.hchtml.textlevel.HCBDI;
import com.helger.html.hchtml.textlevel.HCMark;
import com.helger.html.hchtml.textlevel.HCRP;
import com.helger.html.hchtml.textlevel.HCRT;
import com.helger.html.hchtml.textlevel.HCRuby;
import com.helger.html.hchtml.textlevel.HCTime;
import com.helger.html.hchtml.textlevel.HCWBR;

/**
 * Instantiate and generate code for all HTML5 elements available
 *
 * @author Philip Helger
 */
public final class HC5FuncTest
{
  @Test
  public void testMainHC ()
  {
    final HCHtml h = new HCHtml ();
    final HCBody b = h.getBody ();

    b.addChild (new HCArticle ());
    b.addChild (new HCArticle ().addChild ("Bla foo"));
    b.addChild (new HCAside ());
    b.addChild (new HCAside ().addChild ("Aside"));
    final HCAudio aAudio = new HCAudio ();
    aAudio.addSource (new HCSource ().setSrc (new SimpleURL ("a.mp3")));
    aAudio.addTrack (new HCTrack ().setSrc (new SimpleURL ("a.mp3")));
    b.addChild (aAudio);
    b.addChild (new HCBDI ());
    b.addChild (new HCBDI ().addChild ("bidirectional"));
    b.addChild (new HCCanvas ());
    b.addChild (new HCCanvas ().addChild ("Der kann was der Canvas"));
    b.addChild (new HCCommand ());
    b.addChild (new HCFigure ());
    b.addChild (new HCFigure ().addChild ("Bla foo"));
    b.addChild (new HCFooter ());
    b.addChild (new HCFooter ().addChild ("Bla foo"));
    b.addChild (new HCHeader ());
    b.addChild (new HCHeader ().addChild ("Bla foo"));
    b.addChild (new HCHGroup ());
    b.addChild (new HCHGroup ().addChild ("Bla foo"));
    b.addChild (new HCKeyGen ("kg1"));
    b.addChild (new HCMark ());
    b.addChild (new HCMark ().addChild ("Bla foo"));
    b.addChild (new HCMeter ());
    b.addChild (new HCMeter ().addChild ("Bla foo"));
    b.addChild (new HCNav ());
    b.addChild (new HCNav ().addChild ("Bla foo"));
    b.addChild (new HCProgress ());
    b.addChild (new HCProgress ().addChild ("Bla foo"));
    b.addChild (new HCRP ());
    b.addChild (new HCRP ().addChild ("Bla foo"));
    b.addChild (new HCRT ());
    b.addChild (new HCRT ().addChild ("Bla foo"));
    b.addChild (new HCRuby ());
    b.addChild (new HCRuby ().addItem (HCRP.create ("1")));
    b.addChild (new HCRuby ().addItem (HCRT.create ("Bla foo")));
    b.addChild (new HCRuby ().addItem (HCRP.create ("2")));
    b.addChild (new HCSection ());
    b.addChild (new HCSection ().addChild ("Bla foo"));
    b.addChild (new HCTime ());
    b.addChild (new HCTime ().addChild ("Bla foo"));
    final HCVideo aVideo = new HCVideo ();
    aVideo.addSource (new HCSource ().setSrc (new SimpleURL ("a.avi")));
    aVideo.addTrack (new HCTrack ().setSrc (new SimpleURL ("a.avi")));
    b.addChild (aVideo);
    b.addChild (new HCWBR ());

    final IHCConversionSettings aCS = HCSettings.getConversionSettings ().getCloneIfNecessary (EHTMLVersion.HTML5);
    assertNotNull (HCRenderer.getAsNode (h, aCS));
    if (false)
      System.out.print (HCRenderer.getAsHTMLString (h, aCS));
  }
}
