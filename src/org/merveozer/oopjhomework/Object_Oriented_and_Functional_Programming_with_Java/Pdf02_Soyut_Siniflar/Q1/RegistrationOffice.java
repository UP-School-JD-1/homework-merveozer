package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf02_Soyut_Siniflar.Q1;

import java.util.Date;

public class RegistrationOffice {

	public Student getAStudent(){
		
		Date date = new Date();
		Student s = null;
		
		int i = (int) (5 * Math.random());
		
		switch (i) {
		case 0:
			s = new VocationalStudent(2, "VocationalStudent-Merve", 2014, date, "CP");
			break;
		case 1:
			s = new GraduateStudent(3, "Graduate-Fatih", 2015, date , "EE", "asdf", "asdf");
			break;
		case 2:
			s = new UndergraduateStudent(4, "Undergraduate-Eda", 2015, date , "EE", "asdf");
			break;
		case 3:
			s = new MasterStudent(5, "MasterStudent-Alp", 2018, date, "Transistors", "Akýn", "EE");
			break;
		case 4:
			s = new PhdStudent(6, "PhdStudent-Barýþ", 2012, date, "Transistors", "Akýn", "CENG");
			break;
		}
		
		return s;
	}
	
	public void registerStudent(Student student) {
		
		if(student instanceof VocationalStudent) {
			System.out.println("VocationalStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof GraduateStudent) {
			System.out.println("GraduateStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof UndergraduateStudent) {
			System.out.println("UndergraduateStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof MasterStudent) {
			System.out.println("MasterStudent " + student.getName() + " is registered by registration office.");
		}
		
		if(student instanceof PhdStudent) {
			System.out.println("PhdStudent " + student.getName() + " is registered by registration office.");
		}
	}
	
}
