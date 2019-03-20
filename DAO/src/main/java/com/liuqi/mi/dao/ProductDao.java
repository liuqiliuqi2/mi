package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    List<Product> getAllProduct(Product product);

    Product ProductByPid(int pid);

    int getProductCount(Product product);

    int InsertProduct(Product product);

    int MoreDeleteProduct(@Param("pids") List<Integer> pids);

    int DeleteProduct(int pid);

    int UpdateProduct(Product product);

    int UpdateProduct_state(@Param("pid") int pid, @Param("product_state") String product_state);

    int AddProductAmount(@Param("pid") int pid, @Param("amount") int amount);




}
