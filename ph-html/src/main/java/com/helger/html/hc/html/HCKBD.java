package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;KBD&gt; element
 * 
 * @author Philip Helger
 */
public class HCKBD extends AbstractHCElementWithChildren <HCKBD>
{
  /**
   * Create a new KBD element
   */
  public HCKBD ()
  {
    super (EHTMLElement.KBD);
  }
}
