package com.test.demo;

import java.util.Scanner;

public class TestGame {

    public static void mian(String[] args){
        Role role = new Role();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入，石头剪刀布");
        System.out.println("请输入您的昵称");
        role.setName(input.next());
        System.out.println("请选择难度");

    }
}
