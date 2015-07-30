package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;SUP&gt; element
 * 
 * @author Philip Helger
 */
public class HCSup extends AbstractHCElementWithChildren <HCSup>
{
  /**
   * Create a new SUP element
   */
  public HCSup ()
  {
    super (EHTMLElement.SUP);
  }
}
