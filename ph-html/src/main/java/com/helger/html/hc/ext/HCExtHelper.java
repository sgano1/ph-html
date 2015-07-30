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
package com.helger.html.hc.ext;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.string.StringHelper;
import com.helger.html.EHTMLElement;
import com.helger.html.hcapi.IHCNode;
import com.helger.html.hcapi.impl.HCTextNode;
import com.helger.html.hchtml.IHCElement;
import com.helger.html.hchtml.base.HCHtml;
import com.helger.html.hchtml.deprecated.HCCenter;
import com.helger.html.hchtml.deprecated.HCDir;
import com.helger.html.hchtml.deprecated.HCFont;
import com.helger.html.hchtml.deprecated.HCFrame;
import com.helger.html.hchtml.deprecated.HCFrameset;
import com.helger.html.hchtml.deprecated.HCHGroup;
import com.helger.html.hchtml.deprecated.HCNoBR;
import com.helger.html.hchtml.edits.HCDel;
import com.helger.html.hchtml.edits.HCIns;
import com.helger.html.hchtml.embedded.HCAudio;
import com.helger.html.hchtml.embedded.HCEmbed;
import com.helger.html.hchtml.embedded.HCIFrame;
import com.helger.html.hchtml.embedded.HCImg;
import com.helger.html.hchtml.embedded.HCObject;
import com.helger.html.hchtml.embedded.HCParam;
import com.helger.html.hchtml.embedded.HCPicture;
import com.helger.html.hchtml.embedded.HCSource;
import com.helger.html.hchtml.embedded.HCTrack;
import com.helger.html.hchtml.embedded.HCVideo;
import com.helger.html.hchtml.forms.HCButton;
import com.helger.html.hchtml.forms.HCDataList;
import com.helger.html.hchtml.forms.HCFieldSet;
import com.helger.html.hchtml.forms.HCForm;
import com.helger.html.hchtml.forms.HCInput;
import com.helger.html.hchtml.forms.HCKeyGen;
import com.helger.html.hchtml.forms.HCLabel;
import com.helger.html.hchtml.forms.HCLegend;
import com.helger.html.hchtml.forms.HCMeter;
import com.helger.html.hchtml.forms.HCOptGroup;
import com.helger.html.hchtml.forms.HCOption;
import com.helger.html.hchtml.forms.HCProgress;
import com.helger.html.hchtml.forms.HCSelect;
import com.helger.html.hchtml.forms.HCTextArea;
import com.helger.html.hchtml.grouping.HCBlockQuote;
import com.helger.html.hchtml.grouping.HCDD;
import com.helger.html.hchtml.grouping.HCDL;
import com.helger.html.hchtml.grouping.HCDT;
import com.helger.html.hchtml.grouping.HCDiv;
import com.helger.html.hchtml.grouping.HCFigCaption;
import com.helger.html.hchtml.grouping.HCFigure;
import com.helger.html.hchtml.grouping.HCHR;
import com.helger.html.hchtml.grouping.HCLI;
import com.helger.html.hchtml.grouping.HCMain;
import com.helger.html.hchtml.grouping.HCOL;
import com.helger.html.hchtml.grouping.HCOutput;
import com.helger.html.hchtml.grouping.HCP;
import com.helger.html.hchtml.grouping.HCPre;
import com.helger.html.hchtml.grouping.HCUL;
import com.helger.html.hchtml.interactive.HCCommand;
import com.helger.html.hchtml.interactive.HCDetails;
import com.helger.html.hchtml.interactive.HCMenu;
import com.helger.html.hchtml.interactive.HCSummary;
import com.helger.html.hchtml.metadata.HCBase;
import com.helger.html.hchtml.metadata.HCHead;
import com.helger.html.hchtml.metadata.HCLink;
import com.helger.html.hchtml.metadata.HCStyle;
import com.helger.html.hchtml.metadata.HCTitle;
import com.helger.html.hchtml.script.HCCanvas;
import com.helger.html.hchtml.script.HCNoScript;
import com.helger.html.hchtml.script.HCScriptInline;
import com.helger.html.hchtml.sections.HCAddress;
import com.helger.html.hchtml.sections.HCArticle;
import com.helger.html.hchtml.sections.HCAside;
import com.helger.html.hchtml.sections.HCBody;
import com.helger.html.hchtml.sections.HCFooter;
import com.helger.html.hchtml.sections.HCH1;
import com.helger.html.hchtml.sections.HCH2;
import com.helger.html.hchtml.sections.HCH3;
import com.helger.html.hchtml.sections.HCH4;
import com.helger.html.hchtml.sections.HCH5;
import com.helger.html.hchtml.sections.HCH6;
import com.helger.html.hchtml.sections.HCHeader;
import com.helger.html.hchtml.sections.HCNav;
import com.helger.html.hchtml.sections.HCSection;
import com.helger.html.hchtml.tabular.HCCaption;
import com.helger.html.hchtml.tabular.HCCol;
import com.helger.html.hchtml.tabular.HCColGroup;
import com.helger.html.hchtml.tabular.HCRow;
import com.helger.html.hchtml.tabular.HCTBody;
import com.helger.html.hchtml.tabular.HCTD;
import com.helger.html.hchtml.tabular.HCTFoot;
import com.helger.html.hchtml.tabular.HCTH;
import com.helger.html.hchtml.tabular.HCTHead;
import com.helger.html.hchtml.tabular.HCTable;
import com.helger.html.hchtml.textlevel.HCA;
import com.helger.html.hchtml.textlevel.HCAbbr;
import com.helger.html.hchtml.textlevel.HCB;
import com.helger.html.hchtml.textlevel.HCBDI;
import com.helger.html.hchtml.textlevel.HCBDO;
import com.helger.html.hchtml.textlevel.HCBR;
import com.helger.html.hchtml.textlevel.HCCite;
import com.helger.html.hchtml.textlevel.HCCode;
import com.helger.html.hchtml.textlevel.HCDFN;
import com.helger.html.hchtml.textlevel.HCData;
import com.helger.html.hchtml.textlevel.HCEM;
import com.helger.html.hchtml.textlevel.HCI;
import com.helger.html.hchtml.textlevel.HCKBD;
import com.helger.html.hchtml.textlevel.HCMark;
import com.helger.html.hchtml.textlevel.HCQ;
import com.helger.html.hchtml.textlevel.HCRP;
import com.helger.html.hchtml.textlevel.HCRT;
import com.helger.html.hchtml.textlevel.HCRuby;
import com.helger.html.hchtml.textlevel.HCS;
import com.helger.html.hchtml.textlevel.HCSamp;
import com.helger.html.hchtml.textlevel.HCSmall;
import com.helger.html.hchtml.textlevel.HCSpan;
import com.helger.html.hchtml.textlevel.HCStrong;
import com.helger.html.hchtml.textlevel.HCSub;
import com.helger.html.hchtml.textlevel.HCSup;
import com.helger.html.hchtml.textlevel.HCTime;
import com.helger.html.hchtml.textlevel.HCU;
import com.helger.html.hchtml.textlevel.HCVar;
import com.helger.html.hchtml.textlevel.HCWBR;

@Immutable
public final class HCExtHelper
{
  public static final char PATTERN_NEWLINE = '\n';
  public static final int PATTERN_NEWLINE_LENGTH = 1;

  private HCExtHelper ()
  {}

  @Nullable
  public static IHCElement <?> createHCElement (@Nullable final EHTMLElement eElement)
  {
    if (eElement == null)
      return null;

    switch (eElement)
    {
      case A:
        return new HCA ();
      case ABBR:
        return new HCAbbr ();
      case ADDRESS:
        return new HCAddress ();
      case APPLET:
        return new HCGenericElementWithChildren (eElement);
      case AREA:
        return new HCGenericElementWithChildren (eElement);
      case ARTICLE:
        return new HCArticle ();
      case ASIDE:
        return new HCAside ();
      case AUDIO:
        return new HCAudio ();
      case B:
        return new HCB ();
      case BASE:
        return new HCBase ();
      case BDI:
        return new HCBDI ();
      case BDO:
        return new HCBDO ();
      case BLOCKQUOTE:
        return new HCBlockQuote ();
      case BODY:
        return new HCBody ();
      case BR:
        return new HCBR ();
      case BUTTON:
        return new HCButton ();
      case CANVAS:
        return new HCCanvas ();
      case CAPTION:
        return new HCCaption ();
      case CENTER:
        return new HCCenter ();
      case CITE:
        return new HCCite ();
      case CODE:
        return new HCCode ();
      case COL:
        return new HCCol ();
      case COLGROUP:
        return new HCColGroup ();
      case COMMAND:
        return new HCCommand ();
      case DATA:
        return new HCData ();
      case DATALIST:
        return new HCDataList ();
      case DD:
        return new HCDD ();
      case DEL:
        return new HCDel ();
      case DETAILS:
        return new HCDetails ();
      case DFN:
        return new HCDFN ();
      case DIR:
        return new HCDir ();
      case DIV:
        return new HCDiv ();
      case DL:
        return new HCDL ();
      case DT:
        return new HCDT ();
      case EM:
        return new HCEM ();
      case EMBED:
        return new HCEmbed ();
      case FIELDSET:
        return new HCFieldSet ();
      case FIGCAPTION:
        return new HCFigCaption ();
      case FIGURE:
        return new HCFigure ();
      case FONT:
        return new HCFont ();
      case FOOTER:
        return new HCFooter ();
      case FORM:
        return new HCForm ();
      case FRAME:
        return new HCFrame ();
      case FRAMESET:
        return new HCFrameset ();
      case H1:
        return new HCH1 ();
      case H2:
        return new HCH2 ();
      case H3:
        return new HCH3 ();
      case H4:
        return new HCH4 ();
      case H5:
        return new HCH5 ();
      case H6:
        return new HCH6 ();
      case HEAD:
        return new HCHead ();
      case HEADER:
        return new HCHeader ();
      case HGROUP:
        return new HCHGroup ();
      case HR:
        return new HCHR ();
      case HTML:
        return new HCHtml ();
      case I:
        return new HCI ();
      case IFRAME:
        return new HCIFrame ();
      case IMG:
        return new HCImg ();
      case INS:
        return new HCIns ();
      case INPUT:
        return new HCInput ();
      case KBD:
        return new HCKBD ();
      case KEYGEN:
        return new HCKeyGen ();
      case LABEL:
        return new HCLabel ();
      case LEGEND:
        return new HCLegend ();
      case LI:
        return new HCLI ();
      case LINK:
        return new HCLink ();
      case MAIN:
        return new HCMain ();
      case MAP:
        return new HCGenericElementWithChildren (eElement);
      case MARK:
        return new HCMark ();
      case MENU:
        return new HCMenu ();
      case META:
        return new HCGenericElementWithChildren (eElement);
      case METER:
        return new HCMeter ();
      case NAV:
        return new HCNav ();
      case NOBR:
        return new HCNoBR ();
      case NOSCRIPT:
        return new HCNoScript ();
      case OBJECT:
        return new HCObject ();
      case OL:
        return new HCOL ();
      case OPTGROUP:
        return new HCOptGroup ();
      case OPTION:
        return new HCOption ();
      case OUTPUT:
        return new HCOutput ();
      case P:
        return new HCP ();
      case PARAM:
        return new HCParam ();
      case PICTURE:
        return new HCPicture ();
      case PRE:
        return new HCPre ();
      case PROGRESS:
        return new HCProgress ();
      case RP:
        return new HCRP ();
      case RT:
        return new HCRT ();
      case RUBY:
        return new HCRuby ();
      case Q:
        return new HCQ ();
      case S:
        return new HCS ();
      case SAMP:
        return new HCSamp ();
      case SCRIPT:
        return new HCScriptInline ();
      case SECTION:
        return new HCSection ();
      case SELECT:
        return new HCSelect ();
      case SMALL:
        return new HCSmall ();
      case SOURCE:
        return new HCSource ();
      case SPAN:
        return new HCSpan ();
      case STRONG:
        return new HCStrong ();
      case SUB:
        return new HCSub ();
      case SUMMARY:
        return new HCSummary ();
      case SUP:
        return new HCSup ();
      case STYLE:
        return new HCStyle ();
      case TABLE:
        return new HCTable ();
      case TBODY:
        return new HCTBody ();
      case TD:
        return new HCTD ();
      case TEXTAREA:
        return new HCTextArea ();
      case TEMPLATE:
        return new HCGenericElementWithChildren (eElement);
      case TFOOT:
        return new HCTFoot ();
      case TH:
        return new HCTH ();
      case THEAD:
        return new HCTHead ();
      case TIME:
        return new HCTime ();
      case TITLE:
        return new HCTitle ();
      case TR:
        return new HCRow ();
      case TRACK:
        return new HCTrack ();
      case U:
        return new HCU ();
      case UL:
        return new HCUL ();
      case VAR:
        return new HCVar ();
      case VIDEO:
        return new HCVideo ();
      case WBR:
        return new HCWBR ();
    }
    throw new IllegalStateException ("Failed to resolve element type from " + eElement);
  }

  @Nullable
  public static IHCElement <?> createHCElementFromName (@Nullable final String sTagName)
  {
    final EHTMLElement eElement = EHTMLElement.getFromTagNameOrNull (sTagName);
    return createHCElement (eElement);
  }

  @ReturnsMutableCopy
  public static List <IHCNode> nl2brList (@Nullable final String sText)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (StringHelper.hasText (sText))
    {
      // Remove all "\r" chars
      final String sRealText = sText.replace ("\r", "");
      int nIndex = 0;
      while (nIndex < sRealText.length ())
      {
        final int nNext = sRealText.indexOf (PATTERN_NEWLINE, nIndex);
        if (nNext >= 0)
        {
          if (nNext > nIndex)
            ret.add (new HCTextNode (sRealText.substring (nIndex, nNext)));
          ret.add (new HCBR ());
          nIndex = nNext + PATTERN_NEWLINE_LENGTH;
        }
        else
        {
          // Add the rest
          ret.add (new HCTextNode (sRealText.substring (nIndex)));
          break;
        }
      }
    }
    return ret;
  }

  /**
   * Convert the passed text to a list of &lt;div&gt; elements. Each \n is used
   * to split the text into separate lines. \r characters are removed from the
   * string! Empty lines are preserved except for the last line. E.g.
   * <code>Hello\nworld</code> results in 2 &lt;div&gt;s:
   * &lt;div&gt;Hello&lt;/div&gt; and &lt;div&gt;world&lt;/div&gt;
   *
   * @param sText
   *        The text to be split. May be <code>null</code>.
   * @return A non-<code>null</code> but maybe empty list. The list is empty, if
   *         the string is empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static List <HCDiv> nl2divList (@Nullable final String sText)
  {
    final List <HCDiv> ret = new ArrayList <HCDiv> ();
    if (StringHelper.hasText (sText))
    {
      // Remove all "\r" chars
      final String sRealText = sText.replace ("\r", "");
      int nIndex = 0;
      while (nIndex < sRealText.length ())
      {
        final int nNext = sRealText.indexOf (PATTERN_NEWLINE, nIndex);
        if (nNext >= 0)
        {
          // There is a newline
          ret.add (new HCDiv ().addChild (sRealText.substring (nIndex, nNext)));
          nIndex = nNext + PATTERN_NEWLINE_LENGTH;
        }
        else
        {
          // Add the rest
          final String sRest = sRealText.substring (nIndex);
          if (sRest.length () > 0)
            ret.add (new HCDiv ().addChild (sRest));
          break;
        }
      }
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> list2brList (@Nullable final Iterable <String> aCont)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (aCont != null)
    {
      for (final String sText : aCont)
      {
        if (!ret.isEmpty ())
          ret.add (new HCBR ());
        ret.add (new HCTextNode (sText));
      }
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static List <IHCNode> list2divList (@Nullable final Iterable <String> aCont)
  {
    final List <IHCNode> ret = new ArrayList <IHCNode> ();
    if (aCont != null)
      for (final String sText : aCont)
        ret.add (new HCDiv ().addChild (sText));
    return ret;
  }
}
