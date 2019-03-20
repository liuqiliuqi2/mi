package com.liuqi.mi.dao;

import com.liuqi.mi.common.MD5Util;
import com.liuqi.mi.common.phoneVerCode.SendMessage;
import com.liuqi.mi.entity.Member;
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
public class MemberDaoTest {

    @Autowired
    MemberDao memberDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllMember() {
        Member member=new Member();
//        member.setMember_id(1);
//        member.setName("刘");
//        member.setAgemin("19");
        member.setSkip(0);
        member.setSize(3);
        System.out.println(memberDao.getAllMember(member));
    }

    @Test
    public void getMemberByMember_id() {
        System.out.println(memberDao.getMemberByMember_id(1000000000));
    }

    @Test
    public void getMemberCount() {
        Member member=new Member();
        System.out.println(memberDao.getMemberCount(member));
    }

    @Test
    public void insertMember() {
        Member member=new Member();
        member.setPassword(MD5Util.md5("888888"));
        member.setPhone("17679164807");
        Assert.assertEquals(1, memberDao.InsertMember(member));
    }

    @Test
    public void member_del() {
        System.out.println(memberDao.member_del(1000000008));
    }

    @Test
    public void UpdateMember_state() {
        System.out.println(memberDao.UpdateMember_state(1000000001,"已停用"));
    }

    @Test
    public void Reset_password() {
        System.out.println(memberDao.Reset_password(1000000001));
    }

    @Test
    public void SendVerificationCode() {
        int a=(int)((Math.random()*9+1)*100000);
        String b=a+"";
        SendMessage sendMessage=new SendMessage();
        sendMessage.EX("17679164807",b);
    }
}