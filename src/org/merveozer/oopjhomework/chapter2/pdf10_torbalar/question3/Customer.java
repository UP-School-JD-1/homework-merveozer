package org.merveozer.oopjhomework.chapter2.pdf10_torbalar.question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Customer implements Comparable<Customer>{

	private String name;
	private String lastName;
	private ArrayList<Long> phones;
	private ArrayList<String> adresses;
	
	public Customer(String name, String lastName, ArrayList<Long> phones, ArrayList<String> adresses) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.phones = phones;
		this.adresses = adresses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Long> getPhone() {
		return phones;
	}

	public void setPhone(ArrayList<Long> phones) {
		this.phones = phones;
	}

	public ArrayList<String> getAdress() {
		return adresses;
	}

	public void setAdress(ArrayList<String> adresses) {
		this.adresses = adresses;
	}

	public static void findCustomer(Object o, TreeSet<Customer> set) {  
		Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
        	Customer customer = (Customer) iterator.next();
            if(customer.getName() == o || customer.getLastName() == o || customer.getPhone().contains(o) || customer.getAdress().contains(o))    
            	System.out.println("\nThe result of search: \n" + customer.toString());
        }   
  
    }

	@Override
	public int compareTo(Customer o) {
         return this.getLastName().compareTo(o.getLastName());
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastName=" + lastName + ", phones=" + phones + ", adresses=" + adresses
				+ "]";
	}

	
}
