package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		ArrayList<Long> phones1 = new ArrayList <Long> ();
		phones1.add((long) 55356744);
		phones1.add((long) 216435677);
		ArrayList<String> adresses1 = new ArrayList <String> ();
		adresses1.add("Istanbul");
		adresses1.add("Middle Earth");
		
		ArrayList<Long> phones2 = new ArrayList <Long> ();
		phones2.add((long) 553334);
		phones2.add((long) 2125667);
		ArrayList<String> adresses2 = new ArrayList <String> ();
		adresses2.add("Roma");
		adresses2.add("Amsterdam");
		
		ArrayList<Long> phones3 = new ArrayList <Long> ();
		phones3.add((long) 4334);
		phones3.add((long) 1238956);
		ArrayList<String> adresses3 = new ArrayList <String> ();
		adresses3.add("Ankara");
		adresses3.add("Mugla");
		
		Customer c1 = new Customer("Merve", "Ozer", phones1, adresses1);
		Customer c2 = new Customer("Aragorn", "Elessar", phones2, adresses2);
		Customer c3 = new Customer("Bilbo", "Baggins", phones3, adresses3);
		Customer c4 = new Customer("Legolas", "Thranduil", phones1, adresses2);
		Customer c5 = new Customer("Merve", "Ozer", phones1, adresses2); //duplicate
		Customer c6 = new Customer("Gandalf", "Grey", phones2, adresses3);
		
		
		TreeSet<Customer> customers = new TreeSet<>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		customers.add(c6);
		
		customers.comparator();
		customers.forEach(item -> System.out.print("["+item.getLastName()+"]"));
		
		System.out.println();
		System.out.println();
		
		Iterator i = customers.iterator();
		while (i.hasNext()) {
			Customer c = (Customer) i.next();
			System.out.println(c.getName() + " " + c.getLastName() + " " + c.getPhone() + c.getAdress());
		}
		
		System.out.println();
		
		Customer.findCustomer((long) 4334, customers);
		Customer.findCustomer("Merve", customers);
		Customer.findCustomer("Thranduil", customers);
		Customer.findCustomer("Mugla", customers); //return 2 result
	}
}
