package com.helger.html.hc.html.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.textlevel.HCB;

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
