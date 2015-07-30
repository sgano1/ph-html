package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

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
