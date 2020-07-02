package com.mo.yun;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mo.yun.config.MybatisPlusConfig;
import com.mo.yun.pojo.User;
import com.mo.yun.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =NongxinEmplyApplication.class)
public class UserTest {
    @Autowired
    UserService userService;
    @Test
    public void queryUserInfo(){
//        List<String> list=new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        List<User> byId = userService.getById(list);
//        System.out.println(">>>>>>>>>>>:"+byId);
//        Page page=new Page();
//        page.setCurrent(2);
//        page.setSize(1);
//        IPage<User> page1 = userService.selectPageVo(page, null);
//        System.out.println(">>>>>>>>>>>:"+page1.getRecords());
//        System.out.println(">>>>>>>>>>>:"+page1.getTotal());
//        System.out.println(">>>>>>>>>>>:"+page1.getCurrent());
//        System.out.println(">>>>>>>>>>>:"+page1.getSize());
    }
}
