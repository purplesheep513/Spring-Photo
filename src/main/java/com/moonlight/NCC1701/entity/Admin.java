package com.moonlight.NCC1701.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Admin {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int Id;
	
	@Column(nullable = false, length = 30,unique=true)
	private String adminId;
	
	@Column(nullable = false, length = 30)
	private String adminAuth;
	
	@CreationTimestamp
	private Timestamp createDate;
}
