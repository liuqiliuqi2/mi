package com.liuqi.mi.controller;


import com.liuqi.mi.common.R;
import com.liuqi.mi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/admin_validate")
    @ResponseBody
    public R admin_validate(String admin_name){
        return R.ok(adminService.AdminByAdmin_name(admin_name));
    }


}
