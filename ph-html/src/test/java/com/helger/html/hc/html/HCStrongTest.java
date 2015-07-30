package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCStrong}
 * 
 * @author Philip Helger
 */
public final class HCStrongTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCStrong ().hasChildren ());
  }
}
