package com.liuqi.mi.service.Impl;


import com.liuqi.mi.dao.CartDao;
import com.liuqi.mi.entity.Cart;
import com.liuqi.mi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartDao cartDao;

    public List<Cart> getAllCart(int member_id) {
        return cartDao.getAllCart(member_id);
    }

    public List<Cart> getCartByMaxCid(int member_id) {
        return cartDao.getCartByMaxCid(member_id);
    }

    public Cart CartByCid(int cid) {
        return cartDao.CartByCid(cid);
    }

    public Cart CartByCname(String cname, int member_id) {
        return cartDao.CartByCname(cname,member_id);
    }

    public int getCartProductCount(int member_id) {
        return cartDao.getCartProductCount(member_id);
    }

    public int DeleteCart(int cid) {
        return cartDao.DeleteCart(cid);
    }

    public int MoreDeleteCart(List<Integer> cids) {
        if(cids==null||cids.size()<=0) {
            return 0;
        }
        return cartDao.MoreDeleteCart(cids);
    }

    public int UpdateCartProductCamount(int cid, int camount) {
        return cartDao.UpdateCartProductCamount(cid, camount);
    }

    public int InsertCartProduct(Cart cart) {
        return cartDao.InsertCartProduct(cart);
    }
}
