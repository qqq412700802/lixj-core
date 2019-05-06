package com.lixj;

public abstract class AbstractEntity
  implements Entity
{
  private static final long serialVersionUID = 1L;
  private Long id;
  private Integer version = 0;
  private Long lastAccess = 0L;
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Integer getVersion()
  {
    return this.version;
  }
  
  public void setVersion(Integer version)
  {
    this.version = version;
  }
  
  public Long getLastAccess()
  {
    return this.lastAccess;
  }
  
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
