package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;ABBR&gt; element
 * 
 * @author Philip Helger
 */
public class HCAbbr extends AbstractHCElementWithChildren <HCAbbr>
{
  /**
   * Create a new ABBR element
   */
  public HCAbbr ()
  {
    super (EHTMLElement.ABBR);
  }
}
