package com.resume.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import com.resume.delegate.UserDelegate;
import com.resume.model.RegistrationModel;

@Controller
public class ResumeBuilderController {
	@Autowired
	public UserDelegate userDelegate;

	ModelAndView modelAndView = null;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView showLoginForm() {
		return new ModelAndView("login");

	}

	@RequestMapping(value = "login.htm", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		String viewName = userDelegate.authentication(username, password);
		return new ModelAndView(viewName);
	}

	@RequestMapping(value = "/register.htm", method = RequestMethod.GET)
	public ModelAndView showSignupForm(Map<String, Object> model) {
		model.put("registrationModel", new RegistrationModel());
		return new ModelAndView("register");
	}

	@RequestMapping(value = "register.htm", method = RequestMethod.POST)
	public String registration(@ModelAttribute("registrationModel") RegistrationModel registrationModel,
			BindingResult result) {
		String viewName = userDelegate.registration(registrationModel);
		RequestAttributes reqAtt = RequestContextHolder.getRequestAttributes();
		System.out.println(reqAtt.getAttribute("userID", RequestAttributes.SCOPE_REQUEST));
		return viewName;
	}
	@RequestMapping(value = "/createResume.htm", method = RequestMethod.GET)
	public String crateResume() {
		return "redirect:resumeFlow";
	}

	
	/*@RequestMapping(value = "/createResume.htm", method = RequestMethod.GET)
	public String crateResume(Map<String, Object> model,@ModelAttribute("resumeModel") ResumeModel resumeModel,BindingResult error) {
		model.put("resumeModel", new ResumeModel());
		return "redirect:resumeFlow";
	}
*/
	/*@RequestMapping(value = "/createResume.htm", method = RequestMethod.GET)
	public String crateResume(Map<String, Object> model) {
		model.put("resumeModel", new ResumeModel());
		return "create-resume";
	}

	@RequestMapping(value = "resumeDetailPart1.htm", method = RequestMethod.POST)
	public String resumeInitialDetail(@ModelAttribute("resumeModel") ResumeModel resumeModel) {
		return "local-address";
	}
	
	@RequestMapping(value="localAddress.htm",method=RequestMethod.POST)
	public String localAddressDetail(@ModelAttribute("resumeModel") ResumeModel resumeModel){
		return "permanent-address";
	}
	@RequestMapping(value="permanentAddress.htm",method=RequestMethod.POST)
	public String permanentAddressDetail(@ModelAttribute("resumeModel") ResumeModel resumeModel){
		String viewName = userDelegate.setResumeDetails(resumeModel);
		return viewName;
	}
	*/

}
