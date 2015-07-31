package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCSpan;

/**
 * Test class for class {@link HCSpan}
 * 
 * @author Philip Helger
 */
public final class HCSpanTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSpan ().hasChildren ());
  }
}
