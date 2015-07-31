package com.helger.html.hc.html.textlevel;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.html.AbstractHCElementWithChildren;

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
