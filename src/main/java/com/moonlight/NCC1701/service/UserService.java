package com.moonlight.NCC1701.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.moonlight.NCC1701.dto.ResponseDto;
import com.moonlight.NCC1701.entity.User;
import com.moonlight.NCC1701.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository userRepositiory;
	
	//회원가입
	@Transactional
	public void createUserService(User user) {
		userRepositiory.save(user);
	}
	
	// 로그인
	
	// 유저 대표 이미지 변경
	
	// 임시 비밀번호 전송
	
}
