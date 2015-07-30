package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;ABBR&gt; element
 * 
 * @author Philip Helger
 */
public class HCAbbr extends AbstractHCElementWithChildren <HCAbbr>
{
  /**
   * Create a new ABBR element
   */
  public HCAbbr ()
  {
    super (EHTMLElement.ABBR);
  }
}
