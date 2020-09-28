package com.capgemini;

public class EmployeeWageBuilder implements EmpWage{
	//UC11- ability to manage employee wage of multiple companies using interface approach
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
    public EmployeeWageBuilder() {
    	companyEmpWageArray = new CompanyEmpWage[5];
    }
    @Override
    public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth ) {
    	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
    numOfCompany++;
    }
	public void computeEmpWage() {
		for(int i =0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours = 0, totalEmpHours = 0, totalWorkingDays = 0;
		while (totalEmpHours <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random()* 10)% 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHours = 4;
				break;
			case IS_FULL_TIME:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}
			totalEmpHours += empHours;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr:  " + empHours);
		}
       return totalEmpHours * companyEmpWage.empRatePerHour;
	}
	@Override
	public int getTotalWage(String company) {
		return 0;
	}
	 public static void main(String[] args) {
		 EmployeeWageBuilder empWage = new EmployeeWageBuilder();
		 empWage.addCompanyEmpWage("Boat",  10,  5,  20);
		 empWage.addCompanyEmpWage("JBL",  20,  3,  10);
		 empWage.computeEmpWage();
	 }
}


