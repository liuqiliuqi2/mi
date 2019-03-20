package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.service.CartcheckedlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Cartcheckedlist")
public class CartcheckedlistController {

    @Autowired
    CartcheckedlistService cartcheckedlistService;

    @RequestMapping("/getCartcheckedlist")
    @ResponseBody
    public R getCartcheckedlist(){
        return R.ok(cartcheckedlistService.getCartcheckedlist());
    }

    @RequestMapping("/InsertCartCheckedList")
    @ResponseBody
    public R InsertCartCheckedList(@RequestBody List<Integer> cids){
        return R.ok(cartcheckedlistService.InsertCartCheckedList(cids));
    }

    @RequestMapping("/UpdateCartcheckedlist")
    @ResponseBody
    public R UpdateCartcheckedlist(int orderId){
        return R.ok(cartcheckedlistService.UpdateCartcheckedlist(orderId));
    }

    @RequestMapping("/DeleteCartcheckedlist")
    @ResponseBody
    public R DeleteCartcheckedlist(){
        return R.ok(cartcheckedlistService.DeleteCartcheckedlist());
    }


}
