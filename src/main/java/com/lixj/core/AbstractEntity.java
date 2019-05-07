package com.lixj.core;

public abstract class AbstractEntity
  implements Entity
{
  private static final long serialVersionUID = 1L;
  private Long id;
  private Integer version = 0;
  private Long lastAccess = 0L;

  @Override
  public Long getId()
  {
    return this.id;
  }
  
  @Override
  public void setId(Long id)
  {
    this.id = id;
  }
  
  @Override
  public Integer getVersion()
  {
    return this.version;
  }
  
  @Override
  public void setVersion(Integer version)
  {
    this.version = version;
  }
  
  @Override
  public Long getLastAccess()
  {
    return this.lastAccess;
  }
  
  @Override
  public void setLastAccess(Long lastAccess)
  {
    this.lastAccess = lastAccess;
  }

  @Override
  public String toString() {
    return "AbstractEntity{" +
            "id=" + id +
            ", version=" + version +
            ", lastAccess=" + lastAccess +
            '}';
  }
}
