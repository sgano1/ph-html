package com.helger.html.hchtml.impl;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;EM&gt; element
 * 
 * @author Philip Helger
 */
public class HCEM extends AbstractHCElementWithChildren <HCEM>
{
  /**
   * Create a new EM element
   */
  public HCEM ()
  {
    super (EHTMLElement.EM);
  }
}
