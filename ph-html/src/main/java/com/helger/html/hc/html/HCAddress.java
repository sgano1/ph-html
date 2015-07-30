package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

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
