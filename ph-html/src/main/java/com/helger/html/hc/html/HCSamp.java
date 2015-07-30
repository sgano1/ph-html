package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

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
