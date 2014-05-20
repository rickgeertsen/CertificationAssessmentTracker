package com.pluralsight.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pluralsight.model.Certification;
import com.pluralsight.model.Person;
import com.pluralsight.service.CertificationService;

@Controller
public class CertificationController {
	
	@Autowired
	private CertificationService certificationService;
	
	@RequestMapping(value = "/addCertification",  method = RequestMethod.GET)
	public String getCertification(@ModelAttribute ("certification") Certification certification) {
	
		return "addCertification";
	}
	
	@RequestMapping(value = "/addCertification",  method = RequestMethod.POST)
	public String addCertification(@Valid @ModelAttribute ("certification") Certification certification, HttpSession session, BindingResult result) {
		
		System.out.println("Certification Name: " + certification.getCertName());
		System.out.println("Certification Date: " + certification.getCertDate());
		System.out.println("Certification Type: " + certification.getType());
		System.out.println("Certification Category: " + certification.getCertCategory());
		
		if(result.hasErrors()) {
			return "addCertification";
		}
		else {
			Person person = (Person)session.getAttribute("person");
			certification.setPerson(person);
			certificationService.save(certification);
		}
		
		return "forward:index.jsp";
	}

}
