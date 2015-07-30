package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.deprecated.HCFont;

/**
 * Test class for class {@link HCFont}
 * 
 * @author Philip Helger
 */
public final class HCFontTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCFont ().hasChildren ());
  }
}
