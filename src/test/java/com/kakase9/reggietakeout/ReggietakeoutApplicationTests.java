package com.kakase9.reggietakeout;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class ReggietakeoutApplicationTests {

//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    @Test
//    public void testString(){
//        ValueOperations valueOperations = redisTemplate.opsForValue();//简单k-v操作
//        valueOperations.set("city","hp");
//    }

//    @Test
//    void contextLoads() {
//    }



//}
