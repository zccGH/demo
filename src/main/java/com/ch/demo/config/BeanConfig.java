package com.ch.demo.config;

import com.ch.demo.entity.Pet;
import com.ch.demo.entity.User;
import com.ch.demo.entity.UserInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName BeanConfig
 * @Description 自定义bean装配
 * @Author zhaocc
 * @Date 2022/7/7
 * @Version 1.0
 **/
//Full proxyBeanMethods = true
//Lite proxyBeanMethods = false
// ImportResource 原生配置文件引入
//@Import(User.class)
@Configuration(proxyBeanMethods = true)
@ImportResource("classpath:beans.xml")
public class BeanConfig {

    @Bean
    public UserInfo userInfo(){
        UserInfo userInfo=new UserInfo();
        return userInfo;
    }

    @Bean()
    public Pet pet(){
        Pet pet = new Pet();
        return pet;
    }

    @Bean()
    public Pet petCopy(){
        Pet pet = new Pet();
        return pet;
    }
}
