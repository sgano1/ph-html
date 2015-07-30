package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;STRONG&gt; element
 * 
 * @author Philip Helger
 */
public class HCStrong extends AbstractHCElementWithChildren <HCStrong>
{
  /**
   * Create a new STRONG element
   */
  public HCStrong ()
  {
    super (EHTMLElement.STRONG);
  }
}
