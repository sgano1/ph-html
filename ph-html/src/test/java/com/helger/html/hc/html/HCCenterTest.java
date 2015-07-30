package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCCenter;

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
