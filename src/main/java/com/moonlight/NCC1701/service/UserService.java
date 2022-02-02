package com.moonlight.NCC1701.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
	@Transactional(readOnly = true) // select 할때 트랜잭션 시작, 서비스 종료시 트랜잭션 종료(정합성 유지)
	public User signInService(User user) {
		return userRepositiory.findByUserIdAndUserPassword(user.getUserId(), user.getUserPassword());
	}
	// 유저 대표 이미지 변경
	
	// 임시 비밀번호 전송
	
}
