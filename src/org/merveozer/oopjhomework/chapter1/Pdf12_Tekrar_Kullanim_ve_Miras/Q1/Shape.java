package org.merveozer.oopjhomework.chapter1.pdf12_tekrar_kullanim_ve_miras.Q1;

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

	abstract double calculateCircumference(); //abstract metotlar sadece interface �eklinde ��nk� �evre ve alan hesab� her �ekle �zel
}
