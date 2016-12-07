package com.resume.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reg_tbl")
public class RegistrationEntity {
	
	private int regID;
	private String email;
	private long mobileNo;
	private String city;
	private LoginEntity loginEntity;
	
	@Id
	@GeneratedValue
	@Column(name="regID")
	public int getRegID() {
		return regID;
	}
	public void setRegID(int regID) {
		this.regID = regID;
	}
	@Column(name="email",nullable=false,length=100)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="mobile_no",nullable=false,length=100)
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Column(name="city",nullable=false,length=100)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@OneToOne(cascade=CascadeType.ALL)
	public LoginEntity getLoginEntity() {
		return loginEntity;
	}
	public void setLoginEntity(LoginEntity loginEntity) {
		this.loginEntity = loginEntity;
	}

}
