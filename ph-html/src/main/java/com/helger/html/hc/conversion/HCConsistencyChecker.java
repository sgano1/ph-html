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
package com.helger.html.hc.conversion;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.annotation.PresentForCodeCoverage;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.cache.AnnotationUsageCache;
import com.helger.commons.debug.GlobalDebug;
import com.helger.commons.state.EFinish;
import com.helger.commons.string.StringHelper;
import com.helger.html.EHTMLElement;
import com.helger.html.EHTMLVersion;
import com.helger.html.annotation.DeprecatedInHTML4;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.annotation.DeprecatedInXHTML1;
import com.helger.html.annotation.SinceHTML5;
import com.helger.html.hc.HCHelper;
import com.helger.html.hc.IHCElement;
import com.helger.html.hc.IHCHasID;
import com.helger.html.hc.IHCIteratorCallback;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.base.IHCTable;
import com.helger.html.hc.html.HCA;
import com.helger.html.hc.html.HCButton;
import com.helger.html.hc.html.HCForm;
import com.helger.html.hc.html.HCMeter;
import com.helger.html.hc.html.HCObject;
import com.helger.html.hc.html.HCPre;
import com.helger.html.hc.html.HCProgress;

/**
 * This class performs some consistency checks on HCNodes
 *
 * @author Philip Helger
 */
@Immutable
public final class HCConsistencyChecker
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (HCConsistencyChecker.class);

  private static final int MAX_CSS_IE = 31;
  private static final AnnotationUsageCache s_aAUC_D_HTML4 = new AnnotationUsageCache (DeprecatedInHTML4.class);
  private static final AnnotationUsageCache s_aAUC_D_XHTML1 = new AnnotationUsageCache (DeprecatedInXHTML1.class);
  private static final AnnotationUsageCache s_aAUC_D_HTML5 = new AnnotationUsageCache (DeprecatedInHTML5.class);
  private static final AnnotationUsageCache s_aAUC_S_HTML5 = new AnnotationUsageCache (SinceHTML5.class);

  @PresentForCodeCoverage
  private static final HCConsistencyChecker s_aInstance = new HCConsistencyChecker ();

  private HCConsistencyChecker ()
  {}

  public static void consistencyError (@Nonnull final String sMsg)
  {
    if (GlobalDebug.isDebugMode ())
      throw new IllegalStateException ("HC Consistency check error: " + sMsg);
    // In production emit only an error
    s_aLogger.error ("HC Consistency check error: " + sMsg);
  }

  private static void _checkDeprecation (final Class <?> aElementClass,
                                         final String sElementName,
                                         final EHTMLVersion eHTMLVersion)
  {
    if (s_aAUC_D_HTML4.hasAnnotation (aElementClass))
      consistencyError ("The element '" + sElementName + "' was deprecated in HTML 4.0");
    else
      if (s_aAUC_D_XHTML1.hasAnnotation (aElementClass))
        consistencyError ("The element '" + sElementName + "' is deprecated in XHTML1");
      else
        if (eHTMLVersion.isAtLeastHTML5 ())
        {
          // HTML5 specifics checks
          if (s_aAUC_D_HTML5.hasAnnotation (aElementClass))
            consistencyError ("The element '" + sElementName + "' is deprecated in HTML5");
        }
        else
        {
          // pre-HTML5 checks
          if (s_aAUC_S_HTML5.hasAnnotation (aElementClass))
            consistencyError ("The element '" + sElementName + "' is only available in HTML5");
        }
  }

  private static void _checkA (final HCA aA)
  {
    if (HCHelper.recursiveContainsChildWithTagName (aA, EHTMLElement.A))
      consistencyError ("A may never contain other links!");
    if (HCHelper.recursiveContainsChildWithTagName (aA, EHTMLElement.SELECT))
      consistencyError ("A contains invalid child element!");
  }

  private static void _checkButton (final HCButton aButton)
  {
    final IHCElement <?> aChild = HCHelper.recursiveGetFirstChildWithTagName (aButton,
                                                                              EHTMLElement.A,
                                                                              EHTMLElement.INPUT,
                                                                              EHTMLElement.SELECT,
                                                                              EHTMLElement.TEXTAREA,
                                                                              EHTMLElement.LABEL,
                                                                              EHTMLElement.BUTTON,
                                                                              EHTMLElement.FORM,
                                                                              EHTMLElement.FIELDSET,
                                                                              EHTMLElement.IFRAME);
    if (aChild != null)
      consistencyError ("BUTTON element contains forbidden tag " + aChild.getElement ());
  }

  private static void _checkForm (final HCForm aForm)
  {
    if (HCHelper.recursiveContainsChildWithTagName (aForm, EHTMLElement.FORM))
      consistencyError ("FORM contains other nested form");
  }

  private static void _checkMeter (final HCMeter aMeter)
  {
    if (HCHelper.recursiveContainsChildWithTagName (aMeter, EHTMLElement.METER))
      consistencyError ("METER contains other nested meter");
  }

  private static void _checkObject (final HCObject aValue)
  {
    if (aValue.getData () == null && aValue.getType () == null)
      consistencyError ("OBJECT contains neither type nor data");
  }

  private static void _checkPre (final HCPre aPre)
  {
    final IHCElement <?> aChild = HCHelper.recursiveGetFirstChildWithTagName (aPre,
                                                                              EHTMLElement.IMG,
                                                                              EHTMLElement.OBJECT,
                                                                              EHTMLElement.SMALL,
                                                                              EHTMLElement.SUB,
                                                                              EHTMLElement.SUP);
    if (aChild != null)
      consistencyError ("PRE elements contains forbidden tag " + aChild.getElement ());
  }

  private static void _checkProgress (final HCProgress aProgress)
  {
    if (HCHelper.recursiveContainsChildWithTagName (aProgress, EHTMLElement.PROGRESS))
      consistencyError ("PROGRESS contains other nested progress");
  }

  private static void _checkTable (@Nonnull final IHCTable <?> aTable)
  {
    aTable.checkInternalConsistency ();
  }

  public static void runConsistencyCheckBeforeCreation (@Nonnull final IHCElement <?> aElement,
                                                        @Nonnull final EHTMLVersion eHTMLVersion)
  {
    final String sElementName = aElement.getTagName ();
    final Class <?> aElementClass = aElement.getClass ();

    // Deprecation is checked for all elements
    _checkDeprecation (aElementClass, sElementName, eHTMLVersion);

    // Special checks based on the implementation
    if (aElement instanceof HCA)
      _checkA ((HCA) aElement);
    else
      if (aElement instanceof HCButton)
        _checkButton ((HCButton) aElement);
      else
        if (aElement instanceof HCForm)
          _checkForm ((HCForm) aElement);
        else
          if (aElement instanceof HCMeter)
            _checkMeter ((HCMeter) aElement);
          else
            if (aElement instanceof HCObject)
              _checkObject ((HCObject) aElement);
            else
              if (aElement instanceof HCPre)
                _checkPre ((HCPre) aElement);
              else
                if (aElement instanceof HCProgress)
                  _checkProgress ((HCProgress) aElement);
                else
                  if (aElement instanceof IHCTable <?>)
                    _checkTable ((IHCTable <?>) aElement);
  }

  public static void checkIfLinkIsMasked (@Nullable final String sHref)
  {
    if (sHref != null)
    {
      // This is potential vulnerability. If the passed href is passed
      // from a user input, which cannot be told at this point, it might as well
      // contain a'&amp;' followed by some malicious code that should be
      // escaped.
      // Note PH: this is not a vulnerability. This is a programming error!
      if (sHref.contains ("&amp;"))
        consistencyError ("The URL '" + sHref + "' seems to be already escaped - please use an unescaped URL!!");
    }
  }

  /**
   * Check all nodes inside the passed HTML body whether they have unique IDs or
   * not.
   *
   * @param aStartNode
   *        The HTML node to check, usually the body element. May not be
   *        <code>null</code>.
   * @return A set with all IDs used more than once. Never <code>null</code> but
   *         maybe empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static Set <String> checkForUniqueIDs (@Nonnull final IHCNode aStartNode)
  {
    final Set <String> aUsedIDs = new HashSet <String> ();
    final Set <String> aDuplicateIDs = new HashSet <String> ();
    HCHelper.iterateTree (aStartNode, new IHCIteratorCallback ()
    {
      @Nonnull
      public EFinish call (@Nullable final IHCNode aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCHasID <?>)
        {
          final IHCHasID <?> aElement = (IHCHasID <?>) aChildNode;
          final String sID = aElement.getID ();
          if (StringHelper.hasText (sID) && !aUsedIDs.add (sID))
          {
            consistencyError ("The ID '" + sID + "' is used more than once within a single HTML page!");
            aDuplicateIDs.add (sID);
          }
        }
        return EFinish.UNFINISHED;
      }
    });
    return aDuplicateIDs;
  }

  public static void checkForMaximumCSSResources (final int nCSSExternals)
  {
    // Sources:
    // http://acidmartin.wordpress.com/2008/11/25/the-32-external-css-files-limitation-of-internet-explorer-and-more/
    // http://social.msdn.microsoft.com/Forums/en-US/iewebdevelopment/thread/ad1b6e88-bbfa-4cc4-9e95-3889b82a7c1d
    if (nCSSExternals > MAX_CSS_IE)
      consistencyError ("You are including more than 31 CSS files (" +
                        nCSSExternals +
                        ") in your request, which will be ignored by Internet Explorer (at least up to version 8)!");
  }
}
