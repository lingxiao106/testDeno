package com.test.demo.controller.user;

import com.test.demo.serivce.EmailService;
import com.test.demo.tool.phone.EmailValidate;
import com.test.demo.tool.phone.PhoneValidate;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    JavaMailSender mailSender;//自动注入

    @Autowired
    private EmailService emailService;

    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        if (subject.getPrincipal() != null) {
            return "/index";
        }
        // 登录失败从request中获取shiro处理的异常信息。
        // shiroLoginFailure:就是shiro异常类的全类名.
        String exception = (String) request.getAttribute("shiroLoginFailure");
        System.out.println("exception=" + exception);
        String msg = "";
        if (exception != null) {
            msg = "账号或密码错误";
        }
        map.put("msg", msg);
        return "/login";
    }

    @RequestMapping("/phonevalidate/{phone}")
    @ResponseBody
    public String getPhoneValidate(@PathVariable String phone){
       return PhoneValidate.getPhoneValidate(phone);
    }

    @RequestMapping("/emailvalidate/{email}")
    @ResponseBody
    public String getEmailValidate(@PathVariable String email){
        EmailValidate emailValidate = new EmailValidate();
        return emailValidate.getWebValidate(email,mailSender);
    }

    @RequestMapping("/regPhone/phone")
    public String regPhone(){
        return "";
    }

    public String regEmail(){

        return "";
    }
}
