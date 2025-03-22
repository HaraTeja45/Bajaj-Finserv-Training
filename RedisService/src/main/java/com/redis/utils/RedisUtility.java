package com.redis.utils;

import java.text.MessageFormat;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.stereotype.Component;

@Component
public class RedisUtility {

	public RedissonClient getRedissonConnection(boolean isClusterSetUp, String redisHost, String redisPort) {
		Config config = new Config();
		if (isClusterSetUp) {
			config.useClusterServers().addNodeAddress(MessageFormat.format("{0}:{1}", redisHost, redisPort));
		} else {
			config.useSingleServer().setAddress(MessageFormat.format("{0}:{1}", redisHost, redisPort));
		}
		return Redisson.create(config);
	}

}
