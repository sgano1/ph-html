package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;LI&gt; element
 * 
 * @author Philip Helger
 */
public class HCLI extends AbstractHCElementWithChildren <HCLI>
{
  /**
   * Create a new LI element
   */
  public HCLI ()
  {
    super (EHTMLElement.LI);
  }
}
