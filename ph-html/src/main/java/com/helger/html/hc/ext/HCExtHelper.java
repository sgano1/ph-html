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
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.html.IHCElement;
import com.helger.html.hc.html.deprecated.HCCenter;
import com.helger.html.hc.html.deprecated.HCDir;
import com.helger.html.hc.html.deprecated.HCFont;
import com.helger.html.hc.html.deprecated.HCFrame;
import com.helger.html.hc.html.deprecated.HCFrameset;
import com.helger.html.hc.html.deprecated.HCHGroup;
import com.helger.html.hc.html.deprecated.HCNoBR;
import com.helger.html.hc.html.edits.HCDel;
import com.helger.html.hc.html.edits.HCIns;
import com.helger.html.hc.html.embedded.HCAudio;
import com.helger.html.hc.html.embedded.HCEmbed;
import com.helger.html.hc.html.embedded.HCIFrame;
import com.helger.html.hc.html.embedded.HCImg;
import com.helger.html.hc.html.embedded.HCObject;
import com.helger.html.hc.html.embedded.HCParam;
import com.helger.html.hc.html.embedded.HCPicture;
import com.helger.html.hc.html.embedded.HCSource;
import com.helger.html.hc.html.embedded.HCTrack;
import com.helger.html.hc.html.embedded.HCVideo;
import com.helger.html.hc.html.forms.HCButton;
import com.helger.html.hc.html.forms.HCDataList;
import com.helger.html.hc.html.forms.HCFieldSet;
import com.helger.html.hc.html.forms.HCForm;
import com.helger.html.hc.html.forms.HCInput;
import com.helger.html.hc.html.forms.HCKeyGen;
import com.helger.html.hc.html.forms.HCLabel;
import com.helger.html.hc.html.forms.HCLegend;
import com.helger.html.hc.html.forms.HCMeter;
import com.helger.html.hc.html.forms.HCOptGroup;
import com.helger.html.hc.html.forms.HCOption;
import com.helger.html.hc.html.forms.HCProgress;
import com.helger.html.hc.html.forms.HCSelect;
import com.helger.html.hc.html.forms.HCTextArea;
import com.helger.html.hc.html.grouping.HCBlockQuote;
import com.helger.html.hc.html.grouping.HCDD;
import com.helger.html.hc.html.grouping.HCDL;
import com.helger.html.hc.html.grouping.HCDT;
import com.helger.html.hc.html.grouping.HCDiv;
import com.helger.html.hc.html.grouping.HCFigCaption;
import com.helger.html.hc.html.grouping.HCFigure;
import com.helger.html.hc.html.grouping.HCHR;
import com.helger.html.hc.html.grouping.HCLI;
import com.helger.html.hc.html.grouping.HCMain;
import com.helger.html.hc.html.grouping.HCOL;
import com.helger.html.hc.html.grouping.HCOutput;
import com.helger.html.hc.html.grouping.HCP;
import com.helger.html.hc.html.grouping.HCPre;
import com.helger.html.hc.html.grouping.HCUL;
import com.helger.html.hc.html.interactive.HCCommand;
import com.helger.html.hc.html.interactive.HCDetails;
import com.helger.html.hc.html.interactive.HCMenu;
import com.helger.html.hc.html.interactive.HCSummary;
import com.helger.html.hc.html.metadata.HCBase;
import com.helger.html.hc.html.metadata.HCHead;
import com.helger.html.hc.html.metadata.HCLink;
import com.helger.html.hc.html.metadata.HCMeta;
import com.helger.html.hc.html.metadata.HCStyle;
import com.helger.html.hc.html.metadata.HCTitle;
import com.helger.html.hc.html.root.HCHtml;
import com.helger.html.hc.html.script.HCCanvas;
import com.helger.html.hc.html.script.HCNoScript;
import com.helger.html.hc.html.script.HCScriptInline;
import com.helger.html.hc.html.sections.HCAddress;
import com.helger.html.hc.html.sections.HCArticle;
import com.helger.html.hc.html.sections.HCAside;
import com.helger.html.hc.html.sections.HCBody;
import com.helger.html.hc.html.sections.HCFooter;
import com.helger.html.hc.html.sections.HCH1;
import com.helger.html.hc.html.sections.HCH2;
import com.helger.html.hc.html.sections.HCH3;
import com.helger.html.hc.html.sections.HCH4;
import com.helger.html.hc.html.sections.HCH5;
import com.helger.html.hc.html.sections.HCH6;
import com.helger.html.hc.html.sections.HCHeader;
import com.helger.html.hc.html.sections.HCNav;
import com.helger.html.hc.html.sections.HCSection;
import com.helger.html.hc.html.tabular.HCCaption;
import com.helger.html.hc.html.tabular.HCCol;
import com.helger.html.hc.html.tabular.HCColGroup;
import com.helger.html.hc.html.tabular.HCRow;
import com.helger.html.hc.html.tabular.HCTBody;
import com.helger.html.hc.html.tabular.HCTD;
import com.helger.html.hc.html.tabular.HCTFoot;
import com.helger.html.hc.html.tabular.HCTH;
import com.helger.html.hc.html.tabular.HCTHead;
import com.helger.html.hc.html.tabular.HCTable;
import com.helger.html.hc.html.textlevel.HCA;
import com.helger.html.hc.html.textlevel.HCAbbr;
import com.helger.html.hc.html.textlevel.HCB;
import com.helger.html.hc.html.textlevel.HCBDI;
import com.helger.html.hc.html.textlevel.HCBDO;
import com.helger.html.hc.html.textlevel.HCBR;
import com.helger.html.hc.html.textlevel.HCCite;
import com.helger.html.hc.html.textlevel.HCCode;
import com.helger.html.hc.html.textlevel.HCDFN;
import com.helger.html.hc.html.textlevel.HCData;
import com.helger.html.hc.html.textlevel.HCEM;
import com.helger.html.hc.html.textlevel.HCI;
import com.helger.html.hc.html.textlevel.HCKBD;
import com.helger.html.hc.html.textlevel.HCMark;
import com.helger.html.hc.html.textlevel.HCQ;
import com.helger.html.hc.html.textlevel.HCRP;
import com.helger.html.hc.html.textlevel.HCRT;
import com.helger.html.hc.html.textlevel.HCRuby;
import com.helger.html.hc.html.textlevel.HCS;
import com.helger.html.hc.html.textlevel.HCSamp;
import com.helger.html.hc.html.textlevel.HCSmall;
import com.helger.html.hc.html.textlevel.HCSpan;
import com.helger.html.hc.html.textlevel.HCStrong;
import com.helger.html.hc.html.textlevel.HCSub;
import com.helger.html.hc.html.textlevel.HCSup;
import com.helger.html.hc.html.textlevel.HCTime;
import com.helger.html.hc.html.textlevel.HCU;
import com.helger.html.hc.html.textlevel.HCVar;
import com.helger.html.hc.html.textlevel.HCWBR;
import com.helger.html.hc.impl.HCTextNode;

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
        return new HCMeta ();
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
