package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;B&gt; element
 * 
 * @author Philip Helger
 */
public class HCB extends AbstractHCElementWithChildren <HCB>
{
  /**
   * Create a new B element
   */
  public HCB ()
  {
    super (EHTMLElement.B);
  }
}
