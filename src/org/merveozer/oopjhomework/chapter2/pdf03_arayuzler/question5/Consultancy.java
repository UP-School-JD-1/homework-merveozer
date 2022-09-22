package org.merveozer.oopjhomework.chapter2.pdf03_arayuzler.question5;

public class Consultancy extends BaseProduct implements Priceable {

	enum ConsultancyTypes{
		IT, FINANCE, MANAGEMENT, FOREIGN_LANGUAGE, MARKETING
	}
	
	private ConsultancyTypes consultancyType;
	
	public Consultancy(String name, String sku, String description, ConsultancyTypes consultancyType) {
		super(name, sku, description);
		this.setConsultancyType(consultancyType);
	}
	
	public ConsultancyTypes getConsultancyType() {
		return consultancyType;
	}

	public void setConsultancyType(ConsultancyTypes consultancyType) {
		this.consultancyType = consultancyType;
	}

	@Override 
	public void getPrice() {
		System.out.println("Please refer to us..");
	}

	@Override
	public double getPriceWithTax() {
		System.out.println("Please refer to us..");
		return 0;
	}

	@Override
	public void purchase() {
		System.out.println("Please refer to us..");
	}

}
