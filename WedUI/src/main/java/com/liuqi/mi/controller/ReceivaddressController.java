package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.entity.Receivaddress;
import com.liuqi.mi.service.ReceivaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Receivaddress")
public class ReceivaddressController {

    @Autowired
    ReceivaddressService receivaddressService;

    @RequestMapping("/getReceivaddressByMember_id")
    @ResponseBody
    public R getReceivaddressByMember_id(int member_id){
        return R.ok(receivaddressService.getReceivaddressByMember_id(member_id));
    }

    @RequestMapping("/InsertReceivaddress")
    @ResponseBody
    public R InsertReceivaddress(Receivaddress receivaddress){
        return R.ok(receivaddressService.InsertReceivaddress(receivaddress));
    }

    @RequestMapping("/UpdateReceivaddress")
    @ResponseBody
    public R UpdateReceivaddress(Receivaddress receivaddress){
        return R.ok(receivaddressService.UpdateReceivaddress(receivaddress));
    }
}
