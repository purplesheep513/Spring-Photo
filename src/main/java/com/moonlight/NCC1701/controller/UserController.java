package com.moonlight.NCC1701.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.moonlight.NCC1701.entity.User;
import com.moonlight.NCC1701.repository.UserRepository;
import com.moonlight.NCC1701.service.UserService;

// this controller only shows pages.

@Controller
public class UserController {
	@GetMapping({ "", "/" })
	public String index() {
		// 로그인 되지 않은  사용자는 이곳에 진입
		// 로그인 된 사용자는 /main으로 이동
		return "signinPage";
	}

	@GetMapping("/main")
	public String signin() {
		return "main";
	}

	// 포스트 List

	// 포스트 쓰기

	// 포스트 삭제

	// 댓글 작성

	// 댓글 삭제

	// 하트 보내기

	// 하트를 보낸 유저 정보 반환

	// 로그아웃
}
