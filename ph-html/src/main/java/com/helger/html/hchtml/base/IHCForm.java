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
import com.helger.commons.state.ETriState;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.hcapi.IHCHasName;
import com.helger.html.hchtml.EHCFormMethod;
import com.helger.html.hchtml.HC_Target;
import com.helger.html.hchtml.IHCElementWithChildren;
import com.helger.html.js.IHasJSCode;
import com.helger.html.js.IHasJSCodeWithSettings;

/**
 * Interface for FORMs
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        Implementation type
 */
public interface IHCForm <THISTYPE extends IHCForm <THISTYPE>> extends IHCElementWithChildren <THISTYPE>, IHCHasName <THISTYPE>
{
  @Nullable
  String getAcceptCharset ();

  @Nonnull
  THISTYPE setAcceptCharset (@Nullable String sAcceptCharset);

  @Nullable
  String getActionURL ();

  @Nullable
  IHasJSCode getActionJS ();

  @Nonnull
  THISTYPE setAction (@Nullable ISimpleURL aAction);

  @Nonnull
  THISTYPE setAction (@Nullable String sAction);

  @Nonnull
  THISTYPE setAction (@Nullable IHasJSCodeWithSettings aAction);

  boolean isAutoCompleteOn ();

  boolean isAutoCompleteOff ();

  boolean isAutoCompleteUndefined ();

  @Nonnull
  THISTYPE setAutoComplete (boolean bAutoComplete);

  @Nonnull
  THISTYPE setAutoComplete (@Nonnull ETriState eAutoComplete);

  @Nullable
  IMimeType getEncType ();

  /**
   * Make this form a file-upload form.
   *
   * @return this
   */
  @Nonnull
  THISTYPE setEncTypeFileUpload ();

  /**
   * Set the enctype to text/plain
   *
   * @return this
   */
  @Nonnull
  THISTYPE setEncTypeTextPlain ();

  @Nonnull
  THISTYPE setEncType (@Nullable IMimeType aEncType);

  @Nullable
  EHCFormMethod getMethod ();

  @Nonnull
  THISTYPE setMethod (@Nullable EHCFormMethod eMethod);

  boolean isNoValidate ();

  @Nonnull
  THISTYPE setNoValidate (boolean bNoValidate);

  @Nullable
  HC_Target getTarget ();

  @Nonnull
  THISTYPE setTarget (@Nullable HC_Target aTarget);

  boolean isSubmitPressingEnter ();

  int getSubmitButtonTabIndex ();

  @Nonnull
  THISTYPE setSubmitPressingEnter (boolean bSubmitPressingEnter);

  @Nonnull
  THISTYPE setSubmitPressingEnter (boolean bSubmitPressingEnter, int nSubmitButtonTabIndex);
}
