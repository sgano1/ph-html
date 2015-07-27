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

  public static void prepareHtmlForConversion (@Nonnull final HCHtml aHtml,
                                               @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    // customize, finalize and extract resources
    prepareForConversion (aHtml, aHtml.getBody (), aConversionSettings);

    // Extract all out-of-band nodes into the body
    if (aConversionSettings.isExtractOutOfBandNodes ())
      aHtml.extractAndReorderOutOfBandNodes ();
  }

  /**
   * Customize the passed base node and all child nodes recursively.
   *
   * @param aStartNode
   *        Base node to start customizing (incl.). May not be <code>null</code>
   *        .
   * @param aGlobalTargetNode
   *        The target node where new nodes should be appended to in case the
   *        direct parent node is not suitable. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to use. May not be <code>null</code>.
   */
  public static void prepareForConversion (@Nonnull final IHCHasChildren aStartNode,
                                           @Nonnull final IHCHasChildrenMutable <?, ? super IHCNode> aGlobalTargetNode,
                                           @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    ValueEnforcer.notNull (aStartNode, "NodeToBeCustomized");
    ValueEnforcer.notNull (aGlobalTargetNode, "TargetNode");
    ValueEnforcer.notNull (aConversionSettings, "ConversionSettings");

    final IHCCustomizer aCustomizer = aConversionSettings.getCustomizer ();
    final EHTMLVersion eHTMLVersion = aConversionSettings.getHTMLVersion ();

    // Customize all elements before extracting out-of-band nodes, in case the
    // customizer adds some out-of-band nodes as well
    // Than finalize and register external resources
    HCHelper.iterateTree (aStartNode, new IHCIteratorCallback ()
    {
      @SuppressWarnings ("unchecked")
      @Nonnull
      public EFinish call (@Nullable final IHCHasChildren aParentNode, @Nonnull final IHCNode aChildNode)
      {
        // If the parent node is suitable, use it, else use the global target
        // node
        IHCHasChildrenMutable <?, ? super IHCNode> aRealTargetNode;
        if (aParentNode instanceof IHCHasChildrenMutable <?, ?>)
          aRealTargetNode = (IHCHasChildrenMutable <?, IHCNode>) aParentNode;
        else
          aRealTargetNode = aGlobalTargetNode;

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
  }

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
   * @param aSrcNode
   *        The node to be converted. May not be <code>null</code>.
   * @param aConversionSettings
   *        The conversion settings to be used. May not be <code>null</code>.
   * @return The fully created HTML node
   */
  @SuppressWarnings ("unchecked")
  @Nullable
  public static IMicroNode getAsNode (@Nonnull final IHCNode aSrcNode,
                                      @Nonnull final IHCConversionSettingsToNode aConversionSettings)
  {
    IHCNode aConvertNode = aSrcNode;

    // Special case for HCHtml - must have been done separately because the
    // extraction of the OOB nodes must happen before the HTML HEAD is filled
    if (!(aSrcNode instanceof HCHtml))
    {
      // Determine the target node to use
      final boolean bSrcNodeCanHaveChildren = aSrcNode instanceof IHCHasChildrenMutable <?, ?>;
      IHCHasChildrenMutable <?, IHCNode> aTempNode;
      if (bSrcNodeCanHaveChildren)
      {
        // Passed node can handle it
        aTempNode = (IHCHasChildrenMutable <?, IHCNode>) aSrcNode;
      }
      else
      {
        aTempNode = new HCNodeList ();
        aTempNode.addChild (aSrcNode);
      }

      // customize, finalize and extract resources
      prepareForConversion (aTempNode, aTempNode, aConversionSettings);

      // NOTE: no OOB extraction here, because it is unclear what would happen
      // to the nodes. So this branch should mainly be used for unit testing
      // only!

      // Select node to convert to MicroDOM - if something was extracted, use
      // the temp node
      if (!bSrcNodeCanHaveChildren && aTempNode.getChildCount () > 1)
        aConvertNode = aTempNode;
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
    return getAsHTMLString (aHCNode, HCSettings.getConversionSettingsWithoutNamespaces ());
  }
}
