package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.User;

public interface IUserDao extends JpaRepository<User,Long> {
	Optional<User> findByEmailAndPassword(String em,String pass);
	
}
