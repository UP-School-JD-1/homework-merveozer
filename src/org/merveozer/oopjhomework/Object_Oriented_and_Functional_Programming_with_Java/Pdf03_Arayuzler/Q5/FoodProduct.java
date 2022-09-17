package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf03_Arayuzler.Q5;

import java.util.Date;

public class FoodProduct extends BaseProduct implements Locateable, Priceable {

	private Date productionDate;
	private int life;
	
	public FoodProduct(String name, String sku, String description, Date productionDate, int life) {
		super(name, sku, description);
		this.productionDate = productionDate;
		this.life = life;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public void getPrice() {
		System.out.println("All food products are 5$");
	}

	@Override
	public double getPriceWithTax() {
		double newPriceWithTax = 5 + ((5 * 18) / 100);
		return newPriceWithTax;
	}

	@Override
	public void purchase() {
		double newPriceWithTax = getPriceWithTax();
		System.out.println("If you want to purchase you should pay " + newPriceWithTax);
		
	}

	@Override
	public void getLocation() {
		System.out.println("Our main warehouse is in Amsterdam..");
	}
	
	
	
}
