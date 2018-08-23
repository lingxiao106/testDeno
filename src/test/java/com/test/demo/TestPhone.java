package com.test.demo;


import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import org.json.JSONException;

import javax.xml.ws.http.HTTPException;
import java.io.IOException;


public class TestPhone {
    static int appid = 1400084664;

    static String appkey = "a7b332e1523f668b0ea794ad3f32a493";

    static String[] phoneNumbers = {"13728751298"};

    static int templateId = 166901;

    static String smsSign = "凌不在潇";


    static String yzm = String.valueOf((int) ((Math.random() * 9 + 1) * 100000));

    static String a = "5";

    public static void main(String[] args) {
        try {
            String[] params = {yzm, a};
            SmsSingleSender sender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = sender.sendWithParam("86", phoneNumbers[0],
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
    }
}
