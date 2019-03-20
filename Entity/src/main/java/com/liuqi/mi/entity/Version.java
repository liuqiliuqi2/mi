package com.liuqi.mi.entity;

public class Version {

  private int versionId;
  private int randomAccessMemoryId;
  private int memoryCapacityId;
  private String versionName;
  private int pid;
  private int priceId;

  private Randomaccessmemory randomaccessmemory;
  private Memorycapacity memorycapacity;
  private Product product;
  private Price price;


  public int getVersionId() {
    return versionId;
  }

  public void setVersionId(int versionId) {
    this.versionId = versionId;
  }


  public int getRandomAccessMemoryId() {
    return randomAccessMemoryId;
  }

  public void setRandomAccessMemoryId(int randomAccessMemoryId) {
    this.randomAccessMemoryId = randomAccessMemoryId;
  }


  public int getMemoryCapacityId() {
    return memoryCapacityId;
  }

  public void setMemoryCapacityId(int memoryCapacityId) {
    this.memoryCapacityId = memoryCapacityId;
  }


  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public int getPriceId() {
    return priceId;
  }

  public void setPriceId(int priceId) {
    this.priceId = priceId;
  }

  public Randomaccessmemory getRandomaccessmemory() {
    return randomaccessmemory;
  }

  public void setRandomaccessmemory(Randomaccessmemory randomaccessmemory) {
    this.randomaccessmemory = randomaccessmemory;
  }

  public Memorycapacity getMemorycapacity() {
    return memorycapacity;
  }

  public void setMemorycapacity(Memorycapacity memorycapacity) {
    this.memorycapacity = memorycapacity;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Version{" +
            "versionId=" + versionId +
            ", randomAccessMemoryId=" + randomAccessMemoryId +
            ", memoryCapacityId=" + memoryCapacityId +
            ", versionName='" + versionName + '\'' +
            ", pid=" + pid +
            ", priceId=" + priceId +
            ", randomaccessmemory=" + randomaccessmemory +
            ", memorycapacity=" + memorycapacity +
            ", product=" + product +
            ", price=" + price +
            '}';
  }
}
