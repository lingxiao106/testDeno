package com.test.demo.controller.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@RequestMapping("/sendInfo")
	@ResponseBody
	public String getSendInfo(String message) {

		amqpTemplate.convertAndSend("hello", message);

		return "success";
	}

	@RequestMapping("/sendInfo1")
	@ResponseBody
	public String getSendInfo1(String message) {

		amqpTemplate.convertAndSend("exchange", "topic.message", message);

		return "success";
	}

	@RequestMapping("/sendInfo2")
	@ResponseBody
	public String getSendInfo2(String messages) {
//		for(int i = 0;i<100000;i++) {
//
//		}
		amqpTemplate.convertAndSend("exchange","topic.messages", messages);
		return "success";
	}
}
