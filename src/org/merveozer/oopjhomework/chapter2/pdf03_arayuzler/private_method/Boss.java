package org.merveozer.oopjhomework.chapter2.pdf03_arayuzler.private_method;

public class Boss implements SalaryCalculator {

	public static void main(String... args) {
        Boss boss = new Boss();
        
        boss.getSalary(1, 5);
        //boss.calculateSalary();
        //we can't reach to private methods in interfaces
    }
}
