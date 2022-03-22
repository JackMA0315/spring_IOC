package com.qf.test;

import com.qf.pojo.TabUser;
import com.qf.pojo.User;
import javafx.scene.control.Tab;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SpringTest {

    @Test
    public void test1(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml") ;
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user2);

    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml") ;
        TabUser tabUser = (TabUser) applicationContext.getBean("tabUser");
        System.out.println(tabUser);
        System.out.println("---------------------------------");
        System.out.println(tabUser.getTabUserInfo());
    }
}
