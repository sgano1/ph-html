package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;VAR&gt; element
 * 
 * @author Philip Helger
 */
public class HCVar extends AbstractHCElementWithChildren <HCVar>
{
  /**
   * Create a new VAR element
   */
  public HCVar ()
  {
    super (EHTMLElement.VAR);
  }
}
