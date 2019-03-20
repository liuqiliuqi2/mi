package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.service.VersioncolorrelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/VersionColorRelation")
public class VersioncolorrelationController {

    @Autowired
    VersioncolorrelationService versioncolorrelationService;

    @RequestMapping("/getColorNameByVersionId")
    @ResponseBody
    public R getColorNameByVersionId(int versionId){
        return R.ok(versioncolorrelationService.getColorNameByVersionId(versionId));
    }

    @RequestMapping("/getPictureSrcByVersionIdAndColorId")
    @ResponseBody
    public R getPictureSrcByVersionIdAndColorId(int versionId, int colorId){
        return R.ok(versioncolorrelationService.getPictureSrcByVersionIdAndColorId(versionId,colorId));
    }

}
