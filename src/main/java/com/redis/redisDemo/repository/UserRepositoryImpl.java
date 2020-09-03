package com.redis.redisDemo.repository;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.redis.redisDemo.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private RedisTemplate<String, User> redistemplate;
	private HashOperations hashOperations;
	private static final String TABLE_NAME = "USER";
	
	public UserRepositoryImpl(RedisTemplate<String, User> redistemplate) {
		this.redistemplate = redistemplate;
		hashOperations = redistemplate.opsForHash();
	}

	
	@Override
	public void save(User user) {
		hashOperations.put(TABLE_NAME, user.getId(), user);
	}

	@Override
	public Map<String, User> findAll() {
		// TODO Auto-generated method stub
		 return hashOperations.entries(TABLE_NAME);
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return (User)hashOperations.get(TABLE_NAME, id);
	}

	@Override
	public void update(User user) {
		save(user);

	}

	@Override
	public void delete(String id) {
		hashOperations.delete(TABLE_NAME, id);
	}

}
