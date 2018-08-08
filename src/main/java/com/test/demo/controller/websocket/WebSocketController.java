package com.test.demo.controller.websocket;

import com.test.demo.tool.websocket.WebSocketServer1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebSocketController {

    @RequestMapping("/websocket")
    public String getConnectionWebSocket(){

        return "/websocket";
    }

    @RequestMapping("/websocketinfo")
    public String getWebsocket(){

        return "/websocketmessage";
    }

    @RequestMapping("/webInfo/{info}")
    @ResponseBody
    public void sendInfo(@PathVariable String info){
        WebSocketServer1.onMessage(info);
    }
}
