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
package com.helger.html.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation that denotes all HTML elements that are marked deprecated
 * in XHTML1.<br>
 * Source: http://www.w3.org/2002/08/xhtml/xhtml1-transitional.xsd<br>
 * Source: http://webdesign.about.com/od/htmltags/a/bltags_deprctag.htm
 * 
 * @author Philip Helger
 */
@Documented
@Retention (RetentionPolicy.RUNTIME)
@Target ({ ElementType.TYPE })
public @interface DeprecatedInXHTML1
{
  String value() default "";
}
