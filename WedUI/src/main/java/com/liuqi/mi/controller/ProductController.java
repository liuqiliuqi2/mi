package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.entity.Product;
import com.liuqi.mi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/ProductJson")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/getAllProduct")
    @ResponseBody
    public R getAllPhone_Product(Product product){
        return R.ok(productService.getAllProduct(product));
    }

    @RequestMapping("/ProductByPid")
    @ResponseBody
    public R ProductByPid(int pid){
        return R.ok(productService.ProductByPid(pid));
    }

    @RequestMapping("/getProductCount")
    @ResponseBody
    public R getProductCount(Product product){
        return R.ok(productService.getProductCount(product));
    }

    @RequestMapping("/InsertProduct")
    @ResponseBody
    public R InsertProduct(Product product){
        return R.ok(productService.InsertProduct(product));
    }

    @RequestMapping("/MoreDeleteProduct")
    @ResponseBody
    public R MoreDeleteProduct(@RequestBody List<Integer> pids){
        return R.ok(productService.MoreDeleteProduct(pids));
    }

    @RequestMapping("/DeleteProduct")
    @ResponseBody
    public R DeleteProduct(int pid){
        return R.ok(productService.DeleteProduct(pid));
    }

    @RequestMapping("/UpdateProduct")
    @ResponseBody
    public R UpdateProduct(Product product){
        return R.ok(productService.UpdateProduct(product));
    }

    @RequestMapping("/UpdateProduct_state")
    @ResponseBody
    public R UpdateProduct_state(int pid, String product_state){
        return R.ok(productService.UpdateProduct_state(pid,product_state));
    }

    @RequestMapping("/AddProductAmount")
    @ResponseBody
    public R AddProductAmount(int pid, int amount){
        return R.ok(productService.AddProductAmount(pid,amount));
    }

    //上传图片
    @RequestMapping(value="/put",method= RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {
        //文件存放的位置
        String path="C:\\Users\\liuqi\\Documents\\HBuilderProject\\H-ui.admin-master\\img\\MI";
        String path2="C:\\Users\\liuqi\\Documents\\HBuilderProject\\mi-pc\\img\\MI";
        String path3="C:\\Users\\liuqi\\WebstormProjects\\vue0001\\static\\img\\MI";
        //文件名
        String fileName = file.getOriginalFilename();
        File tarFile = new File(path, fileName);
        File tarFile2 = new File(path2, fileName);
        File tarFile3 = new File(path3, fileName);
        if (!tarFile.getParentFile().exists()) {//判断路径是否存在，不存在就创建
            tarFile.getParentFile().mkdirs();
        }
        if (!tarFile2.getParentFile().exists()) {//判断路径是否存在，不存在就创建
            tarFile2.getParentFile().mkdirs();
        }
        if (!tarFile3.getParentFile().exists()) {//判断路径是否存在，不存在就创建
            tarFile3.getParentFile().mkdirs();
        }
        file.transferTo(tarFile);//将文件添加到路径中
        file.transferTo(tarFile2);//将文件添加到路径中
        file.transferTo(tarFile3);//将文件添加到路径中
        return "{\"data\":\"封面上传成功！\"}";//返回json
    }


    //商品导出
    @RequestMapping("/pushcsv")
    @ResponseBody
    public void pushcsv(HttpServletResponse response,Product product) throws IOException {
        //POI
        //response.setContentType("textml;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename=product.csv");
        PrintWriter out = response.getWriter();
        //加上bom头,解决excel打开乱码问题
        byte[] bomStrByteArr = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
        String bomStr = new String(bomStrByteArr, "UTF-8");
        out.write(bomStr);
        System.out.println(bomStr);

        List<Product> list=productService.getAllProduct(product);
        StringBuffer str=new StringBuffer("");
        str.append("编号,名称\r\n");
        for (Product commodity:list) {
            str.append(commodity.getPid()+","+commodity.getPname()+"\r\n");
        }
        response.getWriter().write(str.toString());
    }

}
