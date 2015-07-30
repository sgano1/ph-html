package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;S&gt; element
 * 
 * @author Philip Helger
 */
public class HCS extends AbstractHCElementWithChildren <HCS>
{
  /**
   * Create a new S element
   */
  public HCS ()
  {
    super (EHTMLElement.S);
  }
}
