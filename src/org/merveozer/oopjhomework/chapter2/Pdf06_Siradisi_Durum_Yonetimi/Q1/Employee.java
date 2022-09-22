package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf06_Siradisi_Durum_Yonetimi.Q1;

public class Employee {
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY = 900;
	
	public Employee(int no, String name, int year, String department){
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	
	public void work(){
		System.out.println("Employee is working!");
	}


	public double calculateSalary() {
		
	     return year * BASE_SALARY;
	}
	
	public void getSalary() throws SalaryPaidOnBankException {
		
		try {
			double salary = calculateSalary();
			if(salary > 7000) {
				throw new SalaryPaidOnBankException();
			}else {
				System.out.println("Yes! Payday finally came :) ");
			}
		}
		catch(SalaryPaidOnBankException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	
	public void printInfo(){
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}
}
