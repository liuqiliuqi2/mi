package com.liuqi.mi.dao;

import org.junit.After;
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
public class VersioncolorrelationDaoTest {

    @Autowired
    VersioncolorrelationDao versioncolorrelationDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getColorNameByVersionId() {
        System.out.println(versioncolorrelationDao.getColorNameByVersionId(13));
    }

    @Test
    public void getPictureSrcByVersionIdAndColorId() {
        System.out.println(versioncolorrelationDao.getPictureSrcByVersionIdAndColorId(13,4));
    }
}