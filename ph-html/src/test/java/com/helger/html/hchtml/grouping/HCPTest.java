package com.helger.html.hchtml.grouping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test class for class {@link HCP}
 *
 * @author Philip Helger
 */
public final class HCPTest
{
  @Test
  public void testCreate ()
  {
    assertFalse (new HCP ().hasChildren ());
  }

  @Test
  public void testSetID ()
  {
    HCP aElement = new HCP ();
    assertNull (aElement.getID ());
    assertNotNull (aElement.ensureID ().getID ());
    assertSame (aElement, aElement.ensureID ());
    try
    {
      assertSame (aElement, aElement.setID ("foo"));
      assertEquals ("foo", aElement.getID ());
    }
    catch (final IllegalStateException ex)
    {
      // ID already set - in debug mode
    }

    aElement = new HCP ();
    assertSame (aElement, aElement.setID ("foo"));
    assertEquals ("foo", aElement.getID ());

    try
    {
      // ID with whitespace is not allowed
      aElement.setID ("ID blank");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      // ID with whitespace is not allowed
      aElement.setID (" IDblank");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}

    try
    {
      // ID with whitespace is not allowed
      aElement.setID ("ID\tblank");
      fail ();
    }
    catch (final IllegalArgumentException ex)
    {}
    assertEquals ("foo", aElement.getID ());
  }
}
