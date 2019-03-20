package com.liuqi.mi.dao;

import com.liuqi.mi.common.MD5Util;
import com.liuqi.mi.entity.Admin;
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
public class AdminDaoTest {

    @Autowired
    AdminDao adminDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void adminByAdmin_name() {
        System.out.println(adminDao.AdminByAdmin_name("liuqi"));
    }

    @Test
    public void InsertAdmin() {
        Admin admin=new Admin();
        admin.setAdmin_name("admin");
        admin.setAdmin_password(MD5Util.md5("admin"));
        Assert.assertEquals(1, adminDao.InsertAdmin(admin));
    }

}