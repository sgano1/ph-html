package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCSub;

/**
 * Test class for class {@link HCSub}
 * 
 * @author Philip Helger
 */
public final class HCSubTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCSub ().hasChildren ());
  }
}
