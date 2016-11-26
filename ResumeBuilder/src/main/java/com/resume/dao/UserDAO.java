package com.resume.dao;

import com.resume.model.RegistrationModel;
import com.resume.model.ResumeModel;

public interface UserDAO {
	public boolean validateUser(String username, String password);
	public boolean register(RegistrationModel registrationModel);
	public boolean setResumeDetails(ResumeModel resumeModel);
}
