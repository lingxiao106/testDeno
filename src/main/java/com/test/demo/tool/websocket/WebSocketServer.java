package com.test.demo.tool.websocket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import groovy.util.logging.Slf4j;

@Slf4j
@ServerEndpoint(value = "/webSocketServer/{userName}")
@Component
public class WebSocketServer {
	private static int onlineCount=0;
	
	private static CopyOnWriteArraySet<WebSocketServer> webSocketServers = new CopyOnWriteArraySet<>();
	
	private Session session;

	@OnOpen
	public void opOpen(Session session) {
		this.session = session;
		webSocketServers.add(this);
		addOnlineCount();
		System.out.println("当前在线人数" + getOnlineCount());
		try {
			sendMessage("连接成功");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("出现异常" + e.getMessage());
		}
	}

	
	@OnMessage
	public void onMessage(String message,Session session) {
		System.err.println("来着客户端的消息" + message);
		for (WebSocketServer item : webSocketServers) {
			try {
				item.sendMessage(message);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	@OnClose
	public void onCloase(){
		webSocketServers.remove(this);
		subOnlineCount();
		System.out.println("一位战友离开了游戏" + getOnlineCount());
	}
	
	@OnError
	public void onError(Session session,Throwable error) {
		System.out.println("出现错误");
		error.printStackTrace();
	}
	
	public void sendMessage(String text) throws IOException {
		this.session.getBasicRemote().sendText(text);
	}
	
	public static synchronized int getOnlineCount() {
		return onlineCount;
	}
	
	public static synchronized void addOnlineCount() {
		WebSocketServer.onlineCount ++;
	}
	
	public static synchronized void subOnlineCount() {
		WebSocketServer.onlineCount --;
	}
}
