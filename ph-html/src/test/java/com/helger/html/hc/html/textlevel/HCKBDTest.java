package com.helger.html.hc.html.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.textlevel.HCKBD;

/**
 * Test class for class {@link HCKBD}
 * 
 * @author Philip Helger
 */
public final class HCKBDTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCKBD ().hasChildren ());
  }
}
