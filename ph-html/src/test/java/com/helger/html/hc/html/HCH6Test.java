package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.sections.HCH6;

/**
 * Test class for class {@link HCH6}
 * 
 * @author Philip Helger
 */
public final class HCH6Test
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCH6 ().hasChildren ());
  }
}
