package com.pluralsight.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Assessment {

	@Id
	@GeneratedValue
	@Column(name="ASSESS_ID")
	private Long id;
	
	@NotNull
	@Column(name="ASSESS_NAME")
	private String assessName;
	
	@NotNull
	@Column(name="ASSESS_DATE")
	private Date assessDate;
	
	@NotNull
	@Column(name="ASSESS_CATEGORY")
	private String assessCategory;
	
	@NotNull
	@Column(name="TYPE")
	private String type = "Assessment";
	
	@ManyToOne
	private Person person;

	public String getAssessCategory() {
		return assessCategory;
	}

	public Date getAssessDate() {
		return assessDate;
	}

	public String getAssessName() {
		return assessName;
	}

	public Long getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public String getType() {
		return type;
	}

	public void setAssessCategory(String assessCategory) {
		this.assessCategory = assessCategory;
	}

	public void setAssessDate(Date assessDate) {
		this.assessDate = assessDate;
	}

	public void setAssessName(String assessName) {
		this.assessName = assessName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setType(String type) {
		this.type = type;
	}
}
