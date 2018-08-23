package com.test.demo;


import javax.security.auth.Subject;
import java.util.Scanner;

public class TestInfo {

    public static void main(String[] args) {
        testInfo();
    }

    public static boolean flag = false;
    public static Scanner input = new Scanner(System.in);
    public static double money = 500;
    public static void login(){
        int i = 3;
        while (true) {
            System.out.println("请输入您的账号：");
            String username = input.next();
            if (username.equals("lingxiao")) {
                System.out.println("请输入账号密码：");
                String userpwd = input.next();
                if (userpwd.equals("123")) {
                    System.out.println("登录成功");
                    flag = true;
                    break;
                } else {
                    System.out.println("密码错误");
                    continue;
                }
            } else {
                if (i == 0) break;
                System.out.println("账号错误，请重新输入。还有" + i + "次机会。");
                --i;
                continue;
            }

        }
    }

    public static void goWu(){

        while (true) {
            if (money < 10) {
                System.out.println("您的余额已不足十元，请及时充值。");
            }
            System.out.println("当前的余额为：" + money);
            System.out.println("您已经进入商城：请输入要购买的商品，1.小王,2.小李,3.退出");
            String info = input.next();
            if (info.equals("3")) {
                break;
            }
            switch (info) {
                case "1":
                    System.out.println("名称：小王，价格：255");
                    System.out.println("1.购买,2.取消");
                    String y = input.next();
                    if (y.equals("1")) {
                        if (255 <= money) {
                            System.out.println("购买成功");
                            money -= 255;
                            break;
                        } else {
                            System.out.println("余额不足");
                            break;
                        }
                    } else {
                        break;
                    }
                case "2":
                    System.out.println("名称：小李，价格：245");
                    System.out.println("1.购买,2.取消");
                    String x = input.next();
                    if (x.equals("1")) {
                        if (245 <= money) {
                            System.out.println("购买成功");
                            money -= 245;
                            break;
                        } else {
                            System.out.println("余额不足");
                            break;
                        }
                    } else {
                        break;
                    }
                default:
                    System.out.println("输入有误，请重新输入");
                    continue;
            }
        }
    }

    public static void testInfo() {

        System.out.println("Test");
        while (true) {
            System.out.println("1.进入商城、2.登录、3.退出");
            String con = input.next();
            if (con.equals("1")) {

                goWu();
            } else if (con.equals("2")) {
                login();
            } else if (con.equals("3")) {
                System.out.println("退出成功");
                break;
            }
        }
    }
}
