package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;BLOCKQUOTE&gt; element
 * 
 * @author Philip Helger
 */
public class HCBlockQuote extends AbstractHCElementWithChildren <HCBlockQuote>
{
  /**
   * Create a new BLOCKQUOTE element
   */
  public HCBlockQuote ()
  {
    super (EHTMLElement.BLOCKQUOTE);
  }
}
