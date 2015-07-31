package com.helger.html.hc.html.sections;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.sections.HCH2;

/**
 * Test class for class {@link HCH2}
 * 
 * @author Philip Helger
 */
public final class HCH2Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH2 ().hasChildren ());
  }
}
