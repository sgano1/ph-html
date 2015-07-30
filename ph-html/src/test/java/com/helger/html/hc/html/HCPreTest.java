package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.grouping.HCPre;

/**
 * Test class for class {@link HCPre}
 * 
 * @author Philip Helger
 */
public final class HCPreTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCPre ().hasChildren ());
  }
}
