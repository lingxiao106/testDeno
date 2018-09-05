package com.test.demo.tool.queue;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send() {
		String context = "Hello" + new Date().getTime();
		System.out.println("Sender " + context);
		this.amqpTemplate.convertAndSend("hello",context);
	}
	
	
}
