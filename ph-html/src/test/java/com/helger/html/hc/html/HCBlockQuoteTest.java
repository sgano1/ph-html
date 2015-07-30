package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

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
