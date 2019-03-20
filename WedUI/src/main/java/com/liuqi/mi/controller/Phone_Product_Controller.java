package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.entity.Phone_Product;
import com.liuqi.mi.service.Phone_Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Phone_Product_json")
public class Phone_Product_Controller {

    @Autowired
    Phone_Product_Service phone_product_service;

    @RequestMapping("/getAllPhone_Product")
    @ResponseBody
    public R getAllPhone_Product(Phone_Product phone_product){
        return R.ok(phone_product_service.getAllPhone_Product(phone_product));
    }

    @RequestMapping("/DeletePhone_Product")
    @ResponseBody
    public R DeletePhone_Product(int id){
        System.out.println(id);
        return R.ok(phone_product_service.DeletePhone_Product(id));
    }

    @RequestMapping("/InsertPhone_Product")
    @ResponseBody
    public R InsertPhone_Product(Phone_Product phone_product){
        return R.ok(phone_product_service.InsertPhone_Product(phone_product));
    }

    @RequestMapping("/UpdatePhone_Product")
    @ResponseBody
    public R UpdatePhone_Product(Phone_Product phone_product){
        return R.ok(phone_product_service.UpdatePhone_Product(phone_product));
    }

}
