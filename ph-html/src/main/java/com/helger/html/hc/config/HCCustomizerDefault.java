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
package com.helger.html.hc.config;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.string.StringParser;
import com.helger.css.ECSSUnit;
import com.helger.css.property.CCSSProperties;
import com.helger.html.EHTMLVersion;
import com.helger.html.css.DefaultCSSClassProvider;
import com.helger.html.css.ICSSClassProvider;
import com.helger.html.hcapi.IHCCustomizer;
import com.helger.html.hcapi.IHCHasChildrenMutable;
import com.helger.html.hcapi.IHCNode;
import com.helger.html.hcapi.config.HCCustomizerDoNothing;
import com.helger.html.hcapi.impl.HCEntityNode;
import com.helger.html.hchtml.IHCControl;
import com.helger.html.hchtml.IHCElement;
import com.helger.html.hchtml.IHCHasState;
import com.helger.html.hchtml.base.IHCButton;
import com.helger.html.hchtml.base.IHCCell;
import com.helger.html.hchtml.base.IHCCol;
import com.helger.html.hchtml.base.IHCForm;
import com.helger.html.hchtml.base.IHCTable;
import com.helger.html.hchtml.impl.HCButton_Submit;
import com.helger.html.hchtml.impl.HCColGroup;
import com.helger.html.hchtml.impl.HCRow;
import com.helger.html.hchtml.impl.HCScriptInline;
import com.helger.html.js.EJSEvent;

/**
 * The default implementation of {@link IHCCustomizer} performing some default
 * class assignments etc.
 *
 * @author Philip Helger
 */
@Immutable
public class HCCustomizerDefault extends HCCustomizerDoNothing
{
  // For controls only
  public static final ICSSClassProvider CSS_CLASS_DISABLED = DefaultCSSClassProvider.create ("disabled");
  public static final ICSSClassProvider CSS_CLASS_READONLY = DefaultCSSClassProvider.create ("readonly");

  // For buttons
  public static final ICSSClassProvider CSS_CLASS_INVISIBLE_BUTTON = DefaultCSSClassProvider.create ("pdaf_invisible_button");

  // For tables
  public static final ICSSClassProvider CSS_FORCE_COLSPAN = DefaultCSSClassProvider.create ("force_colspan");

  public HCCustomizerDefault ()
  {}

  @Nonnull
  protected IHCButton <?> createFakeSubmitButton ()
  {
    return new HCButton_Submit ("").addClass (CSS_CLASS_INVISIBLE_BUTTON);
  }

  @Override
  public void customizeNode (@Nonnull final IHCNode aNode,
                             @Nonnull final EHTMLVersion eHTMLVersion,
                             @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    if (aNode instanceof IHCElement <?>)
    {
      final IHCElement <?> aElement = (IHCElement <?>) aNode;

      if (aElement instanceof IHCForm <?>)
      {
        final IHCForm <?> aForm = (IHCForm <?>) aElement;
        if (aForm.isSubmitPressingEnter ())
        {
          final IHCButton <?> aButton = createFakeSubmitButton ();
          aButton.setTabIndex (aForm.getSubmitButtonTabIndex ());
          aForm.addChild (aButton);
        }
      }
      else
        if (aElement instanceof IHCTable <?>)
        {
          final IHCTable <?> aTable = (IHCTable <?>) aElement;
          final HCColGroup aColGroup = aTable.getColGroup ();
          // bug fix for IE9 table layout bug
          // (http://msdn.microsoft.com/en-us/library/ms531161%28v=vs.85%29.aspx)
          // IE9 only interprets column widths if the first row
          // does not use colspan (i.e. at least one row does not
          // use colspan)
          if (aColGroup != null &&
              aColGroup.hasColumns () &&
              aTable.hasBodyRows () &&
              aTable.getFirstBodyRow ().isColspanUsed ())
          {
            // Create a dummy row with explicit widths
            final HCRow aRow = new HCRow (false).addClass (CSS_FORCE_COLSPAN);
            for (final IHCCol <?> aCol : aColGroup.getAllColumns ())
            {
              final IHCCell <?> aCell = aRow.addAndReturnCell (HCEntityNode.newNBSP ());
              final int nWidth = StringParser.parseInt (aCol.getWidth (), -1);
              if (nWidth >= 0)
                aCell.addStyle (CCSSProperties.WIDTH.newValue (ECSSUnit.px (nWidth)));
            }
            aTable.addBodyRow (0, aRow);
          }
        }

      // Unfocusable?
      if (aElement.isUnfocusable ())
        aElement.setEventHandler (EJSEvent.FOCUS, FakeJS.JS_BLUR);

      // Added "disabled" class on disabled element
      if (aElement instanceof IHCHasState <?>)
        if (((IHCHasState <?>) aElement).isDisabled ())
          aElement.addClass (CSS_CLASS_DISABLED);

      if (aElement instanceof IHCControl <?>)
      {
        // Specific control stuff
        final IHCControl <?> aCtrl = (IHCControl <?>) aElement;

        // Read only?
        if (aCtrl.isReadonly ())
        {
          // Add read-only class
          aCtrl.addClass (CSS_CLASS_READONLY);

          // Set explicit tab index -1 to avoid focusing
          aCtrl.setTabIndex (-1L);
        }

        if (aCtrl.isFocused ())
        {
          // Add a JS call that focuses this element
          aTargetNode.addChild (new HCScriptInline (FakeJS.focus (aCtrl)));
        }
      }
    }
  }
}
