package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCSmall;

/**
 * Test class for class {@link HCSmall}
 * 
 * @author Philip Helger
 */
public final class HCSmallTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSmall ().hasChildren ());
  }
}
