package com.ch.demo;

import com.ch.demo.config.BeanConfig;
import com.ch.demo.entity.Pet;
import com.ch.demo.entity.User;
import com.ch.demo.entity.UserInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author
 * @Description DataSourceAutoConfiguration.class
 * @Date 2022/6/15
 * @Param
 * @param
 * @return
 * @return null
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.ch.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        //查看容器里面的所有组件
        /*String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }*/
        //从容器中获取组件
       /* UserInfo userInfo = run.getBean("userInfo", UserInfo.class);
        System.out.println(userInfo);
        UserInfo userInfo1 = run.getBean(UserInfo.class);
        System.out.println(userInfo1);
        Object userInfo2 = run.getBean("userInfo");
        System.out.println(userInfo2);*/

        boolean tom1 = run.containsBean("tom");
        boolean userInfo3 = run.containsBean("userInfo");
        boolean tom11 = run.containsBean("tom11");
        System.out.println("tom = " + tom1);
        System.out.println("userInfo3 = " + userInfo3);
        System.out.println("tom11 = " + tom11);

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        boolean heihei = run.containsBean("heihei");
        System.out.println("haha = " + haha);
        System.out.println("hehe = " + hehe);
        System.out.println("heihei = " + heihei);

        /*System.out.println(userInfo == userInfo1);
        System.out.println(userInfo == userInfo2);*/

        BeanConfig beanConfig = run.getBean(BeanConfig.class);
        System.out.println(beanConfig);

        Pet tom = beanConfig.pet();
        Pet pet = beanConfig.pet();
        System.out.println(tom);
        System.out.println(pet);
        System.out.println(tom == pet);


        User user = run.getBean(User.class);
        System.out.println(user);
    }

}
