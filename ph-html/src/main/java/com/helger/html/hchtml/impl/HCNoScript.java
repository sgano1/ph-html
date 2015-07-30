package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

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
