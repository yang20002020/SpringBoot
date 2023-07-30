package com.fuyu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Springboot050RedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void set() {
        ValueOperations value = redisTemplate.opsForValue();
        value.set("age", 41);

    }

    @Test
    void get() {
        ValueOperations value = redisTemplate.opsForValue();
        Object age = value.get("age");
        System.out.println(age);
    }

    @Test
    void hset() {
        HashOperations ops = redisTemplate.opsForHash();
        ops.put("info", "a", "aa");

    }

    @Test
    void hget() {
        HashOperations ops = redisTemplate.opsForHash();
        Object value = ops.get("info", "a");
        System.out.println(value);
    }

}
