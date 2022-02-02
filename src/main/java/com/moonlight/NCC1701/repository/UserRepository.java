package com.moonlight.NCC1701.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.moonlight.NCC1701.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	User findByUserIdAndUserPassword(String userId, String userPassword);
	
	//@Query(value="SELECT * FROM user WHERE userId = ?1 AND userPassword = ?2")
	//User signin(String userId, String userPassword);
}
