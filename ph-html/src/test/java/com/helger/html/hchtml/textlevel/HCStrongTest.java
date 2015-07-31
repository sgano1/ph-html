package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCStrong;

/**
 * Test class for class {@link HCStrong}
 * 
 * @author Philip Helger
 */
public final class HCStrongTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCStrong ().hasChildren ());
  }
}
