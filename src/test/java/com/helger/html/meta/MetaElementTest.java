package com.helger.html.meta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.mock.CommonsTestHelper;

/**
 * Test class for class {@link MetaElement}.
 *
 * @author Philip Helger
 */
public final class MetaElementTest
{
  @Test
  public void testBasic ()
  {
    final MetaElement e1 = new MetaElement ("nam", "con");
    assertEquals ("nam", e1.getName ());
    assertFalse (e1.isHttpEquiv ());
    assertTrue (e1.isLanguageIndependent ());
    assertEquals ("con", e1.getContentLanguageIndependent ());

    CommonsTestHelper.testDefaultSerialization (e1);
    CommonsTestHelper.testDefaultImplementationWithEqualContentObject (e1, new MetaElement ("nam", "con"));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (e1, new MetaElement ("nam2", "con"));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (e1, new MetaElement ("nam", "con2"));
    CommonsTestHelper.testDefaultImplementationWithDifferentContentObject (e1,
                                                                           new MetaElement ("nam", "con").setHttpEquiv (true));
  }
}
