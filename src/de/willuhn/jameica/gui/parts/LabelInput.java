/**********************************************************************
 * $Source: /cvsroot/jameica/jameica/src/de/willuhn/jameica/gui/parts/Attic/LabelInput.java,v $
 * $Revision: 1.4 $
 * $Date: 2004/02/24 22:46:53 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by willuhn.webdesign
 * All rights reserved
 *
 **********************************************************************/
package de.willuhn.jameica.gui.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import de.willuhn.jameica.gui.util.Style;

/**
 * Das ist ein Dummy-InputFeld.
 * Denn es ist kein Eingabe-Feld sondern lediglich ein Text.
 * Das Label ist z.Bsp. sinnvoll, wenn Werte zwar angezeigt aber nicht geaendert werden sollen.
 * @author willuhn
 */
public class LabelInput extends Input
{
	private Label label;
  private String value;

  /**
   * Erzeugt ein neues Label mit dem angegebenen Wert.
   * @param value anzuzeigender Wert.
   */
  public LabelInput(String value)
  {
    this.value = value;
  }

  /**
   * @see de.willuhn.jameica.gui.parts.Input#getControl()
   */
  public Control getControl()
  {
    label = new Label(getParent(),SWT.WRAP);
		label.setBackground(Style.COLOR_BG);
    label.setText(value);
    return label;

  }

  /**
   * @see de.willuhn.jameica.gui.parts.Input#getValue()
   */
  public String getValue()
  {
    return null;
  }

  /**
   * @see de.willuhn.jameica.gui.parts.Input#focus()
   */
  public void focus()
  {
  }

  /**
   * @see de.willuhn.jameica.gui.parts.Input#setValue(java.lang.String)
   */
  public void setValue(String value)
  {
		if (value == null || label == null)
			return;
		this.label.setText(value);
		this.label.redraw();
  }

  /**
   * @see de.willuhn.jameica.gui.parts.Input#disable()
   */
  public void disable()
  {
  }

  /**
   * @see de.willuhn.jameica.gui.parts.Input#enable()
   */
  public void enable()
  {
  }


}

/*********************************************************************
 * $Log: LabelInput.java,v $
 * Revision 1.4  2004/02/24 22:46:53  willuhn
 * @N GUI refactoring
 *
 * Revision 1.3  2004/02/18 01:40:30  willuhn
 * @N new white style
 *
 * Revision 1.2  2004/02/17 00:53:47  willuhn
 * *** empty log message ***
 *
 * Revision 1.1  2004/01/28 20:51:24  willuhn
 * @C gui.views.parts moved to gui.parts
 * @C gui.views.util moved to gui.util
 *
 * Revision 1.8  2004/01/23 00:29:03  willuhn
 * *** empty log message ***
 *
 * Revision 1.7  2003/12/29 16:29:47  willuhn
 * @N javadoc
 *
 * Revision 1.6  2003/12/16 02:27:44  willuhn
 * *** empty log message ***
 *
 * Revision 1.5  2003/12/11 21:00:54  willuhn
 * @C refactoring
 *
 * Revision 1.4  2003/12/10 00:47:12  willuhn
 * @N SearchDialog done
 * @N FatalErrorView
 *
 * Revision 1.3  2003/12/01 21:22:58  willuhn
 * *** empty log message ***
 *
 * Revision 1.2  2003/12/01 20:28:58  willuhn
 * @B filter in DBIteratorImpl
 * @N InputFelder generalisiert
 *
 * Revision 1.1  2003/11/24 23:01:58  willuhn
 * @N added settings
 **********************************************************************/