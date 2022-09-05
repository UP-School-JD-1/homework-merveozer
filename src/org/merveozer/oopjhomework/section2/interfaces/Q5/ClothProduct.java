package org.merveozer.oopjhomework.section2.interfaces.Q5;

public class ClothProduct extends BaseProduct implements Locateable, Priceable {

	enum Sizes {
		SMALL, MEDIUM, LARGE
	}
	
	private String sex;
	private Sizes size;
	
	public ClothProduct(String name, String sku, String description, String sex, Sizes size) {
		super(name, sku, description);
		this.sex = sex;
		this.size = size;
	}

	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Sizes getSize() {
		return size;
	}

	public void setSize(Sizes size) {
		this.size = size;
	}


	@Override
	public void getPrice() {
		System.out.println("All cloth products are 15$");
	}

	@Override
	public double getPriceWithTax() {
		double newPriceWithTax = 15 + ((15 * 18) / 100);
		return newPriceWithTax;
	}

	@Override
	public void purchase() {
		double newPriceWithTax = getPriceWithTax();
		System.out.println("If you want to purchase you should pay " + newPriceWithTax);
		
	}

	@Override
	public void getLocation() {
		System.out.println("Our main warehouse is in London..");
	}
	
	
	
}
