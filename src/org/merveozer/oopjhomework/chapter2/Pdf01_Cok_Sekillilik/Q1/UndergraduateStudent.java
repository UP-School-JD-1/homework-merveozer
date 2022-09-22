package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf01_Cok_Sekillilik.Q1;

import java.util.Date;

public class UndergraduateStudent extends Student {
	
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
