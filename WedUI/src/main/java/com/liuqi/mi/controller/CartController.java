package com.liuqi.mi.controller;


import com.liuqi.mi.common.R;
import com.liuqi.mi.entity.Cart;
import com.liuqi.mi.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/getAllCart")
    @ResponseBody
    public R getAllCart(int member_id){
        return R.ok(cartService.getAllCart(member_id));
    }

    @RequestMapping("/getCartByMaxCid")
    @ResponseBody
    public R getCartByMaxCid(int member_id){
        return R.ok(cartService.getCartByMaxCid(member_id));
    }

    @RequestMapping("/CartByCid")
    @ResponseBody
    public R CartByCid(int cid){
        return R.ok(cartService.CartByCid(cid));
    }

    @RequestMapping("/CartByCname")
    @ResponseBody
    public R CartByCname(String cname, int member_id){
        return R.ok(cartService.CartByCname(cname,member_id));
    }

    @RequestMapping("/getCartProductCount")
    @ResponseBody
    public R getCartProductCount(int member_id){
        return R.ok(cartService.getCartProductCount(member_id));
    }

    @RequestMapping("/MoreDeleteCart")
    @ResponseBody
    public R MoreDeleteCart(@RequestBody List<Integer> cids){
        return R.ok(cartService.MoreDeleteCart(cids));
    }

    @RequestMapping("/DeleteCart")
    @ResponseBody
    public R DeleteCart(int cid){
        return R.ok(cartService.DeleteCart(cid));
    }

    @RequestMapping("/UpdateCartProductCamount")
    @ResponseBody
    public R UpdateCartProductCamount(int cid, int camount){
        return R.ok(cartService.UpdateCartProductCamount(cid,camount));
    }

    @RequestMapping("/InsertCartProduct")
    @ResponseBody
    public R InsertCartProduct(Cart cart){
        return R.ok(cartService.InsertCartProduct(cart));
    }

}
