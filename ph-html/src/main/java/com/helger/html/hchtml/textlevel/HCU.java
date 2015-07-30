package com.helger.html.hchtml.textlevel;

import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML4;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;U&gt; element
 *
 * @author Philip Helger
 */
@DeprecatedInHTML4
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