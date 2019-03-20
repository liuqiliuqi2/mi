package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Cartcheckedlist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartcheckedlistDao {

    List<Cartcheckedlist> getCartcheckedlist();

    int InsertCartCheckedList(@Param("cids") List<Integer> cids);

    int UpdateCartcheckedlist(int orderId);

    int DeleteCartcheckedlist();
}
