package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {

    List<Cart> getAllCart(int member_id);

    List<Cart> getCartByMaxCid(int member_id);

    Cart CartByCid(int cid);

    Cart CartByCname(@Param("cname") String cname, @Param("member_id") int member_id);

    int getCartProductCount(int member_id);

    int DeleteCart(int cid);

    int MoreDeleteCart(@Param("cids") List<Integer> cids);

    int UpdateCartProductCamount(@Param("cid") int cid, @Param("camount") int camount);

    int InsertCartProduct(Cart cart);





}
