package com.ch.demo.algorithm;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName AlgorithmTest
 * @Description TODO
 * @Author zhaocc
 * @Date 2022/8/5
 * @Version 1.0
 **/
@Component
public class Algorithm {

    /**
     * @Author zhaocc
     * @Description 两数之和
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     *
     * @Date 2022/8/5
     * @Param [nums, target]
     * @return void
     **/
    public void sumoftwoNumbers(int[] nums,int target){
        int[] result=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (target==(nums[i]+nums[i1])){
                    result[0]=i;
                    result[1]=i1;
                }
            }
        }
        /*
        * Arrays.toString() 返回一个包含数组元素的字符串，这些元素被放置在括号内，并用逗号分开
        * int[] array = {1,2,3,4,5};
        * System.out.println(Arrays.toString(array));
        * 输出：[1, 2, 3, 4, 5]
        */
        System.out.println(Arrays.toString(result));
    }

    /**
     * @Author zhaocc
     * @Description 冒泡排序
     * @Date 2022/8/5
     * @Param [nums]
     * @return void
     **/
    public void bubbleSort(int[] nums){
        int[] arr=Arrays.copyOf(nums,nums.length);
        for (int i = 1; i < arr.length; i++) {
            //定义一个标志，标志值不变，说明此轮未进行排序，待排序数组有序
            boolean flag=true;
            for (int i1 = 0; i1 < arr.length-i; i1++) {
                if (arr[i1]>arr[i1+1]) {
                    int temp=arr[i1];
                    arr[i1]=arr[i1+1];
                    arr[i1+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
