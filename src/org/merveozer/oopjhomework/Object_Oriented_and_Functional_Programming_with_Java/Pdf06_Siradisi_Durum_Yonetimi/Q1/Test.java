package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf06_Siradisi_Durum_Yonetimi.Q1;

public class Test {

	public static void main(String[] args) throws SalaryPaidOnBankException {
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		e1.printInfo();
		System.out.println("Maaþý: " + e1.calculateSalary());
		e1.work();
		e1.getSalary();

		System.out.println();
		
		Manager m1 = new Manager(2, "Fatma", 1, "Production", "Production");
		m1.printInfo();
		System.out.println("Maaþý: " + m1.calculateSalary());
		m1.work();
		m1.getSalary();
		
		System.out.println();

		Director d1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		d1.printInfo();
		System.out.println("Maaþý: " + d1.calculateSalary());
		d1.work();
		d1.getSalary();

	}
}
