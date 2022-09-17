package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf08_Siniflar_ve_Nesneleri.Q2;

public class Book {

	String title;
	int page;
	String type;
	boolean isHardCover;
	int currentPage;
	Author author;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isHardCover() {
		return isHardCover;
	}
	public void setHardCover(boolean isHardCover) {
		this.isHardCover = isHardCover;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	
}
