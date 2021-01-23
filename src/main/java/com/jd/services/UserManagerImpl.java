package com.jd.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.dao.UserDao;
import com.jd.domain.User;

@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	UserDao userDao;
	
	@Override
//	@Transactional
	public void addUser(User user) {
		userDao.save(user);
	}

}
