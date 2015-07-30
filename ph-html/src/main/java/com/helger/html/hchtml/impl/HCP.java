package com.helger.html.hchtml.impl;

import javax.annotation.Nonnull;

import com.helger.html.EHTMLElement;
import com.helger.html.hchtml.AbstractHCElementWithChildren;

/**
 * Represents an HTML &lt;P&gt; element
 * 
 * @author Philip Helger
 */
public class HCP extends AbstractHCElementWithChildren <HCP>
{
  /**
   * Create a new P element
   */
  public HCP ()
  {
    super (EHTMLElement.P);
  }

  @Override
  @Nonnull
  public String getPlainText ()
  {
    return super.getPlainText () + "\n";
  }
}
