package org.merveozer.oopjhomework.week8.Q2;

public class Author {

	String name;
	String category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void writeCategory(Author author) {
		System.out.println(author.name + "," + author.category + " türünde yazmaktadýr.");
	}
}
