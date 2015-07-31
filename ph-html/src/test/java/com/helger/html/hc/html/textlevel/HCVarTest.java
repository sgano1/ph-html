package com.helger.html.hc.html.textlevel;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.textlevel.HCVar;

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
