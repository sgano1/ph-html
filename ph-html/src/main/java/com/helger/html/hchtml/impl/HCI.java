package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;I&gt; element
 * 
 * @author Philip Helger
 */
public class HCI extends AbstractHCElementWithChildren <HCI>
{
  /**
   * Create a new I element
   */
  public HCI ()
  {
    super (EHTMLElement.I);
  }
}
