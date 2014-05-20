package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Person;
import com.pluralsight.model.PersonReport;
import com.pluralsight.repository.PersonRepository;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Transactional
	public Person save(Person person) {
		
		return personRepository.save(person);
	}

	public List<Person> findAllPersons() {
		return personRepository.findAll();
	}

	public List<PersonReport> findAllPersonReports() {
		List<PersonReport> personReportCerts = null;
		List<PersonReport> personReportAssess = null;
		List<PersonReport> personReportAll = new ArrayList<PersonReport>();
		
		personReportCerts = personRepository.findAllCertificationPersonReports();
		personReportAssess = personRepository.findAllAssessmentPersonReports();
		
		if (!personReportCerts.isEmpty()) {
		    personReportAll.addAll(personReportCerts);
		}
		
		if (!personReportAssess.isEmpty()) {
		    personReportAll.addAll(personReportAssess);
		}
		
		return personReportAll;	
	}

	public List<PersonReport> findAllPersonCertificationReports() {
		List<PersonReport> personReportCerts = null;
		
		personReportCerts = personRepository.findAllCertificationPersonReports();
		
		return personReportCerts;	
	}

	public List<PersonReport> findAllPersonAssessmentReports() {
		List<PersonReport> personReportAssess = null;
		
		personReportAssess = personRepository.findAllAssessmentPersonReports();
		
		return personReportAssess;
	}
}
