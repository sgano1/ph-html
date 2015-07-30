package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;Q&gt; element
 * 
 * @author Philip Helger
 */
public class HCQ extends AbstractHCElementWithChildren <HCQ>
{
  /**
   * Create a new Q element
   */
  public HCQ ()
  {
    super (EHTMLElement.Q);
  }
}
