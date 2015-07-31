package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCEM;

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
