package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.OrderproductDao;
import com.liuqi.mi.entity.Orderproduct;
import com.liuqi.mi.service.OrderproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderproductServiceImpl implements OrderproductService {

    @Autowired
    OrderproductDao orderproductDao;

//    public List<Orderproduct> getOrderProductByorderState(int member_id,String orderState) {
//        return orderproductDao.getOrderProductByorderState(member_id,orderState);
//    }

    public List<Orderproduct> OrderproductOrderProductNameByOrderId(int orderId) {
        return orderproductDao.OrderproductOrderProductNameByOrderId(orderId);
    }

    public int InsertOrderproduct() {
        return orderproductDao.InsertOrderproduct();
    }
}
