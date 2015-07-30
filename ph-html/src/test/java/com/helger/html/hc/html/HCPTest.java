package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCP}
 * 
 * @author Philip Helger
 */
public final class HCPTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCP ().hasChildren ());
  }
}
