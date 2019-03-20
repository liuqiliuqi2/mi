package com.liuqi.mi.service;

import com.liuqi.mi.entity.Cartcheckedlist;

import java.util.List;

public interface CartcheckedlistService {

    List<Cartcheckedlist> getCartcheckedlist();

    int InsertCartCheckedList(List<Integer> cids);

    int UpdateCartcheckedlist(int orderId);

    int DeleteCartcheckedlist();
}
