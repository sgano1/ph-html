package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.sections.HCH1;

/**
 * Test class for class {@link HCH1}
 * 
 * @author Philip Helger
 */
public final class HCH1Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH1 ().hasChildren ());
  }
}
