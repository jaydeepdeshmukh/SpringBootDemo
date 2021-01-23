package com.jd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jd.domain.User;

@Service
public interface UserDao extends JpaRepository<User, Long>{

}
