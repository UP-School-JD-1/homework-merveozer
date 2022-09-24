package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getNo() == s2.getNo()) {
			return 0;
		}else
		return s1.getNo() > s2.getNo() ? 1 : -1;
	}

}
