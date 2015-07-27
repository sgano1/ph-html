package com.helger.html.hc.api;

public enum EHCScriptInlineMode
{
 /**
  * Emit JS code as plain text, but XML masked. The XML masking rules for text
  * nodes apply.
  *
  * <pre>
  * &lt;script&gt;my &amp;lt; script&lt;/script&gt;
  * </pre>
  */
  PLAIN_TEXT,
 /**
  * Emit JS code as plain text, but without XML masking.
  *
  * <pre>
  * &lt;script&gt;my &lt; script&lt;/script&gt;
  * </pre>
  */
  PLAIN_TEXT_NO_ESCAPE,
 /**
  * Wrap the whole JS code as plain text in XML comments.
  *
  * <pre>
  * &lt;script&gt;&lt;!--
  * my &lt; script
  * //--&gt;&lt;/script&gt;
  * </pre>
  */
  PLAIN_TEXT_WRAPPED_IN_COMMENT,
 /**
  * Wrap the whole JS code in an XML CDATA container.
  *
  * <pre>
  * &lt;script&gt;&lt;![CDATA[my &lt; script]]&gt;&lt;/script&gt;
  * </pre>
  */
  CDATA,
 /**
  * Wrap the whole JS code in an XML CDATA container inside a JS comment
  * Tested OK with FF6, Opera11, Chrome13, IE8, IE9
  *
  * <pre>
  * &lt;script&gt;//&lt;![CDATA[
  * my &lt; script
  * //]]&gt;&lt;/script&gt;
  * </pre>
  */
  CDATA_IN_COMMENT;
}