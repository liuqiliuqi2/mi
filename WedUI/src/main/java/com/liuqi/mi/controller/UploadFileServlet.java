package com.liuqi.mi.controller;

import com.liuqi.mi.common.UploadFile.R;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

@SuppressWarnings("serial")
@WebServlet("/UploadFile")
public class UploadFileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置编码
        response.setCharacterEncoding("utf-8");
        // 物理路径
        String savePath = this.getServletConfig().getServletContext().getRealPath("");
        savePath = savePath + "images\\";
        File f1 = new File(savePath);
        if (!f1.exists()) {
            f1.mkdirs();
        }

        DiskFileItemFactory fac = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fac);
        upload.setHeaderEncoding("utf-8");
        List<FileItem> fileList = null;
        try {
            fileList = upload.parseRequest(request);
        } catch (FileUploadException ex) {
            return;
        }


        Iterator<FileItem> it = fileList.iterator();
        String name = "";
        String extName = "";
        while (it.hasNext()) {
            FileItem item = it.next();
            if (!item.isFormField()) {
                name = item.getName();
                long size = item.getSize();
                String type = item.getContentType();
                System.out.println(size + " " + type);
                if (name == null || name.trim().equals("")) {
                    continue;
                }

                // 扩展名格式：
                if (name.lastIndexOf(".") >= 0) {
                    extName = name.substring(name.lastIndexOf("."));
                }

                File file = null;
                do {
                    // 生成文件名：
                    name = UUID.randomUUID().toString();
                    file = new File(savePath + name + extName);
                } while (file.exists());

                File saveFile = new File(savePath + name + extName);
                try {
                    item.write(saveFile);
                } catch (Exception exp) {
                    response.getWriter().write(exp.getMessage());
                    exp.printStackTrace();
                }
            }
        }

        R r = new R();
        r.setCode(0);
        r.setMsg("上传成功");
        Map<String, String> data = new HashMap<String, String>();
        data.put("src", "images/" + name + extName);
        data.put("name",name + extName);
        r.setData(data);

        response.getWriter().print(r.toJson());


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
