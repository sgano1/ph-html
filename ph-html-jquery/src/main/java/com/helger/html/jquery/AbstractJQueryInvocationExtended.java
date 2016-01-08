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
package com.helger.html.jquery;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.Nonempty;
import com.helger.html.EHTMLElement;
import com.helger.html.css.ICSSClassProvider;
import com.helger.html.hc.IHCNode;
import com.helger.html.jscode.IJSExpression;
import com.helger.html.jscode.JSAnonymousFunction;
import com.helger.html.jscode.JSArray;
import com.helger.html.jscode.JSFunction;
import com.helger.json.IJson;

/**
 * This file is generated - do NOT edit!
 * 
 * @author com.helger.html.jquery.supplementary.main.
 *         Main_AbstractJQueryInvocationExtended
 * @param <IMPLTYPE>
 *        Implementation type
 */
public abstract class AbstractJQueryInvocationExtended <IMPLTYPE extends AbstractJQueryInvocationExtended <IMPLTYPE>>
                                                       extends AbstractJQueryInvocation <IMPLTYPE>
                                                       implements IJQueryInvocationExtended <IMPLTYPE>
{
  public AbstractJQueryInvocationExtended (@Nonnull final JSFunction aFunction)
  {
    super (aFunction);
  }

  public AbstractJQueryInvocationExtended (@Nullable final IJSExpression aLhs, @Nonnull @Nonempty final String sMethod)
  {
    super (aLhs, sMethod);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJSExpression selector)
  {
    return add ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJQuerySelector selector)
  {
    return add ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final JQuerySelectorList selector)
  {
    return add ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final EHTMLElement selector)
  {
    return add ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final ICSSClassProvider selector)
  {
    return add ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final String elements)
  {
    return add ().arg (elements);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IHCNode html)
  {
    return add ().arg (html);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final JQueryInvocation selection)
  {
    return add ().arg (selection);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJQuerySelector selector, @Nonnull final IJSExpression context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final JQuerySelectorList selector, @Nonnull final IJSExpression context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final EHTMLElement selector, @Nonnull final IJSExpression context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final ICSSClassProvider selector, @Nonnull final IJSExpression context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJSExpression selector, @Nonnull final EHTMLElement context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJQuerySelector selector, @Nonnull final EHTMLElement context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final JQuerySelectorList selector, @Nonnull final EHTMLElement context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final EHTMLElement selector, @Nonnull final EHTMLElement context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final ICSSClassProvider selector, @Nonnull final EHTMLElement context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJSExpression selector, @Nonnull final String context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final IJQuerySelector selector, @Nonnull final String context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final JQuerySelectorList selector, @Nonnull final String context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final EHTMLElement selector, @Nonnull final String context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE add (@Nonnull final ICSSClassProvider selector, @Nonnull final String context)
  {
    return add ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE addBack (@Nonnull final IJSExpression selector)
  {
    return addBack ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE addBack (@Nonnull final IJQuerySelector selector)
  {
    return addBack ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE addBack (@Nonnull final JQuerySelectorList selector)
  {
    return addBack ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE addBack (@Nonnull final EHTMLElement selector)
  {
    return addBack ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE addBack (@Nonnull final ICSSClassProvider selector)
  {
    return addBack ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE addClass (@Nonnull final IJSExpression className)
  {
    return addClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE addClass (@Nonnull final IJson className)
  {
    return addClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE addClass (@Nonnull final IHCNode className)
  {
    return addClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE addClass (@Nonnull final String className)
  {
    return addClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE addClass (@Nonnull final JSAnonymousFunction function)
  {
    return addClass ().arg (function);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content)
  {
    return after ().arg (content);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content)
  {
    return after ().arg (content);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content)
  {
    return after ().arg (content);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content)
  {
    return after ().arg (content);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content)
  {
    return after ().arg (content);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content)
  {
    return after ().arg (content);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content, @Nonnull final IJSExpression content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content, @Nonnull final IJSExpression content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content, @Nonnull final IJSExpression content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content, @Nonnull final IJSExpression content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content, @Nonnull final IJSExpression content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content, @Nonnull final IJSExpression content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content, @Nonnull final IHCNode content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content, @Nonnull final IHCNode content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content, @Nonnull final IHCNode content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content, @Nonnull final IHCNode content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content, @Nonnull final IHCNode content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content, @Nonnull final IHCNode content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content, @Nonnull final String content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content, @Nonnull final String content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content, @Nonnull final String content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content, @Nonnull final String content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content, @Nonnull final String content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content, @Nonnull final String content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content, @Nonnull final EHTMLElement content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content, @Nonnull final EHTMLElement content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content, @Nonnull final EHTMLElement content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content, @Nonnull final EHTMLElement content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content, @Nonnull final EHTMLElement content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content, @Nonnull final EHTMLElement content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content, @Nonnull final JSArray content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content, @Nonnull final JSArray content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content, @Nonnull final JSArray content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content, @Nonnull final JSArray content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content, @Nonnull final JSArray content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content, @Nonnull final JSArray content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IJSExpression content, @Nonnull final JQueryInvocation content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final IHCNode content, @Nonnull final JQueryInvocation content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final String content, @Nonnull final JQueryInvocation content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final EHTMLElement content, @Nonnull final JQueryInvocation content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSArray content, @Nonnull final JQueryInvocation content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JQueryInvocation content, @Nonnull final JQueryInvocation content1)
  {
    return after ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE after (@Nonnull final JSAnonymousFunction function)
  {
    return after ().arg (function);
  }

  @Nonnull
  public IMPLTYPE ajaxComplete (@Nonnull final IJSExpression handler)
  {
    return ajaxComplete ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxComplete (@Nonnull final JSAnonymousFunction handler)
  {
    return ajaxComplete ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxError (@Nonnull final IJSExpression handler)
  {
    return ajaxError ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxError (@Nonnull final JSAnonymousFunction handler)
  {
    return ajaxError ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxSend (@Nonnull final IJSExpression handler)
  {
    return ajaxSend ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxSend (@Nonnull final JSAnonymousFunction handler)
  {
    return ajaxSend ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxStart (@Nonnull final IJSExpression handler)
  {
    return ajaxStart ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxStart (@Nonnull final JSAnonymousFunction handler)
  {
    return ajaxStart ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxStop (@Nonnull final IJSExpression handler)
  {
    return ajaxStop ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxStop (@Nonnull final JSAnonymousFunction handler)
  {
    return ajaxStop ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxSuccess (@Nonnull final IJSExpression handler)
  {
    return ajaxSuccess ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ajaxSuccess (@Nonnull final JSAnonymousFunction handler)
  {
    return ajaxSuccess ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE animate (@Nonnull final IJSExpression properties)
  {
    return animate ().arg (properties);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content)
  {
    return append ().arg (content);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content)
  {
    return append ().arg (content);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content)
  {
    return append ().arg (content);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content)
  {
    return append ().arg (content);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content)
  {
    return append ().arg (content);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content)
  {
    return append ().arg (content);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content, @Nonnull final IJSExpression content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content, @Nonnull final IJSExpression content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content, @Nonnull final IJSExpression content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content, @Nonnull final IJSExpression content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content, @Nonnull final IJSExpression content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content, @Nonnull final IJSExpression content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content, @Nonnull final IHCNode content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content, @Nonnull final IHCNode content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content, @Nonnull final IHCNode content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content, @Nonnull final IHCNode content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content, @Nonnull final IHCNode content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content, @Nonnull final IHCNode content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content, @Nonnull final String content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content, @Nonnull final String content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content, @Nonnull final String content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content, @Nonnull final String content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content, @Nonnull final String content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content, @Nonnull final String content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content, @Nonnull final EHTMLElement content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content, @Nonnull final EHTMLElement content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content, @Nonnull final EHTMLElement content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content, @Nonnull final EHTMLElement content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content, @Nonnull final EHTMLElement content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content, @Nonnull final EHTMLElement content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content, @Nonnull final JSArray content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content, @Nonnull final JSArray content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content, @Nonnull final JSArray content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content, @Nonnull final JSArray content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content, @Nonnull final JSArray content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content, @Nonnull final JSArray content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IJSExpression content, @Nonnull final JQueryInvocation content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final IHCNode content, @Nonnull final JQueryInvocation content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final String content, @Nonnull final JQueryInvocation content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final EHTMLElement content, @Nonnull final JQueryInvocation content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSArray content, @Nonnull final JQueryInvocation content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JQueryInvocation content, @Nonnull final JQueryInvocation content1)
  {
    return append ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE append (@Nonnull final JSAnonymousFunction function)
  {
    return append ().arg (function);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final IJSExpression target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final IJQuerySelector target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final JQuerySelectorList target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final EHTMLElement target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final ICSSClassProvider target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final IHCNode target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final String target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final JSArray target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE appendTo (@Nonnull final JQueryInvocation target)
  {
    return appendTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName)
  {
    return attr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName)
  {
    return attr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName)
  {
    return attr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName)
  {
    return attr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final IJSExpression value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final IJSExpression value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final IJSExpression value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final IJSExpression value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final IJson value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final IJson value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final IJson value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final IJson value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final IHCNode value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final IHCNode value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final IHCNode value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final IHCNode value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final String value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final String value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final String value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final String value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, final int value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, final int value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, final int value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, final int value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, final long value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, final long value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, final long value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, final long value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final BigInteger value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final BigInteger value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final BigInteger value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final BigInteger value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, final double value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, final double value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, final double value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, final double value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final BigDecimal value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final BigDecimal value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final BigDecimal value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final BigDecimal value)
  {
    return attr ().arg (attributeName).arg (value);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJSExpression attributeName, @Nonnull final JSAnonymousFunction function)
  {
    return attr ().arg (attributeName).arg (function);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IJson attributeName, @Nonnull final JSAnonymousFunction function)
  {
    return attr ().arg (attributeName).arg (function);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final IHCNode attributeName, @Nonnull final JSAnonymousFunction function)
  {
    return attr ().arg (attributeName).arg (function);
  }

  @Nonnull
  public IMPLTYPE attr (@Nonnull final String attributeName, @Nonnull final JSAnonymousFunction function)
  {
    return attr ().arg (attributeName).arg (function);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content)
  {
    return before ().arg (content);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content)
  {
    return before ().arg (content);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content)
  {
    return before ().arg (content);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content)
  {
    return before ().arg (content);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content)
  {
    return before ().arg (content);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content)
  {
    return before ().arg (content);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content, @Nonnull final IJSExpression content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content, @Nonnull final IJSExpression content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content, @Nonnull final IJSExpression content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content, @Nonnull final IJSExpression content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content, @Nonnull final IJSExpression content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content, @Nonnull final IJSExpression content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content, @Nonnull final IHCNode content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content, @Nonnull final IHCNode content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content, @Nonnull final IHCNode content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content, @Nonnull final IHCNode content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content, @Nonnull final IHCNode content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content, @Nonnull final IHCNode content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content, @Nonnull final String content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content, @Nonnull final String content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content, @Nonnull final String content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content, @Nonnull final String content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content, @Nonnull final String content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content, @Nonnull final String content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content, @Nonnull final EHTMLElement content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content, @Nonnull final EHTMLElement content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content, @Nonnull final EHTMLElement content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content, @Nonnull final EHTMLElement content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content, @Nonnull final EHTMLElement content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content, @Nonnull final EHTMLElement content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content, @Nonnull final JSArray content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content, @Nonnull final JSArray content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content, @Nonnull final JSArray content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content, @Nonnull final JSArray content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content, @Nonnull final JSArray content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content, @Nonnull final JSArray content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IJSExpression content, @Nonnull final JQueryInvocation content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final IHCNode content, @Nonnull final JQueryInvocation content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final String content, @Nonnull final JQueryInvocation content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final EHTMLElement content, @Nonnull final JQueryInvocation content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSArray content, @Nonnull final JQueryInvocation content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JQueryInvocation content, @Nonnull final JQueryInvocation content1)
  {
    return before ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE before (@Nonnull final JSAnonymousFunction function)
  {
    return before ().arg (function);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJSExpression eventType, @Nonnull final IJSExpression eventData)
  {
    return bind ().arg (eventType).arg (eventData);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJson eventType, @Nonnull final IJSExpression eventData)
  {
    return bind ().arg (eventType).arg (eventData);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IHCNode eventType, @Nonnull final IJSExpression eventData)
  {
    return bind ().arg (eventType).arg (eventData);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final String eventType, @Nonnull final IJSExpression eventData)
  {
    return bind ().arg (eventType).arg (eventData);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJSExpression eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final IJSExpression handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJson eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final IJSExpression handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IHCNode eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final IJSExpression handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final String eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final IJSExpression handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJSExpression eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJson eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IHCNode eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final String eventType,
                        @Nonnull final IJSExpression eventData,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return bind ().arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJSExpression eventType)
  {
    return bind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJson eventType)
  {
    return bind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IHCNode eventType)
  {
    return bind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final String eventType)
  {
    return bind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJSExpression eventType,
                        @Nonnull final IJSExpression eventData,
                        final boolean preventBubble)
  {
    return bind ().arg (eventType).arg (eventData).arg (preventBubble);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IJson eventType,
                        @Nonnull final IJSExpression eventData,
                        final boolean preventBubble)
  {
    return bind ().arg (eventType).arg (eventData).arg (preventBubble);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final IHCNode eventType,
                        @Nonnull final IJSExpression eventData,
                        final boolean preventBubble)
  {
    return bind ().arg (eventType).arg (eventData).arg (preventBubble);
  }

  @Nonnull
  public IMPLTYPE bind (@Nonnull final String eventType,
                        @Nonnull final IJSExpression eventData,
                        final boolean preventBubble)
  {
    return bind ().arg (eventType).arg (eventData).arg (preventBubble);
  }

  @Nonnull
  public IMPLTYPE blur (@Nonnull final IJSExpression handler)
  {
    return blur ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE blur (@Nonnull final JSAnonymousFunction handler)
  {
    return blur ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE blur (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return blur ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE blur (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return blur ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE callbacks_add (@Nonnull final IJSExpression callbacks)
  {
    return callbacks_add ().arg (callbacks);
  }

  @Nonnull
  public IMPLTYPE callbacks_add (@Nonnull final JSAnonymousFunction callbacks)
  {
    return callbacks_add ().arg (callbacks);
  }

  @Nonnull
  public IMPLTYPE callbacks_add (@Nonnull final JSArray callbacks)
  {
    return callbacks_add ().arg (callbacks);
  }

  @Nonnull
  public IMPLTYPE callbacks_fire (@Nonnull final IJSExpression arguments)
  {
    return callbacks_fire ().arg (arguments);
  }

  @Nonnull
  public IMPLTYPE callbacks_fireWith (@Nonnull final IJSExpression context)
  {
    return callbacks_fireWith ().arg (context);
  }

  @Nonnull
  public IMPLTYPE callbacks_fireWith (@Nonnull final IJSExpression context, @Nonnull final IJSExpression args)
  {
    return callbacks_fireWith ().arg (context).arg (args);
  }

  @Nonnull
  public IMPLTYPE callbacks_has (@Nonnull final IJSExpression callback)
  {
    return callbacks_has ().arg (callback);
  }

  @Nonnull
  public IMPLTYPE callbacks_has (@Nonnull final JSAnonymousFunction callback)
  {
    return callbacks_has ().arg (callback);
  }

  @Nonnull
  public IMPLTYPE callbacks_remove (@Nonnull final IJSExpression callbacks)
  {
    return callbacks_remove ().arg (callbacks);
  }

  @Nonnull
  public IMPLTYPE callbacks_remove (@Nonnull final JSAnonymousFunction callbacks)
  {
    return callbacks_remove ().arg (callbacks);
  }

  @Nonnull
  public IMPLTYPE callbacks_remove (@Nonnull final JSArray callbacks)
  {
    return callbacks_remove ().arg (callbacks);
  }

  @Nonnull
  public IMPLTYPE change (@Nonnull final IJSExpression handler)
  {
    return change ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE change (@Nonnull final JSAnonymousFunction handler)
  {
    return change ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE change (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return change ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE change (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return change ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE children (@Nonnull final IJSExpression selector)
  {
    return children ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE children (@Nonnull final IJQuerySelector selector)
  {
    return children ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE children (@Nonnull final JQuerySelectorList selector)
  {
    return children ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE children (@Nonnull final EHTMLElement selector)
  {
    return children ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE children (@Nonnull final ICSSClassProvider selector)
  {
    return children ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE clearQueue (@Nonnull final IJSExpression queueName)
  {
    return clearQueue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE clearQueue (@Nonnull final IJson queueName)
  {
    return clearQueue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE clearQueue (@Nonnull final IHCNode queueName)
  {
    return clearQueue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE clearQueue (@Nonnull final String queueName)
  {
    return clearQueue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE click (@Nonnull final IJSExpression handler)
  {
    return click ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE click (@Nonnull final JSAnonymousFunction handler)
  {
    return click ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE click (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return click ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE click (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return click ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE _clone (@Nonnull final IJSExpression withDataAndEvents)
  {
    return _clone ().arg (withDataAndEvents);
  }

  @Nonnull
  public IMPLTYPE _clone (final boolean withDataAndEvents)
  {
    return _clone ().arg (withDataAndEvents);
  }

  @Nonnull
  public IMPLTYPE _clone (@Nonnull final IJSExpression withDataAndEvents,
                          @Nonnull final IJSExpression deepWithDataAndEvents)
  {
    return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents);
  }

  @Nonnull
  public IMPLTYPE _clone (final boolean withDataAndEvents, @Nonnull final IJSExpression deepWithDataAndEvents)
  {
    return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents);
  }

  @Nonnull
  public IMPLTYPE _clone (@Nonnull final IJSExpression withDataAndEvents, final boolean deepWithDataAndEvents)
  {
    return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents);
  }

  @Nonnull
  public IMPLTYPE _clone (final boolean withDataAndEvents, final boolean deepWithDataAndEvents)
  {
    return _clone ().arg (withDataAndEvents).arg (deepWithDataAndEvents);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJSExpression selector)
  {
    return closest ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJQuerySelector selector)
  {
    return closest ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final JQuerySelectorList selector)
  {
    return closest ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final EHTMLElement selector)
  {
    return closest ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final ICSSClassProvider selector)
  {
    return closest ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJQuerySelector selector, @Nonnull final IJSExpression context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final JQuerySelectorList selector, @Nonnull final IJSExpression context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final EHTMLElement selector, @Nonnull final IJSExpression context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final ICSSClassProvider selector, @Nonnull final IJSExpression context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJSExpression selector, @Nonnull final EHTMLElement context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJQuerySelector selector, @Nonnull final EHTMLElement context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final JQuerySelectorList selector, @Nonnull final EHTMLElement context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final EHTMLElement selector, @Nonnull final EHTMLElement context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final ICSSClassProvider selector, @Nonnull final EHTMLElement context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJSExpression selector, @Nonnull final String context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final IJQuerySelector selector, @Nonnull final String context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final JQuerySelectorList selector, @Nonnull final String context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final EHTMLElement selector, @Nonnull final String context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final ICSSClassProvider selector, @Nonnull final String context)
  {
    return closest ().arg (selector).arg (context);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final JQueryInvocation selection)
  {
    return closest ().arg (selection);
  }

  @Nonnull
  public IMPLTYPE closest (@Nonnull final String element)
  {
    return closest ().arg (element);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE closest (@Nonnull final JSArray selectors)
  {
    return closest ().arg (selectors);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE closest (@Nonnull final JSArray selectors, @Nonnull final IJSExpression context)
  {
    return closest ().arg (selectors).arg (context);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE closest (@Nonnull final JSArray selectors, @Nonnull final EHTMLElement context)
  {
    return closest ().arg (selectors).arg (context);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE closest (@Nonnull final JSArray selectors, @Nonnull final String context)
  {
    return closest ().arg (selectors).arg (context);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName)
  {
    return css ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName)
  {
    return css ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName)
  {
    return css ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName)
  {
    return css ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final JSArray propertyNames)
  {
    return css ().arg (propertyNames);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final IJSExpression value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final IJSExpression value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final IJSExpression value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final IJSExpression value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final IJson value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final IJson value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final IJson value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final IJson value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final IHCNode value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final IHCNode value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final IHCNode value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final IHCNode value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final String value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final String value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final String value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final String value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, final int value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, final int value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, final int value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, final int value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, final long value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, final long value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, final long value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, final long value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final BigInteger value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final BigInteger value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final BigInteger value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final BigInteger value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, final double value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, final double value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, final double value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, final double value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final BigDecimal value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final BigDecimal value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final BigDecimal value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final BigDecimal value)
  {
    return css ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJSExpression propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return css ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IJson propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return css ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final IHCNode propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return css ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE css (@Nonnull final String propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return css ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final IJSExpression key, @Nonnull final IJSExpression value)
  {
    return data ().arg (key).arg (value);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final IJson key, @Nonnull final IJSExpression value)
  {
    return data ().arg (key).arg (value);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final IHCNode key, @Nonnull final IJSExpression value)
  {
    return data ().arg (key).arg (value);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final String key, @Nonnull final IJSExpression value)
  {
    return data ().arg (key).arg (value);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final IJSExpression obj)
  {
    return data ().arg (obj);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final IJson key)
  {
    return data ().arg (key);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final IHCNode key)
  {
    return data ().arg (key);
  }

  @Nonnull
  public IMPLTYPE data (@Nonnull final String key)
  {
    return data ().arg (key);
  }

  @Nonnull
  public IMPLTYPE dblclick (@Nonnull final IJSExpression handler)
  {
    return dblclick ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE dblclick (@Nonnull final JSAnonymousFunction handler)
  {
    return dblclick ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE dblclick (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return dblclick ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE dblclick (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return dblclick ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE deferred_always (@Nonnull final IJSExpression alwaysCallbacks)
  {
    return deferred_always ().arg (alwaysCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_always (@Nonnull final JSAnonymousFunction alwaysCallbacks)
  {
    return deferred_always ().arg (alwaysCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_always (@Nonnull final IJSExpression alwaysCallbacks,
                                   @Nonnull final IJSExpression alwaysCallbacks1)
  {
    return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_always (@Nonnull final JSAnonymousFunction alwaysCallbacks,
                                   @Nonnull final IJSExpression alwaysCallbacks1)
  {
    return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_always (@Nonnull final IJSExpression alwaysCallbacks,
                                   @Nonnull final JSAnonymousFunction alwaysCallbacks1)
  {
    return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_always (@Nonnull final JSAnonymousFunction alwaysCallbacks,
                                   @Nonnull final JSAnonymousFunction alwaysCallbacks1)
  {
    return deferred_always ().arg (alwaysCallbacks).arg (alwaysCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_done (@Nonnull final IJSExpression doneCallbacks)
  {
    return deferred_done ().arg (doneCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_done (@Nonnull final JSAnonymousFunction doneCallbacks)
  {
    return deferred_done ().arg (doneCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_done (@Nonnull final IJSExpression doneCallbacks,
                                 @Nonnull final IJSExpression doneCallbacks1)
  {
    return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_done (@Nonnull final JSAnonymousFunction doneCallbacks,
                                 @Nonnull final IJSExpression doneCallbacks1)
  {
    return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_done (@Nonnull final IJSExpression doneCallbacks,
                                 @Nonnull final JSAnonymousFunction doneCallbacks1)
  {
    return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_done (@Nonnull final JSAnonymousFunction doneCallbacks,
                                 @Nonnull final JSAnonymousFunction doneCallbacks1)
  {
    return deferred_done ().arg (doneCallbacks).arg (doneCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_fail (@Nonnull final IJSExpression failCallbacks)
  {
    return deferred_fail ().arg (failCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_fail (@Nonnull final JSAnonymousFunction failCallbacks)
  {
    return deferred_fail ().arg (failCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_fail (@Nonnull final IJSExpression failCallbacks,
                                 @Nonnull final IJSExpression failCallbacks1)
  {
    return deferred_fail ().arg (failCallbacks).arg (failCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_fail (@Nonnull final JSAnonymousFunction failCallbacks,
                                 @Nonnull final IJSExpression failCallbacks1)
  {
    return deferred_fail ().arg (failCallbacks).arg (failCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_fail (@Nonnull final IJSExpression failCallbacks,
                                 @Nonnull final JSAnonymousFunction failCallbacks1)
  {
    return deferred_fail ().arg (failCallbacks).arg (failCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_fail (@Nonnull final JSAnonymousFunction failCallbacks,
                                 @Nonnull final JSAnonymousFunction failCallbacks1)
  {
    return deferred_fail ().arg (failCallbacks).arg (failCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_notify (@Nonnull final IJSExpression args)
  {
    return deferred_notify ().arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_notifyWith (@Nonnull final IJSExpression context)
  {
    return deferred_notifyWith ().arg (context);
  }

  @Nonnull
  public IMPLTYPE deferred_notifyWith (@Nonnull final IJSExpression context, @Nonnull final IJSExpression args)
  {
    return deferred_notifyWith ().arg (context).arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_notifyWith (@Nonnull final IJSExpression context, @Nonnull final JSArray args)
  {
    return deferred_notifyWith ().arg (context).arg (args);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter)
  {
    return deferred_pipe ().arg (doneFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter)
  {
    return deferred_pipe ().arg (doneFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter, @Nonnull final IJSExpression failFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter, @Nonnull final IJSExpression failFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter, @Nonnull final JSAnonymousFunction failFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE deferred_pipe (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_pipe ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final IJSExpression progressCallbacks)
  {
    return deferred_progress ().arg (progressCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSAnonymousFunction progressCallbacks)
  {
    return deferred_progress ().arg (progressCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSArray progressCallbacks)
  {
    return deferred_progress ().arg (progressCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final IJSExpression progressCallbacks,
                                     @Nonnull final IJSExpression progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSAnonymousFunction progressCallbacks,
                                     @Nonnull final IJSExpression progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSArray progressCallbacks,
                                     @Nonnull final IJSExpression progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final IJSExpression progressCallbacks,
                                     @Nonnull final JSAnonymousFunction progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSAnonymousFunction progressCallbacks,
                                     @Nonnull final JSAnonymousFunction progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSArray progressCallbacks,
                                     @Nonnull final JSAnonymousFunction progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final IJSExpression progressCallbacks,
                                     @Nonnull final JSArray progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSAnonymousFunction progressCallbacks,
                                     @Nonnull final JSArray progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_progress (@Nonnull final JSArray progressCallbacks,
                                     @Nonnull final JSArray progressCallbacks1)
  {
    return deferred_progress ().arg (progressCallbacks).arg (progressCallbacks1);
  }

  @Nonnull
  public IMPLTYPE deferred_promise (@Nonnull final IJSExpression target)
  {
    return deferred_promise ().arg (target);
  }

  @Nonnull
  public IMPLTYPE deferred_reject (@Nonnull final IJSExpression args)
  {
    return deferred_reject ().arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_rejectWith (@Nonnull final IJSExpression context)
  {
    return deferred_rejectWith ().arg (context);
  }

  @Nonnull
  public IMPLTYPE deferred_rejectWith (@Nonnull final IJSExpression context, @Nonnull final IJSExpression args)
  {
    return deferred_rejectWith ().arg (context).arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_rejectWith (@Nonnull final IJSExpression context, @Nonnull final JSArray args)
  {
    return deferred_rejectWith ().arg (context).arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_resolve (@Nonnull final IJSExpression args)
  {
    return deferred_resolve ().arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_resolveWith (@Nonnull final IJSExpression context)
  {
    return deferred_resolveWith ().arg (context);
  }

  @Nonnull
  public IMPLTYPE deferred_resolveWith (@Nonnull final IJSExpression context, @Nonnull final IJSExpression args)
  {
    return deferred_resolveWith ().arg (context).arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_resolveWith (@Nonnull final IJSExpression context, @Nonnull final JSArray args)
  {
    return deferred_resolveWith ().arg (context).arg (args);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneFilter)
  {
    return deferred_then ().arg (doneFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneFilter)
  {
    return deferred_then ().arg (doneFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final IJSExpression progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final IJSExpression failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneFilter,
                                 @Nonnull final JSAnonymousFunction failFilter,
                                 @Nonnull final JSAnonymousFunction progressFilter)
  {
    return deferred_then ().arg (doneFilter).arg (failFilter).arg (progressFilter);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneCallbacks, @Nonnull final IJSExpression failCallbacks)
  {
    return deferred_then ().arg (doneCallbacks).arg (failCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneCallbacks,
                                 @Nonnull final IJSExpression failCallbacks)
  {
    return deferred_then ().arg (doneCallbacks).arg (failCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final IJSExpression doneCallbacks,
                                 @Nonnull final JSAnonymousFunction failCallbacks)
  {
    return deferred_then ().arg (doneCallbacks).arg (failCallbacks);
  }

  @Nonnull
  public IMPLTYPE deferred_then (@Nonnull final JSAnonymousFunction doneCallbacks,
                                 @Nonnull final JSAnonymousFunction failCallbacks)
  {
    return deferred_then ().arg (doneCallbacks).arg (failCallbacks);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final IJSExpression duration)
  {
    return delay ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE delay (final int duration)
  {
    return delay ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE delay (final long duration)
  {
    return delay ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final BigInteger duration)
  {
    return delay ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final IJSExpression duration, @Nonnull final IJSExpression queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final int duration, @Nonnull final IJSExpression queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final long duration, @Nonnull final IJSExpression queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final BigInteger duration, @Nonnull final IJSExpression queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final IJSExpression duration, @Nonnull final IJson queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final int duration, @Nonnull final IJson queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final long duration, @Nonnull final IJson queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final BigInteger duration, @Nonnull final IJson queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final IJSExpression duration, @Nonnull final IHCNode queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final int duration, @Nonnull final IHCNode queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final long duration, @Nonnull final IHCNode queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final BigInteger duration, @Nonnull final IHCNode queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final IJSExpression duration, @Nonnull final String queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final int duration, @Nonnull final String queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (final long duration, @Nonnull final String queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delay (@Nonnull final BigInteger duration, @Nonnull final String queueName)
  {
    return delay ().arg (duration).arg (queueName);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final String eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final String eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final String eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final String eventType,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final IJSExpression handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJSExpression eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IJson eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final IHCNode eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector,
                            @Nonnull final String eventType,
                            @Nonnull final IJSExpression eventData,
                            @Nonnull final JSAnonymousFunction handler)
  {
    return delegate ().arg (selector).arg (eventType).arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression events)
  {
    return delegate ().arg (selector).arg (events);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IJson selector, @Nonnull final IJSExpression events)
  {
    return delegate ().arg (selector).arg (events);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final IHCNode selector, @Nonnull final IJSExpression events)
  {
    return delegate ().arg (selector).arg (events);
  }

  @Nonnull
  public IMPLTYPE delegate (@Nonnull final String selector, @Nonnull final IJSExpression events)
  {
    return delegate ().arg (selector).arg (events);
  }

  @Nonnull
  public IMPLTYPE dequeue (@Nonnull final IJSExpression queueName)
  {
    return dequeue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE dequeue (@Nonnull final IJson queueName)
  {
    return dequeue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE dequeue (@Nonnull final IHCNode queueName)
  {
    return dequeue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE dequeue (@Nonnull final String queueName)
  {
    return dequeue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE detach (@Nonnull final IJSExpression selector)
  {
    return detach ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE detach (@Nonnull final IJQuerySelector selector)
  {
    return detach ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE detach (@Nonnull final JQuerySelectorList selector)
  {
    return detach ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE detach (@Nonnull final EHTMLElement selector)
  {
    return detach ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE detach (@Nonnull final ICSSClassProvider selector)
  {
    return detach ().arg (selector);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJSExpression eventType)
  {
    return die ().arg (eventType);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJson eventType)
  {
    return die ().arg (eventType);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IHCNode eventType)
  {
    return die ().arg (eventType);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final String eventType)
  {
    return die ().arg (eventType);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJSExpression eventType, @Nonnull final IJSExpression handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJson eventType, @Nonnull final IJSExpression handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IHCNode eventType, @Nonnull final IJSExpression handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final String eventType, @Nonnull final IJSExpression handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJSExpression eventType, @Nonnull final IJson handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJson eventType, @Nonnull final IJson handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IHCNode eventType, @Nonnull final IJson handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final String eventType, @Nonnull final IJson handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJSExpression eventType, @Nonnull final IHCNode handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJson eventType, @Nonnull final IHCNode handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IHCNode eventType, @Nonnull final IHCNode handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final String eventType, @Nonnull final IHCNode handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJSExpression eventType, @Nonnull final String handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IJson eventType, @Nonnull final String handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final IHCNode eventType, @Nonnull final String handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE die (@Nonnull final String eventType, @Nonnull final String handler)
  {
    return die ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE each (@Nonnull final IJSExpression function)
  {
    return each ().arg (function);
  }

  @Nonnull
  public IMPLTYPE each (@Nonnull final JSAnonymousFunction function)
  {
    return each ().arg (function);
  }

  @Nonnull
  public IMPLTYPE _eq (@Nonnull final IJSExpression index)
  {
    return _eq ().arg (index);
  }

  @Nonnull
  public IMPLTYPE _eq (final int index)
  {
    return _eq ().arg (index);
  }

  @Nonnull
  public IMPLTYPE _eq (final long index)
  {
    return _eq ().arg (index);
  }

  @Nonnull
  public IMPLTYPE _eq (@Nonnull final BigInteger index)
  {
    return _eq ().arg (index);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE error (@Nonnull final IJSExpression handler)
  {
    return error ().arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE error (@Nonnull final JSAnonymousFunction handler)
  {
    return error ().arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE error (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return error ().arg (eventData).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE error (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return error ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, @Nonnull final IJSExpression opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final int opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final long opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, @Nonnull final BigInteger opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final double opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, @Nonnull final BigDecimal opacity)
  {
    return fadeTo ().arg (duration).arg (opacity);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final int opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final long opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigInteger opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigInteger opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final double opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final double opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final double opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final double opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final double opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final double opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigDecimal opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigDecimal opacity, @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final int opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final int opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final int opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final int opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final long opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final long opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final long opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final double opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final double opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final double opacity, @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final IJSExpression opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final IJSExpression opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final IJSExpression opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final int opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final long opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, @Nonnull final BigInteger opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigInteger opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigInteger opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigInteger opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final double opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, @Nonnull final BigDecimal opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigDecimal opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigDecimal opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigDecimal opacity, @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final IJSExpression opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final IJSExpression opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final IJSExpression opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final int opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final long opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigInteger opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigInteger opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigInteger opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final double opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigDecimal opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigDecimal opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigDecimal opacity, @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final IJSExpression opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final IJSExpression opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final IJSExpression opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final int opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final long opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigInteger opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigInteger opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigInteger opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration, final double opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration, @Nonnull final BigDecimal opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration, @Nonnull final BigDecimal opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration, @Nonnull final BigDecimal opacity, @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final IJSExpression complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJSExpression easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IJson easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final IHCNode easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final IJSExpression opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final int opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final long opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigInteger opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          final double opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJSExpression duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IJson duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final IHCNode duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final String duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final int duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final long duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigInteger duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (final double duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE fadeTo (@Nonnull final BigDecimal duration,
                          @Nonnull final BigDecimal opacity,
                          @Nonnull final String easing,
                          @Nonnull final JSAnonymousFunction complete)
  {
    return fadeTo ().arg (duration).arg (opacity).arg (easing).arg (complete);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final IJSExpression selector)
  {
    return filter ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final IJQuerySelector selector)
  {
    return filter ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final JQuerySelectorList selector)
  {
    return filter ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final EHTMLElement selector)
  {
    return filter ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final ICSSClassProvider selector)
  {
    return filter ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final JSAnonymousFunction function)
  {
    return filter ().arg (function);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final String elements)
  {
    return filter ().arg (elements);
  }

  @Nonnull
  public IMPLTYPE filter (@Nonnull final JQueryInvocation selection)
  {
    return filter ().arg (selection);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final IJSExpression selector)
  {
    return find ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final IJQuerySelector selector)
  {
    return find ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final JQuerySelectorList selector)
  {
    return find ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final EHTMLElement selector)
  {
    return find ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final ICSSClassProvider selector)
  {
    return find ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final String element)
  {
    return find ().arg (element);
  }

  @Nonnull
  public IMPLTYPE find (@Nonnull final JQueryInvocation element)
  {
    return find ().arg (element);
  }

  @Nonnull
  public IMPLTYPE finish (@Nonnull final IJSExpression queue)
  {
    return finish ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE finish (@Nonnull final IJson queue)
  {
    return finish ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE finish (@Nonnull final IHCNode queue)
  {
    return finish ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE finish (@Nonnull final String queue)
  {
    return finish ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE focus (@Nonnull final IJSExpression handler)
  {
    return focus ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE focus (@Nonnull final JSAnonymousFunction handler)
  {
    return focus ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE focus (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return focus ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE focus (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return focus ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusin (@Nonnull final IJSExpression handler)
  {
    return focusin ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusin (@Nonnull final JSAnonymousFunction handler)
  {
    return focusin ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusin (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return focusin ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusin (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return focusin ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusout (@Nonnull final IJSExpression handler)
  {
    return focusout ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusout (@Nonnull final JSAnonymousFunction handler)
  {
    return focusout ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusout (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return focusout ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE focusout (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return focusout ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE get (@Nonnull final IJSExpression index)
  {
    return get ().arg (index);
  }

  @Nonnull
  public IMPLTYPE get (final int index)
  {
    return get ().arg (index);
  }

  @Nonnull
  public IMPLTYPE get (final long index)
  {
    return get ().arg (index);
  }

  @Nonnull
  public IMPLTYPE get (@Nonnull final BigInteger index)
  {
    return get ().arg (index);
  }

  @Nonnull
  public IMPLTYPE has (@Nonnull final IJSExpression selector)
  {
    return has ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE has (@Nonnull final IJson selector)
  {
    return has ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE has (@Nonnull final IHCNode selector)
  {
    return has ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE has (@Nonnull final String selector)
  {
    return has ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE has (@Nonnull final EHTMLElement contained)
  {
    return has ().arg (contained);
  }

  @Nonnull
  public IMPLTYPE hasClass (@Nonnull final IJSExpression className)
  {
    return hasClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE hasClass (@Nonnull final IJson className)
  {
    return hasClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE hasClass (@Nonnull final IHCNode className)
  {
    return hasClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE hasClass (@Nonnull final String className)
  {
    return hasClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final IJSExpression value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final IJson value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final IHCNode value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final String value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (final int value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (final long value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final BigInteger value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (final double value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final BigDecimal value)
  {
    return height ().arg (value);
  }

  @Nonnull
  public IMPLTYPE height (@Nonnull final JSAnonymousFunction function)
  {
    return height ().arg (function);
  }

  @Nonnull
  public IMPLTYPE hide (@Nonnull final IJSExpression duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (final int duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (final long duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (@Nonnull final BigInteger duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (final double duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (@Nonnull final BigDecimal duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (@Nonnull final IJson duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (@Nonnull final IHCNode duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hide (@Nonnull final String duration)
  {
    return hide ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE hover (@Nonnull final IJSExpression handlerIn, @Nonnull final IJSExpression handlerOut)
  {
    return hover ().arg (handlerIn).arg (handlerOut);
  }

  @Nonnull
  public IMPLTYPE hover (@Nonnull final JSAnonymousFunction handlerIn, @Nonnull final IJSExpression handlerOut)
  {
    return hover ().arg (handlerIn).arg (handlerOut);
  }

  @Nonnull
  public IMPLTYPE hover (@Nonnull final IJSExpression handlerIn, @Nonnull final JSAnonymousFunction handlerOut)
  {
    return hover ().arg (handlerIn).arg (handlerOut);
  }

  @Nonnull
  public IMPLTYPE hover (@Nonnull final JSAnonymousFunction handlerIn, @Nonnull final JSAnonymousFunction handlerOut)
  {
    return hover ().arg (handlerIn).arg (handlerOut);
  }

  @Nonnull
  public IMPLTYPE hover (@Nonnull final IJSExpression handlerInOut)
  {
    return hover ().arg (handlerInOut);
  }

  @Nonnull
  public IMPLTYPE hover (@Nonnull final JSAnonymousFunction handlerInOut)
  {
    return hover ().arg (handlerInOut);
  }

  @Nonnull
  public IMPLTYPE html (@Nonnull final IJSExpression htmlString)
  {
    return html ().arg (htmlString);
  }

  @Nonnull
  public IMPLTYPE html (@Nonnull final IHCNode htmlString)
  {
    return html ().arg (htmlString);
  }

  @Nonnull
  public IMPLTYPE html (@Nonnull final String htmlString)
  {
    return html ().arg (htmlString);
  }

  @Nonnull
  public IMPLTYPE html (@Nonnull final JSAnonymousFunction function)
  {
    return html ().arg (function);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final IJSExpression selector)
  {
    return index ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final IJQuerySelector selector)
  {
    return index ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final JQuerySelectorList selector)
  {
    return index ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final EHTMLElement selector)
  {
    return index ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final ICSSClassProvider selector)
  {
    return index ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final String element)
  {
    return index ().arg (element);
  }

  @Nonnull
  public IMPLTYPE index (@Nonnull final JQueryInvocation element)
  {
    return index ().arg (element);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final IJSExpression value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final IJson value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final IHCNode value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final String value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (final int value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (final long value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final BigInteger value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (final double value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final BigDecimal value)
  {
    return innerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerHeight (@Nonnull final JSAnonymousFunction function)
  {
    return innerHeight ().arg (function);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final IJSExpression value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final IJson value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final IHCNode value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final String value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (final int value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (final long value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final BigInteger value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (final double value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final BigDecimal value)
  {
    return innerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE innerWidth (@Nonnull final JSAnonymousFunction function)
  {
    return innerWidth ().arg (function);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final IJSExpression target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final IJQuerySelector target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final JQuerySelectorList target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final EHTMLElement target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final ICSSClassProvider target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final IHCNode target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final String target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final JSArray target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertAfter (@Nonnull final JQueryInvocation target)
  {
    return insertAfter ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final IJSExpression target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final IJQuerySelector target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final JQuerySelectorList target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final EHTMLElement target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final ICSSClassProvider target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final IHCNode target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final String target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final JSArray target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE insertBefore (@Nonnull final JQueryInvocation target)
  {
    return insertBefore ().arg (target);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final IJSExpression selector)
  {
    return is ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final IJQuerySelector selector)
  {
    return is ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final JQuerySelectorList selector)
  {
    return is ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final EHTMLElement selector)
  {
    return is ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final ICSSClassProvider selector)
  {
    return is ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final JSAnonymousFunction function)
  {
    return is ().arg (function);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final JQueryInvocation selection)
  {
    return is ().arg (selection);
  }

  @Nonnull
  public IMPLTYPE is (@Nonnull final String elements)
  {
    return is ().arg (elements);
  }

  @Nonnull
  public IMPLTYPE keydown (@Nonnull final IJSExpression handler)
  {
    return keydown ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE keydown (@Nonnull final JSAnonymousFunction handler)
  {
    return keydown ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE keydown (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return keydown ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE keydown (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return keydown ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE keypress (@Nonnull final IJSExpression handler)
  {
    return keypress ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE keypress (@Nonnull final JSAnonymousFunction handler)
  {
    return keypress ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE keypress (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return keypress ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE keypress (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return keypress ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE keyup (@Nonnull final IJSExpression handler)
  {
    return keyup ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE keyup (@Nonnull final JSAnonymousFunction handler)
  {
    return keyup ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE keyup (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return keyup ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE keyup (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return keyup ().arg (eventData).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJSExpression events, @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJson events, @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IHCNode events, @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final String events, @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJSExpression events, @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJson events, @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IHCNode events, @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final String events, @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJSExpression events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJson events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IHCNode events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final String events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJSExpression events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJson events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IHCNode events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final String events,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction handler)
  {
    return live ().arg (events).arg (data).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE live (@Nonnull final IJSExpression events)
  {
    return live ().arg (events);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression handler)
  {
    return load ().arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE load (@Nonnull final JSAnonymousFunction handler)
  {
    return load ().arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return load ().arg (eventData).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return load ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url)
  {
    return load ().arg (url);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url)
  {
    return load ().arg (url);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url)
  {
    return load ().arg (url);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final IJSExpression data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final IJSExpression data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final IJSExpression data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url, @Nonnull final IJson data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final IJson data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final IJson data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final IJson data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url, @Nonnull final IHCNode data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final IHCNode data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final IHCNode data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final IHCNode data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url, @Nonnull final String data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final String data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final String data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final String data)
  {
    return load ().arg (url).arg (data);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final IJson data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final IJson data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final IJson data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final IJson data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final IHCNode data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final IHCNode data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final IHCNode data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final IHCNode data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final String data,
                        @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url, @Nonnull final String data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url, @Nonnull final String data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url, @Nonnull final String data, @Nonnull final IJSExpression complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url,
                        @Nonnull final IJSExpression data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final IJson data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url,
                        @Nonnull final IJson data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url,
                        @Nonnull final IJson data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url,
                        @Nonnull final IJson data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final IHCNode data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url,
                        @Nonnull final IHCNode data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url,
                        @Nonnull final IHCNode data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url,
                        @Nonnull final IHCNode data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJSExpression url,
                        @Nonnull final String data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IJson url,
                        @Nonnull final String data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final IHCNode url,
                        @Nonnull final String data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE load (@Nonnull final String url,
                        @Nonnull final String data,
                        @Nonnull final JSAnonymousFunction complete)
  {
    return load ().arg (url).arg (data).arg (complete);
  }

  @Nonnull
  public IMPLTYPE map (@Nonnull final IJSExpression callback)
  {
    return map ().arg (callback);
  }

  @Nonnull
  public IMPLTYPE map (@Nonnull final JSAnonymousFunction callback)
  {
    return map ().arg (callback);
  }

  @Nonnull
  public IMPLTYPE mousedown (@Nonnull final IJSExpression handler)
  {
    return mousedown ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousedown (@Nonnull final JSAnonymousFunction handler)
  {
    return mousedown ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousedown (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mousedown ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousedown (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mousedown ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseenter (@Nonnull final IJSExpression handler)
  {
    return mouseenter ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseenter (@Nonnull final JSAnonymousFunction handler)
  {
    return mouseenter ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseenter (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mouseenter ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseenter (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mouseenter ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseleave (@Nonnull final IJSExpression handler)
  {
    return mouseleave ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseleave (@Nonnull final JSAnonymousFunction handler)
  {
    return mouseleave ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseleave (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mouseleave ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseleave (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mouseleave ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousemove (@Nonnull final IJSExpression handler)
  {
    return mousemove ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousemove (@Nonnull final JSAnonymousFunction handler)
  {
    return mousemove ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousemove (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mousemove ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mousemove (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mousemove ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseout (@Nonnull final IJSExpression handler)
  {
    return mouseout ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseout (@Nonnull final JSAnonymousFunction handler)
  {
    return mouseout ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseout (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mouseout ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseout (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mouseout ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseover (@Nonnull final IJSExpression handler)
  {
    return mouseover ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseover (@Nonnull final JSAnonymousFunction handler)
  {
    return mouseover ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseover (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mouseover ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseover (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mouseover ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseup (@Nonnull final IJSExpression handler)
  {
    return mouseup ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseup (@Nonnull final JSAnonymousFunction handler)
  {
    return mouseup ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseup (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return mouseup ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE mouseup (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return mouseup ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE next (@Nonnull final IJSExpression selector)
  {
    return next ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE next (@Nonnull final IJQuerySelector selector)
  {
    return next ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE next (@Nonnull final JQuerySelectorList selector)
  {
    return next ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE next (@Nonnull final EHTMLElement selector)
  {
    return next ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE next (@Nonnull final ICSSClassProvider selector)
  {
    return next ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextAll (@Nonnull final IJSExpression selector)
  {
    return nextAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextAll (@Nonnull final IJson selector)
  {
    return nextAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextAll (@Nonnull final IHCNode selector)
  {
    return nextAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextAll (@Nonnull final String selector)
  {
    return nextAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJSExpression selector)
  {
    return nextUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJQuerySelector selector)
  {
    return nextUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQuerySelectorList selector)
  {
    return nextUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final EHTMLElement selector)
  {
    return nextUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final ICSSClassProvider selector)
  {
    return nextUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJQuerySelector selector, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final EHTMLElement selector, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJSExpression selector, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJQuerySelector selector, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final EHTMLElement selector, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJSExpression selector, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJQuerySelector selector, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final EHTMLElement selector, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJSExpression selector, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJQuerySelector selector, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final EHTMLElement selector, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJSExpression selector, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final IJQuerySelector selector, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final EHTMLElement selector, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final String element)
  {
    return nextUntil ().arg (element);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQueryInvocation element)
  {
    return nextUntil ().arg (element);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final String element, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQueryInvocation element, @Nonnull final IJSExpression filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final String element, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQueryInvocation element, @Nonnull final IJQuerySelector filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final String element, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQueryInvocation element, @Nonnull final JQuerySelectorList filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final String element, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQueryInvocation element, @Nonnull final EHTMLElement filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final String element, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE nextUntil (@Nonnull final JQueryInvocation element, @Nonnull final ICSSClassProvider filter)
  {
    return nextUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final IJSExpression selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final IJQuerySelector selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final JQuerySelectorList selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final EHTMLElement selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final ICSSClassProvider selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final String selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final JSArray selector)
  {
    return _not ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final JSAnonymousFunction function)
  {
    return _not ().arg (function);
  }

  @Nonnull
  public IMPLTYPE _not (@Nonnull final JQueryInvocation selection)
  {
    return _not ().arg (selection);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events)
  {
    return off ().arg (events);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events)
  {
    return off ().arg (events);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events)
  {
    return off ().arg (events);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events)
  {
    return off ().arg (events);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events, @Nonnull final IJSExpression selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events, @Nonnull final IJSExpression selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events, @Nonnull final IJSExpression selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events, @Nonnull final IJSExpression selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events, @Nonnull final IJson selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events, @Nonnull final IJson selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events, @Nonnull final IJson selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events, @Nonnull final IJson selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events, @Nonnull final IHCNode selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events, @Nonnull final IHCNode selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events, @Nonnull final IHCNode selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events, @Nonnull final IHCNode selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events, @Nonnull final String selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events, @Nonnull final String selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events, @Nonnull final String selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events, @Nonnull final String selector)
  {
    return off ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events, @Nonnull final IJson selector, @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final IJson selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final IJson selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final IJson selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final IJson selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJSExpression events,
                       @Nonnull final String selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IJson events,
                       @Nonnull final String selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final IHCNode events,
                       @Nonnull final String selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE off (@Nonnull final String events,
                       @Nonnull final String selector,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return off ().arg (events).arg (selector).arg (handler);
  }

  @Nonnull
  public IMPLTYPE offset (@Nonnull final IJSExpression coordinates)
  {
    return offset ().arg (coordinates);
  }

  @Nonnull
  public IMPLTYPE offset (@Nonnull final JSAnonymousFunction function)
  {
    return offset ().arg (function);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events, @Nonnull final IJSExpression selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final IJSExpression selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final IJSExpression selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final IJSExpression selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events, @Nonnull final IJson selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final IJson selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final IJson selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final IJson selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events, @Nonnull final IHCNode selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final IHCNode selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final IHCNode selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final IHCNode selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events, @Nonnull final String selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final String selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final String selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final String selector)
  {
    return on ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final IJson selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final IJson selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final IJson selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final IHCNode selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final IHCNode selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final IHCNode selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events, @Nonnull final String selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events, @Nonnull final String selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events, @Nonnull final String selector, @Nonnull final IJSExpression data)
  {
    return on ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final IJSExpression handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IJSExpression selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IJson selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final IHCNode selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJson events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IHCNode events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final String events,
                      @Nonnull final String selector,
                      @Nonnull final IJSExpression data,
                      @Nonnull final JSAnonymousFunction handler)
  {
    return on ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE on (@Nonnull final IJSExpression events)
  {
    return on ().arg (events);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events, @Nonnull final IJson selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final IJson selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events, @Nonnull final IJson selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final IJson selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events, @Nonnull final IHCNode selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final IHCNode selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events, @Nonnull final IHCNode selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final IHCNode selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events, @Nonnull final String selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final String selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events, @Nonnull final String selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final String selector)
  {
    return one ().arg (events).arg (selector);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final IJson selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events, @Nonnull final IJson selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final IJson selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final IHCNode selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final IHCNode selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events, @Nonnull final String selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events, @Nonnull final String selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events, @Nonnull final String selector, @Nonnull final IJSExpression data)
  {
    return one ().arg (events).arg (selector).arg (data);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final IJSExpression handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IJSExpression selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IJson selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final IHCNode selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJson events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IHCNode events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final String events,
                       @Nonnull final String selector,
                       @Nonnull final IJSExpression data,
                       @Nonnull final JSAnonymousFunction handler)
  {
    return one ().arg (events).arg (selector).arg (data).arg (handler);
  }

  @Nonnull
  public IMPLTYPE one (@Nonnull final IJSExpression events)
  {
    return one ().arg (events);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final IJSExpression includeMargin)
  {
    return outerHeight ().arg (includeMargin);
  }

  @Nonnull
  public IMPLTYPE outerHeight (final boolean includeMargin)
  {
    return outerHeight ().arg (includeMargin);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final IJson value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final IHCNode value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final String value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (final int value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (final long value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final BigInteger value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (final double value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final BigDecimal value)
  {
    return outerHeight ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerHeight (@Nonnull final JSAnonymousFunction function)
  {
    return outerHeight ().arg (function);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final IJSExpression includeMargin)
  {
    return outerWidth ().arg (includeMargin);
  }

  @Nonnull
  public IMPLTYPE outerWidth (final boolean includeMargin)
  {
    return outerWidth ().arg (includeMargin);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final IJson value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final IHCNode value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final String value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (final int value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (final long value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final BigInteger value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (final double value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final BigDecimal value)
  {
    return outerWidth ().arg (value);
  }

  @Nonnull
  public IMPLTYPE outerWidth (@Nonnull final JSAnonymousFunction function)
  {
    return outerWidth ().arg (function);
  }

  @Nonnull
  public IMPLTYPE parent (@Nonnull final IJSExpression selector)
  {
    return parent ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parent (@Nonnull final IJQuerySelector selector)
  {
    return parent ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parent (@Nonnull final JQuerySelectorList selector)
  {
    return parent ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parent (@Nonnull final EHTMLElement selector)
  {
    return parent ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parent (@Nonnull final ICSSClassProvider selector)
  {
    return parent ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parents (@Nonnull final IJSExpression selector)
  {
    return parents ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parents (@Nonnull final IJQuerySelector selector)
  {
    return parents ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parents (@Nonnull final JQuerySelectorList selector)
  {
    return parents ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parents (@Nonnull final EHTMLElement selector)
  {
    return parents ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parents (@Nonnull final ICSSClassProvider selector)
  {
    return parents ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJSExpression selector)
  {
    return parentsUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJQuerySelector selector)
  {
    return parentsUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQuerySelectorList selector)
  {
    return parentsUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final EHTMLElement selector)
  {
    return parentsUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final ICSSClassProvider selector)
  {
    return parentsUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJQuerySelector selector, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final EHTMLElement selector, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJSExpression selector, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJQuerySelector selector, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final EHTMLElement selector, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJSExpression selector, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJQuerySelector selector, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final EHTMLElement selector, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJSExpression selector, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJQuerySelector selector, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final EHTMLElement selector, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJSExpression selector, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final IJQuerySelector selector, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final EHTMLElement selector, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final String element)
  {
    return parentsUntil ().arg (element);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQueryInvocation element)
  {
    return parentsUntil ().arg (element);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final String element, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQueryInvocation element, @Nonnull final IJSExpression filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final String element, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQueryInvocation element, @Nonnull final IJQuerySelector filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final String element, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQueryInvocation element, @Nonnull final JQuerySelectorList filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final String element, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQueryInvocation element, @Nonnull final EHTMLElement filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final String element, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE parentsUntil (@Nonnull final JQueryInvocation element, @Nonnull final ICSSClassProvider filter)
  {
    return parentsUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content)
  {
    return prepend ().arg (content);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content)
  {
    return prepend ().arg (content);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content)
  {
    return prepend ().arg (content);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content)
  {
    return prepend ().arg (content);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content)
  {
    return prepend ().arg (content);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content)
  {
    return prepend ().arg (content);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content, @Nonnull final IJSExpression content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content, @Nonnull final IJSExpression content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content, @Nonnull final IJSExpression content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content, @Nonnull final IJSExpression content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content, @Nonnull final IJSExpression content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content, @Nonnull final IJSExpression content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content, @Nonnull final IHCNode content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content, @Nonnull final IHCNode content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content, @Nonnull final IHCNode content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content, @Nonnull final IHCNode content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content, @Nonnull final IHCNode content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content, @Nonnull final IHCNode content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content, @Nonnull final String content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content, @Nonnull final String content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content, @Nonnull final String content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content, @Nonnull final String content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content, @Nonnull final String content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content, @Nonnull final String content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content, @Nonnull final EHTMLElement content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content, @Nonnull final EHTMLElement content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content, @Nonnull final EHTMLElement content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content, @Nonnull final EHTMLElement content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content, @Nonnull final EHTMLElement content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content, @Nonnull final EHTMLElement content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content, @Nonnull final JSArray content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content, @Nonnull final JSArray content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content, @Nonnull final JSArray content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content, @Nonnull final JSArray content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content, @Nonnull final JSArray content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content, @Nonnull final JSArray content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IJSExpression content, @Nonnull final JQueryInvocation content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final IHCNode content, @Nonnull final JQueryInvocation content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final String content, @Nonnull final JQueryInvocation content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final EHTMLElement content, @Nonnull final JQueryInvocation content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSArray content, @Nonnull final JQueryInvocation content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JQueryInvocation content, @Nonnull final JQueryInvocation content1)
  {
    return prepend ().arg (content).arg (content1);
  }

  @Nonnull
  public IMPLTYPE prepend (@Nonnull final JSAnonymousFunction function)
  {
    return prepend ().arg (function);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final IJSExpression target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final IJQuerySelector target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final JQuerySelectorList target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final EHTMLElement target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final ICSSClassProvider target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final IHCNode target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final String target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final JSArray target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prependTo (@Nonnull final JQueryInvocation target)
  {
    return prependTo ().arg (target);
  }

  @Nonnull
  public IMPLTYPE prev (@Nonnull final IJSExpression selector)
  {
    return prev ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prev (@Nonnull final IJQuerySelector selector)
  {
    return prev ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prev (@Nonnull final JQuerySelectorList selector)
  {
    return prev ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prev (@Nonnull final EHTMLElement selector)
  {
    return prev ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prev (@Nonnull final ICSSClassProvider selector)
  {
    return prev ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevAll (@Nonnull final IJSExpression selector)
  {
    return prevAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevAll (@Nonnull final IJQuerySelector selector)
  {
    return prevAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevAll (@Nonnull final JQuerySelectorList selector)
  {
    return prevAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevAll (@Nonnull final EHTMLElement selector)
  {
    return prevAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevAll (@Nonnull final ICSSClassProvider selector)
  {
    return prevAll ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJSExpression selector)
  {
    return prevUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJQuerySelector selector)
  {
    return prevUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQuerySelectorList selector)
  {
    return prevUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final EHTMLElement selector)
  {
    return prevUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final ICSSClassProvider selector)
  {
    return prevUntil ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJQuerySelector selector, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final EHTMLElement selector, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJSExpression selector, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJQuerySelector selector, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final EHTMLElement selector, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJSExpression selector, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJQuerySelector selector, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final EHTMLElement selector, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJSExpression selector, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJQuerySelector selector, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final EHTMLElement selector, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJSExpression selector, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final IJQuerySelector selector, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQuerySelectorList selector, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final EHTMLElement selector, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final ICSSClassProvider selector, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (selector).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final String element)
  {
    return prevUntil ().arg (element);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQueryInvocation element)
  {
    return prevUntil ().arg (element);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final String element, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQueryInvocation element, @Nonnull final IJSExpression filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final String element, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQueryInvocation element, @Nonnull final IJQuerySelector filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final String element, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQueryInvocation element, @Nonnull final JQuerySelectorList filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final String element, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQueryInvocation element, @Nonnull final EHTMLElement filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final String element, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE prevUntil (@Nonnull final JQueryInvocation element, @Nonnull final ICSSClassProvider filter)
  {
    return prevUntil ().arg (element).arg (filter);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final IJSExpression type)
  {
    return promise ().arg (type);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final IJson type)
  {
    return promise ().arg (type);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final IHCNode type)
  {
    return promise ().arg (type);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final String type)
  {
    return promise ().arg (type);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final IJSExpression type, @Nonnull final IJSExpression target)
  {
    return promise ().arg (type).arg (target);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final IJson type, @Nonnull final IJSExpression target)
  {
    return promise ().arg (type).arg (target);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final IHCNode type, @Nonnull final IJSExpression target)
  {
    return promise ().arg (type).arg (target);
  }

  @Nonnull
  public IMPLTYPE promise (@Nonnull final String type, @Nonnull final IJSExpression target)
  {
    return promise ().arg (type).arg (target);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IJSExpression propertyName)
  {
    return prop ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IJson propertyName)
  {
    return prop ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IHCNode propertyName)
  {
    return prop ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final String propertyName)
  {
    return prop ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IJSExpression propertyName, @Nonnull final IJSExpression value)
  {
    return prop ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IJson propertyName, @Nonnull final IJSExpression value)
  {
    return prop ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IHCNode propertyName, @Nonnull final IJSExpression value)
  {
    return prop ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final String propertyName, @Nonnull final IJSExpression value)
  {
    return prop ().arg (propertyName).arg (value);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IJSExpression propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return prop ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IJson propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return prop ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final IHCNode propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return prop ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE prop (@Nonnull final String propertyName, @Nonnull final JSAnonymousFunction function)
  {
    return prop ().arg (propertyName).arg (function);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements)
  {
    return pushStack ().arg (elements);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements)
  {
    return pushStack ().arg (elements);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final IJSExpression name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final IJSExpression name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final IJson name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final IJson name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final IHCNode name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final IHCNode name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final String name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final String name,
                             @Nonnull final IJSExpression arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final IJSExpression name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final IJSExpression name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final IJson name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final IJson name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final IHCNode name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final IHCNode name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final IJSExpression elements,
                             @Nonnull final String name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE pushStack (@Nonnull final JSArray elements,
                             @Nonnull final String name,
                             @Nonnull final JSArray arguments)
  {
    return pushStack ().arg (elements).arg (name).arg (arguments);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJSExpression queueName)
  {
    return queue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJson queueName)
  {
    return queue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IHCNode queueName)
  {
    return queue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final String queueName)
  {
    return queue ().arg (queueName);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJSExpression queueName, @Nonnull final IJSExpression newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJson queueName, @Nonnull final IJSExpression newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IHCNode queueName, @Nonnull final IJSExpression newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final String queueName, @Nonnull final IJSExpression newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJSExpression queueName, @Nonnull final JSArray newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJson queueName, @Nonnull final JSArray newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IHCNode queueName, @Nonnull final JSArray newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final String queueName, @Nonnull final JSArray newQueue)
  {
    return queue ().arg (queueName).arg (newQueue);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJSExpression queueName, @Nonnull final JSAnonymousFunction callback)
  {
    return queue ().arg (queueName).arg (callback);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IJson queueName, @Nonnull final JSAnonymousFunction callback)
  {
    return queue ().arg (queueName).arg (callback);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final IHCNode queueName, @Nonnull final JSAnonymousFunction callback)
  {
    return queue ().arg (queueName).arg (callback);
  }

  @Nonnull
  public IMPLTYPE queue (@Nonnull final String queueName, @Nonnull final JSAnonymousFunction callback)
  {
    return queue ().arg (queueName).arg (callback);
  }

  @Nonnull
  public IMPLTYPE ready (@Nonnull final IJSExpression handler)
  {
    return ready ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE ready (@Nonnull final JSAnonymousFunction handler)
  {
    return ready ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE remove (@Nonnull final IJSExpression selector)
  {
    return remove ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE remove (@Nonnull final IJson selector)
  {
    return remove ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE remove (@Nonnull final IHCNode selector)
  {
    return remove ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE remove (@Nonnull final String selector)
  {
    return remove ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE removeAttr (@Nonnull final IJSExpression attributeName)
  {
    return removeAttr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE removeAttr (@Nonnull final IJson attributeName)
  {
    return removeAttr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE removeAttr (@Nonnull final IHCNode attributeName)
  {
    return removeAttr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE removeAttr (@Nonnull final String attributeName)
  {
    return removeAttr ().arg (attributeName);
  }

  @Nonnull
  public IMPLTYPE removeClass (@Nonnull final IJSExpression className)
  {
    return removeClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE removeClass (@Nonnull final IJson className)
  {
    return removeClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE removeClass (@Nonnull final IHCNode className)
  {
    return removeClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE removeClass (@Nonnull final String className)
  {
    return removeClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE removeClass (@Nonnull final JSAnonymousFunction function)
  {
    return removeClass ().arg (function);
  }

  @Nonnull
  public IMPLTYPE removeData (@Nonnull final IJSExpression name)
  {
    return removeData ().arg (name);
  }

  @Nonnull
  public IMPLTYPE removeData (@Nonnull final IJson name)
  {
    return removeData ().arg (name);
  }

  @Nonnull
  public IMPLTYPE removeData (@Nonnull final IHCNode name)
  {
    return removeData ().arg (name);
  }

  @Nonnull
  public IMPLTYPE removeData (@Nonnull final String name)
  {
    return removeData ().arg (name);
  }

  @Nonnull
  public IMPLTYPE removeData (@Nonnull final JSArray list)
  {
    return removeData ().arg (list);
  }

  @Nonnull
  public IMPLTYPE removeProp (@Nonnull final IJSExpression propertyName)
  {
    return removeProp ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE removeProp (@Nonnull final IJson propertyName)
  {
    return removeProp ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE removeProp (@Nonnull final IHCNode propertyName)
  {
    return removeProp ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE removeProp (@Nonnull final String propertyName)
  {
    return removeProp ().arg (propertyName);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final IJSExpression target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final IJQuerySelector target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final JQuerySelectorList target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final EHTMLElement target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final ICSSClassProvider target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final JQueryInvocation target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final JSArray target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceAll (@Nonnull final String target)
  {
    return replaceAll ().arg (target);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final IJSExpression newContent)
  {
    return replaceWith ().arg (newContent);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final IHCNode newContent)
  {
    return replaceWith ().arg (newContent);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final String newContent)
  {
    return replaceWith ().arg (newContent);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final EHTMLElement newContent)
  {
    return replaceWith ().arg (newContent);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final JSArray newContent)
  {
    return replaceWith ().arg (newContent);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final JQueryInvocation newContent)
  {
    return replaceWith ().arg (newContent);
  }

  @Nonnull
  public IMPLTYPE replaceWith (@Nonnull final JSAnonymousFunction function)
  {
    return replaceWith ().arg (function);
  }

  @Nonnull
  public IMPLTYPE resize (@Nonnull final IJSExpression handler)
  {
    return resize ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE resize (@Nonnull final JSAnonymousFunction handler)
  {
    return resize ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE resize (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return resize ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE resize (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return resize ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE scroll (@Nonnull final IJSExpression handler)
  {
    return scroll ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE scroll (@Nonnull final JSAnonymousFunction handler)
  {
    return scroll ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE scroll (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return scroll ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE scroll (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return scroll ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE scrollLeft (@Nonnull final IJSExpression value)
  {
    return scrollLeft ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollLeft (final int value)
  {
    return scrollLeft ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollLeft (final long value)
  {
    return scrollLeft ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollLeft (@Nonnull final BigInteger value)
  {
    return scrollLeft ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollLeft (final double value)
  {
    return scrollLeft ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollLeft (@Nonnull final BigDecimal value)
  {
    return scrollLeft ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollTop (@Nonnull final IJSExpression value)
  {
    return scrollTop ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollTop (final int value)
  {
    return scrollTop ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollTop (final long value)
  {
    return scrollTop ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollTop (@Nonnull final BigInteger value)
  {
    return scrollTop ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollTop (final double value)
  {
    return scrollTop ().arg (value);
  }

  @Nonnull
  public IMPLTYPE scrollTop (@Nonnull final BigDecimal value)
  {
    return scrollTop ().arg (value);
  }

  @Nonnull
  public IMPLTYPE select (@Nonnull final IJSExpression handler)
  {
    return select ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE select (@Nonnull final JSAnonymousFunction handler)
  {
    return select ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE select (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return select ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE select (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return select ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE show (@Nonnull final IJSExpression duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (final int duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (final long duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (@Nonnull final BigInteger duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (final double duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (@Nonnull final BigDecimal duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (@Nonnull final IJson duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (@Nonnull final IHCNode duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE show (@Nonnull final String duration)
  {
    return show ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE siblings (@Nonnull final IJSExpression selector)
  {
    return siblings ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE siblings (@Nonnull final IJQuerySelector selector)
  {
    return siblings ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE siblings (@Nonnull final JQuerySelectorList selector)
  {
    return siblings ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE siblings (@Nonnull final EHTMLElement selector)
  {
    return siblings ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE siblings (@Nonnull final ICSSClassProvider selector)
  {
    return siblings ().arg (selector);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final IJSExpression start)
  {
    return slice ().arg (start);
  }

  @Nonnull
  public IMPLTYPE slice (final int start)
  {
    return slice ().arg (start);
  }

  @Nonnull
  public IMPLTYPE slice (final long start)
  {
    return slice ().arg (start);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final BigInteger start)
  {
    return slice ().arg (start);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final IJSExpression start, @Nonnull final IJSExpression end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final int start, @Nonnull final IJSExpression end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final long start, @Nonnull final IJSExpression end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final BigInteger start, @Nonnull final IJSExpression end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final IJSExpression start, final int end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final int start, final int end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final long start, final int end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final BigInteger start, final int end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final IJSExpression start, final long end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final int start, final long end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final long start, final long end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final BigInteger start, final long end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final IJSExpression start, @Nonnull final BigInteger end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final int start, @Nonnull final BigInteger end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (final long start, @Nonnull final BigInteger end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE slice (@Nonnull final BigInteger start, @Nonnull final BigInteger end)
  {
    return slice ().arg (start).arg (end);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression clearQueue)
  {
    return stop ().arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (final boolean clearQueue)
  {
    return stop ().arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression clearQueue, @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (final boolean clearQueue, @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (final boolean clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue)
  {
    return stop ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue)
  {
    return stop ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue)
  {
    return stop ().arg (queue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue, @Nonnull final IJSExpression clearQueue)
  {
    return stop ().arg (queue).arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue, @Nonnull final IJSExpression clearQueue)
  {
    return stop ().arg (queue).arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue, @Nonnull final IJSExpression clearQueue)
  {
    return stop ().arg (queue).arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue, final boolean clearQueue)
  {
    return stop ().arg (queue).arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue, final boolean clearQueue)
  {
    return stop ().arg (queue).arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue, final boolean clearQueue)
  {
    return stop ().arg (queue).arg (clearQueue);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression queue,
                        @Nonnull final IJSExpression clearQueue,
                        @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue,
                        @Nonnull final IJSExpression clearQueue,
                        @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue,
                        @Nonnull final IJSExpression clearQueue,
                        @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue,
                        @Nonnull final IJSExpression clearQueue,
                        @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression queue,
                        final boolean clearQueue,
                        @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue, final boolean clearQueue, @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue, final boolean clearQueue, @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue, final boolean clearQueue, @Nonnull final IJSExpression jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression queue,
                        @Nonnull final IJSExpression clearQueue,
                        final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue, @Nonnull final IJSExpression clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue, @Nonnull final IJSExpression clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue, @Nonnull final IJSExpression clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJSExpression queue, final boolean clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IJson queue, final boolean clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final IHCNode queue, final boolean clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE stop (@Nonnull final String queue, final boolean clearQueue, final boolean jumpToEnd)
  {
    return stop ().arg (queue).arg (clearQueue).arg (jumpToEnd);
  }

  @Nonnull
  public IMPLTYPE submit (@Nonnull final IJSExpression handler)
  {
    return submit ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE submit (@Nonnull final JSAnonymousFunction handler)
  {
    return submit ().arg (handler);
  }

  @Nonnull
  public IMPLTYPE submit (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return submit ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE submit (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return submit ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final IJSExpression text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final IJson text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final IHCNode text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final String text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (final int text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (final long text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final BigInteger text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (final double text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final BigDecimal text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (final boolean text)
  {
    return text ().arg (text);
  }

  @Nonnull
  public IMPLTYPE text (@Nonnull final JSAnonymousFunction function)
  {
    return text ().arg (function);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression handler, @Nonnull final IJSExpression handler1)
  {
    return toggle ().arg (handler).arg (handler1);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction handler, @Nonnull final IJSExpression handler1)
  {
    return toggle ().arg (handler).arg (handler1);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression handler, @Nonnull final JSAnonymousFunction handler1)
  {
    return toggle ().arg (handler).arg (handler1);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction handler, @Nonnull final JSAnonymousFunction handler1)
  {
    return toggle ().arg (handler).arg (handler1);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression handler,
                          @Nonnull final IJSExpression handler1,
                          @Nonnull final IJSExpression handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction handler,
                          @Nonnull final IJSExpression handler1,
                          @Nonnull final IJSExpression handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression handler,
                          @Nonnull final JSAnonymousFunction handler1,
                          @Nonnull final IJSExpression handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction handler,
                          @Nonnull final JSAnonymousFunction handler1,
                          @Nonnull final IJSExpression handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression handler,
                          @Nonnull final IJSExpression handler1,
                          @Nonnull final JSAnonymousFunction handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction handler,
                          @Nonnull final IJSExpression handler1,
                          @Nonnull final JSAnonymousFunction handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression handler,
                          @Nonnull final JSAnonymousFunction handler1,
                          @Nonnull final JSAnonymousFunction handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE toggle (@Nonnull final JSAnonymousFunction handler,
                          @Nonnull final JSAnonymousFunction handler1,
                          @Nonnull final JSAnonymousFunction handler2)
  {
    return toggle ().arg (handler).arg (handler1).arg (handler2);
  }

  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJSExpression duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (final int duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (final long duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (@Nonnull final BigInteger duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (final double duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (@Nonnull final BigDecimal duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IJson duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (@Nonnull final IHCNode duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (@Nonnull final String duration)
  {
    return toggle ().arg (duration);
  }

  @Nonnull
  public IMPLTYPE toggle (final boolean display)
  {
    return toggle ().arg (display);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IJSExpression className)
  {
    return toggleClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IJson className)
  {
    return toggleClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IHCNode className)
  {
    return toggleClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final String className)
  {
    return toggleClass ().arg (className);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IJSExpression className, @Nonnull final IJSExpression state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IJson className, @Nonnull final IJSExpression state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IHCNode className, @Nonnull final IJSExpression state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final String className, @Nonnull final IJSExpression state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IJSExpression className, final boolean state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IJson className, final boolean state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final IHCNode className, final boolean state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final String className, final boolean state)
  {
    return toggleClass ().arg (className).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (final boolean state)
  {
    return toggleClass ().arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final JSAnonymousFunction function)
  {
    return toggleClass ().arg (function);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final JSAnonymousFunction function, @Nonnull final IJSExpression state)
  {
    return toggleClass ().arg (function).arg (state);
  }

  @Nonnull
  public IMPLTYPE toggleClass (@Nonnull final JSAnonymousFunction function, final boolean state)
  {
    return toggleClass ().arg (function).arg (state);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IJSExpression eventType)
  {
    return trigger ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IJson eventType)
  {
    return trigger ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IHCNode eventType)
  {
    return trigger ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final String eventType)
  {
    return trigger ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IJSExpression eventType, @Nonnull final IJSExpression extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IJson eventType, @Nonnull final IJSExpression extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IHCNode eventType, @Nonnull final IJSExpression extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final String eventType, @Nonnull final IJSExpression extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IJSExpression eventType, @Nonnull final JSArray extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IJson eventType, @Nonnull final JSArray extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final IHCNode eventType, @Nonnull final JSArray extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE trigger (@Nonnull final String eventType, @Nonnull final JSArray extraParameters)
  {
    return trigger ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IJSExpression eventType)
  {
    return triggerHandler ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IJson eventType)
  {
    return triggerHandler ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IHCNode eventType)
  {
    return triggerHandler ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final String eventType)
  {
    return triggerHandler ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IJSExpression eventType, @Nonnull final IJSExpression extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IJson eventType, @Nonnull final IJSExpression extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IHCNode eventType, @Nonnull final IJSExpression extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final String eventType, @Nonnull final IJSExpression extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IJSExpression eventType, @Nonnull final JSArray extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IJson eventType, @Nonnull final JSArray extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final IHCNode eventType, @Nonnull final JSArray extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE triggerHandler (@Nonnull final String eventType, @Nonnull final JSArray extraParameters)
  {
    return triggerHandler ().arg (eventType).arg (extraParameters);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJSExpression eventType)
  {
    return unbind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJson eventType)
  {
    return unbind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IHCNode eventType)
  {
    return unbind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final String eventType)
  {
    return unbind ().arg (eventType);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJSExpression eventType, @Nonnull final IJSExpression handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJson eventType, @Nonnull final IJSExpression handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IHCNode eventType, @Nonnull final IJSExpression handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final String eventType, @Nonnull final IJSExpression handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJSExpression eventType, @Nonnull final JSAnonymousFunction handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJson eventType, @Nonnull final JSAnonymousFunction handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IHCNode eventType, @Nonnull final JSAnonymousFunction handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final String eventType, @Nonnull final JSAnonymousFunction handler)
  {
    return unbind ().arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJSExpression eventType, final boolean _false)
  {
    return unbind ().arg (eventType).arg (_false);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IJson eventType, final boolean _false)
  {
    return unbind ().arg (eventType).arg (_false);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final IHCNode eventType, final boolean _false)
  {
    return unbind ().arg (eventType).arg (_false);
  }

  @Nonnull
  public IMPLTYPE unbind (@Nonnull final String eventType, final boolean _false)
  {
    return unbind ().arg (eventType).arg (_false);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector, @Nonnull final IJSExpression eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector, @Nonnull final IJSExpression eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector, @Nonnull final IJSExpression eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector, @Nonnull final IJSExpression eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector, @Nonnull final IJson eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector, @Nonnull final IJson eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector, @Nonnull final IJson eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector, @Nonnull final IJson eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector, @Nonnull final IHCNode eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector, @Nonnull final IHCNode eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector, @Nonnull final IHCNode eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector, @Nonnull final IHCNode eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector, @Nonnull final String eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector, @Nonnull final String eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector, @Nonnull final String eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector, @Nonnull final String eventType)
  {
    return undelegate ().arg (selector).arg (eventType);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final String eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final String eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final String eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final String eventType,
                              @Nonnull final IJSExpression handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final IJSExpression eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final IJson eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final IHCNode eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression selector,
                              @Nonnull final String eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson selector,
                              @Nonnull final String eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode selector,
                              @Nonnull final String eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String selector,
                              @Nonnull final String eventType,
                              @Nonnull final JSAnonymousFunction handler)
  {
    return undelegate ().arg (selector).arg (eventType).arg (handler);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJSExpression namespace)
  {
    return undelegate ().arg (namespace);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IJson namespace)
  {
    return undelegate ().arg (namespace);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final IHCNode namespace)
  {
    return undelegate ().arg (namespace);
  }

  @Nonnull
  public IMPLTYPE undelegate (@Nonnull final String namespace)
  {
    return undelegate ().arg (namespace);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE unload (@Nonnull final IJSExpression handler)
  {
    return unload ().arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE unload (@Nonnull final JSAnonymousFunction handler)
  {
    return unload ().arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE unload (@Nonnull final IJSExpression eventData, @Nonnull final IJSExpression handler)
  {
    return unload ().arg (eventData).arg (handler);
  }

  @Deprecated
  @Nonnull
  public IMPLTYPE unload (@Nonnull final IJSExpression eventData, @Nonnull final JSAnonymousFunction handler)
  {
    return unload ().arg (eventData).arg (handler);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final IJSExpression value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final IJson value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final IHCNode value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final String value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (final int value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (final long value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final BigInteger value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (final double value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final BigDecimal value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final JSArray value)
  {
    return val ().arg (value);
  }

  @Nonnull
  public IMPLTYPE val (@Nonnull final JSAnonymousFunction function)
  {
    return val ().arg (function);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final IJSExpression value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final IJson value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final IHCNode value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final String value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (final int value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (final long value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final BigInteger value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (final double value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final BigDecimal value)
  {
    return width ().arg (value);
  }

  @Nonnull
  public IMPLTYPE width (@Nonnull final JSAnonymousFunction function)
  {
    return width ().arg (function);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final IJSExpression wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final IJQuerySelector wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final JQuerySelectorList wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final EHTMLElement wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final ICSSClassProvider wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final IHCNode wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final String wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final JQueryInvocation wrappingElement)
  {
    return wrap ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrap (@Nonnull final JSAnonymousFunction function)
  {
    return wrap ().arg (function);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final IJSExpression wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final IJQuerySelector wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final JQuerySelectorList wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final EHTMLElement wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final ICSSClassProvider wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final IHCNode wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final String wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final JQueryInvocation wrappingElement)
  {
    return wrapAll ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapAll (@Nonnull final JSAnonymousFunction function)
  {
    return wrapAll ().arg (function);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final IJSExpression wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final IHCNode wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final String wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final IJQuerySelector wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final JQuerySelectorList wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final EHTMLElement wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final ICSSClassProvider wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final JQueryInvocation wrappingElement)
  {
    return wrapInner ().arg (wrappingElement);
  }

  @Nonnull
  public IMPLTYPE wrapInner (@Nonnull final JSAnonymousFunction function)
  {
    return wrapInner ().arg (function);
  }

}
