package com.test.demo.controller;


import com.test.demo.serivce.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

@RestController
public class HelloController {
    private static String content = "<!DOCTYPE html>"
            + "<html>"
            + "<head>"
            + "<title>测试邮件2</title>"
            + "<meta name=\"content-type\" content=\"text/html; charset=UTF-8\">"
            + "</head>"
            + "<body>"
            + "<p style=\"color:#0FF\">这是一封测试邮件~</p>"
            + "</body>"
            + "</html>"; // 可以用HTMl语言写

    @Autowired
    JavaMailSender mailSender;//自动注入

    @Resource
    private EmailService emailService;

    @RequestMapping(value = "/sendEmail/{name}", method = RequestMethod.GET)
    public Object sendEmail(@PathVariable("name") String name) {
        try {
            MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("1060369102@qq.com");//设置发信人，发信人需要和spring.mail.username配置的一样否则报错
//            name+="@qq.com";					//补全地址
            message.setTo(name);				//设置收信人
            message.setSubject("测试邮件主题");	//设置主题
            message.setText(content,true);  	//第二个参数true表示使用HTML语言来编写邮件
//            FileSystemResource file = new FileSystemResource(
//            new File("src/main/resources/static/image/picture.jpg"));
//            helper.addAttachment("图片.jpg", file);//添加带附件的邮件
//            helper.addInline("picture",file);//添加带静态资源的邮件
            this.mailSender.send(mimeMessage);

            return "sucesss";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }
    }


        /**
         * 测试邮件发送
         */

        @RequestMapping(value = "/getTestDemoEmail", method = RequestMethod.GET)
        public @ResponseBody String getEntityById() throws Exception {
            String sendTo = "1060369102@qq.com";
            String titel = "测试邮件标题";
            String content = "测试邮件内容";
            emailService.sendSimpleMail(sendTo, titel, content);
            return "success";
        }

}