package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.edits.HCIns;

/**
 * Test class for class {@link HCIns}
 * 
 * @author Philip Helger
 */
public final class HCInsTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCIns ().hasChildren ());
  }
}
