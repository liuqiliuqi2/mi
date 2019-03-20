package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Order;
import com.liuqi.mi.entity.Orderproduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderproductDao {

//    List<Orderproduct> getOrderProductByorderState(@Param("member_id") int member_id,@Param("orderState") String orderState);


    List<Orderproduct> OrderproductOrderProductNameByOrderId(int orderId);

    int InsertOrderproduct();
}
