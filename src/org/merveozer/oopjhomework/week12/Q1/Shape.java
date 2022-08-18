package org.merveozer.oopjhomework.week12.Q1;

public abstract class Shape {
	protected String name;

	public Shape(String name) {

		this.name = name;
	}

	public void draw() {
		System.out.println("Draw " + name);
	}

	public void erase() {
		System.out.println("Erase " + name);
	}

	abstract double calculateArea();

	abstract double calculateCircumference(); //abstract metotlar sadece interface þeklinde çünkü çevre ve alan hesabý her þekle özel
}
