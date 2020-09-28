package com.capgemini;

public class EmployeeWageBuilder {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int NO_OF_WORK_DAYS = 2;
	public static final int MAX_WORK_DAYS= 10;

	// UC7 - Compute employee wage using class methods
	public static int EmpWageCalculation() {
		int emphrs = 0;
		int totalhrs = 0;
		int totalworkdays = 0;
		while (totalhrs <= MAX_WORK_DAYS && totalworkdays < NO_OF_WORK_DAYS) {
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
		return totalwage;
	}

	public static void main(String[] args) {
		System.out.println("Total wage as calculated is : " + EmpWageCalculation());
		System.out.println("Computing employee wage using class methods!!");
	}

}


