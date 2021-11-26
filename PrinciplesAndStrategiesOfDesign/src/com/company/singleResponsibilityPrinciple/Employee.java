package com.company.singleResponsibilityPrinciple;

import java.util.Date;

public class Employee {

	// this class breaks the single responsibility principle because:
	// the logic to determine the promotion must be done by HR department, not by the Employee class
	// the logic to determine the income must be done by Finance department, not by the Employee class
	// if one of the HR or Finance policy changes, the Employee class suffers changes too

	private String employeeId;
	private String name;
	private String address;
	private Date dateOfJoining;

	// moved this methods to the corresponding classes
	// promotion to HRPromotions and income tax to Finance

//	public boolean isPromotionDueThisYear() {
//		// promotion logic
//
//		return false;
//	}
//
//	public double calcIncomeTaxForCurrentYear() {
//		// income tax logic
//
//		return 0L;
//	}

	// getters and setters for all member variables
}
