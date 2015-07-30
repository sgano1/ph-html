package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCH2}
 * 
 * @author Philip Helger
 */
public final class HCH2Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH2 ().hasChildren ());
  }
}
