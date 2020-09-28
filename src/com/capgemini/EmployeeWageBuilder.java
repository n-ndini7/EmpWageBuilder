package com.capgemini;

public class EmployeeWageBuilder {
	//UC6 - CALCULATE WAGES TILL TOTAL WORKING HOURS OR DAYS IS REACHED FOR A MONTH.
	public static final int IS_PART_TIME= 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NO_OF_WORK_DAYS = 2;
	public static final int MAX_WORK_HRS= 10;

	public static void main(String[] args) {
		int emphrs = 0;
		int totalhrs = 0;
		int totalworkdays = 0;
		while (totalhrs <= MAX_WORK_HRS && totalworkdays < NO_OF_WORK_DAYS) {
			totalworkdays++;
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
			totalhrs += emphrs;
			System.out.println("Day: " + totalworkdays + " emp hrs : " + emphrs);
		}
		int totalwage = totalhrs * EMP_RATE_PER_HR;
		System.out.println("total emp wage as calculated is : " + totalwage);
	}

}

