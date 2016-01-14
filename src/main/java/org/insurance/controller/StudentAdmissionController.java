package org.insurance.controller;

import org.insurance.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/AdmissionForm.html", method=RequestMethod.GET)
public ModelAndView getAdmission(){
ModelAndView model=new ModelAndView("AdmissionForm");
	
	return model;
	
}

@RequestMapping(value="/submitAdmissionForm.html", method= RequestMethod.POST)
public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1, BindingResult result)
{
	if(result.hasErrors())
	{
		ModelAndView model1=new ModelAndView("AdmissionForm");
		return model1;
	}
	ModelAndView model1=new ModelAndView("AdmissionSuccess");
	model1.addObject("msg", "Details submitted by you: ");

	return model1;
}
}