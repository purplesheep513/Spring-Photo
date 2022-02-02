package com.moonlight.NCC1701.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM -> Java등(다른언어)에서 Object를 생성하면 -> 테이블로 매칭시켜준다.

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // User클래스가 아래 정보를 읽어 MySql에 테이블이 생성된다.
public class User {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB넘버링 전략을 따라간다.
	private int id; //시퀀스, auto_increment
	
	@Column(nullable = false, length = 30,unique=true)
	private String userId;
	
	@Column( length = 20)
	@ColumnDefault("'oo'")
	private String userName;
	
	@Column(nullable = false, length = 200)
	private String userPassword;

	@Column(length = 500)
	private String userPhoto;
	
	@Column(nullable = false, length = 50)
	private String userEmail;
	
	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}
