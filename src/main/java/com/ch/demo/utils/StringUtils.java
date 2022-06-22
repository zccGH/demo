package com.ch.demo.utils;

import java.util.Objects;

/**
 * @ClassName StringUtils
 * @Description spring 字符串处理方法工具类
 * @Author zhaocc
 * @Date 2022/6/16
 * @Version 1.0
 **/
public class StringUtils {

    /**
     * @Author zhaocc
     * @Description 判断字符串是否为空,是否为null
     * @Date 2022/6/22
     * @Param [args]
     * @return boolean
     **/
    public static final boolean isBlank(String args){
        if (Objects.isNull(args) || Objects.equals(args,"null") || args.length()==0 || args.trim().length()==0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * @Author zhaocc
     * @Description 字符串不为空判断
     * @Date 2022/6/22
     * @Param [args]
     * @return boolean
     **/
    public static final boolean isNotBlank(String args){
        if (!Objects.isNull(args) && !Objects.equals(args,"null") && args.length()!=0 && args.trim().length()!=0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * @Author zhaocc
     * @Description 判断字符串是否全部为空
     * @Date 2022/6/22
     * @Param [args]
     * @return boolean
     **/
    public static final boolean isAllBlank(String... args){
        for (String arg : args) {
            if (isNotBlank(arg)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @Author zhaocc
     * @Description 是否全部不为空
     * @Date 2022/6/22
     * @Param [args]
     * @return boolean
     **/
    public static final boolean isAllNotBlank(String... args){
        for (String arg : args) {
            if (isBlank(arg)) {
                return false;
            }
        }
        return true;
    }
}
