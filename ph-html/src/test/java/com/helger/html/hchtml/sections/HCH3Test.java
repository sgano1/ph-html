package com.helger.html.hchtml.sections;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.sections.HCH3;

/**
 * Test class for class {@link HCH3}
 * 
 * @author Philip Helger
 */
public final class HCH3Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH3 ().hasChildren ());
  }
}
