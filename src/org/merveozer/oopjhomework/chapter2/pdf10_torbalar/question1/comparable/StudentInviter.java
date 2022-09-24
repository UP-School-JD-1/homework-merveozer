package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparable;

import java.util.Date;

public interface StudentInviter {
	
public default Student getAStudent(){
		
		Date date = new Date();
		Student s = null;
		
		int i = (int) (6 * Math.random());
		
		switch (i) {
		case 0:
			s = new Student(1, "Student-Ali", 2015, date, "Psy");
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
			s = new MasterStudent(5, "MasterStudent-Alp", 2018, date, "Transistors", "Akin", "EE");
			break;
		case 5:
			s = new PhdStudent(6, "PhdStudent-Salih", 2012, date, "Transistors", "Akin", "CENG");
			break;
		}
		
		return s;
	}

}
