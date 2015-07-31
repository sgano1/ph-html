package com.helger.html.hc.html.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.textlevel.HCI;

/**
 * Test class for class {@link HCI}
 * 
 * @author Philip Helger
 */
public final class HCITest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCI ().hasChildren ());
  }
}
