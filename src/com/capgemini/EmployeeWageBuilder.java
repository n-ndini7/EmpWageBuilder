package com.capgemini;

public class EmployeeWageBuilder {

	//UC5- CALCULATING WAGES FOR A MONTH
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NO_OF_WORK_DAYS = 2;

	public static void main(String[] args) {
		int emphrs = 0;
		int empwage = 0;
		int totalwage = 0;
		System.out.println("Calculating wages for a month");
		for (int d = 0; d < NO_OF_WORK_DAYS; d++) {
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
			totalwage += empwage;
			System.out.println("employee wage as calculated is: " + empwage);
		}
		System.out.println("total emp wage as calculated is: " + totalwage);
	}

}
