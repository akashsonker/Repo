package com.resume.service;

public interface AdminService {
	public String login();

	public String logout();

	public String viewAllUsers();

	public String viewUser(String name);

	public String blockUser();
}
