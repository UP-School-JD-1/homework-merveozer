package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf01_Cok_Sekillilik.Q1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}

	@Override
	public void study() {
		System.out.println("Master Student is studying.");
	}

	public void writeThesis() {
		System.out.println("Master Student is writing...");
	}
	
	public void meetWithAdvisor() {
		System.out.println("Master Student is meeting with advisor.");
	}
}
