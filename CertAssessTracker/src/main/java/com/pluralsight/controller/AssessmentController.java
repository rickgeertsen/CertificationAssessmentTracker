package com.pluralsight.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.Assessment;
import com.pluralsight.model.Person;
import com.pluralsight.service.AssessmentService;

@Controller
public class AssessmentController {

	@Autowired
	private AssessmentService assessmentService;
	
	@RequestMapping(value = "/addAssessment",  method = RequestMethod.GET)
	public String getAssessment(@ModelAttribute ("assessment") Assessment assessment) {
	
		return "addAssessment";
	}
	
	@RequestMapping(value = "/addAssessment",  method = RequestMethod.POST)
	public String addAssessment(@Valid @ModelAttribute ("assessment") Assessment assessment, HttpSession session, BindingResult result) {
		
		System.out.println("Assessment Name: " + assessment.getAssessName());
		System.out.println("Assessment Date: " + assessment.getAssessDate());
		System.out.println("Assessment Type: " + assessment.getType());
		System.out.println("Assessment Category: " + assessment.getAssessCategory());
		
		if(result.hasErrors()) {
			return "addAssessment";
		}
		else {
			Person person = (Person)session.getAttribute("person");
			assessment.setPerson(person);
			assessmentService.save(assessment);
		}
		
		return "forward:index.jsp";
	}

}
