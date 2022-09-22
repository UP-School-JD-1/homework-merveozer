package org.merveozer.oopjhomework.chapter2.pdf09_javada_fonksiyonel_programlama.question2;

public class Book {

	private String title;
	private int pages;
	
	public Book() {
		this.title = "No title specified!";
		this.pages = 0;
	}

	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
}

