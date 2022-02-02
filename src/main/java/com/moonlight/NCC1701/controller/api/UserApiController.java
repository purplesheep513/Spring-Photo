package com.moonlight.NCC1701.controller.api;

import javax.servlet.http.HttpSession;

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
	
	// 세션은 컨트롤러에서 매개변수로 받을 수도 있고.
	// 스프링이 세션 객체를 빈으로 등록해서 가지고 있기 때문에 변수로 볼 수도 있다.
	@Autowired
	private HttpSession session; 

	
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
	@PostMapping("/api/signin")
	public ResponseDto<Integer> signInController(@RequestBody User user){ 
//		System.out.println("call signInController");
		User principal = userService.signInService(user);
		
		if(principal != null) {
			session.setAttribute("principal", principal);
		}
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
	}
	// 유저 대표 이미지 변경
	
	// 임시 비밀번호 전송
}
