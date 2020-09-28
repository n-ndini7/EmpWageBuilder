package com.capgemini;

public class EmployeeWageBuilder {
	//UC4 - solving using switch case
	public static final int IS_PART_TIME= 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;

	public static void main(String[] args) {
		int emphrs = 0;
		int empwage = 0;
		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case IS_PART_TIME:
			emphrs = 4;
			break;
		case IS_FULL_TIME:
			emphrs = 8;
			break;
		default:
			emphrs = 0;
			break;
		}
		empwage = emphrs * EMP_RATE_PER_HR;
		System.out.println("employee wage is calculated as: " + empwage);
	}

}


