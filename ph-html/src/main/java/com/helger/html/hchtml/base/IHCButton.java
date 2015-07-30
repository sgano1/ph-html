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
package com.helger.html.hchtml.base;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.mime.IMimeType;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.hcapi.IHCHasName;
import com.helger.html.hchtml.EHCButtonType;
import com.helger.html.hchtml.EHCFormMethod;
import com.helger.html.hchtml.HC_Target;
import com.helger.html.hchtml.IHCElementWithChildren;
import com.helger.html.hchtml.IHCHasState;
import com.helger.html.js.IHasJSCode;
import com.helger.html.js.IHasJSCodeWithSettings;

public interface IHCButton <THISTYPE extends IHCButton <THISTYPE>> extends IHCElementWithChildren <THISTYPE>, IHCHasState <THISTYPE>, IHCHasName <THISTYPE>
{
  boolean isAutoFocus ();

  @Nonnull
  THISTYPE setAutoFocus (boolean bAutoFocus);

  @Nullable
  String getForm ();

  @Nonnull
  THISTYPE setForm (@Nullable String sForm);

  @Nullable
  String getFormActionURL ();

  @Nullable
  IHasJSCode getFormActionJS ();

  @Nonnull
  THISTYPE setFormAction (@Nullable ISimpleURL aAction);

  @Nonnull
  THISTYPE setFormAction (@Nullable String sAction);

  @Nonnull
  THISTYPE setFormAction (@Nullable IHasJSCodeWithSettings aAction);

  @Nullable
  IMimeType getFormEncType ();

  /**
   * Make this form a file-upload form.
   *
   * @return this
   */
  @Nonnull
  THISTYPE setFormEncTypeFileUpload ();

  /**
   * Set the enctype to text/plain
   *
   * @return this
   */
  @Nonnull
  THISTYPE setFormEncTypeTextPlain ();

  @Nonnull
  THISTYPE setFormEncType (@Nullable IMimeType aFormEncType);

  @Nullable
  EHCFormMethod getFormMethod ();

  @Nonnull
  THISTYPE setFormMethod (@Nullable EHCFormMethod eFormMethod);

  boolean isFormNoValidate ();

  @Nonnull
  THISTYPE setFormNoValidate (boolean bFormNoValidate);

  @Nullable
  HC_Target getFormTarget ();

  @Nonnull
  THISTYPE setFormTargetBlank ();

  @Nonnull
  THISTYPE setFormTarget (@Nullable HC_Target aFormTarget);

  /**
   * @return The value of the button. May be <code>null</code>.
   */
  @Nullable
  String getValue ();

  /**
   * Set the value of the button.
   *
   * @param sValue
   *        The value to set. May be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE setValue (@Nullable String sValue);

  /**
   * @return The type of the button (button, submit or reset). Never
   *         <code>null</code>.
   */
  @Nonnull
  EHCButtonType getType ();

  /**
   * Set the type of the button.
   *
   * @param eType
   *        The new type. May not be <code>null</code>.
   * @return this
   */
  @Nonnull
  THISTYPE setType (@Nonnull EHCButtonType eType);

  /**
   * Shortcut for <code>setEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   *
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Nonnull
  THISTYPE setOnClick (@Nullable IHasJSCode aOnClick);

  /**
   * Shortcut for <code>setOnClick(JSHtml.windowLocationHref (aURL))</code>
   *
   * @param aURL
   *        URL to link to
   * @return this
   */
  @Nonnull
  THISTYPE setOnClick (@Nonnull ISimpleURL aURL);

  /**
   * Shortcut for <code>addEventHandler(EJSEvent.ONCLICK, aOnClick)</code>
   *
   * @param aOnClick
   *        JS event to trigger
   * @return this
   */
  @Nonnull
  THISTYPE addOnClick (@Nullable IHasJSCode aOnClick);

  /**
   * Shortcut for <code>addOnClick(JSHtml.windowLocationHref (aURL))</code>
   *
   * @param aURL
   *        URL to link to
   * @return this
   */
  @Nonnull
  THISTYPE addOnClick (@Nonnull ISimpleURL aURL);
}
