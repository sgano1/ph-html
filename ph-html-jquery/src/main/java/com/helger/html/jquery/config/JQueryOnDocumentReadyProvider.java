package com.helger.html.jquery.config;

import javax.annotation.Nonnull;

import com.helger.html.hc.config.IHCOnDocumentReadyProvider;
import com.helger.html.jquery.JQuery;
import com.helger.html.js.IHasJSCode;

/**
 * The default JQuery based "on document ready" provider.
 *
 * @author Philip Helger
 */
public class JQueryOnDocumentReadyProvider implements IHCOnDocumentReadyProvider
{
  @Nonnull
  public IHasJSCode createOnDocumentReady (final IHasJSCode aJSCodeProvider)
  {
    return JQuery.onDocumentReady (aJSCodeProvider);
  }
}
