package com.resume.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.UserDAO;
import com.resume.model.RegistrationModel;
import com.resume.model.ResumeModel;
import com.resume.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public void setLoginDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean authenticate(String username, String password) {
		System.out.println("In Service class...Check Login");
		return userDAO.validateUser(username, password);
	}

	@Override
	public boolean registraion(RegistrationModel registrationModel) {
		return userDAO.register(registrationModel);
	}

	@Override
	public boolean setResumeDetails(ResumeModel resumeModel) {
		return userDAO.setResumeDetails(resumeModel);

	}

}
