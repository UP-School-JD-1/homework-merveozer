package org.merveozer.oopjhomework.chapter2.pdf03_arayuzler.private_method;

public interface SalaryCalculator {

	 default void getSalary(int day, int perDiem) {
         double salary = calculateSalary(day, perDiem);
         System.out.print(salary);
     }
 
     private double calculateSalary(int day, int perDiem) {
         return day * perDiem;
}
     
}
