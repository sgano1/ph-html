package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Test class for class {@link HCNoBR}
 * 
 * @author Philip Helger
 */
public final class HCNoBRTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCNoBR ().hasChildren ());
  }
}
