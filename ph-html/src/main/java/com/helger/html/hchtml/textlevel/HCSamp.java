package com.helger.html.hchtml.textlevel;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;SAMP&gt; element
 * 
 * @author Philip Helger
 */
public class HCSamp extends AbstractHCElementWithChildren <HCSamp>
{
  /**
   * Create a new SAMP element
   */
  public HCSamp ()
  {
    super (EHTMLElement.SAMP);
  }
}
