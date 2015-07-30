package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCH4}
 * 
 * @author Philip Helger
 */
public final class HCH4Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH4 ().hasChildren ());
  }
}
