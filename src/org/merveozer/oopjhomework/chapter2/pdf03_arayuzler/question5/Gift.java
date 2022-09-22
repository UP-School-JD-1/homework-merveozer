package org.merveozer.oopjhomework.chapter2.pdf03_arayuzler.question5;

public class Gift extends BaseProduct implements Locateable {
	
	public Gift(String name, String sku, String description) {
		super(name, sku, description);
	}

	@Override
	public void getLocation() {
		System.out.println("Gifts's location is Rome");
	}

}
