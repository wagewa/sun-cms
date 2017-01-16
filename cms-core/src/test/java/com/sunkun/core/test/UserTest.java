package com.sunkun.core.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sunkun.cms.basic.bean.UserBean;
import com.sunkun.cms.core.dao.IUserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/beans.xml")
public class UserTest
{
    @Resource
    private IUserDao userDao;
    
    @Test
    public void addUser()
    {
        UserBean bean = new UserBean();
        bean.setUserName("测试2");
        bean.setPassword("123456");
        bean.setEmail("ceshi@sunkun.com");
        bean.setIsValidated(0);
        bean.setCreateTime(new Date());
        userDao.saveOrUpdate(bean);
        System.out.println("=======================");
    }
    
    @Test
    public void getUser(){
        System.out.println("===========================================1111");
        UserBean user = userDao.queryObjectById(1);
        System.out.println(JSON.toJSONString(user));
    }
}
