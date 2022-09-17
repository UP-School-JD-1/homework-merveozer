package org.merveozer.oopjhomework.section2.interfaces.Q1;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
	
	String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}

	@Override
	public void study() {
		System.out.println("Undergraduate Student is studying.");
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [minor=" + minor + "]";
	}
	
}
