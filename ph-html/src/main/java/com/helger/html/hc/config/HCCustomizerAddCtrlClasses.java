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

import com.helger.html.EHTMLVersion;
import com.helger.html.css.DefaultCSSClassProvider;
import com.helger.html.css.ICSSClassProvider;
import com.helger.html.hcapi.IHCCustomizer;
import com.helger.html.hcapi.IHCHasChildrenMutable;
import com.helger.html.hcapi.IHCNode;
import com.helger.html.hcapi.config.HCCustomizerDoNothing;
import com.helger.html.hchtml.IHCElement;
import com.helger.html.hchtml.base.IHCButton;
import com.helger.html.hchtml.impl.HCCheckBox;
import com.helger.html.hchtml.impl.HCEdit;
import com.helger.html.hchtml.impl.HCEditFile;
import com.helger.html.hchtml.impl.HCEditPassword;
import com.helger.html.hchtml.impl.HCHiddenField;
import com.helger.html.hchtml.impl.HCRadioButton;

/**
 * Implementation of {@link IHCCustomizer} performing some default class
 * assignments etc.
 *
 * @author Philip Helger
 */
@Immutable
public class HCCustomizerAddCtrlClasses extends HCCustomizerDoNothing
{
  public static final ICSSClassProvider CSS_CLASS_BUTTON = DefaultCSSClassProvider.create ("button");
  public static final ICSSClassProvider CSS_CLASS_CHECKBOX = DefaultCSSClassProvider.create ("checkbox");
  public static final ICSSClassProvider CSS_CLASS_EDIT = DefaultCSSClassProvider.create ("edit");
  public static final ICSSClassProvider CSS_CLASS_EDIT_FILE = DefaultCSSClassProvider.create ("edit_file");
  public static final ICSSClassProvider CSS_CLASS_EDIT_PASSWORD = DefaultCSSClassProvider.create ("edit_password");
  public static final ICSSClassProvider CSS_CLASS_HIDDEN = DefaultCSSClassProvider.create ("hidden");
  public static final ICSSClassProvider CSS_CLASS_RADIO = DefaultCSSClassProvider.create ("radio");

  public HCCustomizerAddCtrlClasses ()
  {}

  @Override
  public void customizeNode (@Nonnull final IHCNode aNode,
                             @Nonnull final EHTMLVersion eHTMLVersion,
                             @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    if (aNode instanceof IHCElement <?>)
    {
      final IHCElement <?> aElement = (IHCElement <?>) aNode;
      if (aElement instanceof IHCButton <?>)
        aElement.addClass (CSS_CLASS_BUTTON);
      else
        if (aElement instanceof HCCheckBox)
          aElement.addClass (CSS_CLASS_CHECKBOX);
        else
          if (aElement instanceof HCEdit)
            aElement.addClass (CSS_CLASS_EDIT);
          else
            if (aElement instanceof HCEditFile)
              aElement.addClasses (CSS_CLASS_EDIT, CSS_CLASS_EDIT_FILE);
            else
              if (aElement instanceof HCEditPassword)
                aElement.addClasses (CSS_CLASS_EDIT, CSS_CLASS_EDIT_PASSWORD);
              else
                if (aElement instanceof HCHiddenField)
                  aElement.addClass (CSS_CLASS_HIDDEN);
                else
                  if (aElement instanceof HCRadioButton)
                    aElement.addClass (CSS_CLASS_RADIO);
    }
  }
}
