package org.merveozer.oopjhomework.section2.abstractClasses.Q1;

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
