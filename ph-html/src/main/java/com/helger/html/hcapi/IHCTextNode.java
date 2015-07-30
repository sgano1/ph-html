package com.helger.html.hcapi;

import javax.annotation.Nullable;

import com.helger.commons.microdom.MicroText;

public interface IHCTextNode extends IHCNode
{
  /**
   * @return The unescaped text. Never <code>null</code>.
   */
  String getText ();

  IHCTextNode setText (@Nullable String sText);

  IHCTextNode setText (char [] aChars);

  IHCTextNode setText (char [] aChars, int nOfs, int nLen);

  IHCTextNode prependText (@Nullable String sText);

  IHCTextNode prependText (char [] aChars);

  IHCTextNode prependText (char [] aChars, int nOfs, int nLen);

  IHCTextNode appendText (@Nullable String sText);

  IHCTextNode appendText (char [] aChars);

  IHCTextNode appendText (char [] aChars, int nOfs, int nLen);

  /**
   * Enable or disable XML escaping in the final document. By default all text
   * is escaped ({@link MicroText#DEFAULT_ESCAPE}), but for certain special
   * cases (like script elements in HTML), XML escaping must be disabled.
   *
   * @param bEscape
   *        <code>true</code> to enable escaping (default), <code>false</code>
   *        to disable it
   * @return this
   */
  IHCTextNode setEscape (boolean bEscape);

  /**
   * @return <code>true</code> if XML escaping is enabled, <code>false</code> if
   *         it is disabled
   */
  boolean isEscape ();
}
