package com.capgemini;

public class EmployeeWageBuilder {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int emprateperhr;
	private final int noofworkdays;
	private final int maxhrspermonth;
	private int totalwage;

	// UC9 - compute employee wage and save total wage by company.
	public EmployeeWageBuilder(String company, int emprateperhr, int noofworkdays, int maxhrspermonth) {
		this.company = company;
		this.emprateperhr = emprateperhr;
		this.noofworkdays = noofworkdays;
		this.maxhrspermonth = maxhrspermonth;
	}

	public void EmpWageCalculation() {
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
		totalwage = totalhrs * emprateperhr;

	}

	@Override
	public String toString() {
		return "Total wage as calculated for " + company + " employee is : " + totalwage;
	}

	public static void main(String[] args) {
		EmployeeWageBuilder Boat = new EmployeeWageBuilder("Boat", 20, 3, 9);
		EmployeeWageBuilder JBL = new EmployeeWageBuilder("JBL", 20, 3, 9);
		Boat.EmpWageCalculation();
		System.out.println(Boat);
		JBL.EmpWageCalculation();
		System.out.println(JBL);
		System.out.println("Computing employee wage using class methods for different companies!!");
	}

}

