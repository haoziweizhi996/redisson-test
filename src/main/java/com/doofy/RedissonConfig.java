package com.doofy;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @ClassName
 * @Description:读取redis配置文件
 * @Author DooFy
 * @Date 2020/4/21
 * @Version
 **/
@Configuration
public class RedissonConfig {


    @Bean
    public RedissonClient redisson() throws IOException {
        Config config = Config.fromYAML(RedissonConfig.class.getClassLoader().getResource("config-file.yaml"));
        return Redisson.create(config);
    }



}