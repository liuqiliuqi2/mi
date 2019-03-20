package com.liuqi.mi.entity;


public class Randomaccessmemory {

  private int randomAccessMemoryId;
  private String randomAccessMemorySize;


  public int getRandomAccessMemoryId() {
    return randomAccessMemoryId;
  }

  public void setRandomAccessMemoryId(int randomAccessMemoryId) {
    this.randomAccessMemoryId = randomAccessMemoryId;
  }


  public String getRandomAccessMemorySize() {
    return randomAccessMemorySize;
  }

  public void setRandomAccessMemorySize(String randomAccessMemorySize) {
    this.randomAccessMemorySize = randomAccessMemorySize;
  }

  @Override
  public String toString() {
    return "Randomaccessmemory{" +
            "randomAccessMemoryId=" + randomAccessMemoryId +
            ", randomAccessMemorySize='" + randomAccessMemorySize + '\'' +
            '}';
  }
}
