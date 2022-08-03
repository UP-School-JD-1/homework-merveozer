package org.merveozer.oopjhomework.week8.Q2;

public class Reader {

	String name;
	int age;
	char sex;
	Book book;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void read(Book book, Reader reader) {
		System.out.println(reader.name + " þu anda " + book.title + " kitabýný okumaktadýr." );
	}
	
	public void sleep(Book book, Reader reader) {
		System.out.println(reader.name + (" ") + book.title + " baþlýklý kitabý okumaktan sýkýldýðý için uyuyakaldý." );
	}
	
	public void getReaderInfo(Reader reader) {
		
		System.out.println("Name: " + reader.name);
		System.out.println("Age: " + reader.age);
		System.out.println("Sex: " + reader.sex );
	}
	
	
}
