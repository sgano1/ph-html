package com.helger.html.jquery.config;

import com.helger.commons.annotation.IsSPIImplementation;
import com.helger.html.hc.customize.HCDefaultSettings;
import com.helger.html.hc.customize.IHCDefaultSettingsProviderSPI;

/**
 * JQuery implementation of {@link IHCDefaultSettingsProviderSPI}.
 * 
 * @author Philip Helger
 */
@IsSPIImplementation
public final class HCDefaultSettingsProviderJQuerySPI implements IHCDefaultSettingsProviderSPI
{
  public void initHCDefaultSettings ()
  {
    HCDefaultSettings.setOnDocumentReadyProvider (new JQueryOnDocumentReadyProvider ());
  }
}
