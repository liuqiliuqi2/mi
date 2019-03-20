package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.CartcheckedlistDao;
import com.liuqi.mi.entity.Cartcheckedlist;
import com.liuqi.mi.service.CartcheckedlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartcheckedlistServiceImpl implements CartcheckedlistService {

    @Autowired
    CartcheckedlistDao cartcheckedlistDao;

    public List<Cartcheckedlist> getCartcheckedlist() {
        return cartcheckedlistDao.getCartcheckedlist();
    }

    public int InsertCartCheckedList(List<Integer> cids) {
        if(cids==null||cids.size()<=0) {
            return 0;
        }
        return cartcheckedlistDao.InsertCartCheckedList(cids);
    }

    public int UpdateCartcheckedlist(int orderId) {
        return cartcheckedlistDao.UpdateCartcheckedlist(orderId);
    }

    public int DeleteCartcheckedlist() {
        return cartcheckedlistDao.DeleteCartcheckedlist();
    }
}
