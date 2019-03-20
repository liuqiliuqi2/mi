package com.liuqi.mi.entity;


public class Orderproduct {

  private int orderProductId;
  private String orderProductName;
  private String orderProductPrice;
  private String orderProductAmount;
  private String orderPictureSrc;
  private int orderId;

//  private Order order;


  public int getOrderProductId() {
    return orderProductId;
  }

  public void setOrderProductId(int orderProductId) {
    this.orderProductId = orderProductId;
  }

  public String getOrderProductName() {
    return orderProductName;
  }

  public void setOrderProductName(String orderProductName) {
    this.orderProductName = orderProductName;
  }


  public String getOrderProductPrice() {
    return orderProductPrice;
  }

  public void setOrderProductPrice(String orderProductPrice) {
    this.orderProductPrice = orderProductPrice;
  }


  public String getOrderProductAmount() {
    return orderProductAmount;
  }

  public void setOrderProductAmount(String orderProductAmount) {
    this.orderProductAmount = orderProductAmount;
  }


  public String getOrderPictureSrc() {
    return orderPictureSrc;
  }

  public void setOrderPictureSrc(String orderPictureSrc) {
    this.orderPictureSrc = orderPictureSrc;
  }


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

//  public Order getOrder() {
//    return order;
//  }
//
//  public void setOrder(Order order) {
//    this.order = order;
//  }

  @Override
  public String toString() {
    return "Orderproduct{" +
            "orderProductId=" + orderProductId +
            ", orderProductName='" + orderProductName + '\'' +
            ", orderProductPrice='" + orderProductPrice + '\'' +
            ", orderProductAmount='" + orderProductAmount + '\'' +
            ", orderPictureSrc='" + orderPictureSrc + '\'' +
            ", orderId=" + orderId +
//            ", order=" + order +
            '}';
  }
}
