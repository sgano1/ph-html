package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;LI&gt; element
 * 
 * @author Philip Helger
 */
public class HCLI extends AbstractHCElementWithChildren <HCLI>
{
  /**
   * Create a new LI element
   */
  public HCLI ()
  {
    super (EHTMLElement.LI);
  }
}
