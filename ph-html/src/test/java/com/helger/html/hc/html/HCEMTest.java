package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCEM}
 * 
 * @author Philip Helger
 */
public final class HCEMTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCEM ().hasChildren ());
  }
}
