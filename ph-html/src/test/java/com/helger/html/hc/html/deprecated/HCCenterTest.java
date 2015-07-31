package com.helger.html.hc.html.deprecated;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.deprecated.HCCenter;

/**
 * Test class for class {@link HCCenter}
 * 
 * @author Philip Helger
 */
public final class HCCenterTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCCenter ().hasChildren ());
  }
}
