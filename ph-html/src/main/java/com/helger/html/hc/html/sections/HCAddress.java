package com.helger.html.hc.html.sections;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.html.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;ADDRESS&gt; element
 * 
 * @author Philip Helger
 */
public class HCAddress extends AbstractHCElementWithChildren <HCAddress>
{
  /**
   * Create a new ADDRESS element
   */
  public HCAddress ()
  {
    super (EHTMLElement.ADDRESS);
  }
}
