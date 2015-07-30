package com.helger.html.hchtml.edits;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;INS&gt; element
 * 
 * @author Philip Helger
 */
public class HCIns extends AbstractHCElementWithChildren <HCIns>
{
  /**
   * Create a new INS element
   */
  public HCIns ()
  {
    super (EHTMLElement.INS);
  }
}
