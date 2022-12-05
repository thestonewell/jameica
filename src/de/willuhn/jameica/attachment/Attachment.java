/**********************************************************************
 *
 * Copyright (c) 2022 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * Jameica License.  Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/

package de.willuhn.jameica.attachment;

import java.io.Serializable;

/**
 * Kapselt die Daten eines einzelnen Attachments.
 */
public class Attachment implements Serializable
{
  static final long serialVersionUID = 1L;

  private String filename  = null;
  private String uuid      = null;
  private String storageId = null;
  private Context context  = null;
  
  /**
   * Liefert den Dateinamen.
   * @return filename der Dateiname.
   */
  public String getFilename()
  {
    return filename;
  }
  
  /**
   * Speichert den Dateinamen.
   * @param filename der Dateiname.
   */
  public void setFilename(String filename)
  {
    this.filename = filename;
  }
  
  /**
   * Liefert die UUID.
   * @return uuid die UUID.
   */
  public String getUuid()
  {
    return uuid;
  }
  
  /**
   * Speichert die UUID.
   * @param uuid die UUID.
   */
  public void setUuid(String uuid)
  {
    this.uuid = uuid;
  }
  
  /**
   * Liefert den Identifier f�r das Storage-System, in dem das Attachment gespeichert ist.
   * @return storage der Identifier f�r das Storage-System, in dem das Attachment gespeichert ist.
   */
  public String getStorageId()
  {
    return storageId;
  }
  
  /**
   * Speichert den Identifier f�r das Storage-System, in dem das Attachment gespeichert ist.
   * @param storage der Identifier f�r das Storage-System, in dem das Attachment gespeichert ist.
   */
  public void setStorageId(String storage)
  {
    this.storageId = storage;
  }
  
  /**
   * Liefert den Context des Attachments.
   * @return context der Context des Attachments.
   */
  public Context getContext()
  {
    return context;
  }
  
  /**
   * Speichert den Context des Attachments.
   * @param context der Context des Attachments.
   */
  public void setContext(Context context)
  {
    this.context = context;
  }
}