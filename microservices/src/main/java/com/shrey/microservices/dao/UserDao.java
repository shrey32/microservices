package com.shrey.microservices.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shrey.microservices.pojo.User;

/**
 * 
 * @author Shrey
 *
 */
@Repository
public class UserDao {

	/**
	 * 
	 * @param firstName
	 * @return
	 */
	public User getUserByName(String firstName) {
		return new User(firstName, "Doe");
	}

	/**
	 * 
	 * @return
	 */
	public List<User> getAllUsers() {
		List<User> users = new LinkedList<>();
		users.add(new User("John", "Doe"));
		users.add(new User("Matthew", "Fraser"));
		return users;
	}

}
