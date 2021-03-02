package com.idea.lan.action;

import com.idea.lan.controller.DemoController;
import com.idea.lan.service.DemoService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SimpleTest {
    public static void main(String[] args) {

        //实例化bean工厂对象
        BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");

        Action01 act = bf.getBean("action_01",Action01.class);
        act.demo_fun01();
        act.target_func();


        User u = bf.getBean("ff",User.class);
        System.out.println(u);


        ListSetMap lsm = bf.getBean("listSetMap",ListSetMap.class);
        System.out.println(lsm);

        System.out.println(bf.getBean("demoService", DemoService.class).demo_func());
    }
}
