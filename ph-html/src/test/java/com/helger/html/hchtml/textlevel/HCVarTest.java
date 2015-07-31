package com.helger.html.hchtml.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.textlevel.HCVar;

/**
 * Test class for class {@link HCVar}
 * 
 * @author Philip Helger
 */
public final class HCVarTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCVar ().hasChildren ());
  }
}
