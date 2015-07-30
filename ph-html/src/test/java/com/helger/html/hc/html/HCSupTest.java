package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCSup}
 * 
 * @author Philip Helger
 */
public final class HCSupTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSup ().hasChildren ());
  }
}
