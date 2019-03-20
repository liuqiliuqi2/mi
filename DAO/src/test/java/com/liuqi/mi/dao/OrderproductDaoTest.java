package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Order;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderproductDaoTest {

    @Autowired
    OrderproductDao orderproductDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

//    @Test
//    public void getOrderProductByorderState() {
//        System.out.println(orderproductDao.getOrderProductByorderState(100000000,"全部有效订单"));
//
//    }

    @Test
    public void orderproductOrderProductNameByOrderId() {
    }

    @Test
    public void insertOrderproduct() {
    }
}