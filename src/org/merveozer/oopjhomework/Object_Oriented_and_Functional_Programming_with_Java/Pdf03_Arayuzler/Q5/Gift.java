package org.merveozer.oopjhomework.section2.interfaces.Q5;

public class Gift extends BaseProduct implements Locateable {
	
	public Gift(String name, String sku, String description) {
		super(name, sku, description);
	}

	@Override
	public void getLocation() {
		System.out.println("Gifts's location is Rome");
	}

}
