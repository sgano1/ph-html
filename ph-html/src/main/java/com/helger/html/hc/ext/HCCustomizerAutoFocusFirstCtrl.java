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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.mutable.MutableBoolean;
import com.helger.commons.state.EFinish;
import com.helger.commons.wrapper.Wrapper;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.HCHelper;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCIteratorCallback;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.html.forms.HCHiddenField;
import com.helger.html.hc.html.forms.IHCControl;
import com.helger.html.hc.html.forms.IHCForm;
import com.helger.html.hc.html.forms.IHCHasFocus;
import com.helger.html.hc.impl.AbstractHCCustomizer;

public class HCCustomizerAutoFocusFirstCtrl extends AbstractHCCustomizer
{
  public HCCustomizerAutoFocusFirstCtrl ()
  {}

  public static void setAutoFocusOnFirstControl (@Nonnull final IHCNode aStartNode)
  {
    final Wrapper <IHCHasFocus <?>> aFirstCtrl = new Wrapper <IHCHasFocus <?>> ();
    final MutableBoolean bAnyCtrlHasFocus = new MutableBoolean (false);
    HCHelper.iterateChildren (aStartNode, new IHCIteratorCallback ()
    {
      public EFinish call (@Nullable final IHCNode aParentNode, @Nonnull final IHCNode aChildNode)
      {
        if (aChildNode instanceof IHCHasFocus <?>)
        {
          final IHCHasFocus <?> aHasFocus = (IHCHasFocus <?>) aChildNode;
          if (!aFirstCtrl.isSet ())
          {
            if (aHasFocus instanceof HCHiddenField)
            {
              // cannot focus
            }
            else
              if (aHasFocus instanceof IHCControl <?> && ((IHCControl <?>) aHasFocus).isReadOnly ())
              {
                // cannot focus read-only controls
              }
              else
                aFirstCtrl.set (aHasFocus);
          }
          if (aHasFocus.isAutoFocus ())
          {
            // No need to continue because an existing control already has the
            // focus
            bAnyCtrlHasFocus.set (true);
            return EFinish.FINISHED;
          }
        }

        return EFinish.UNFINISHED;
      }
    });

    if (!bAnyCtrlHasFocus.booleanValue ())
    {
      final IHCHasFocus <?> aFirst = aFirstCtrl.get ();
      if (aFirst != null)
        aFirst.setAutoFocus (true);
    }
  }

  @Override
  public void customizeNode (@Nonnull final IHCNode aNode,
                             @Nonnull final EHTMLVersion eHTMLVersion,
                             @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode)
  {
    if (aNode instanceof IHCForm <?>)
      setAutoFocusOnFirstControl (aNode);
  }
}
