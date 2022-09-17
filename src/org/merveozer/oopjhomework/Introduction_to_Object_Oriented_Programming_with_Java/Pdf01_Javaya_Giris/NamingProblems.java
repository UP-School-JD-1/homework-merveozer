package org.merveozer.oopjhomework.week1;

public class NamingProblems {
String firstName;
	
	int powerOfTheNumber(int base, int exponent) {
		int power = 1;
		for(int i = 0; i < exponent; i++) {
			power = power * base;
		}
		return power;
	}
	
	int $svds() {
		int b = 2;
		return b;
	}
	
	public static void main(String[] args) {
		NamingProblems namingErrors = new NamingProblems();
		int baseVar = 2;
		int expVar = 10;
		int baseVarOfPowExpVar = namingErrors.powerOfTheNumber(baseVar, expVar);
		System.out.println(baseVar + " to the " + expVar + " is " + baseVarOfPowExpVar);
		System.out.println(baseVar + " ^ " + expVar + " is " + baseVarOfPowExpVar);
	
	}
}
