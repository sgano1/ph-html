package com.helger.html.hc.html.script;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.html.AbstractHCElementWithChildren;

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
