package com.liuqi.mi.entity;


import java.util.List;

public class Order {

  private int orderId;
  private double orderPrice;
  private String orderState;
  private String orderDate;
  private String consignee;
  private String consigneePhone;
  private String receivAddress;
  private String detailedAddress;
  private String postalCode;
  private String addressLabels;
  private int member_id;

  private int skip;
  private int size;

  private List<Orderproduct> orderproductList;


  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }


  public double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(double orderPrice) {
    this.orderPrice = orderPrice;
  }


  public String getOrderState() {
    return orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }


  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }


  public String getConsigneePhone() {
    return consigneePhone;
  }

  public void setConsigneePhone(String consigneePhone) {
    this.consigneePhone = consigneePhone;
  }


  public String getReceivAddress() {
    return receivAddress;
  }

  public void setReceivAddress(String receivAddress) {
    this.receivAddress = receivAddress;
  }


  public String getDetailedAddress() {
    return detailedAddress;
  }

  public void setDetailedAddress(String detailedAddress) {
    this.detailedAddress = detailedAddress;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public String getAddressLabels() {
    return addressLabels;
  }

  public void setAddressLabels(String addressLabels) {
    this.addressLabels = addressLabels;
  }

  public int getMember_id() {
    return member_id;
  }

  public void setMember_id(int member_id) {
    this.member_id = member_id;
  }

  public List<Orderproduct> getOrderproductList() {
    return orderproductList;
  }

  public void setOrderproductList(List<Orderproduct> orderproductList) {
    this.orderproductList = orderproductList;
  }

  public int getSkip() {
    return skip;
  }

  public void setSkip(int skip) {
    this.skip = skip;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", orderPrice=" + orderPrice +
            ", orderState='" + orderState + '\'' +
            ", orderDate='" + orderDate + '\'' +
            ", consignee='" + consignee + '\'' +
            ", consigneePhone='" + consigneePhone + '\'' +
            ", receivAddress='" + receivAddress + '\'' +
            ", detailedAddress='" + detailedAddress + '\'' +
            ", postalCode='" + postalCode + '\'' +
            ", addressLabels='" + addressLabels + '\'' +
            ", member_id=" + member_id +
            ", skip=" + skip +
            ", size=" + size +
            ", orderproductList=" + orderproductList +
            '}';
  }
}
