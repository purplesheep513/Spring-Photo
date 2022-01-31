package com.moonlight.NCC1701.entity;

public class User {
	//table column
	private String userId;
	private String userPassword;
	private String email;
	private String userName;
	
	public User(String userId, String userName, String userPassword, String email) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
