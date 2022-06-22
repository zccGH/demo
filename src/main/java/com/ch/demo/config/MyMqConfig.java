package com.ch.demo.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyMqConfig
 * @Description RambbitMQ配置类
 * @Author zhaocc
 * @Date 2022/6/22
 * @Version 1.0
 **/
@Configuration
public class MyMqConfig {

    @Bean
    public MessageConverter getMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
