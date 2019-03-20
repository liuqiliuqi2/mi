package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Cart;
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
public class CartDaoTest {

    @Autowired
    CartDao cartDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllCart() {
        System.out.println(cartDao.getAllCart(100000000));
    }

    @Test
    public void getCartByMaxCid() {
        System.out.println(cartDao.getCartByMaxCid(100000000));
    }

    @Test
    public void CartByCid() {
        System.out.println(cartDao.CartByCid(1000000004));
    }


    @Test
    public void CartByCname() {
        System.out.println(cartDao.CartByCname("小米8 青春版 6GB内存 128GB 全网通 暮光金",100000000));
    }

    @Test
    public void InsertCartProduct() {
        Cart cart =new Cart();
        cart.setImage_url("pms_1527735134.03584233.jpg");
        cart.setCname("6GB内存 64GB 全网通 黑色");
        cart.setCprice(2299);
        cart.setPid(10000);
        Assert.assertEquals(1, cartDao.InsertCartProduct(cart));
    }

    @Test
    public void getCartProductCount() {
        System.out.println(cartDao.getCartProductCount(100000000));
    }

    @Test
    public void DeleteCart() {
        System.out.println(cartDao.DeleteCart(3));
    }

    @Test
    public void UpdateCartProductCamount() {
        System.out.println(cartDao.UpdateCartProductCamount(2,10));
    }

}