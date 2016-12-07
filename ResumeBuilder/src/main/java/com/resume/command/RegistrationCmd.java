package com.resume.command;

public class RegistrationCmd {
	private String email;
	private long mobileNo;
	private String city;
	private LoginCmd loginCmd;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LoginCmd getLoginCmd() {
		return loginCmd;
	}
	public void setLoginCmd(LoginCmd loginCmd) {
		this.loginCmd = loginCmd;
	}
	@Override
	public String toString() {
		return "RegistrationCmd [email=" + email + ", mobileNo=" + mobileNo + ", city=" + city + ", loginCmd="
				+ loginCmd + "]";
	}
	
	
}
