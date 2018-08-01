package com.test.demo.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userE")
public class UserEcharts {

    @RequestMapping("/user1")
    public String getE1(){

        return "echars/demo1";
    }

    @RequestMapping("/user2")
    public String getE2(){

        return "echars/demo2";
    }

    @RequestMapping("/user3")
    public String getE3(){

        return "echars/demo3";
    }
}
