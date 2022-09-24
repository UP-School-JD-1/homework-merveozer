package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question1.comparable;

public class Dean implements StudentInviter {

	private String name;
	private String faculty;
	
	public Dean(String name, String faculty) {
		super();
		this.name = name;
		this.faculty = faculty;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
}
