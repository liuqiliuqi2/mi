package com.liuqi.mi.service;

import com.liuqi.mi.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrder(Order order);

    int getOrderCount();

    List<Order> getOrderByMember_idAndorderState(int member_id,String orderState);

    Order getOrderId(int member_id);

    Order OrderByOrderId(int orderId);

    int InsertOrder(Order order);

    int UpdateOrderState(int orderId,String orderState);
}
