package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf03_Arayuzler.Q1;

import java.util.Date;

public class AbstractStudent implements Student{

	private int no;
	private String name;
	private int year;
	private Date dob;
	private String major;
	
	public AbstractStudent(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void study() {
		System.out.println("Student is studying.");
		
	}

	@Override
	public void register(Student student) {
		System.out.print("Student is registered.");
		
	}

}
