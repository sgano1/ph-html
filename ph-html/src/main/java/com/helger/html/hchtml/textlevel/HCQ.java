package com.helger.html.hchtml.textlevel;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

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
