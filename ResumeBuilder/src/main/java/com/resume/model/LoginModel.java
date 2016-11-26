package com.resume.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_tbl")
public class LoginModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userID;

	private String username;

	private String password;

	@Id
	@GeneratedValue
	@Column(name = "userId")
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
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
