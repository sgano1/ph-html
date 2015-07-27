package com.helger.html.hc;

import javax.annotation.Nonnull;

public enum EHCNodeState
{
 INITIAL (0),
 CUSTOMIZED (1),
 FINALIZED (2),
 RESOURCES_REGISTERED (3);

  private final int m_nID;

  private EHCNodeState (final int nID)
  {
    m_nID = nID;
  }

  public int getID ()
  {
    return m_nID;
  }

  public boolean isBefore (@Nonnull final EHCNodeState eOther)
  {
    return m_nID < eOther.m_nID;
  }
}
