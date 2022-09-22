package org.merveozer.oopjhomework.chapter2.pdf01_cok_sekillilik.question1;

import java.util.Date;

public class PhdStudent extends GraduateStudent{

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}
	

	@Override
	public void study() {
		System.out.println("Phd Student is studying.");
	}

	public void writeThesis() {
		System.out.println("Phd Student is writing thesis...");
	}
	
	public void meetWithAdvisor() {
		System.out.println("Master Student is meeting with advisor.");
	}

	public void writePaper() {
		System.out.println("Phd Student is writing scientific article.");
	}
	
}
