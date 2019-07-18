package com.jst.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 单机版可不配置此类
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {

}
