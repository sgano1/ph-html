package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.impl.HCBDO;

/**
 * Test class for class {@link HCBDO}
 * 
 * @author Philip Helger
 */
public final class HCBDOTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCBDO ().hasChildren ());
  }
}
