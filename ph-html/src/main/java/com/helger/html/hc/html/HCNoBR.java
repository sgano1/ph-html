package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML4;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;NOBR&gt; element
 * 
 * @author Philip Helger
 */
@DeprecatedInHTML4
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
