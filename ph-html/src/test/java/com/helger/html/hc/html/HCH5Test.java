package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCH5;

/**
 * Test class for class {@link HCH5}
 * 
 * @author Philip Helger
 */
public final class HCH5Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH5 ().hasChildren ());
  }
}
