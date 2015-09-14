package com.helger.html.hc.special;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;
import com.helger.css.media.CSSMediaList;
import com.helger.css.media.ICSSMediaList;
import com.helger.html.resource.css.ConstantCSSCodeProvider;
import com.helger.html.resource.css.ICSSCodeProvider;

/**
 * This is a very special list used only to group inline CSS code for correct
 * merging. It maintains the original order and combines only those with the
 * same media lists.
 *
 * @author Philip Helger
 */
public class InlineCSSList
{
  @Nonnull
  public static ICSSMediaList getSafeCSSMediaList (@Nullable final ICSSMediaList aMediaList)
  {
    if (aMediaList != null && !aMediaList.hasNoMediaOrAll ())
    {
      // A special media list is present that is neither null nor empty nor does
      // it contain the "all" keyword
      return aMediaList;
    }

    // Create a new one without any media
    return new CSSMediaList ();
  }

  private static final class Key
  {
    private final ICSSMediaList m_aMediaList;

    public Key (@Nonnull final ICSSMediaList aMediaList)
    {
      m_aMediaList = getSafeCSSMediaList (aMediaList);
    }

    @Nonnull
    public ICSSMediaList getMediaList ()
    {
      return m_aMediaList;
    }

    @Override
    public boolean equals (final Object o)
    {
      if (o == this)
        return true;
      if (o == null || !getClass ().equals (o.getClass ()))
        return false;
      final Key rhs = (Key) o;
      return m_aMediaList.equals (rhs.m_aMediaList);
    }

    @Override
    public int hashCode ()
    {
      return new HashCodeGenerator (this).append (m_aMediaList).getHashCode ();
    }

    @Override
    public String toString ()
    {
      return new ToStringGenerator (null).append ("MediaList", m_aMediaList).toString ();
    }
  }

  private static final class Item
  {
    private final Key m_aKey;
    private final StringBuilder m_aCSS = new StringBuilder ();

    public Item (@Nonnull final Key aKey)
    {
      m_aKey = ValueEnforcer.notNull (aKey, "Key");
    }

    void appendCSS (@Nonnull final CharSequence aInlineCSS)
    {
      m_aCSS.append (aInlineCSS);
    }

    @Nonnull
    Key getKey ()
    {
      return m_aKey;
    }

    @Nonnull
    public ICSSMediaList getMediaList ()
    {
      return m_aKey.getMediaList ();
    }

    @Nonnull
    public String getCSS ()
    {
      return m_aCSS.toString ();
    }
  }

  private final List <Item> m_aItems = new ArrayList <Item> ();

  public InlineCSSList ()
  {}

  public void addInlineCSS (@Nullable final ICSSMediaList aMediaList, @Nonnull final CharSequence aInlineCSS)
  {
    final Key aKey = new Key (aMediaList);
    final Item aLastItem = CollectionHelper.getLastElement (m_aItems);
    final Key aLastKey = aLastItem == null ? null : aLastItem.getKey ();
    Item aItemToUse;
    if (aLastKey != null && aLastKey.equals (aKey))
    {
      aItemToUse = aLastItem;
    }
    else
    {
      aItemToUse = new Item (aKey);
      m_aItems.add (aItemToUse);
    }
    aItemToUse.appendCSS (aInlineCSS);
  }

  void clear ()
  {
    m_aItems.clear ();
  }

  public boolean isEmpty ()
  {
    return m_aItems.isEmpty ();
  }

  @Nonnull
  @ReturnsMutableCopy
  public List <ICSSCodeProvider> getAll ()
  {
    final List <ICSSCodeProvider> ret = new ArrayList <ICSSCodeProvider> ();
    for (final Item aItem : m_aItems)
      ret.add (new ConstantCSSCodeProvider (aItem.getCSS (), null, aItem.getMediaList (), true));
    return ret;
  }
}