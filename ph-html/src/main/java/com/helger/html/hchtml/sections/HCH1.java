package com.helger.html.hchtml.sections;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;H1&gt; element
 * 
 * @author Philip Helger
 */
public class HCH1 extends AbstractHCElementWithChildren <HCH1>
{
  /**
   * Create a new H1 element
   */
  public HCH1 ()
  {
    super (EHTMLElement.H1);
  }
}