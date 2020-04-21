package com.doofy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName
 * @Description:
 * @Author DooFy
 * @Date 2020/4/21
 * @Version
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class RedissonTest {
    @Autowired
    RedissonClient redissonClient;

    @Test
    public void set(){
        // 设置字符串
        RBucket<String> keyObj = redissonClient.getBucket("k1");
        keyObj.set("v1236");

    }
}