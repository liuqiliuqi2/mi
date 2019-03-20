package com.liuqi.mi.service;

import com.liuqi.mi.entity.Phone_Product;

import java.util.List;

public interface Phone_Product_Service {

    List<Phone_Product> getAllPhone_Product(Phone_Product phone_product);

    Phone_Product getPhone_ProductById(int id);

    int UpdatePhone_Product(Phone_Product phone_product);

    int DeletePhone_Product(int id);

    int InsertPhone_Product(Phone_Product phone_product);
}
