package com.resume.delegateImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.resume.delegate.UserDelegate;
import com.resume.model.RegistrationModel;
import com.resume.model.ResumeModel;
import com.resume.service.UserService;

public class UserDelegateImpl implements UserDelegate {
	@Autowired
	public UserService userService;

	@Override
	public String authentication(String username, String password) {

		boolean userExists = userService.authenticate(username, password);
		if (userExists)
			return "dashboard";
		else
			return "error";
	}

	@Override
	public String registration(RegistrationModel registrationModel) {
		boolean regStatus = userService.registraion(registrationModel);
		if (regStatus)
			return "login";
		else
			return "error";
	}

	@Override
	public String setResumeDetails(ResumeModel resumeModel) {
		boolean resumeDetailStatus=userService.setResumeDetails(resumeModel);
		
		if (resumeDetailStatus)
			return "success";
		else
			return "error";
	}

}
