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
package com.helger.html.js.builder;

import javax.annotation.Nonnull;

import com.helger.commons.annotations.CodingStyleguideUnaware;
import com.helger.json.IJson;

/**
 * A JS expression.
 *
 * @author Philip Helger
 */
public interface IJSExpression extends IJSGeneratable
{
  /**
   * @return "-[this]" from "[this]".
   */
  @Nonnull
  IJSExpression minus ();

  /**
   * @return "([this]);" from "[this]".
   */
  @Nonnull
  IJSExpression inParantheses ();

  /**
   * @return "![this]" from "[this]".
   */
  @Nonnull
  IJSExpression not ();

  /**
   * @return "~[this]" from "[this]".
   */
  @Nonnull
  IJSExpression complement ();

  /**
   * @return "[this]++" from "[this]".
   */
  @Nonnull
  IJSExpression incrPostfix ();

  /**
   * @return "++[this]" from "[this]".
   */
  @Nonnull
  IJSExpression incrPrefix ();

  /**
   * @return "[this]--" from "[this]".
   */
  @Nonnull
  IJSExpression decrPostfix ();

  /**
   * @return "--[this]" from "[this]".
   */
  @Nonnull
  IJSExpression decrPrefix ();

  /**
   * @return "typeof [this]" from "[this]"
   */
  @Nonnull
  IJSExpression typeof ();

  /**
   * @param aType
   *        The type to compare against
   * @return "typeof [this] === typename" from "[this]"
   */
  @Nonnull
  IJSExpression isTypeof (@Nonnull AbstractJSType aType);

  /**
   * @param aType
   *        The type to compare against
   * @return "typeof [this] !== typename" from "[this]"
   */
  @Nonnull
  IJSExpression isNotTypeof (@Nonnull AbstractJSType aType);

  /**
   * @return "typeof [this] === undefined" or "[this] === undefined" from
   *         "[this]"
   */
  @Nonnull
  IJSExpression isUndefined ();

  /**
   * @return "typeof [this] !== undefined" or "[this] !== undefined" from
   *         "[this]"
   */
  @Nonnull
  IJSExpression isNotUndefined ();

  /**
   * @param cValue
   *        constant char to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (char cValue);

  /**
   * @param dValue
   *        constant value to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (double dValue);

  /**
   * @param fValue
   *        constant value to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (float fValue);

  /**
   * @param nValue
   *        constant value to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (int nValue);

  /**
   * @param nValue
   *        constant value to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (long nValue);

  /**
   * @param sValue
   *        constant String value to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull String sValue);

  /**
   * @param aExpr
   *        value to add
   * @return "[this]+[right]"
   */
  @Nonnull
  IJSExpression plus (@Nonnull IJSExpression aExpr);

  /**
   * @param dValue
   *        constant value to subtract
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (double dValue);

  /**
   * @param fValue
   *        constant value to subtract
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (float fValue);

  /**
   * @param nValue
   *        constant value to subtract
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (int nValue);

  /**
   * @param nValue
   *        constant value to subtract
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (long nValue);

  /**
   * @param aExpr
   *        value to subtract
   * @return "[this]-[right]"
   */
  @Nonnull
  IJSExpression minus (@Nonnull IJSExpression aExpr);

  /**
   * @param dValue
   *        constant value to multiply with
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (double dValue);

  /**
   * @param fValue
   *        constant value to multiply with
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (float fValue);

  /**
   * @param nValue
   *        constant value to multiply with
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (int nValue);

  /**
   * @param nValue
   *        constant value to multiply with
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (long nValue);

  /**
   * @param aExpr
   *        value to multiply with
   * @return "[this]*[right]"
   */
  @Nonnull
  IJSExpression mul (@Nonnull IJSExpression aExpr);

  /**
   * @param dValue
   *        constant value to divide through
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (double dValue);

  /**
   * @param fValue
   *        constant value to divide through
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (float fValue);

  /**
   * @param nValue
   *        constant value to divide through
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (int nValue);

  /**
   * @param nValue
   *        constant value to divide through
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (long nValue);

  /**
   * @param aExpr
   *        value to divide through
   * @return "[this]/[right]"
   */
  @Nonnull
  IJSExpression div (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression mod (int nValue);

  @Nonnull
  IJSExpression mod (long nValue);

  /**
   * @param aExpr
   *        value to modulo against
   * @return "[this]%[right]"
   */
  @Nonnull
  IJSExpression mod (@Nonnull IJSExpression aExpr);

  /**
   * @param nValue
   *        constant value to shift left
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (int nValue);

  /**
   * @param nValue
   *        constant value to shift left
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (long nValue);

  /**
   * @param aExpr
   *        value to shift left
   * @return "[this]&lt;&lt;[right]"
   */
  @Nonnull
  IJSExpression shl (@Nonnull IJSExpression aExpr);

  /**
   * @param nValue
   *        constant value to shift right
   * @return "[this]&gt;&gt;[right]"
   */
  @Nonnull
  IJSExpression shr (int nValue);

  /**
   * @param nValue
   *        constant value to shift right
   * @return "[this]&gt;&gt;[right]"
   */
  @Nonnull
  IJSExpression shr (long nValue);

  /**
   * @param aExpr
   *        value to shift right
   * @return "[this]&gt;&gt;[right]"
   */
  @Nonnull
  IJSExpression shr (@Nonnull IJSExpression aExpr);

  /**
   * @param nValue
   *        constant value to shift right with zero padding
   * @return "[this]&gt;&gt;&gt;[right]"
   */
  @Nonnull
  IJSExpression shrz (int nValue);

  /**
   * @param nValue
   *        constant value to shift right with zero padding
   * @return "[this]&gt;&gt;&gt;[right]"
   */
  @Nonnull
  IJSExpression shrz (long nValue);

  /**
   * @param aExpr
   *        value to shift right with zero padding
   * @return "[this]&gt;&gt;&gt;[right]"
   */
  @Nonnull
  IJSExpression shrz (@Nonnull IJSExpression aExpr);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (int nValue);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (long nValue);

  /** Bit-wise AND '&amp;'. */
  @Nonnull
  IJSExpression band (@Nonnull IJSExpression aExpr);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (int nValue);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (long nValue);

  /** Bit-wise OR '|'. */
  @Nonnull
  IJSExpression bor (@Nonnull IJSExpression aExpr);

  /** Logical AND '&amp;&amp;'. */
  @Nonnull
  IJSExpression cand (@Nonnull IJSExpression aExpr);

  /** Logical OR '||'. */
  @Nonnull
  IJSExpression cor (@Nonnull IJSExpression aExpr);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (int nValue);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (long nValue);

  /** XOR '^'. */
  @Nonnull
  IJSExpression xor (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression lt (double dValue);

  @Nonnull
  IJSExpression lt (float fValue);

  @Nonnull
  IJSExpression lt (int nValue);

  @Nonnull
  IJSExpression lt (long nValue);

  /** Lower than '&lt;'. */
  @Nonnull
  IJSExpression lt (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression lte (double dValue);

  @Nonnull
  IJSExpression lte (float fValue);

  @Nonnull
  IJSExpression lte (int nValue);

  @Nonnull
  IJSExpression lte (long nValue);

  /** Lower than or equal '&lt;='. */
  @Nonnull
  IJSExpression lte (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression gt (double dValue);

  @Nonnull
  IJSExpression gt (float fValue);

  @Nonnull
  IJSExpression gt (int nValue);

  @Nonnull
  IJSExpression gt (long nValue);

  /** Greater than '&gt;'. */
  @Nonnull
  IJSExpression gt (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression gte (double dValue);

  @Nonnull
  IJSExpression gte (float fValue);

  @Nonnull
  IJSExpression gte (int nValue);

  @Nonnull
  IJSExpression gte (long nValue);

  /** Greater than or equal '&gt;='. */
  @Nonnull
  IJSExpression gte (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression eq (boolean bValue);

  @Nonnull
  IJSExpression eq (char cValue);

  @Nonnull
  IJSExpression eq (float fValue);

  @Nonnull
  IJSExpression eq (double dValue);

  @Nonnull
  IJSExpression eq (int nValue);

  @Nonnull
  IJSExpression eq (long nValue);

  @Nonnull
  IJSExpression eq (@Nonnull String sValue);

  @Nonnull
  IJSExpression eq (@Nonnull IJson aValue);

  /** Equals '=='. */
  @Nonnull
  IJSExpression eq (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression eeq (boolean bValue);

  @Nonnull
  IJSExpression eeq (char cValue);

  @Nonnull
  IJSExpression eeq (float fValue);

  @Nonnull
  IJSExpression eeq (double dValue);

  @Nonnull
  IJSExpression eeq (int nValue);

  @Nonnull
  IJSExpression eeq (long nValue);

  @Nonnull
  IJSExpression eeq (@Nonnull String sValue);

  @Nonnull
  IJSExpression eeq (@Nonnull IJson aValue);

  /** Exactly equals '==='. */
  @Nonnull
  IJSExpression eeq (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression ne (boolean bValue);

  @Nonnull
  IJSExpression ne (char cValue);

  @Nonnull
  IJSExpression ne (float fValue);

  @Nonnull
  IJSExpression ne (double dValue);

  @Nonnull
  IJSExpression ne (int nValue);

  @Nonnull
  IJSExpression ne (long nValue);

  @Nonnull
  IJSExpression ne (@Nonnull String sValue);

  @Nonnull
  IJSExpression ne (@Nonnull IJson aValue);

  /** Not equals '!='. */
  @Nonnull
  IJSExpression ne (@Nonnull IJSExpression aExpr);

  @Nonnull
  IJSExpression ene (boolean bValue);

  @Nonnull
  IJSExpression ene (char cValue);

  @Nonnull
  IJSExpression ene (float fValue);

  @Nonnull
  IJSExpression ene (double dValue);

  @Nonnull
  IJSExpression ene (int nValue);

  @Nonnull
  IJSExpression ene (long nValue);

  @Nonnull
  IJSExpression ene (@Nonnull String sValue);

  @Nonnull
  IJSExpression ene (@Nonnull IJson aValue);

  /** Exactly not equals '!=='. */
  @Nonnull
  IJSExpression ene (@Nonnull IJSExpression aExpr);

  /** instanceof */
  @Nonnull
  @CodingStyleguideUnaware
  IJSExpression _instanceof (@Nonnull AbstractJSType aType);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (@Nonnull JSMethod aMethod);

  /**
   * @return "[this].[method]". Arguments shall be added to the returned
   *         {@link JSInvocation} object.
   */
  @Nonnull
  JSInvocation invoke (@Nonnull String sMethod);

  @Nonnull
  JSFieldRef ref (@Nonnull JSVar aField);

  @Nonnull
  JSFieldRef ref (@Nonnull String sField);

  @Nonnull
  JSArrayCompRef component (char cIndex);

  @Nonnull
  JSArrayCompRef component (int nIndex);

  @Nonnull
  JSArrayCompRef component (long nIndex);

  @Nonnull
  JSArrayCompRef component (@Nonnull String sIndex);

  @Nonnull
  JSArrayCompRef component (@Nonnull IJSExpression aExpr);
}
