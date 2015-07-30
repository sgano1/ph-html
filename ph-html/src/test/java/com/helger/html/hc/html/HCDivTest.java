package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCDiv;

/**
 * Test class for class {@link HCDiv}
 * 
 * @author Philip Helger
 */
public final class HCDivTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCDiv ().hasChildren ());
  }
}
