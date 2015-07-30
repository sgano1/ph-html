package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCAddress;

/**
 * Test class for class {@link HCAddress}
 * 
 * @author Philip Helger
 */
public final class HCAddressTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCAddress ().hasChildren ());
  }
}
