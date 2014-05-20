package com.pluralsight.utils;

import java.util.Comparator;

import com.pluralsight.model.PersonReport;

public class ComparatorSort implements Comparator<PersonReport> {

	public int compare(PersonReport one, PersonReport two) {
		int stat = 0;
		stat = one.getLastName().compareToIgnoreCase(two.getLastName());
		if (stat != 0) return stat;
		stat = one.getFirstName().compareToIgnoreCase(two.getFirstName());
		if (stat != 0) return stat;
		stat = one.getMiddleName().compareToIgnoreCase(two.getMiddleName());
		if (stat != 0) return stat;
		stat = one.getType().compareToIgnoreCase(two.getType());
		if (stat != 0) return stat;
		stat = one.getCertAssessName().compareToIgnoreCase(two.getCertAssessName());
		if (stat != 0) return stat;
		stat = one.getCertAssessCategory().compareToIgnoreCase(two.getCertAssessCategory());
		return stat;		
	}
}
