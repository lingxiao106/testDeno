package com.test.demo.controller.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSocketController {

    @RequestMapping("/websocket")
    public String getConnectionWebSocket(){

        return "/websocket";
    }
}
