package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCBlockQuote;

/**
 * Test class for class {@link HCBlockQuote}
 * 
 * @author Philip Helger
 */
public final class HCBlockQuoteTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCBlockQuote ().hasChildren ());
  }
}
