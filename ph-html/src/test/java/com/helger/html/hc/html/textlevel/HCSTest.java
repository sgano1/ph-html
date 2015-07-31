package com.helger.html.hc.html.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.textlevel.HCS;

/**
 * Test class for class {@link HCS}
 * 
 * @author Philip Helger
 */
public final class HCSTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCS ().hasChildren ());
  }
}
