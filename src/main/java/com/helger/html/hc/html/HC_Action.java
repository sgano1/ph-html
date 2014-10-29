package com.helger.html.hc.html;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.microdom.IMicroElement;
import com.helger.commons.string.StringHelper;
import com.helger.commons.string.ToStringGenerator;
import com.helger.commons.url.ISimpleURL;
import com.helger.html.js.CJS;
import com.helger.html.js.IJSCodeProvider;
import com.helger.html.js.builder.IJSStatement;

@NotThreadSafe
public final class HC_Action
{
  private String m_sAction;
  private IJSCodeProvider m_aAction;

  @Nullable
  public final String getActionURL ()
  {
    return m_sAction;
  }

  @Nullable
  public final IJSCodeProvider getActionJS ()
  {
    return m_aAction;
  }

  public void setAction (@Nullable final ISimpleURL aAction)
  {
    setAction (aAction == null ? null : aAction.getAsString ());
  }

  public void setAction (@Nullable final String sAction)
  {
    m_sAction = sAction;
    m_aAction = null;
  }

  public void setAction (@Nullable final IJSStatement aAction)
  {
    m_sAction = null;
    m_aAction = aAction;
  }

  public void applyProperties (@Nonnull final String sAttributeName, @Nonnull final IMicroElement aElement)
  {
    if (m_aAction != null)
      aElement.setAttribute (sAttributeName, CJS.JS_PREFIX + m_aAction.getJSCode ());
    else
      if (StringHelper.hasText (m_sAction))
        aElement.setAttribute (sAttributeName, m_sAction);
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (null).appendIfNotNull ("actionURL", m_sAction)
                                       .appendIfNotNull ("actionJS", m_aAction)
                                       .toString ();
  }
}
