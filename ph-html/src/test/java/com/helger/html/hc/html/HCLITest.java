package com.helger.html.hc.html;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.helger.html.hchtml.grouping.HCLI;

/**
 * Test class for class {@link HCLI}
 * 
 * @author Philip Helger
 */
public final class HCLITest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCLI ().hasChildren ());
  }
}
