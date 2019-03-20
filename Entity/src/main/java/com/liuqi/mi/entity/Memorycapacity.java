package com.liuqi.mi.entity;


public class Memorycapacity {

  private int memoryCapacityId;
  private String memoryCapacitySize;


  public int getMemoryCapacityId() {
    return memoryCapacityId;
  }

  public void setMemoryCapacityId(int memoryCapacityId) {
    this.memoryCapacityId = memoryCapacityId;
  }


  public String getMemoryCapacitySize() {
    return memoryCapacitySize;
  }

  public void setMemoryCapacitySize(String memoryCapacitySize) {
    this.memoryCapacitySize = memoryCapacitySize;
  }

  @Override
  public String toString() {
    return "Memorycapacity{" +
            "memoryCapacityId=" + memoryCapacityId +
            ", memoryCapacitySize='" + memoryCapacitySize + '\'' +
            '}';
  }
}
