package com.ch.demo;

import com.ch.demo.algorithm.Algorithm;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName AlgorithmTest
 * @Description 算法测试
 * @Author zhaocc
 * @Date 2022/8/5
 * @Version 1.0
 **/

public class AlgorithmTest extends DemoApplicationTests{

    @Autowired
    private Algorithm algorithm;

    @Test
    public void test(){
        int[] nums={1,3,4,7,6,9,5,11};
        int target=20;
        //algorithm.sumoftwoNumbers(nums,target);
        algorithm.bubbleSort(nums);
    }
}
