package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.service.OrderproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Orderproduct")
public class OrderproductController {

    @Autowired
    OrderproductService orderproductService;

//    @RequestMapping("/getOrderProductByorderState")
//    @ResponseBody
//    public R getOrderProductByorderState(int member_id,String orderState){
//        return R.ok(orderproductService.getOrderProductByorderState(member_id,orderState));
//    }

    @RequestMapping("/OrderproductOrderProductNameByOrderId")
    @ResponseBody
    public R OrderproductOrderProductNameByOrderId(int orderId){
        return R.ok(orderproductService.OrderproductOrderProductNameByOrderId(orderId));
    }

    @RequestMapping("/InsertOrderproduct")
    @ResponseBody
    public R InsertOrderproduct(){
        return R.ok(orderproductService.InsertOrderproduct());
    }
}
