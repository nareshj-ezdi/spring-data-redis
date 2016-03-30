/**
 * 
 */
package org.programming.mitra.spring.data.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author Naresh Joshi
 * @since 18-Feb-2016
 */

@Configuration
public class Configurations {

	@Bean
	public RedisConnectionFactory connectionfactory() {
		/**
		 * default values are
		 * hostName = "localhost",
		 * port = 6379, 
		 * usePool =true,
		 * password is empty;
		 */
		JedisConnectionFactory factory = new JedisConnectionFactory();
		return factory;
	}

	@Bean
	public RedisTemplate<?, ?> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<?, ?> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);
		return template;
	}
}
