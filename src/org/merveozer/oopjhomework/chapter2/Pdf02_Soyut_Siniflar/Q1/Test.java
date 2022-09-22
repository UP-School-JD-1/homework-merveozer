package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf02_Soyut_Siniflar.Q1;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		RegistrationOffice ro = new RegistrationOffice();
		Date date = new Date();
		
		Student student = ro.getAStudent();		//Soyut sýnýflar alt sýnýflarýnýn nesnelerini tutabilir
		System.out.println("Get a random student: " + student.getName());
		
		
     	GraduateStudent student1 = new GraduateStudent(1, "Ecem", 2015, date , "CP", "dfd", "dbfd");
		ro.registerStudent(student1);
		
		
	}

	
}
