package test.com.pluralsight;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.pluralsight.model.Assessment;
import com.pluralsight.model.Certification;
import com.pluralsight.model.Person;
import com.pluralsight.model.PersonReport;
import com.pluralsight.service.AssessmentService;
import com.pluralsight.service.CertificationService;
import com.pluralsight.service.PersonService;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/testJpaContext.xml"})
public class TestPersonService /*extends TestCase*/ {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private CertificationService certificationService;
	
	@Autowired
	private AssessmentService assessmentService;
	
	@Test
	public void testSaveGetPerson() {
		Person person = new Person();
		
		person.setFirstName("Yogi");
		person.setMiddleName("T");
		person.setLastName("Bear");
		
		person.setId(null);
		personService.save(person);
		
		List<Person> persons = personService.findAllPersons();
		
		Assert.assertNotNull("Persons list is null", persons);
		Assert.assertTrue("Persons List is empty", persons.size() > 0);
		
		boolean foundPerson = false;
		
		for (Person thisPerson : persons) {
			if (thisPerson.getLastName().equals(person.getLastName()) 
					&& thisPerson.getFirstName().equals(person.getFirstName())
					&& thisPerson.getMiddleName().equals(person.getMiddleName())) {
						
				foundPerson = true;
				break;
			}
		}
		
		
		Assert.assertEquals("Person not found", true, foundPerson);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSaveCertifications() {
		Person person = new Person();
		Certification certification = new Certification();
		
		person.setFirstName("Mickey");
		person.setMiddleName("M");
		person.setLastName("Mouse");
		
		person.setId(null);
		personService.save(person);
		List<Person> persons = personService.findAllPersons();
		
		Assert.assertNotNull("Persons list is null", persons);
		Assert.assertTrue("Persons List is empty", persons.size() > 0);
		
		boolean foundPerson = false;
		
		for (Person thisPerson : persons) {
			if (thisPerson.getLastName().equals(person.getLastName()) 
					&& thisPerson.getFirstName().equals(person.getFirstName())
					&& thisPerson.getMiddleName().equals(person.getMiddleName())) {
						
				foundPerson = true;
				break;
			}
		}
		
		Assert.assertEquals("Person not found", true, foundPerson);
		
		certification.setPerson(person);
		certification.setCertName("Java");
		certification.setCertDate(new Date("05/02/2014"));
		certification.setCertCategory("Professional");
		certificationService.save(certification);
		
		List<PersonReport> personReports = personService.findAllPersonCertificationReports();
		
		Assert.assertNotNull("PersonReports list is null", personReports);
		Assert.assertTrue("PersonsReports List is empty", personReports.size() > 0);
		
		boolean foundIt = false;
		
		for (PersonReport personReport : personReports) {
			if (personReport.getLastName().equals(person.getLastName()) 
					&& personReport.getFirstName().equals(person.getFirstName())
					&& personReport.getMiddleName().equals(person.getMiddleName())) {
				
				Assert.assertEquals("Certification Name does not match", certification.getCertName(), personReport.getCertAssessName());
				Assert.assertEquals("Certification Date does not match", certification.getCertDate(), personReport.getCertAssessDate());
				Assert.assertEquals("Type does not match", certification.getType(), personReport.getType());
				Assert.assertEquals("Certification Category does not match", certification.getCertCategory(), personReport.getCertAssessCategory());
				foundIt = true;
				break;
				
			}
		}
        Assert.assertEquals("Person Object not found", true, foundIt);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSaveAssessments() {
		Person person = new Person();
		Assessment assessment = new Assessment();
		
		person.setFirstName("Donald");
		person.setMiddleName("L");
		person.setLastName("Duck");
		
		person.setId(null);
		personService.save(person);
		List<Person> persons = personService.findAllPersons();
		
		Assert.assertNotNull("Persons list is null", persons);
		Assert.assertTrue("Persons List is empty", persons.size() > 0);
		
		boolean foundPerson = false;
		
		for (Person thisPerson : persons) {
			if (thisPerson.getLastName().equals(person.getLastName()) 
					&& thisPerson.getFirstName().equals(person.getFirstName())
					&& thisPerson.getMiddleName().equals(person.getMiddleName())) {
						
				foundPerson = true;
				break;
			}
		}
		
		Assert.assertEquals("Person not found", true, foundPerson);
		
		assessment.setPerson(person);
		assessment.setAssessName("Spring JPA with Hibernate");
		assessment.setAssessDate(new Date("05/10/2014"));
		assessment.setAssessCategory("Intermediate");
		assessmentService.save(assessment);
		
		List<PersonReport> personReports = personService.findAllPersonAssessmentReports();
		
		Assert.assertNotNull("PersonReports list is null", personReports);
		Assert.assertTrue("PersonsReports List is empty", personReports.size() > 0);
		
		boolean foundIt = false;
		
		for (PersonReport personReport : personReports) {
			if (personReport.getLastName().equals(person.getLastName()) 
					&& personReport.getFirstName().equals(person.getFirstName())
					&& personReport.getMiddleName().equals(person.getMiddleName())) {
				
				Assert.assertEquals("Assessment Name does not match", assessment.getAssessName(), personReport.getCertAssessName());
				Assert.assertEquals("Assessment Date does not match", assessment.getAssessDate(), personReport.getCertAssessDate());
				Assert.assertEquals("Type does not match", assessment.getType(), personReport.getType());
				Assert.assertEquals("Assessment Category does not match", assessment.getAssessCategory(), personReport.getCertAssessCategory());
				foundIt = true;
				break;
				
			}
		}
        Assert.assertEquals("Person Object not found", true, foundIt);
		
		
		
	}


}
