package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.OrderDao;
import com.liuqi.mi.entity.Order;
import com.liuqi.mi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl  implements OrderService {

    @Autowired
    OrderDao orderDao;

    public List<Order> getAllOrder(Order order) {
        return orderDao.getAllOrder(order);
    }

    public int getOrderCount() {
        return orderDao.getOrderCount();
    }

    public List<Order> getOrderByMember_idAndorderState(int member_id, String orderState) {
        return orderDao.getOrderByMember_idAndorderState(member_id, orderState);
    }

    public Order getOrderId(int member_id) {
        return orderDao.getOrderId(member_id);
    }

    public Order OrderByOrderId(int orderId) {
        return orderDao.OrderByOrderId(orderId);
    }

    public int InsertOrder(Order order) {
        return orderDao.InsertOrder(order);
    }

    public int UpdateOrderState(int orderId, String orderState) {
        return orderDao.UpdateOrderState(orderId, orderState);
    }
}
