package com.liuqi.mi.entity;


public class Cart {

  private int cid;
  private String image_url;
  private String cname;
  private double cprice;
  private int camount;
  private int pid;
  private int member_id;


  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
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


  public double getCprice() {
    return cprice;
  }

  public void setCprice(double cprice) {
    this.cprice = cprice;
  }


  public int getCamount() {
    return camount;
  }

  public void setCamount(int camount) {
    this.camount = camount;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public int getMember_id() {
    return member_id;
  }

  public void setMember_id(int member_id) {
    this.member_id = member_id;
  }

  @Override
  public String toString() {
    return "Cart{" +
            "cid=" + cid +
            ", image_url='" + image_url + '\'' +
            ", cname='" + cname + '\'' +
            ", cprice=" + cprice +
            ", camount=" + camount +
            ", pid=" + pid +
            ", member_id=" + member_id +
            '}';
  }


}
