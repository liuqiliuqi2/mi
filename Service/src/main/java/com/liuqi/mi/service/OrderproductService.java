package com.liuqi.mi.service;

import com.liuqi.mi.entity.Orderproduct;

import java.util.List;

public interface OrderproductService {

//    List<Orderproduct> getOrderProductByorderState(int member_id,String orderState);


    List<Orderproduct> OrderproductOrderProductNameByOrderId(int orderId);

    int InsertOrderproduct();
}
