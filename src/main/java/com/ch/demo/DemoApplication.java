package com.ch.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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
        SpringApplication.run(DemoApplication.class, args);
    }

}
