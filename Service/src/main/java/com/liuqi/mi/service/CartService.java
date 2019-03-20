package com.liuqi.mi.service;

import com.liuqi.mi.entity.Cart;

import java.util.List;

public interface CartService {

    List<Cart> getAllCart(int member_id);

    List<Cart> getCartByMaxCid(int member_id);

    Cart CartByCid(int cid);

    Cart CartByCname(String cname, int member_id);

    int getCartProductCount(int member_id);

    int DeleteCart(int cid);

    int MoreDeleteCart(List<Integer> cids);

    int UpdateCartProductCamount(int cid, int camount);

    int InsertCartProduct(Cart cart);

}
