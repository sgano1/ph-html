package com.helger.html.hc.html.script;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hc.html.script.HCNoScript;

/**
 * Test class for class {@link HCNoScript}
 * 
 * @author Philip Helger
 */
public final class HCNoScriptTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCNoScript ().hasChildren ());
  }
}
