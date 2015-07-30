package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;CENTER&gt; element
 * 
 * @author Philip Helger
 */
public class HCCenter extends AbstractHCElementWithChildren <HCCenter>
{
  /**
   * Create a new CENTER element
   */
  public HCCenter ()
  {
    super (EHTMLElement.CENTER);
  }
}
