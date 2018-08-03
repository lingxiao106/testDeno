package com.test.demo.tool.phone;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import org.json.JSONException;

import javax.xml.ws.http.HTTPException;
import java.io.IOException;

//腾讯云短信验证
public class PhoneValidate {

    static int appid = 1400084664; //appid

    static String appkey = "a7b332e1523f668b0ea794ad3f32a493"; //appkey

    static int templateId = 166901; //模板Id

    static String smsSign = "凌不在潇"; //标签

    static String yzm = String.valueOf((int) ((Math.random() * 9 + 1) * 100000)); //验证码 随机6位数

    static String a = "5"; //其他

    public static String getPhoneValidate(String phoneNumbers) {
        try {
            String[] params = {yzm, a};
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers,
                    templateId, params, smsSign, "", "");  // 签名参数未提供或者为空时，会使用默认签名发送短信
        } catch (HTTPException e) {
            // HTTP响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // json解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络IO错误
            e.printStackTrace();
        } catch (com.github.qcloudsms.httpclient.HTTPException e) {
            e.printStackTrace();
        }
        return "验证码发送成功";
    }
}
