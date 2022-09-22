package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf03_Arayuzler.Q1;

import java.util.Date;

public class VocationalStudent extends AbstractStudent{

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void study() {
		System.out.println("Vocational Student is studying.");
	}
}
