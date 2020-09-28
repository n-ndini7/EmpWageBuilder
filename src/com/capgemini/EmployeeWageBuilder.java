package com.capgemini;

public class EmployeeWageBuilder {

	//UC2- employee daily wage calculate
	public static void main(String[] args) {
		System.out.println("Employee daily wage calculate");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME)
			emphrs = 8;
		else
			emphrs = 0;
		empwage = emphrs * EMP_RATE_PER_HR;

		System.out.println("Employee wage :" + empwage);

	}

}
