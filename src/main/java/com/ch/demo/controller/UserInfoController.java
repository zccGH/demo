package com.ch.demo.controller;

import com.ch.demo.dao.UserInfoDao;
import com.ch.demo.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserInfoController
 * @Description TODO
 * @Author zhaocc
 * @Date 2022/6/15
 * @Version 1.0
 **/

@RestController
@Slf4j
public class UserInfoController {
    @Resource
    private UserInfoDao userInfoDAO;

    @GetMapping(path = "/all")
    public List<UserInfo> getAllUser(){
        return userInfoDAO.findAllUser();
    }

    @GetMapping(path = "/getUser/{id}")
    public UserInfo getById(@PathVariable int id){
        return userInfoDAO.getUserById(id);
    }

    @GetMapping(path = "/getUser/one")
    public UserInfo getById1(){
        return userInfoDAO.getUserByIdEqualOne();
    }

    @GetMapping(path = "/getUser/two")
    public UserInfo getById2(){
        return userInfoDAO.getUserByIdEqualTwo();
    }
}
