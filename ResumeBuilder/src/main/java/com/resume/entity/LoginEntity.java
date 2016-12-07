package com.resume.entity;

import javax.persistence.Column;

public class LoginEntity {
	private int userID;
	private String username;
	private String password;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [userID=" + userID + ", username=" + username + ", password=" + password + "]";
	}
}
