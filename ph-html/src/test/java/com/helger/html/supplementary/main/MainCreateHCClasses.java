/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.html.supplementary.main;

import java.io.File;
import java.util.Locale;

import com.helger.commons.charset.CCharset;
import com.helger.commons.io.file.SimpleFileIO;

public class MainCreateHCClasses
{
  private static final String TEMPLATE_MAIN = "package com.helger.html.hc.html;\r\n" +
                                              "\r\n" +
                                              "import javax.annotation.Nonnull;\r\n" +
                                              "import javax.annotation.Nullable;\r\n" +
                                              "\r\n" +
                                              "import com.helger.html.EHTMLElement;\r\n" +
                                              "import com.helger.html.hc.IHCNode;\r\n" +
                                              "import com.helger.html.hc.impl.AbstractHCElementWithChildren;\r\n" +
                                              "\r\n" +
                                              "/**\r\n" +
                                              " * Represents an HTML &lt;$$$&gt; element<br>\r\n" +
                                              " * This file is automatically generated from " +
                                              MainCreateHCClasses.class.getName () +
                                              " so DO NOT EDIT!\r\n" +
                                              " * \r\n" +
                                              " * @author Philip Helger\r\n" +
                                              " */\r\n" +
                                              "$ANNOTATIONS$public class HC$$ extends $SUPERCLASS$ <HC$$>\r\n" +
                                              "{\r\n" +
                                              "  /**\r\n" +
                                              "   * Create a new $$$ element\r\n" +
                                              "   */\r\n" +
                                              "  public HC$$ ()\r\n" +
                                              "  {\r\n" +
                                              "    super ($SUPERPARAM$);$CTORCODE$\r\n" +
                                              "  }\r\n" +
                                              "$CUSTOMCODE$\r\n" +
                                              "  /**\r\n" +
                                              "   * Create a new $$$ element with the passed child text\r\n" +
                                              "   * @param sChild The child to be appended. May be <code>null</code>\r\n" +
                                              "   * @return The created HC$$ element and never <code>null</code>\r\n" +
                                              "   */\r\n" +
                                              "  @Nonnull\r\n" +
                                              "  public static HC$$ create (@Nullable final String sChild)\r\n" +
                                              "  {\r\n" +
                                              "    return new HC$$ ().addChild (sChild);\r\n" +
                                              "  }\r\n" +
                                              "\r\n" +
                                              "  /**\r\n" +
                                              "   * Create a new $$$ element with the passed child texts\r\n" +
                                              "   * @param aChildren The child texts to be appended. May be <code>null</code>\r\n" +
                                              "   * @return The created HC$$ element and never <code>null</code>\r\n" +
                                              "   */\r\n" +
                                              "  @Nonnull\r\n" +
                                              "  public static HC$$ create (@Nullable final String... aChildren)\r\n" +
                                              "  {\r\n" +
                                              "    return new HC$$ ().addChildren (aChildren);\r\n" +
                                              "  }\r\n" +
                                              "\r\n" +
                                              "  /**\r\n" +
                                              "   * Create a new $$$ element with the passed child node\r\n" +
                                              "   * @param aChild The child node to be appended. May be <code>null</code>\r\n" +
                                              "   * @return The created HC$$ element and never <code>null</code>\r\n" +
                                              "   */\r\n" +
                                              "  @Nonnull\r\n" +
                                              "  public static HC$$ create (@Nullable final IHCNode aChild)\r\n" +
                                              "  {\r\n" +
                                              "    return new HC$$ ().addChild (aChild);\r\n" +
                                              "  }\r\n" +
                                              "\r\n" +
                                              "  /**\r\n" +
                                              "   * Create a new $$$ element with the passed child nodes\r\n" +
                                              "   * @param aChildren The child nodes to be appended. May be <code>null</code>\r\n" +
                                              "   * @return The created HC$$ element and never <code>null</code>\r\n" +
                                              "   */\r\n" +
                                              "  @Nonnull\r\n" +
                                              "  public static HC$$ create (@Nullable final IHCNode... aChildren)\r\n" +
                                              "  {\r\n" +
                                              "    return new HC$$ ().addChildren (aChildren);\r\n" +
                                              "  }\r\n" +
                                              "\r\n" +
                                              "  /**\r\n" +
                                              "   * Create a new $$$ element with the passed child nodes\r\n" +
                                              "   * @param aChildren The child nodes to be appended. May be <code>null</code>\r\n" +
                                              "   * @return The created HC$$ element and never <code>null</code>\r\n" +
                                              "   */\r\n" +
                                              "  @Nonnull\r\n" +
                                              "  public static HC$$ create (@Nullable final Iterable <? extends IHCNode> aChildren)\r\n" +
                                              "  {\r\n" +
                                              "    return new HC$$ ().addChildren (aChildren);\r\n" +
                                              "  }\r\n" +
                                              "}\r\n" +
                                              "";

  private static final String TEMPLATE_TEST = "package com.helger.html.hc.html;\r\n" +
                                              "\r\n" +
                                              "import static org.junit.Assert.assertEquals;\r\n" +
                                              "import static org.junit.Assert.assertFalse;\r\n" +
                                              "\r\n" +
                                              "import java.util.ArrayList;\r\n" +
                                              "\r\n" +
                                              "import org.junit.Test;\r\n" +
                                              "\r\n" +
                                              "import com.helger.commons.collections.CollectionHelper;\r\n" +
                                              "import com.helger.html.hc.IHCNode;\r\n" +
                                              "\r\n" +
                                              "/**\r\n" +
                                              " * Test class for class {@link HC$$}\r\n" +
                                              " * This file is automatically generated from " +
                                              MainCreateHCClasses.class.getName () +
                                              " so DO NOT EDIT!\r\n" +
                                              " * \r\n" +
                                              " * @author Philip Helger\r\n" +
                                              " */\r\n" +
                                              "public final class HC$$Test\r\n" +
                                              "{\r\n" +
                                              "  @Test\r\n" +
                                              "  public void testCreate ()\r\n" +
                                              "  {\r\n" +
                                              "    assertFalse (new HC$$ ().hasChildren ());\r\n" +
                                              "    assertEquals (1, HC$$.create (\"Text\").getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create ((String) null).getChildCount ());\r\n" +
                                              "    assertEquals (1, HC$$.create (HCB.create (\"Bold\")).getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create ((IHCNode) null).getChildCount ());\r\n" +
                                              "    assertEquals (3, HC$$.create (\"Hallo\", \"Welt\", \"!!!\").getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create (new String [0]).getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create ((String []) null).getChildCount ());\r\n" +
                                              "    assertEquals (2, HC$$.create (HCB.create (\"Bold\"), HCI.create (\"Italic\")).getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create (new IHCNode [0]).getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create ((IHCNode []) null).getChildCount ());\r\n" +
                                              "    assertEquals (2, HC$$.create (CollectionHelper.newList (HCB.create (\"Bold\"), HCI.create (\"Italic\")))\r\n" +
                                              "                         .getChildCount ());\r\n" +
                                              "    assertEquals (0, HC$$.create (new ArrayList <IHCNode> ()).getChildCount ());\r\n" +
                                              "  }\r\n" +
                                              "}\r\n";

  public static void main (final String [] args)
  {
    final String [] ELEMENTS = new String [] { "Abbr",
                                               "Address",
                                               "B",
                                               "BDO",
                                               "BlockQuote",
                                               "Center",
                                               "Div",
                                               "EM",
                                               "Font",
                                               "H1",
                                               "H2",
                                               "H3",
                                               "H4",
                                               "H5",
                                               "H6",
                                               "I",
                                               "Ins",
                                               "KBD",
                                               "LI",
                                               "NoBR",
                                               "NoScript",
                                               "P",
                                               "Pre",
                                               "Q",
                                               "S",
                                               "Samp",
                                               "Small",
                                               "Span",
                                               "Strong",
                                               "Sub",
                                               "Sup",
                                               "U",
                                               "Var" };
    final File aMainDir = new File ("src/main/java/com/helger/html/hc/html");
    final File aTestDir = new File ("src/test/java/com/helger/html/hc/html");
    for (final String sElementName : ELEMENTS)
    {
      final String sUC = sElementName.toUpperCase (Locale.US);
      {
        String sSuperClass = "AbstractHCElementWithChildren";
        String sSuperParam = "EHTMLElement." + sUC;
        String sCustomCode = "";
        if (sElementName.equals ("Div") || sElementName.equals ("Span"))
        {
          sSuperClass = "AbstractHC" + sElementName;
          sSuperParam = "";
        }
        else
          if (sElementName.equals ("P"))
          {
            sSuperClass = "AbstractHCElementWithChildren";
            sCustomCode = "  @Override\r\n" +
                          "  @Nonnull\r\n" +
                          "  public String getPlainText ()\r\n" +
                          "  {\r\n" +
                          "    return super.getPlainText () + \"\\n\";\r\n" +
                          "  }";
          }
        String sAnnotations = "";
        if (sElementName.equals ("Font"))
          sAnnotations = "@DeprecatedInHTML5\r\n";
        else
          if (sElementName.equals ("U") || sElementName.equals ("NoBR"))
            sAnnotations = "@DeprecatedInHTML4\r\n@DeprecatedInHTML5\r\n";

        final String sCtorCode = "";

        String sMainCode = TEMPLATE_MAIN;
        sMainCode = sMainCode.replace ("$SUPERCLASS$", sSuperClass);
        sMainCode = sMainCode.replace ("$SUPERPARAM$", sSuperParam);
        sMainCode = sMainCode.replace ("$ANNOTATIONS$", sAnnotations);
        sMainCode = sMainCode.replace ("$CTORCODE$", sCtorCode);
        sMainCode = sMainCode.replace ("$CUSTOMCODE$", sCustomCode);
        sMainCode = sMainCode.replace ("$$$", sUC);
        sMainCode = sMainCode.replace ("$$", sElementName);

        final File aFile = new File (aMainDir, "HC" + sElementName + ".java");
        if (!aFile.exists ())
          throw new IllegalStateException (aFile.getPath () + " does not exist");
        SimpleFileIO.writeFile (aFile, sMainCode, CCharset.CHARSET_UTF_8_OBJ);
      }

      {
        String sTestCode = TEMPLATE_TEST;
        sTestCode = sTestCode.replace ("$$", sElementName);
        final File aFile = new File (aTestDir, "HC" + sElementName + "Test.java");
        SimpleFileIO.writeFile (aFile, sTestCode, CCharset.CHARSET_UTF_8_OBJ);
      }
    }
    System.out.println ("Done - run Eclipse cleanup + mvn license:format");
  }
}