/**
 * 
 */
package org.programming.mitra.spring.data.redis.repository.impl;

import javax.annotation.Resource;

import org.programming.mitra.spring.data.redis.model.Employee;
import org.programming.mitra.spring.data.redis.model.Model;
import org.programming.mitra.spring.data.redis.repository.Repository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Naresh Joshi
 * @since 18-Feb-2016
 */

@Service
public class RepositoryImpl implements Repository<Employee> {

	@Resource
	private RedisTemplate<String, Model> redisTemplate;

	@Override
	public void put(Employee object) {
		redisTemplate.opsForHash().put(object.getKey(), object.getHashKey(), object);
	}

	@Override
	public Employee get(Employee key) {
		return (Employee) redisTemplate.opsForHash().get(key.getKey(), key.getHashKey());
	}

	@Override
	public void delete(Employee key) {
		redisTemplate.opsForHash().delete(key.getKey(), key.getHashKey());
	}

}
