package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		RegistrationOffice ro = new RegistrationOffice();
		Date date = new Date();
		Dean dean = new Dean("Tuğba", "Mühendislik Fakültesi");
		
		Student student = ro.getAStudent();	
		System.out.println("Get a random student: " + student.getName());
		
     	GraduateStudent student1 = new GraduateStudent(1, "Ecem", 2015, date , "CP", "dfd", "dbfd");
     	Student student2 = new Student(1, "Student-Ali", 2016, date, "Psy");
     	VocationalStudent student3 = new VocationalStudent(2, "VocationalStudent-Merve", 2017, date, "CP");
     	GraduateStudent student4 = new GraduateStudent(3, "Graduate-Hasan", 2013, date , "EE", "asdf", "asdf");
     	UndergraduateStudent student5 = new UndergraduateStudent(4, "Undergraduate-Eda", 2019, date , "EE", "asdf");
     	MasterStudent student6 = new MasterStudent(5, "MasterStudent-Alp", 2018, date, "Transistors", "Akin", "EE");
     	PhdStudent student7 = new PhdStudent(6, "PhdStudent-Salih", 2020, date, "Transistors", "Akin", "CENG");
     	
     	int result = student1.compareTo(student7);
     	int result2 = student6.compareTo(student4);
     	System.out.println(result);
     	System.out.println(result2);
     	System.out.println();
     	
     	List<Student> studentList = new ArrayList<Student>();
     	studentList.add(student1);
     	studentList.add(student6);
     	studentList.add(student5);
     	studentList.add(student4);
     	studentList.add(student3);
     	studentList.add(student2);
     	studentList.add(student7);
     	
     	Collections.sort(studentList);
     	System.out.println("Sorted list: ");
     	for(Student sortedStudent : studentList) {
     		System.out.println(sortedStudent.getName() + " " + sortedStudent.getYear());
     	}
     	
     	System.out.println();
     	ro.expellOldestStudent(studentList);
     	System.out.println();
     	System.out.println(dean.getAStudent().getName());
     	
	}

	
}
