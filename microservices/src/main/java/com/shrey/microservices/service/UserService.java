package com.shrey.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrey.microservices.dao.UserDao;
import com.shrey.microservices.pojo.User;

/**
 * 
 * @author Shrey
 *
 */

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	/**
	 * 
	 * @param firstName
	 * @return
	 */
	public User getUserByName(String firstName) {
		return userDao.getUserByName(firstName);
	}

	/**
	 * 
	 * @return
	 */
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}
