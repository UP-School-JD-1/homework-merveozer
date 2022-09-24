package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparable;

import java.util.List;

public interface Expeller {
	
	default void expellOldestStudent(List<Student> student){
		
		int currentYear = 2022;
		Student oldestStudent = null;
		
		for(int i=0 ; i < student.size() ; i++) {
			if(student.get(i).getYear() <  currentYear) {
				currentYear = student.get(i).getYear();
				oldestStudent = student.get(i);
			}
		}
		System.out.println(oldestStudent.getName() + " is expelled from university.");
	}
}
