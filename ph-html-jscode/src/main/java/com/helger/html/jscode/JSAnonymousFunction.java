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
package com.helger.html.jscode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.equals.EqualsHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;

/**
 * An anonymous function (a function without a name)
 *
 * @author Philip Helger
 */
public class JSAnonymousFunction extends AbstractJSExpression
{
  /**
   * List of parameters for this function's declaration
   */
  private final List <JSVar> m_aParams = new ArrayList <JSVar> ();

  /**
   * JBlock of statements that makes up the body this function
   */
  private JSBlock m_aBody;

  /**
   * Default constructor
   */
  public JSAnonymousFunction ()
  {}

  /**
   * Constructor for simple functions
   *
   * @param aBody
   *        The body statement. May be <code>null</code>.
   */
  public JSAnonymousFunction (@Nullable final IJSStatement aBody)
  {
    if (aBody != null)
      body ().add (aBody);
  }

  public JSAnonymousFunction (@Nullable final JSVar aParam, @Nullable final IJSStatement aBody)
  {
    if (aParam != null)
      m_aParams.add (aParam);
    if (aBody != null)
      body ().add (aBody);
  }

  public JSAnonymousFunction (@Nullable final Collection <JSVar> aParams, @Nullable final IJSStatement aBody)
  {
    if (aParams != null)
      m_aParams.addAll (aParams);
    if (aBody != null)
      body ().add (aBody);
  }

  public JSAnonymousFunction (@Nullable final JSBlock aBody)
  {
    m_aBody = aBody;
  }

  public JSAnonymousFunction (@Nullable final JSVar aParam, @Nullable final JSBlock aBody)
  {
    if (aParam != null)
      m_aParams.add (aParam);
    m_aBody = aBody;
  }

  public JSAnonymousFunction (@Nullable final Collection <JSVar> aParams, @Nullable final JSBlock aBody)
  {
    if (aParams != null)
      m_aParams.addAll (aParams);
    m_aBody = aBody;
  }

  /**
   * Returns the list of variable of this function.
   *
   * @return List of parameters of this function. This list is not modifiable.
   */
  @Nonnull
  @ReturnsMutableCopy
  public List <JSVar> params ()
  {
    return CollectionHelper.newList (m_aParams);
  }

  /**
   * Add the specified variable to the list of parameters for this function
   * signature.
   *
   * @param sName
   *        Name of the parameter being added
   * @return New parameter variable
   */
  @Nonnull
  public JSVar param (@Nonnull @Nonempty final String sName)
  {
    final JSVar aVar = new JSVar (sName, null);
    m_aParams.add (aVar);
    return aVar;
  }

  @Nonnegative
  public int getParamCount ()
  {
    return m_aParams.size ();
  }

  @Nullable
  public JSVar getParamAtIndex (final int nIndex)
  {
    return CollectionHelper.getSafe (m_aParams, nIndex);
  }

  /**
   * Get the block that makes up body of this function
   *
   * @return Body of function
   */
  @Nonnull
  public JSBlock body ()
  {
    if (m_aBody == null)
      m_aBody = new JSBlock ().newlineAtEnd (false);
    return m_aBody;
  }

  @Nonnull
  public JSInvocation invoke ()
  {
    return new JSInvocation (this);
  }

  public void generate (final JSFormatter aFormatter)
  {
    aFormatter.plain ("function").plain ('(');
    boolean bFirst = true;
    for (final JSVar aParam : m_aParams)
    {
      if (bFirst)
        bFirst = false;
      else
        aFormatter.plain (',');
      aFormatter.var (aParam);
    }
    aFormatter.plain (')').stmt (body ());
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (!super.equals (o))
      return false;
    final JSAnonymousFunction rhs = (JSAnonymousFunction) o;
    return m_aParams.equals (rhs.m_aParams) && EqualsHelper.equals (m_aBody, rhs.m_aBody);
  }

  @Override
  public int hashCode ()
  {
    return HashCodeGenerator.getDerived (super.hashCode ()).append (m_aParams).append (m_aBody).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return ToStringGenerator.getDerived (super.toString ())
                            .appendIfNotEmpty ("params", m_aParams)
                            .append ("body", m_aBody)
                            .toString ();
  }
}