package com.liuqi.mi.dao;

import com.liuqi.mi.entity.Order;
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
public class OrderDaoTest {

    @Autowired
    OrderDao orderDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getOrderByMember_idAndorderState() {
        System.out.println(orderDao.getOrderByMember_idAndorderState(100000000,"全部有效订单"));
    }

    @Test
    public void getOrderId() {
        System.out.println(orderDao.getOrderId(100000000));
    }


    @Test
    public void orderByOrderId() {
    }

    @Test
    public void insertOrder() {
        Order order=new Order();
        order.setOrderPrice(1);
        order.setConsignee("a");
        order.setConsigneePhone("a");
        order.setReceivAddress("a");
        order.setDetailedAddress("a");
        order.setPostalCode("a");
        order.setAddressLabels("a");
        order.setMember_id(100000000);
        Assert.assertEquals(1, orderDao.InsertOrder(order));
    }
}