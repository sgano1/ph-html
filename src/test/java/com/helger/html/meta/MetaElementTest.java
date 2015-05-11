package com.helger.html.meta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.mock.PHTestUtils;

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

    PHTestUtils.testDefaultSerialization (e1);
    PHTestUtils.testDefaultImplementationWithEqualContentObject (e1, new MetaElement ("nam", "con"));
    PHTestUtils.testDefaultImplementationWithDifferentContentObject (e1, new MetaElement ("nam2", "con"));
    PHTestUtils.testDefaultImplementationWithDifferentContentObject (e1, new MetaElement ("nam", "con2"));
    PHTestUtils.testDefaultImplementationWithDifferentContentObject (e1,
                                                                     new MetaElement ("nam", "con").setHttpEquiv (true));
  }
}
