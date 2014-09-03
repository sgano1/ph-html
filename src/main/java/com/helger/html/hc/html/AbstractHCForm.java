/**
 * Copyright (C) 2014 Philip Helger (www.helger.com)
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.CGlobal;
import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.mime.CMimeType;
import com.helger.commons.mime.IMimeType;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.CHTMLAttributeValues;
import com.helger.html.CHTMLAttributes;
import com.helger.html.EHTMLElement;
import com.helger.html.hc.api.EHCFormMethod;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;
import com.helger.html.js.CJS;
import com.helger.html.js.IJSCodeProvider;
import com.helger.html.js.builder.IJSStatement;

/**
 * Represents an HTML &lt;form&gt; element
 *
 * @author Philip Helger
 * @param <IMPLTYPE>
 *        Implementation type
 */
public abstract class AbstractHCForm <IMPLTYPE extends AbstractHCForm <IMPLTYPE>> extends AbstractHCElementWithChildren <IMPLTYPE>
{
  /** Default form submission method is POST */
  public static final EHCFormMethod DEFAULT_METHOD = EHCFormMethod.POST;
  /** By default auto complete is not disabled */
  public static final boolean DEFAULT_DISABLE_AUTO_COMPLETE = false;
  /** By default form are not submitted by pressing Enter key */
  public static final boolean DEFAULT_SUBMIT_PRESSING_ENTER = false;

  private String m_sAction;
  private IJSCodeProvider m_aAction;
  private EHCFormMethod m_eMethod = DEFAULT_METHOD;
  private String m_sName;
  private String m_sAcceptCharset;
  private HCA_Target m_aLinkTarget;
  private boolean m_bDisableAutoComplete = DEFAULT_DISABLE_AUTO_COMPLETE;
  private IMimeType m_aEncType;

  // Must be handled externally!
  private boolean m_bSubmitPressingEnter = DEFAULT_SUBMIT_PRESSING_ENTER;
  private int m_nSubmitButtonTabIndex = CGlobal.ILLEGAL_UINT;

  public AbstractHCForm ()
  {
    super (EHTMLElement.FORM);
  }

  public AbstractHCForm (@Nullable final String sAction)
  {
    this ();
    setAction (sAction);
  }

  public AbstractHCForm (@Nullable final ISimpleURL aAction)
  {
    this ();
    setAction (aAction);
  }

  public AbstractHCForm (@Nullable final IJSStatement aAction)
  {
    this ();
    setAction (aAction);
  }

  @Nullable
  public final String getActionURL ()
  {
    return m_sAction;
  }

  @Nullable
  public final IJSCodeProvider getActionJS ()
  {
    return m_aAction;
  }

  @Nonnull
  public final IMPLTYPE setAction (@Nullable final ISimpleURL aAction)
  {
    return setAction (aAction == null ? null : aAction.getAsString ());
  }

  @Nonnull
  public final IMPLTYPE setAction (@Nullable final String sAction)
  {
    m_sAction = sAction;
    m_aAction = null;
    return thisAsT ();
  }

  @Nonnull
  public final IMPLTYPE setAction (@Nullable final IJSStatement aAction)
  {
    m_sAction = null;
    m_aAction = aAction;
    return thisAsT ();
  }

  @Nullable
  public final EHCFormMethod getMethod ()
  {
    return m_eMethod;
  }

  @Nonnull
  public final IMPLTYPE setMethod (@Nullable final EHCFormMethod eMethod)
  {
    m_eMethod = eMethod;
    return thisAsT ();
  }

  @Nullable
  public final String getName ()
  {
    return m_sName;
  }

  @Nonnull
  public final IMPLTYPE setName (@Nullable final String sName)
  {
    m_sName = sName;
    return thisAsT ();
  }

  @Nullable
  public final HCA_Target getTarget ()
  {
    return m_aLinkTarget;
  }

  @Nonnull
  public final IMPLTYPE setTarget (@Nullable final HCA_Target aTarget)
  {
    m_aLinkTarget = aTarget;
    return thisAsT ();
  }

  @Nullable
  public final String getAcceptCharset ()
  {
    return m_sAcceptCharset;
  }

  @Nonnull
  public final IMPLTYPE setAcceptCharset (@Nullable final String sAcceptCharset)
  {
    m_sAcceptCharset = sAcceptCharset;
    return thisAsT ();
  }

  public final boolean isDisableAutoComplete ()
  {
    return m_bDisableAutoComplete;
  }

  @Nonnull
  public final IMPLTYPE setDisableAutoComplete (final boolean bDisableAutoComplete)
  {
    m_bDisableAutoComplete = bDisableAutoComplete;
    return thisAsT ();
  }

  public final boolean isSubmitPressingEnter ()
  {
    return m_bSubmitPressingEnter;
  }

  public final int getSubmitButtonTabIndex ()
  {
    return m_nSubmitButtonTabIndex;
  }

  @Nonnull
  public final IMPLTYPE setSubmitPressingEnter (final boolean bSubmitPressingEnter)
  {
    return setSubmitPressingEnter (bSubmitPressingEnter, CGlobal.ILLEGAL_UINT);
  }

  @Nonnull
  public final IMPLTYPE setSubmitPressingEnter (final boolean bSubmitPressingEnter, final int nSubmitButtonTabIndex)
  {
    m_bSubmitPressingEnter = bSubmitPressingEnter;
    m_nSubmitButtonTabIndex = nSubmitButtonTabIndex;
    return thisAsT ();
  }

  @Nullable
  public IMimeType getEncType ()
  {
    return m_aEncType;
  }

  /**
   * Make this form a file-upload form.
   *
   * @return this
   */
  @Nonnull
  public IMPLTYPE setFileUploadEncType ()
  {
    return setEncType (CMimeType.MULTIPART_FORMDATA);
  }

  @Nonnull
  public IMPLTYPE setEncType (@Nullable final IMimeType aEncType)
  {
    m_aEncType = aEncType;
    return thisAsT ();
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettingsToNode aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);

    if (m_aAction != null)
      aElement.setAttribute (CHTMLAttributes.ACTION, CJS.JS_PREFIX + m_aAction.getJSCode ());
    else
      if (StringHelper.hasText (m_sAction))
        aElement.setAttribute (CHTMLAttributes.ACTION, m_sAction);

    if (m_eMethod != null)
      aElement.setAttribute (CHTMLAttributes.METHOD, m_eMethod);
    if (StringHelper.hasText (m_sName))
      aElement.setAttribute (CHTMLAttributes.NAME, m_sName);
    if (StringHelper.hasText (m_sAcceptCharset))
      aElement.setAttribute (CHTMLAttributes.ACCEPTCHARSET, m_sAcceptCharset);
    if (m_aLinkTarget != null)
      aElement.setAttribute (CHTMLAttributes.TARGET, m_aLinkTarget);
    if (m_bDisableAutoComplete)
      aElement.setAttribute (CHTMLAttributes.AUTOCOMPLETE, CHTMLAttributeValues.OFF);
    if (m_aEncType != null)
      aElement.setAttribute (CHTMLAttributes.ENCTYPE, m_aEncType.getAsString ());
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotNull ("action", m_sAction)
                            .appendIfNotNull ("actionJS", m_aAction)
                            .appendIfNotNull ("method", m_eMethod)
                            .appendIfNotNull ("name", m_sName)
                            .appendIfNotNull ("acceptCharset", m_sAcceptCharset)
                            .appendIfNotNull ("linkTarget", m_aLinkTarget)
                            .append ("disableAutoComplete", m_bDisableAutoComplete)
                            .append ("submitPressingEnter", m_bSubmitPressingEnter)
                            .append ("submitButtonTabIndex", m_nSubmitButtonTabIndex)
                            .appendIfNotNull ("encType", m_aEncType)
                            .toString ();
  }
}
