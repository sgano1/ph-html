package com.helger.html.hc;

public enum EHCNodeState
{
 INITIAL (0),
 CUSTOMIZED (1),
 FINALIZED (2),
 RESOURCES_REGISTERED (3),
 CONVERTED_TO_MICRONODE (4);

  private final int m_nID;

  private EHCNodeState (final int nID)
  {
    m_nID = nID;
  }

  public int getID ()
  {
    return m_nID;
  }
}
