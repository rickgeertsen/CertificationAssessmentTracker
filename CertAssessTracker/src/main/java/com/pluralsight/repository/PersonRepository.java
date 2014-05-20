package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Person;
import com.pluralsight.model.PersonReport;

@Repository("personRepository")
public interface PersonRepository  extends JpaRepository<Person, Long>{
	
@Query("Select new com.pluralsight.model.PersonReport(p.lastName, p.firstName, p.middleName, "
		+ "c.certName, c.certDate, c.certCategory, c.type) " +
		"from Person p, Certification c where p.id=c.person.id order by p.lastName, p.firstName, p.middleName")
List<PersonReport> findAllCertificationPersonReports();

@Query("Select new com.pluralsight.model.PersonReport(p.lastName, p.firstName, p.middleName, "
		+ "a.assessName, a.assessDate, a.assessCategory, a.type) " +
		"from Person p, Assessment a where p.id=a.person.id order by p.lastName, p.firstName, p.middleName")
List<PersonReport> findAllAssessmentPersonReports();


}
