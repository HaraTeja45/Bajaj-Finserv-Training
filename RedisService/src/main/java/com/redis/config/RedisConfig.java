package com.redis.config;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.redis.utils.RedisUtility;

@ConfigurationProperties
@Configuration
public class RedisConfig {

	@Value("${bfl.cache.host}")
	private String redisHostName;

	@Value("${bfl.cache.port}")
	private int redisPort;

	@Value("${bfl.cache.isclustersetup}")
	private boolean isClusterSetup;


//	@Value("${bfdl.sfdc.app.status.ratelimit.request.seconds}")
//	private long rateLimitRequestRate;
//
//	@Value("${bfdl.sfdc.app.status.ratelimit.time.seconds}")
//	private long rateLimitTimeInterval;

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConFactory;
		JedisClientConfiguration.JedisClientConfigurationBuilder jedisClientConfigurationBuilder = JedisClientConfiguration
				.builder();
		jedisClientConfigurationBuilder.usePooling();
		if (isClusterSetup) {
			RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
			redisClusterConfiguration.clusterNode(redisHostName, redisPort);
			jedisConFactory = new JedisConnectionFactory(redisClusterConfiguration,
					jedisClientConfigurationBuilder.build());
		} else {
			RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(redisHostName,
					redisPort);
			jedisConFactory = new JedisConnectionFactory(redisStandaloneConfiguration,
					jedisClientConfigurationBuilder.build());
		}
		return jedisConFactory;
	}

	@Bean(value = "redisTemplate")
	public RedisTemplate<String, ? extends Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory);
		return redisTemplate;
	}

	@Bean("redisOperation")
	@DependsOn("redisTemplate")
	public ValueOperations<String, Object> valueOpertions(RedisTemplate<String, Object> redisTemplate) {
		ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
		return valueOperations;
	}

	@Bean(name = "redissonClient")
	public RedissonClient redissonClient(@Autowired RedisUtility redisUtility) {
		return redisUtility.getRedissonConnection(isClusterSetup, "redis://" + redisHostName,
				String.valueOf(redisPort));
	}

}
