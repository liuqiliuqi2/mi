package com.liuqi.mi.entity;


public class Price {

  private int priceId;
  private double price;
  private double specialOffer;


  public int getPriceId() {
    return priceId;
  }

  public void setPriceId(int priceId) {
    this.priceId = priceId;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public double getSpecialOffer() {
    return specialOffer;
  }

  public void setSpecialOffer(double specialOffer) {
    this.specialOffer = specialOffer;
  }


  @Override
  public String toString() {
    return "Price{" +
            "priceId=" + priceId +
            ", price=" + price +
            ", specialOffer=" + specialOffer +
            '}';
  }
}
