package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCAbbr;

/**
 * Test class for class {@link HCAbbr}
 * 
 * @author Philip Helger
 */
public final class HCAbbrTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCAbbr ().hasChildren ());
  }
}
