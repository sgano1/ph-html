package com.helger.html.hc.html.textlevel;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.html.AbstractHCElementWithChildren;

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
