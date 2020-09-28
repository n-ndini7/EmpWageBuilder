package com.capgemini;

	public class EmployeeWageBuilder {
		//UC1 - /employee presence check
		public static void main(String[] args) {
			int IS_FULL_TIME=1;
			System.out.println("Employee presence check ");
			double empcheck = Math.floor(Math.random()*10)%2;
			if(empcheck==IS_FULL_TIME) {
				System.out.println("Employee is present");
			}
			else
			{
				System.out.println("Employee is absent");
			}
			
		}
	}


