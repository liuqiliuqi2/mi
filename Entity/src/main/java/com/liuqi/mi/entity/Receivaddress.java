package com.liuqi.mi.entity;


public class Receivaddress {

  private int receivAddressId;
  private String consignee;
  private String consigneePhone;
  private String receivAddress;
  private String detailedAddress;
  private String postalCode;
  private String addressLabels;
  private int member_id;


  public int getReceivAddressId() {
    return receivAddressId;
  }

  public void setReceivAddressId(int receivAddressId) {
    this.receivAddressId = receivAddressId;
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

  @Override
  public String toString() {
    return "Receivaddress{" +
            "receivAddressId=" + receivAddressId +
            ", consignee='" + consignee + '\'' +
            ", consigneePhone='" + consigneePhone + '\'' +
            ", receivAddress='" + receivAddress + '\'' +
            ", detailedAddress='" + detailedAddress + '\'' +
            ", postalCode='" + postalCode + '\'' +
            ", addressLabels='" + addressLabels + '\'' +
            ", member_id=" + member_id +
            '}';
  }
}
