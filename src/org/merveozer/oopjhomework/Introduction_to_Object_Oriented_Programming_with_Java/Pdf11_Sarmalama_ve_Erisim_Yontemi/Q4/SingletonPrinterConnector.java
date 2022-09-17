package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf11_Sarmalama_ve_Erisim_Yontemi.Q4;

public class SingletonPrinterConnector {
	
	String name;
	
	private static SingletonPrinterConnector connector = new SingletonPrinterConnector("Super Connector");

	private SingletonPrinterConnector(String name) {
		super();
		this.name = name;
	}
	
	public static SingletonPrinterConnector getInstance() {
		return connector;
	}
	
	public void connect(String printerName) {
		System.out.println(printerName + " yazýcýsý ile baðlantý kuruluyor...");
	}
}
