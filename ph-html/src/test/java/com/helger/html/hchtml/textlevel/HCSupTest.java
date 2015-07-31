package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCSup;

/**
 * Test class for class {@link HCSup}
 * 
 * @author Philip Helger
 */
public final class HCSupTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSup ().hasChildren ());
  }
}
