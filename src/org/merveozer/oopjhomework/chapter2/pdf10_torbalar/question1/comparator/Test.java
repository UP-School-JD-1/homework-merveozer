package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Date date = new Date();
		StudentComparator studentComparator = new StudentComparator();
		
	 	UndergraduateStudent student5 = new UndergraduateStudent(4, "Undergraduate-Eda", 2019, date , "EE", "asdf");
     	VocationalStudent student3 = new VocationalStudent(2, "VocationalStudent-Merve", 2017, date, "CP");
     	Student student2 = new Student(1, "Student-Ali", 2016, date, "Psy");
    	PhdStudent student7 = new PhdStudent(6, "PhdStudent-Salih", 2020, date, "Transistors", "Akin", "CENG");
     	GraduateStudent student4 = new GraduateStudent(3, "Graduate-Hasan", 2013, date , "EE", "asdf", "asdf");
     	GraduateStudent student1 = new GraduateStudent(0, "Ecem", 2015, date , "CP", "dfd", "dbfd");
     	MasterStudent student6 = new MasterStudent(5, "MasterStudent-Alp", 2018, date, "Transistors", "Akin", "EE");
     
     	List<Student> studentList = new ArrayList<Student>();
     	studentList.add(student1);
     	studentList.add(student6);
     	studentList.add(student5);
     	studentList.add(student4);
     	studentList.add(student3);
     	studentList.add(student2);
     	studentList.add(student7);
     	
     	System.out.println("Sorted list: ");
     	Collections.sort(studentList, studentComparator);
    	for(Student sortedStudent : studentList) {
     		System.out.println(sortedStudent.getName() + " " + sortedStudent.getNo());
     	}

     	
	}

	
}
