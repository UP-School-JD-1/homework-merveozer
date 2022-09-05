package org.merveozer.oopjhomework.section2.abstractClasses.Q1;

import java.util.Date;

public class GraduateStudent extends Student{
	
	String advisor;
	String thesis;
	
	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}
	
	@Override
	public void study() {
		System.out.println("Graduate Student is studying.");
	}
	
	@Override
	public String toString() {
		return "GraduateStudent [advisor=" + advisor + ", thesis=" + thesis + "]";
	}

	@Override
	public void register() {
		System.out.println("Graduate Student is registered.");
	}
	

}
