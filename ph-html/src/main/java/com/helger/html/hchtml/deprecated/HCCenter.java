package com.helger.html.hchtml.deprecated;

import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;CENTER&gt; element
 *
 * @author Philip Helger
 */
@DeprecatedInHTML5
public class HCCenter extends AbstractHCElementWithChildren <HCCenter>
{
  /**
   * Create a new CENTER element
   */
  public HCCenter ()
  {
    super (EHTMLElement.CENTER);
  }
}
