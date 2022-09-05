package org.merveozer.oopjhomework.section2.interfaces.Q5;

public abstract class BaseProduct {

	private String name;
	private String sku;
	private String description;
	
	public BaseProduct(String name, String sku, String description) {
		super();
		this.name = name;
		this.sku = sku;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
