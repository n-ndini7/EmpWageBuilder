package com.capgemini;

public class EmployeeWageBuilder {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	// UC8 - Compute employee wage using class methods for different companies.
	public static int EmpWageCalculation(String company, int emprateperhr, int noofworkdays, int maxhrspermonth) {
		int emphrs = 0;
		int totalhrs = 0;
		int totalworkdays = 0;
		while (totalhrs <= maxhrspermonth && totalworkdays < noofworkdays) {
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
		int totalwage = totalhrs * emprateperhr;
		return totalwage;
	}

	public static void main(String[] args) {
		System.out.println("Total wage as calculated for Boat employee is : " + EmpWageCalculation("Boat", 20, 3, 6));
		System.out.println("Total wage as calculated for Reliance employee is : " + EmpWageCalculation("JBL", 30, 2, 10));
		System.out.println("Computing employee wage using class methods for different companies!!");
	}

}

