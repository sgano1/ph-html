package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCU}
 * 
 * @author Philip Helger
 */
public final class HCUTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCU ().hasChildren ());
  }
}
