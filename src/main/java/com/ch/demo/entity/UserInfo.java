package com.ch.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserInfo
 * @Description TODO
 * @Author zhaocc
 * @Date 2022/6/15
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Long id;
    private Integer userId;
    private String userName;
    private String email;
    private String nickName;
    private byte status;
    private String address;
}
