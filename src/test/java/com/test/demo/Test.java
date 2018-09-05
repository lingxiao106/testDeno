package com.test.demo;


import org.assertj.core.util.DateUtil;

public class Test {

    public static void main(String[] args) {
        long currDate = DateUtil.now().getTime();
        int i = 1 << 24;
        int j = 0;
        while (i != j) {
            System.out.println(j++);
        }
        System.out.println();
//        for (int j = 0;j < i;j++){
//
//            System.out.println(j);
//        }
        System.out.println(currDate);
        long afterDate = DateUtil.now().getTime();
        System.out.println(afterDate);
        System.out.println("用时时间" + (afterDate - currDate) / 1000);
        System.out.println();
    }

}
