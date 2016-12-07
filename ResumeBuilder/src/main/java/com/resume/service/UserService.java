package com.resume.service;

import com.resume.model.RegistrationModel;
import com.resume.model.ResumeModel;

public interface UserService {
	public boolean registraion(RegistrationModel registrationModel);

	public boolean authenticate(String username, String password);
	public boolean setResumeDetails(ResumeModel resumeModel);

	/*public String logout();

	public String createResume();

	public String showResume(String name);

	public String showAllResumes();

	public String updateResume();

	public String deleteResume();

	public String updatePersonalDetails();

	public String generatePDF();*/
}
