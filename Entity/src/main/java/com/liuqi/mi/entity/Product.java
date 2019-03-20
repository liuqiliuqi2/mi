package com.liuqi.mi.entity;


public class Product {

  private int pid;
  private String pname;
  private int ptid;
  private String new_product;
  private String image_url;
  private String product_state;
  private String describes;
  private String screen_size;
  private String screen_sizemin;
  private String screen_sizemax;
  private String rear_camera;
  private String front_facing_camera;
  private String battery_capacity;
  private String battery_capacitymin;
  private String battery_capacitymax;
  private String type_of_network;
  private String screen_resolution;
  private String number_of_CPU_core;
  private String milestone;
  private String milestonemin;
  private String milestonemax;
  private String network_model;
  private String product_insert_date;

  private int priceId;

  private int skip;
  private int size;

  private Price price;


  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public int getPtid() {
    return ptid;
  }

  public void setPtid(int ptid) {
    this.ptid = ptid;
  }

  public String getNew_product() {
    return new_product;
  }

  public void setNew_product(String new_product) {
    this.new_product = new_product;
  }

  public String getImage_url() {
    return image_url;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public String getProduct_state() {
    return product_state;
  }

  public void setProduct_state(String product_state) {
    this.product_state = product_state;
  }

  public String getDescribes() {
    return describes;
  }

  public void setDescribes(String describes) {
    this.describes = describes;
  }

  public String getScreen_size() {
    return screen_size;
  }

  public void setScreen_size(String screen_size) {
    this.screen_size = screen_size;
  }

  public String getScreen_sizemin() {
    return screen_sizemin;
  }

  public void setScreen_sizemin(String screen_sizemin) {
    this.screen_sizemin = screen_sizemin;
  }

  public String getScreen_sizemax() {
    return screen_sizemax;
  }

  public void setScreen_sizemax(String screen_sizemax) {
    this.screen_sizemax = screen_sizemax;
  }

  public String getRear_camera() {
    return rear_camera;
  }

  public void setRear_camera(String rear_camera) {
    this.rear_camera = rear_camera;
  }

  public String getFront_facing_camera() {
    return front_facing_camera;
  }

  public void setFront_facing_camera(String front_facing_camera) {
    this.front_facing_camera = front_facing_camera;
  }

  public String getBattery_capacity() {
    return battery_capacity;
  }

  public void setBattery_capacity(String battery_capacity) {
    this.battery_capacity = battery_capacity;
  }

  public String getBattery_capacitymin() {
    return battery_capacitymin;
  }

  public void setBattery_capacitymin(String battery_capacitymin) {
    this.battery_capacitymin = battery_capacitymin;
  }

  public String getBattery_capacitymax() {
    return battery_capacitymax;
  }

  public void setBattery_capacitymax(String battery_capacitymax) {
    this.battery_capacitymax = battery_capacitymax;
  }

  public String getType_of_network() {
    return type_of_network;
  }

  public void setType_of_network(String type_of_network) {
    this.type_of_network = type_of_network;
  }

  public String getScreen_resolution() {
    return screen_resolution;
  }

  public void setScreen_resolution(String screen_resolution) {
    this.screen_resolution = screen_resolution;
  }

  public String getNumber_of_CPU_core() {
    return number_of_CPU_core;
  }

  public void setNumber_of_CPU_core(String number_of_CPU_core) {
    this.number_of_CPU_core = number_of_CPU_core;
  }

  public String getMilestone() {
    return milestone;
  }

  public void setMilestone(String milestone) {
    this.milestone = milestone;
  }

  public String getMilestonemin() {
    return milestonemin;
  }

  public void setMilestonemin(String milestonemin) {
    this.milestonemin = milestonemin;
  }

  public String getMilestonemax() {
    return milestonemax;
  }

  public void setMilestonemax(String milestonemax) {
    this.milestonemax = milestonemax;
  }

  public String getNetwork_model() {
    return network_model;
  }

  public void setNetwork_model(String network_model) {
    this.network_model = network_model;
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

  public String getProduct_insert_date() {
    return product_insert_date;
  }

  public void setProduct_insert_date(String product_insert_date) {
    this.product_insert_date = product_insert_date;
  }

  public int getPriceId() {
    return priceId;
  }

  public void setPriceId(int priceId) {
    this.priceId = priceId;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
            "pid=" + pid +
            ", pname='" + pname + '\'' +
            ", ptid=" + ptid +
            ", new_product='" + new_product + '\'' +
            ", image_url='" + image_url + '\'' +
            ", product_state='" + product_state + '\'' +
            ", describes='" + describes + '\'' +
            ", screen_size='" + screen_size + '\'' +
            ", screen_sizemin='" + screen_sizemin + '\'' +
            ", screen_sizemax='" + screen_sizemax + '\'' +
            ", rear_camera='" + rear_camera + '\'' +
            ", front_facing_camera='" + front_facing_camera + '\'' +
            ", battery_capacity='" + battery_capacity + '\'' +
            ", battery_capacitymin='" + battery_capacitymin + '\'' +
            ", battery_capacitymax='" + battery_capacitymax + '\'' +
            ", type_of_network='" + type_of_network + '\'' +
            ", screen_resolution='" + screen_resolution + '\'' +
            ", number_of_CPU_core='" + number_of_CPU_core + '\'' +
            ", milestone='" + milestone + '\'' +
            ", milestonemin='" + milestonemin + '\'' +
            ", milestonemax='" + milestonemax + '\'' +
            ", network_model='" + network_model + '\'' +
            ", product_insert_date='" + product_insert_date + '\'' +
            ", skip=" + skip +
            ", size=" + size +
            ", price=" + price +
            '}';
  }

}
