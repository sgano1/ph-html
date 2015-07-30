package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;SMALL&gt; element
 * 
 * @author Philip Helger
 */
public class HCSmall extends AbstractHCElementWithChildren <HCSmall>
{
  /**
   * Create a new SMALL element
   */
  public HCSmall ()
  {
    super (EHTMLElement.SMALL);
  }
}
