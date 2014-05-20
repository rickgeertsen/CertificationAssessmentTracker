package com.pluralsight.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.PersonReport;
import com.pluralsight.model.Person;
import com.pluralsight.service.PersonService;

@Controller
@SessionAttributes("person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "addPerson", method = RequestMethod.GET)
	public String addPerson(Model model, HttpSession session) {
		
		Person person = (Person)session.getAttribute("person");
		
		if (person == null) {
			person = new Person();
		}
			
		model.addAttribute("person", person);
		
		return "addPerson";
	}
	
	@RequestMapping(value = "addPerson", method = RequestMethod.POST)
	public String updatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		
		
		System.out.println("result has errors: " + result.hasErrors());

		
		String fullName = person.getFirstName() +
				          person.getMiddleName() != null ? " " + person.getMiddleName() + " " : " " +
		                  person.getLastName();
		System.out.println("Person name: " + fullName);
		
		if(result.hasErrors()) {
			return "addPerson";
		}
		else {
			person.setId(null);
			personService.save(person);
		}
		
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="getPersons", method = RequestMethod.GET)
	public String getPersons(Model model) {
		List<Person> persons = personService.findAllPersons();
		
		model.addAttribute("persons", persons);
		
		return "getPersons";
	}
	
	@RequestMapping(value="getAllPersonReports", method = RequestMethod.GET)
	public String getAllPersonReports(Model model) {
		List<PersonReport> personReports = personService.findAllPersonReports();
		
		model.addAttribute("personReports", personReports);
		
		return "getPersonReports";
	}
	
	@RequestMapping(value="getPersonCertificationReports", method = RequestMethod.GET)
	public String getPersonCertificationReports(Model model) {
		List<PersonReport> personReports = personService.findAllPersonCertificationReports();
		
		model.addAttribute("personReports", personReports);
		
		return "getPersonReports";
	}
	
	@RequestMapping(value="getPersonAssessmentReports", method = RequestMethod.GET)
	public String getPersonAssessmentReports(Model model) {
		List<PersonReport> personReports = personService.findAllPersonAssessmentReports();
		
		model.addAttribute("personReports", personReports);
		
		return "getPersonReports";
	}

}
