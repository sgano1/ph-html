package com.helger.html.jquery.config;

import com.helger.commons.annotation.IsSPIImplementation;
import com.helger.html.hc.config.HCSettings;
import com.helger.html.hc.config.IHCSettingsProviderSPI;

/**
 * JQuery implementation of {@link IHCSettingsProviderSPI}.
 *
 * @author Philip Helger
 */
@IsSPIImplementation
public final class HCSettingsProviderJQuerySPI implements IHCSettingsProviderSPI
{
  public void initHCSettings ()
  {
    HCSettings.setOnDocumentReadyProvider (new JQueryOnDocumentReadyProvider ());
  }
}
