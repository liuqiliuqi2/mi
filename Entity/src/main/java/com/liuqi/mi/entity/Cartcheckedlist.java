package com.liuqi.mi.entity;


public class Cartcheckedlist {

  private int cartCheckedListId;
  private String image_url;
  private String cname;
  private String cprice;
  private String camount;
  private int orderId;
  private int cid;


  public int getCartCheckedListId() {
    return cartCheckedListId;
  }

  public void setCartCheckedListId(int cartCheckedListId) {
    this.cartCheckedListId = cartCheckedListId;
  }


  public String getImage_url() {
    return image_url;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public String getCprice() {
    return cprice;
  }

  public void setCprice(String cprice) {
    this.cprice = cprice;
  }

  public String getCamount() {
    return camount;
  }

  public void setCamount(String camount) {
    this.camount = camount;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  @Override
  public String toString() {
    return "Cartcheckedlist{" +
            "cartCheckedListId=" + cartCheckedListId +
            ", image_url='" + image_url + '\'' +
            ", cname='" + cname + '\'' +
            ", cprice='" + cprice + '\'' +
            ", camount='" + camount + '\'' +
            ", orderId=" + orderId +
            ", cid=" + cid +
            '}';
  }
}
