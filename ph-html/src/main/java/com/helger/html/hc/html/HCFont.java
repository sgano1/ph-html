package com.helger.html.hc.html;

import com.helger.html.EHTMLElement;
import com.helger.html.annotation.DeprecatedInHTML5;
import com.helger.html.hc.impl.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;FONT&gt; element
 * 
 * @author Philip Helger
 */
@DeprecatedInHTML5
public class HCFont extends AbstractHCElementWithChildren <HCFont>
{
  /**
   * Create a new FONT element
   */
  public HCFont ()
  {
    super (EHTMLElement.FONT);
  }
}
