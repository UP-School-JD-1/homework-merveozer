package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf02_Soyut_Siniflar.Q1;

import java.util.Date;

public class VocationalStudent extends Student{

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void study() {
		System.out.println("Vocational Student is studying.");
	}

	@Override
	public void register() {
		System.out.println("Vocational Student is registered.");
		
	}
}
