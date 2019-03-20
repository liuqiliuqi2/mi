package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Phone_Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class Phone_Product_DaoTest {

    @Autowired
    Phone_Product_Dao phone_product_dao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllPhone_Product() {
        Phone_Product phone_product =new Phone_Product();
        phone_product.setPhone_name("小");
        System.out.println(phone_product_dao.getAllPhone_Product(phone_product));
    }

    @Test
    public void getPhone_ProductById() {
        System.out.println(phone_product_dao.getPhone_ProductById(10));
    }

    @Test
    public void updatePhone_Product() {
        Phone_Product phone_product =phone_product_dao.getPhone_ProductById(10) ;
        phone_product.setPrice("878.78");
        phone_product.setSpecial_offer("978.78");
        phone_product.setProduct_describe("降价了");
        Assert.assertEquals(1, phone_product_dao.UpdatePhone_Product(phone_product));
    }

    @Test
    public void deletePhone_Product() {
        System.out.println(phone_product_dao.DeletePhone_Product(8));

    }

    @Test
    public void InsertPhone_Product() {
        Phone_Product phone_product =new Phone_Product();
        phone_product.setPhone_name("小米110");
        phone_product.setPrice("978.78");
        phone_product.setProduct_describe("好好好");
        Assert.assertEquals(1, phone_product_dao.InsertPhone_Product(phone_product));
    }
}