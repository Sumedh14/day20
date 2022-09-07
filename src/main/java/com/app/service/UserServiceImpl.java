package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;

	@Override
	public User authenticateUser(String em, String pass) {
		return userDao.findByEmailAndPassword(em, pass)
				.orElseThrow(() -> new RuntimeException("Invalid email or password"));
	}

}
