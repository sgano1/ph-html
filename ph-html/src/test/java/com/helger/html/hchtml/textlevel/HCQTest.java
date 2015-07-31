package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCQ;

/**
 * Test class for class {@link HCQ}
 * 
 * @author Philip Helger
 */
public final class HCQTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCQ ().hasChildren ());
  }
}
