package com.lixj.core;

import java.io.Serializable;

public abstract interface Entity
  extends Serializable
{
  public abstract Long getId();
  
  public abstract void setId(Long paramLong);
  
  public abstract Integer getVersion();
  
  public abstract void setVersion(Integer paramInteger);
  
  public abstract Long getLastAccess();
  
  public abstract void setLastAccess(Long paramLong);
  
  public abstract String toString();

}
