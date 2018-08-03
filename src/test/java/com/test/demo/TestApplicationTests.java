package com.test.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.demo.tool.queue.HelloSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
	
    @Resource
    RedisTemplate redisTemplate;

    @Resource
    StringRedisTemplate stringRedisTemplate;
    
    @Autowired
    private HelloSender helloSender;

    @Resource(name="redisTemplate")
    private ListOperations<String, String> listOps;

    @Test
    public void contextLoads() {
        System.out.println("进入");
//        redisTemplate.opsForValue().set("aaa", "xiaowang");
        
        System.out.println(redisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void testRedisInfo(){
        System.out.println("xiaowangxiaowang");
    }
    
    @Test
    public void testRabbitDemo() {
    	helloSender.send();
    }

}
