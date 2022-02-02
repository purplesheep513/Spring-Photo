package com.moonlight.NCC1701.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonlight.NCC1701.dto.ResponseDto;
import com.moonlight.NCC1701.entity.User;
import com.moonlight.NCC1701.service.UserService;

// this Controller sends data to Service(data manipulating)

@RestController
public class UserApiController {
	
	@Autowired
	private UserService userService;
	
	// 회원가입
	@PostMapping("/api/user")
	public ResponseDto<Integer> createUserContoller(@RequestBody User user) {
		
		if(user.getUserName() == "") { // setting default userName
			user.setUserName("oo");
		}
		
		// send data to service 
		userService.createUserService(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}
	
	// 로그인
	
	// 유저 대표 이미지 변경
	
	// 임시 비밀번호 전송
}
