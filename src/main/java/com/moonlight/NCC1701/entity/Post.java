package com.moonlight.NCC1701.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Post {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int postId;
	
	@ManyToOne // FK (User)
	@JoinColumn(name="Id")
	private User user;
	
	@OneToMany(mappedBy = "post",fetch = FetchType.EAGER) // 게시글에 달린 댓글 항상 가져오기
	private List<Reply> reply;
	
	@Column(length = 500)
	private String postPhoto;
	
	@Column(length = 300)
	private String postContent;
	
	@Column
	private int heartNum;
	
	@CreationTimestamp
	private Timestamp createDate;
}
