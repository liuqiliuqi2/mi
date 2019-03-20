package com.liuqi.mi.entity;


public class Picture {

  private int pictureId;
  private String pictureSrc;


  public int getPictureId() {
    return pictureId;
  }

  public void setPictureId(int pictureId) {
    this.pictureId = pictureId;
  }


  public String getPictureSrc() {
    return pictureSrc;
  }

  public void setPictureSrc(String pictureSrc) {
    this.pictureSrc = pictureSrc;
  }


  @Override
  public String toString() {
    return "Picture{" +
            "pictureId=" + pictureId +
            ", pictureSrc='" + pictureSrc + '\'' +
            '}';
  }
}
