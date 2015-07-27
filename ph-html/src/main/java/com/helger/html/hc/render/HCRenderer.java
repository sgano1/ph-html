package com.helger.html.hc.render;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.debug.GlobalDebug;
import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.microdom.serialize.MicroWriter;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.config.HCSettings;
import com.helger.html.hc.conversion.HCConversionSettings;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.hc.html.HCHtml;

@Immutable
public final class HCRenderer
{
  private HCRenderer ()
  {}

  /**
   * Convert the passed HC node to a micro node using the default conversion
   * settings.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCNode aHCNode)
  {
    return aHCNode.convertToMicroNode (HCSettings.getConversionSettings ());
  }

  /**
   * Convert the passed HC node to an HTML string using the default conversion
   * settings.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLString (@Nonnull final IHCNode aHCNode)
  {
    return getAsHTMLString (aHCNode, HCSettings.getConversionSettings ());
  }

  /**
   * Convert the passed node to it's HTML representation. First this HC-node is
   * converted to a micro node, which is than
   *
   * @param aHCNode
   *        The HC node to be converted to an HTML string. May not be
   *        <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as HTML string. Never <code>null</code>.
   */
  @Nonnull
  public final static String getAsHTMLString (@Nonnull final IHCNode aHCNode,
                                              @Nonnull final IHCConversionSettings aConversionSettings)
  {
    IMicroNode aMicroNode;
    if (aHCNode instanceof HCHtml)
    {
      // Apply customizer first
      aMicroNode = ((HCHtml) aHCNode).customizeAndConvertToMicroNode (aConversionSettings);
    }
    else
      aMicroNode = aHCNode.convertToMicroNode (aConversionSettings);
    if (aMicroNode == null)
      return "";
    return MicroWriter.getNodeAsString (aMicroNode, aConversionSettings.getXMLWriterSettings ());
  }

  /**
   * Convert the passed HC node to an HTML string without namespaces. Indent and
   * align status is determined from {@link GlobalDebug#isDebugMode()}
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLStringWithoutNamespaces (@Nonnull final IHCNode aHCNode)
  {
    return getAsHTMLStringWithoutNamespaces (aHCNode, HCSettings.getConversionSettings ());
  }

  /**
   * Convert the passed HC node to an HTML string without namespaces.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The node as XML with or without indentation.
   */
  @Nonnull
  public static String getAsHTMLStringWithoutNamespaces (@Nonnull final IHCNode aHCNode,
                                                         @Nonnull final IHCConversionSettings aConversionSettings)
  {
    // Create a copy
    final HCConversionSettings aRealCS = new HCConversionSettings (aConversionSettings);
    // And modify the copied XML settings
    aRealCS.getXMLWriterSettings ().setEmitNamespaces (false);
    return getAsHTMLString (aHCNode, aRealCS);
  }
}
