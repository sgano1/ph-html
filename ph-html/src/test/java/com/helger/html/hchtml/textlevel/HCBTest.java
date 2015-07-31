package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCB;

/**
 * Test class for class {@link HCB}
 * 
 * @author Philip Helger
 */
public final class HCBTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCB ().hasChildren ());
  }
}
