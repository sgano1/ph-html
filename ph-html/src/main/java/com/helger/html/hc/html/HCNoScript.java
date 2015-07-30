package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;NOSCRIPT&gt; element
 * 
 * @author Philip Helger
 */
public class HCNoScript extends AbstractHCElementWithChildren <HCNoScript>
{
  /**
   * Create a new NOSCRIPT element
   */
  public HCNoScript ()
  {
    super (EHTMLElement.NOSCRIPT);
  }
}
