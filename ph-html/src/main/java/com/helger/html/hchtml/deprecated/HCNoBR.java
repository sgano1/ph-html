package com.helger.html.hchtml.deprecated;

import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;NOBR&gt; element
 *
 * @author Philip Helger
 */
@DeprecatedInHTML5
public class HCNoBR extends AbstractHCElementWithChildren <HCNoBR>
{
  /**
   * Create a new NOBR element
   */
  public HCNoBR ()
  {
    super (EHTMLElement.NOBR);
  }
}
