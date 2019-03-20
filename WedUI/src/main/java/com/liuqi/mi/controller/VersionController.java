package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Version")
public class VersionController {

    @Autowired
    VersionService versionService;

    @RequestMapping("/VersionBypid")
    @ResponseBody
    public R VersionBypid(int pid){
        return R.ok(versionService.VersionBypid(pid));
    }

}
