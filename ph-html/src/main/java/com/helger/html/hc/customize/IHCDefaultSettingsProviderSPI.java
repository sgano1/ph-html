package com.helger.html.hc.customize;

import com.helger.commons.annotation.IsSPIInterface;

/**
 * SPI interface to initialize the {@link HCDefaultSettings}.
 * 
 * @author Philip Helger
 */
@IsSPIInterface
public interface IHCDefaultSettingsProviderSPI
{
  /**
   * Init the default settings.
   */
  void initHCDefaultSettings ();
}
