package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCSmall}
 * 
 * @author Philip Helger
 */
public final class HCSmallTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSmall ().hasChildren ());
  }
}
