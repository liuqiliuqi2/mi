package com.liuqi.mi.entity;

import java.io.Serializable;

public class Phone_Product implements Serializable {

    private int id;
    private String phone_name;
    private String price;
    private String special_offer;
    private String image_url;
    private String product_describe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_name() {
        return phone_name;
    }

    public void setPhone_name(String phone_name) {
        this.phone_name = phone_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpecial_offer() {
        return special_offer;
    }

    public void setSpecial_offer(String special_offer) {
        this.special_offer = special_offer;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getProduct_describe() {
        return product_describe;
    }

    public void setProduct_describe(String product_describe) {
        this.product_describe = product_describe;
    }

    @Override
    public String toString() {
        return "Phone_Product{" +
                "id=" + id +
                ", phone_name='" + phone_name + '\'' +
                ", price='" + price + '\'' +
                ", special_offer='" + special_offer + '\'' +
                ", image_url='" + image_url + '\'' +
                ", product_describe='" + product_describe + '\'' +
                '}';
    }
}
