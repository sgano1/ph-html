package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCSpan;

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
