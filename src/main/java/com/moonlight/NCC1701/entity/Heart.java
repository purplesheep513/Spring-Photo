package com.moonlight.NCC1701.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Heart {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int heartId;
	
	@ManyToOne // FK (User)
	@JoinColumn(name="id")
	private User user;
	
	@ManyToOne // FK (Post)
	@JoinColumn(name="postId")
	private Post post;
	
	@CreationTimestamp
	private Timestamp createDate;
}
