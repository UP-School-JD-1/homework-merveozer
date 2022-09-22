package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf01_Cok_Sekillilik.Q1;

import java.util.Date;

public class VocationalStudent extends Student{

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void study() {
		System.out.println("Vocational Student is studying.");
	}
}
