package com.helger.html.js.provider;

import javax.annotation.Nonnull;

import com.helger.commons.url.ISimpleURL;
import com.helger.html.hc.IHCHasID;
import com.helger.html.js.IHasJSCode;
import com.helger.html.js.marshal.JSMarshaller;

public final class FakeJS
{
  public static final IHasJSCode JS_BLUR = new UnparsedJSCodeProvider ("blur();");
  public static final IHasJSCode RETURN_FALSE = new UnparsedJSCodeProvider ("return false;");

  @Nonnull
  public static IHasJSCode focus (@Nonnull final IHCHasID <?> aElement)
  {
    return new UnparsedJSCodeProvider ("document.getElementById('" +
                                       JSMarshaller.javaScriptEscape (aElement.ensureID ().getID ()) +
                                       "').focus();");
  }

  @Nonnull
  public static IHasJSCode windowLocationHref (@Nonnull final ISimpleURL aURL)
  {
    return new UnparsedJSCodeProvider ("window.location.href='" +
                                       JSMarshaller.javaScriptEscape (aURL.getAsString ()) +
                                       "';");
  }
}
