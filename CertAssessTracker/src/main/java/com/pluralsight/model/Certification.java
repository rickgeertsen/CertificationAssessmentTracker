package com.pluralsight.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Certification {

	@Id
	@GeneratedValue
	@Column(name="CERT_ID")
	private Long id;
	
	@NotNull
	@Column(name="CERT_NAME")
	private String certName;
	
	@NotNull
	@Column(name="CERT_DATE")
	private Date certDate;
	
	@NotNull
	@Column(name="CERT_CATEGORY")
	private String certCategory;
	
	@NotNull
	@Column(name="TYPE")
	private String type = "Certification";
	
	@ManyToOne
	private Person person;

	public String getCertCategory() {
		return certCategory;
	}

	public Date getCertDate() {
		return certDate;
	}

	public String getCertName() {
		return certName;
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

	public void setCertCategory(String certCategory) {
		this.certCategory = certCategory;
	}

	public void setCertDate(Date certDate) {
		this.certDate = certDate;
	}

	public void setCertName(String certName) {
		this.certName = certName;
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
