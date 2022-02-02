package com.moonlight.NCC1701.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
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
public class Reply {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int replyId;
	
	@ManyToOne // FK (User)
	@JoinColumn(name="Id")
	private User user;
	
	@ManyToOne // FK (Post)
	@JoinColumn(name="postId")
	private Post post;
	
	@Column(length = 500)
	private String replyPhoto;
	
	@Column(length = 300)
	private String replyContent;
	
	@CreationTimestamp
	private Timestamp createDate;
}
