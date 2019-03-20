package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.Phone_Product_Dao;
import com.liuqi.mi.entity.Phone_Product;
import com.liuqi.mi.service.Phone_Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Phone_Product_ServiceImpl implements Phone_Product_Service {

    @Autowired
    Phone_Product_Dao phone_product_dao;

    public List<Phone_Product> getAllPhone_Product(Phone_Product phone_product) {
        return phone_product_dao.getAllPhone_Product(phone_product);
    }

    public Phone_Product getPhone_ProductById(int id) {
        return phone_product_dao.getPhone_ProductById(id);
    }

    public int UpdatePhone_Product(Phone_Product phone_product) {
        return phone_product_dao.UpdatePhone_Product(phone_product);
    }

    public int DeletePhone_Product(int id) {
        return phone_product_dao.DeletePhone_Product(id);
    }

    public int InsertPhone_Product(Phone_Product phone_product) {
        return phone_product_dao.InsertPhone_Product(phone_product);
    }
}
