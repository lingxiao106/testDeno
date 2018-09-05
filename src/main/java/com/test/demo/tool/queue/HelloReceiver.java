package com.test.demo.tool.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component

public class HelloReceiver {
	
	@RabbitListener(queues="hello")
	public void process(String hello) {
		System.out.println("Receiver" + hello);
	}
	
	@RabbitListener(queues="hello")
	public void process1(String hello) {
		System.out.println("Receiver2" + hello);
	}
	
	@RabbitListener(queues="topic.message")
	public void process3(String hello) {
		System.out.println("Receiver22" + hello);
	}
	
	@RabbitListener(queues="topic.message")
	public void process43(String hello) {
		System.out.println("Receiver21" + hello);
	}
	
	@RabbitListener(queues= "topic.messages")
	public void process5(String hello) {
		System.out.println("Receiver323" + hello);
	}
	
	@RabbitListener(queues= "topic.messages")
	public void process16(String hello) {
		System.out.println("Receiver2111" + hello);
	}
}
