package org.merveozer.oopjhomework.chapter1.pdf11_sarmalama_ve_erisim_yontemi.question4;

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
		System.out.println(printerName + " yaz�c�s� ile ba�lant� kuruluyor...");
	}
}
