package com.moonlight.NCC1701.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moonlight.NCC1701.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
