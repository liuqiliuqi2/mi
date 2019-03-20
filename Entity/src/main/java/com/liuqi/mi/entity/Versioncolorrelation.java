package com.liuqi.mi.entity;


public class Versioncolorrelation {

  private int versionColorId;
  private int versionId;
  private int colorId;
  private int pictureId;
  private int versionColorAmount;

  private Version version;
  private Color color;
  private Picture picture;


  public int getVersionColorId() {
    return versionColorId;
  }

  public void setVersionColorId(int versionColorId) {
    this.versionColorId = versionColorId;
  }

  public int getVersionId() {
    return versionId;
  }

  public void setVersionId(int versionId) {
    this.versionId = versionId;
  }

  public int getColorId() {
    return colorId;
  }

  public void setColorId(int colorId) {
    this.colorId = colorId;
  }

  public int getPictureId() {
    return pictureId;
  }

  public void setPictureId(int pictureId) {
    this.pictureId = pictureId;
  }

  public int getVersionColorAmount() {
    return versionColorAmount;
  }

  public void setVersionColorAmount(int versionColorAmount) {
    this.versionColorAmount = versionColorAmount;
  }

  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Picture getPicture() {
    return picture;
  }

  public void setPicture(Picture picture) {
    this.picture = picture;
  }

  @Override
  public String toString() {
    return "Versioncolorrelation{" +
            "versionColorId=" + versionColorId +
            ", versionId=" + versionId +
            ", colorId=" + colorId +
            ", pictureId=" + pictureId +
            ", versionColorAmount=" + versionColorAmount +
            ", version=" + version +
            ", color=" + color +
            ", picture=" + picture +
            '}';
  }


}
