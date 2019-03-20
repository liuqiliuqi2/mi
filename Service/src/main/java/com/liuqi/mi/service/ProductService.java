package com.liuqi.mi.service;

import com.liuqi.mi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct(Product product);

    Product ProductByPid(int pid);

    int getProductCount(Product product);

    int InsertProduct(Product product);

    int DeleteProduct(int pid);

    int MoreDeleteProduct(List<Integer> pids);

    int UpdateProduct(Product product);

    int UpdateProduct_state(int pid, String product_state);

    int AddProductAmount(int pid, int amount);
}
