package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

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
