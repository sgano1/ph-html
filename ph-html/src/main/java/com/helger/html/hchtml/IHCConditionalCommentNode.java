package com.helger.html.hchtml;

import javax.annotation.Nonnull;

import com.helger.commons.annotation.Nonempty;
import com.helger.html.hc.IHCWrappingNode;

/**
 * Base interface for conditional comments.
 * 
 * @author Philip Helger
 */
public interface IHCConditionalCommentNode extends IHCWrappingNode
{
  /**
   * @return The condition for the conditional comment. Neither
   *         <code>null</code> nor empty.
   */
  @Nonnull
  @Nonempty
  String getCondition ();
}
