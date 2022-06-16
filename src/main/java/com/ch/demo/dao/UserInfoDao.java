package com.ch.demo.dao;

import com.ch.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserInfoDao
 * @Description TODO
 * @Author zhaocc
 * @Date 2022/6/15
 * @Version 1.0
 **/
@Mapper
public interface UserInfoDao {
    List<UserInfo> findAllUser();

    UserInfo getUserById(@Param("id") int id);

    UserInfo getUserByIdEqualOne();

    UserInfo getUserByIdEqualTwo();

}
