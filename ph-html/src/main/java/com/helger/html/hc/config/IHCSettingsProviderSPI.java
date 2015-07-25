package com.helger.html.hc.config;

import com.helger.commons.annotation.IsSPIInterface;

/**
 * SPI interface to initialize the {@link HCSettings}.
 *
 * @author Philip Helger
 */
@IsSPIInterface
public interface IHCSettingsProviderSPI
{
  /**
   * Init the HC settings.
   */
  void initHCSettings ();
}
