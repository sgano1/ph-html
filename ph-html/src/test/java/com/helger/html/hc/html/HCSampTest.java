package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCSamp}
 * 
 * @author Philip Helger
 */
public final class HCSampTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSamp ().hasChildren ());
  }
}
