package com.jd.services;

import org.springframework.stereotype.Component;

import com.jd.domain.User;

public interface UserManager {

	void addUser(User user);
}
