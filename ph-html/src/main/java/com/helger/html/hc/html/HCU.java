package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML4;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;U&gt; element
 * 
 * @author Philip Helger
 */
@DeprecatedInHTML4
@DeprecatedInHTML5
public class HCU extends AbstractHCElementWithChildren <HCU>
{
  /**
   * Create a new U element
   */
  public HCU ()
  {
    super (EHTMLElement.U);
  }
}
