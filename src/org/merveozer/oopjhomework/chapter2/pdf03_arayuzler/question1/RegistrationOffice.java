package org.merveozer.oopjhomework.chapter2.pdf03_arayuzler.question1;

import java.util.Date;

public class RegistrationOffice {

	public AbstractStudent getAStudent(){
		
		Date date = new Date();
		AbstractStudent s = null;
		
		int i = (int) (6 * Math.random());
		
		switch (i) {
		case 0:
			s = new AbstractStudent(1, "AbstractStudent-Ali", 2015, date, "Psy");
			break;
		case 1:
			s = new VocationalStudent(2, "VocationalStudent-Merve", 2014, date, "CP");
			break;
		case 2:
			s = new GraduateStudent(3, "Graduate-Hasan", 2015, date , "EE", "asdf", "asdf");
			break;
		case 3:
			s = new UndergraduateStudent(4, "Undergraduate-Eda", 2015, date , "EE", "asdf");
			break;
		case 4:
			s = new MasterStudent(5, "MasterStudent-Alp", 2018, date, "Transistors", "Ak�n", "EE");
			break;
		case 5:
			s = new PhdStudent(6, "PhdStudent-Salih", 2012, date, "Transistors", "Ak�n", "CENG");
			break;
		}
		
		return s;
	}
	
	public void registerStudent(AbstractStudent student) {
		
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
