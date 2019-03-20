package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Member;
import com.liuqi.mi.entity.Order;
import com.liuqi.mi.entity.Orderproduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    List<Order> getAllOrder(Order order);

    int getOrderCount();

    List<Order> getOrderByMember_idAndorderState(@Param("member_id") int member_id, @Param("orderState") String orderState);

    Order getOrderId(int member_id);

    Order OrderByOrderId(int orderId);

    int InsertOrder(Order order);

    int UpdateOrderState(@Param("orderId") int orderId, @Param("orderState") String orderState);
}
