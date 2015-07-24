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
package com.helger.html.hcext.html;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.string.StringHelper;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.html.*;
import com.helger.html.hc.impl.AbstractHCElement;
import com.helger.html.hc.impl.HCGenericElementWithChildren;
import com.helger.html.hc.impl.HCTextNode;

@Immutable
public final class HCHTMLHelper
{
  private static final char PATTERN_NEWLINE = '\n';
  private static final int PATTERN_NEWLINE_LENGTH = 1;

  private HCHTMLHelper ()
  {}

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

  @Nullable
  public static AbstractHCElement <?> createHCElement (@Nullable final EHTMLElement eElement)
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
        return new HCScript ();
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
  public static AbstractHCElement <?> createHCElementFromName (@Nullable final String sTagName)
  {
    final EHTMLElement eElement = EHTMLElement.getFromTagNameOrNull (sTagName);
    return createHCElement (eElement);
  }

}
