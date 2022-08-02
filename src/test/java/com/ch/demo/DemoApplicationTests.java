package com.ch.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ch.demo.dao.UserInfoDao;
import com.ch.demo.entity.UserInfo;
import com.ch.demo.service.UserInfoService;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

//classes=springboot项目主启动类.class
@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserInfoDao userInfoDao;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {
        List<UserInfo> allUser = this.userInfoDao.findAllUser();
        allUser.forEach(userInfo -> {
            System.out.println(userInfo);
        });
    }

    @Test
    void testSendRambbitMQ() {
       Map<Integer,String> mqMap= Maps.newHashMap();
        mqMap.put(0,"神司马懿");
        mqMap.put(1,"界徐盛");
        mqMap.put(2,"曹钝");
        mqMap.put(3,"骆统");
        rabbitTemplate.convertAndSend("swl.direct","1",mqMap);
        //rabbitTemplate.convertAndSend("111111111111");
    }

    @Test
    void testReceiveRambbitMQ() {
        Object o = rabbitTemplate.receiveAndConvert("1");
        System.out.println(o.toString());
    }

    /*@RabbitListener(queues = "1")
    public void messageListener(Map<Integer,String> object){
        System.out.println("收到！"+ JSONObject.toJSONString(object));
    }*/

}
