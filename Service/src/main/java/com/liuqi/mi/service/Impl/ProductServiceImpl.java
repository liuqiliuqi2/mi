package com.liuqi.mi.service.Impl;

import com.liuqi.mi.dao.ProductDao;
import com.liuqi.mi.entity.Product;
import com.liuqi.mi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;


    public List<Product> getAllProduct(Product product) {
        return productDao.getAllProduct(product);
    }

    public Product ProductByPid(int pid) {
        return productDao.ProductByPid(pid);
    }

    public int getProductCount(Product product) {
        return productDao.getProductCount(product);
    }

    public int InsertProduct(Product product) {
        return productDao.InsertProduct(product);
    }

    public int DeleteProduct(int pid) {
        return productDao.DeleteProduct(pid);
    }

    public int MoreDeleteProduct(List<Integer> pids) {
        if(pids==null||pids.size()<=0) {
            return 0;
        }
        return productDao.MoreDeleteProduct(pids);
    }

    public int UpdateProduct(Product product) {
        return productDao.UpdateProduct(product);
    }

    public int UpdateProduct_state(int pid, String product_state) {
        return productDao.UpdateProduct_state(pid,product_state);
    }

    public int AddProductAmount(int pid, int amount) {
        return productDao.AddProductAmount(pid,amount);
    }
}
