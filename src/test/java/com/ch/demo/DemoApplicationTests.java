package com.ch.demo;

import com.ch.demo.dao.UserInfoDao;
import com.ch.demo.entity.UserInfo;
import com.ch.demo.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//classes=springboot项目主启动类.class
@SpringBootTest(classes = DemoApplication.class)
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserInfoDao userInfoDao;

    @Test
    void contextLoads() {
        List<UserInfo> allUser = this.userInfoDao.findAllUser();
        allUser.forEach(userInfo -> {
            System.out.println(userInfo);
        });
    }

}
