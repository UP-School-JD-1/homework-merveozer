package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf03_Arayuzler.Q5;

public class OldStaff implements Priceable, Locateable{

	private String department;
	private String name;
	
	public OldStaff(String department, String name) {
		super();
		this.department = department;
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void getLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPriceWithTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
	}

	
}
