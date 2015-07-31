package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCSamp;

/**
 * Test class for class {@link HCSamp}
 * 
 * @author Philip Helger
 */
public final class HCSampTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSamp ().hasChildren ());
  }
}
