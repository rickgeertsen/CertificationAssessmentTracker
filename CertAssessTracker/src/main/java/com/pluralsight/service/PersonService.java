package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Person;
import com.pluralsight.model.PersonReport;

public interface PersonService {
	
	Person save(Person person);

	List<Person> findAllPersons();

	List<PersonReport> findAllPersonReports();
	
	List<PersonReport> findAllPersonCertificationReports();
	
	List<PersonReport> findAllPersonAssessmentReports();
}
