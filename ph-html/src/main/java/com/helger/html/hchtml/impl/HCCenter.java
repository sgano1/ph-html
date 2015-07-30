package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;CENTER&gt; element
 * 
 * @author Philip Helger
 */
public class HCCenter extends AbstractHCElementWithChildren <HCCenter>
{
  /**
   * Create a new CENTER element
   */
  public HCCenter ()
  {
    super (EHTMLElement.CENTER);
  }
}
