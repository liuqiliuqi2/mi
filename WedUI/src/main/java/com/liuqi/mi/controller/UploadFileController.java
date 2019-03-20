package com.liuqi.mi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("/UploadFile")
public class UploadFileController {

    @RequestMapping("/UploadFile")
    @ResponseBody
    public void UploadFile(HttpServletRequest request, HttpServletResponse response){



    }

}
