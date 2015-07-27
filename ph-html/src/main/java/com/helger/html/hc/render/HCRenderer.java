package com.helger.html.hc.render;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.debug.GlobalDebug;
import com.helger.commons.microdom.IMicroNode;
import com.helger.commons.microdom.serialize.MicroWriter;
import com.helger.commons.state.EFinish;
import com.helger.html.EHTMLVersion;
import com.helger.html.hc.HCHelper;
import com.helger.html.hc.IHCHasChildren;
import com.helger.html.hc.IHCHasChildrenMutable;
import com.helger.html.hc.IHCIteratorCallback;
import com.helger.html.hc.IHCNode;
import com.helger.html.hc.config.HCSettings;
import com.helger.html.hc.conversion.HCConversionSettings;
import com.helger.html.hc.conversion.IHCConversionSettings;
import com.helger.html.hc.conversion.IHCConversionSettingsToNode;
import com.helger.html.hc.customize.IHCCustomizer;
import com.helger.html.hc.html.HCHtml;
import com.helger.html.hc.impl.HCNodeList;

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
    return getAsNode (aHCNode, HCSettings.getConversionSettings ());
  }

  /**
   * Convert the passed HC node to a micro node using the provided conversion
   * settings.
   *
   * @param aHCNode
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCNode aHCNode,
                                      @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    IHCNode aConvertNode;
    if (aHCNode instanceof HCHtml)
    {
      final HCHtml aHTML = (HCHtml) aHCNode;

      // prepare nodes
      HCRenderer.prepareForConversion (aHTML, aHTML.getBody (), aConversionSettings);

      // Extract all out-of-band nodes
      if (aConversionSettings.isExtractOutOfBandNodes ())
        aHTML.extractAndReorderOutOfBandNodes ();

      aConvertNode = aHCNode;
    }
    else
    {
      final IHCHasChildrenMutable <?, IHCNode> aHCTemp = new HCNodeList ();
      aHCTemp.addChild (aHCNode);

      // customize, finalize and extract resources
      prepareForConversion (aHCTemp, aHCTemp, aConversionSettings);

      // Select node to convert - if nothing was extracted, use the original
      // node
      aConvertNode = aHCTemp.getChildCount () == 1 ? aHCNode : aHCTemp;
    }

    final IMicroNode aMicroNode = aConvertNode.convertToMicroNode (aConversionSettings);
    return aMicroNode;
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
    final IMicroNode aMicroNode = getAsNode (aHCNode, aConversionSettings);
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

  /**
   * Customize the passed base node and all child nodes recursively.
   *
   * @param aStartNode
   *        Base node to start customizing (incl.). May not be <code>null</code>
   *        .
   * @param aTargetNode
   *        The target node where new nodes should be appended to. May not be
   *        <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to use. May not be <code>null</code>.
   */
  public static void prepareForConversion (@Nonnull final IHCHasChildren aStartNode,
                                           @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aTargetNode,
                                           @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    ValueEnforcer.notNull (aStartNode, "NodeToBeCustomized");
    ValueEnforcer.notNull (aTargetNode, "TargetNode");
    ValueEnforcer.notNull (aConversionSettings, "ConversionSettings");

    final IHCCustomizer aCustomizer = aConversionSettings.getCustomizer ();
    final EHTMLVersion eHTMLVersion = aConversionSettings.getHTMLVersion ();

    final int nTargetNodeChildren = aTargetNode.getChildCount ();

    // Customize all elements before extracting out-of-band nodes, in case the
    // customizer adds some out-of-band nodes as well
    // Than finalize and register external resources
    HCHelper.iterateTree (aStartNode, new IHCIteratorCallback ()
    {
      @SuppressWarnings ("unchecked")
      @Nonnull
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        IHCHasChildrenMutable <?, ? super IHCNode> aRealTargetNode;
        if (aParentNode instanceof IHCHasChildrenMutable <?, ?>)
          aRealTargetNode = (IHCHasChildrenMutable <?, IHCNode>) aParentNode;
        else
          aRealTargetNode = aTargetNode;

        // Run the global customizer
        aChildNode.customizeNode (aCustomizer, eHTMLVersion, aRealTargetNode);

        // finalize the node
        aChildNode.finalizeNodeState (aConversionSettings, aRealTargetNode);

        // No forced registration here
        final boolean bForcedResourceRegistration = false;
        aChildNode.registerExternalResources (aConversionSettings, bForcedResourceRegistration);
        return EFinish.UNFINISHED;
      }
    });

    if (aTargetNode.getChildCount () > nTargetNodeChildren)
    {
      // At least one child was added to the target node - ensure it is also
      // prepared - recursive call
      System.out.println ("Recursive preparation!");
      prepareForConversion (aTargetNode, aTargetNode, aConversionSettings);
    }
  }
}
