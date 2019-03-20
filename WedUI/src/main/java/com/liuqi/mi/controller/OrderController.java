package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.entity.Order;
import com.liuqi.mi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/getAllOrder")
    @ResponseBody
    public R getAllOrder(Order order){
        return R.ok(orderService.getAllOrder(order));
    }

    @RequestMapping("/getOrderCount")
    @ResponseBody
    public R getOrderCount(){
        return R.ok(orderService.getOrderCount());
    }

    @RequestMapping("/getOrderByMember_idAndorderState")
    @ResponseBody
    public R getOrderByMember_idAndorderState(int member_id,String orderState){
        return R.ok(orderService.getOrderByMember_idAndorderState(member_id,orderState));
    }

    @RequestMapping("/getOrderId")
    @ResponseBody
    public R getOrderId(int member_id){
        return R.ok(orderService.getOrderId(member_id));
    }

    @RequestMapping("/OrderByOrderId")
    @ResponseBody
    public R OrderByOrderId(int orderId){
        return R.ok(orderService.OrderByOrderId(orderId));
    }

    @RequestMapping("/InsertOrder")
    @ResponseBody
    public R InsertOrder(Order order){
        return R.ok(orderService.InsertOrder(order));
    }

    @RequestMapping("/UpdateOrderState")
    @ResponseBody
    public R UpdateOrderState(int orderId,String orderState){
        return R.ok(orderService.UpdateOrderState(orderId,orderState));
    }

}
