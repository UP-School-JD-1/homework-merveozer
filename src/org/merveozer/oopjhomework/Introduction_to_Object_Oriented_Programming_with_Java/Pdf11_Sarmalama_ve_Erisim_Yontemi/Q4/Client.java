package org.merveozer.oopjhomework.week11.Q4;

public class Client {

	private SingletonPrinterConnector connector;
	

	private Client() {
		connector = SingletonPrinterConnector.getInstance();
	}

	public void conntectToPrinter() {
		connector.connect("HP-101");
	}
	
	public static void main(String[] args) {
		
		Client client1 = new Client();
		client1.conntectToPrinter();
	}

}
