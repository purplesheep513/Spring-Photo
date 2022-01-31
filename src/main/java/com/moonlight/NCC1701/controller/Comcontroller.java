package com.moonlight.NCC1701.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonlight.NCC1701.entity.User;

@RestController
public class Comcontroller {
	
	//회원가입 유저
	@PostMapping("/create/user")
	public String createUser(@RequestBody User user){
		return "getUser : " + user.getUserId();
	}
}
