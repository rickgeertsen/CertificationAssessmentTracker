package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="persons")
public class Person {

	@Id
	@GeneratedValue
	@Column(name="PERSON_ID")
	private Long id;
	
	@NotNull
	@Column(name="LAST_NAME")
	private String lastName;
	
	@NotNull
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Certification> certifications = new ArrayList<Certification>();
	
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Assessment> assessments = new ArrayList<Assessment>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}

//	public List<Assessment> getAssesments() {
//		return assessments;
//	}
//
//	public void setAssesments(List<Assessment> assesments) {
//		this.assessments = assesments;
//	}
	
}
