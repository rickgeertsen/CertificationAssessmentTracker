package com.pluralsight.model;

import java.util.Date;

public class PersonReport {
    private String lastName;
    private String firstName;
    private String middleName;
    private String certAssessName;
    private Date certAssessDate;
    private String certAssessCategory;
    private String type;
    
    public PersonReport(String lastName, String firstName, String middleName,
    		String certAssessName, Date certAssessDate, String certAssessCategory, String type) {
    	this.lastName = lastName;
    	this.firstName = firstName;
    	this.middleName = middleName;
    	this.certAssessName = certAssessName;
    	this.certAssessDate = certAssessDate;
    	this.certAssessCategory = certAssessCategory;
    	this.type = type;
    }

	public String getCertAssessCategory() {
		return certAssessCategory;
	}

	public Date getCertAssessDate() {
		return certAssessDate;
	}

	public String getCertAssessName() {
		return certAssessName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getType() {
		return type;
	}

	public void setCertAssessCategory(String certAssessCategory) {
		this.certAssessCategory = certAssessCategory;
	}

	public void setCertAssessDate(Date certAssessDate) {
		this.certAssessDate = certAssessDate;
	}

	public void setCertAssessName(String certAssessName) {
		this.certAssessName = certAssessName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setType(String type) {
		this.type = type;
	}
	  
}
