package com.test.demo.tool.phone;

import com.test.demo.serivce.EmailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

@Component
public class EmailValidate {


    public String getValidate(String email, EmailService emailService) {
        String yzm = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
        String titel = "验证码";
        String content = "[凌不在潇]您的验证码是" + yzm +",验证码五分钟内有效,如不是本人请忽略本短信";
        emailService.sendSimpleMail(email, titel, content);
        return yzm;
    }

    public String getWebValidate(String email, JavaMailSender mailSender) {
        String yzm = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
        String content = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>测试邮件2</title>"
                + "<meta name=\"content-type\" content=\"text/html; charset=UTF-8\">"
                + "</head>"
                + "<body>"
                + "<p>[凌不在潇]您的验证码是<b>" + yzm
                + "</b>。验证码五分钟内有效，如不是本人请忽略本短信。</p>"
                + "</body>"
                + "</html>"; // 可以用HTMl语言写
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("1060369102@qq.com");//设置发信人，发信人需要和spring.mail.username配置的一样否则报错
//            name+="@qq.com";					//补全地址
            message.setTo(email);                //设置收信人
            message.setSubject("验证码");    //设置主题
            message.setText(content, true);    //第二个参数true表示使用HTML语言来编写邮件
//            FileSystemResource file = new FileSystemResource(
//            new File("src/main/resources/static/image/picture.jpg"));
//            helper.addAttachment("图片.jpg", file);//添加带附件的邮件
//            helper.addInline("picture",file);//添加带静态资源的邮件
            mailSender.send(mimeMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return yzm;
    }


}
