package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf01_Cok_Sekillilik.Q1;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		RegistrationOffice ro = new RegistrationOffice();
		Date date = new Date();
		
		Student student = ro.getAStudent();		
		System.out.println("Get a random student: " + student.getName());
		
		
     	GraduateStudent student1 = new GraduateStudent(1, "Ecem", 2015, date , "CP", "dfd", "dbfd");
		ro.registerStudent(student1);
		
		
	}

	
}
