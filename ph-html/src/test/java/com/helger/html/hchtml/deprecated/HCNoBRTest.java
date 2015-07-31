package com.helger.html.hchtml.deprecated;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.deprecated.HCNoBR;

/**
 * Test class for class {@link HCNoBR}
 * 
 * @author Philip Helger
 */
public final class HCNoBRTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCNoBR ().hasChildren ());
  }
}
