package com.test.demo;


import org.apache.tomcat.util.digester.ArrayStack;
import org.thymeleaf.util.ListUtils;

import java.util.List;

public class Test {

    public static void main(String[] args){
        System.out.println("Test");

        List<String> list = new ArrayStack<>();
        list.add("ABCDEF");
        list.add("ABCD");
        list.add("ABED");
        list.add("ACDG");
        System.out.println("之前");
        for (String x:list) {
            System.out.println(x);
        }
        System.out.println(ListUtils.sort(list));
        System.out.println("之后");
        for (String s:ListUtils.sort(list)) {
            System.out.println(s);
        }
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
