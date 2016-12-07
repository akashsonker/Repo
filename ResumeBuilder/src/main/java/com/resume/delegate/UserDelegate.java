package com.resume.delegate;

import com.resume.model.RegistrationModel;
import com.resume.model.ResumeModel;

public interface UserDelegate {
	public String authentication(String username, String password);
	public String registration(RegistrationModel registraionModel);
	public String setResumeDetails(ResumeModel resumeModel );
}
