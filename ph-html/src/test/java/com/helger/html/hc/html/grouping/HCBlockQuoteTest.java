package com.helger.html.hc.html.grouping;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.grouping.HCBlockQuote;

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
