package com.helger.html.hc.customize;

import javax.annotation.Nonnull;

import com.helger.html.js.IHasJSCode;

public interface IHCOnDocumentReadyProvider
{
  /**
   * Create "on document ready" JS code. When e.g. using JQuery this could
   * return <code>$(document).ready (function() {<i>JSCode</i>});</code>
   *
   * @param aJSCodeProvider
   *        The code to be executed when the HTML document is ready.
   * @return The created code.
   */
  @Nonnull
  IHasJSCode createOnDocumentReady (@Nonnull final IHasJSCode aJSCodeProvider);
}
