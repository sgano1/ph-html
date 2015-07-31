package com.helger.html.hc.html.grouping;

import com.helger.html.EHTMLElement;
import com.helger.html.hc.html.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;LI&gt; element
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        implementation type
 */
public abstract class AbstractHCLI <THISTYPE extends AbstractHCLI <THISTYPE>> extends AbstractHCElementWithChildren <THISTYPE>implements IHCLI <THISTYPE>
{
  /**
   * Create a new LI element
   */
  public AbstractHCLI ()
  {
    super (EHTMLElement.LI);
  }
}
