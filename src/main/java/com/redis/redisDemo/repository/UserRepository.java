
package com.redis.redisDemo.repository;

import java.util.Map;

import com.redis.redisDemo.model.User;


/**
 * @author sagarbehera
 *
 */
public interface UserRepository {
	
	void save(User user);
	
    Map<String, User> findAll();
    
    User findById(String id);
    
    void update(User user);
    
    void delete(String id);

}
