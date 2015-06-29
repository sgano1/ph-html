package com.helger.html.meta;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.MustImplementEqualsAndHashcode;
import com.helger.commons.annotation.ReturnsMutableCopy;

/**
 * Read only base interface for a list of {@link IMetaElement} objects.
 *
 * @author Philip Helger
 */
@MustImplementEqualsAndHashcode
public interface IMetaElementList extends Serializable, Iterable <IMetaElement>
{
  /**
   * @return A set with used meta element names. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  Set <String> getAllMetaElementNames ();

  /**
   * @return A list with all contained meta elements. Never <code>null</code>.
   */
  @Nonnull
  @ReturnsMutableCopy
  List <IMetaElement> getAllMetaElements ();

  /**
   * Add all contained meta elements to the passed container.
   *
   * @param aTarget
   *        The target container to be filled. May not be <code>null</code>.
   */
  void getAllMetaElements (@Nonnull Collection <? super IMetaElement> aTarget);

  /**
   * Find the meta element with the given name.
   *
   * @param sName
   *        The name to search. May be <code>null</code> or empty.
   * @return <code>null</code> if no such meta element exists.
   */
  @Nullable
  IMetaElement getMetaElementOfName (@Nullable String sName);

  /**
   * Check if a meta element with the given name exists.
   *
   * @param sName
   *        The name to check. May be <code>null</code> or empty.
   * @return <code>true</code> if a meta element with the passed name exists.
   */
  boolean containsMetaElementWithName (@Nullable String sName);

  /**
   * @return The number of contained meta elements. Always &ge; 0.
   */
  @Nonnegative
  int getMetaElementCount ();

  /**
   * @return <code>true</code> if at least one meta element is contained,
   *         <code>false</code> otherwise.
   */
  boolean hasMetaElements ();
}
