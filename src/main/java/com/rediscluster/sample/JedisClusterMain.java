package com.rediscluster.sample;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.JedisCluster;


public class JedisClusterMain {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("classpath:applicationContext-rediscluster.xml");

        JedisCluster jc = ctx.getBean(JedisCluster.class);
        jc.set("test", UUID.randomUUID().toString());
        System.out.println(String.format("---------------%s %s", "test", jc.get("test")));

    }

}
