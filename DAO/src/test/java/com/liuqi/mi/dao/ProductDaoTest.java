package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)

public class ProductDaoTest {

    @Autowired
    ProductDao productDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllProduct() {
        Product product=new Product();
        product.setPtid(10);
        product.setSkip(0);
        product.setSize(8);
        System.out.println(productDao.getAllProduct(product));
    }

    @Test
    public void ProductByPid() {
        System.out.println(productDao.ProductByPid(10000));
    }


    @Test
    public void getProductCount() {
        Product product=new Product();
        product.setNetwork_model("双卡双待双4G");

//        Assert.assertEquals(5, productDao.getProductCount(product));
        System.out.println(productDao.getProductCount(product));
    }

    @Test
    public void InsertProduct() {
        Product product =new Product();
        product.setPname("小米100");
        product.setPtid(19);
        product.setScreen_size("6.21");
        product.setRear_camera("双1200万像素");
        product.setFront_facing_camera("2000万像素");
        product.setBattery_capacity("3400");
        product.setType_of_network("4G全网通");
        product.setScreen_resolution("2248×1080");
        product.setNumber_of_CPU_core("八核");
        product.setMilestone("7.6");
        product.setNetwork_model("双卡双待");
        product.setDescribes("全球首款双频GPS，骁龙845");
        Assert.assertEquals(1, productDao.InsertProduct(product));
    }

    @Test
    public void DeleteProduct() {
        System.out.println(productDao.DeleteProduct(2));
    }

    @Test
    public void UpdateProduct_state() {
        System.out.println(productDao.UpdateProduct_state(2,"已发布"));
    }

    @Test
    public void AddProductAmount() {
        System.out.println(productDao.AddProductAmount(2,10));
    }

}