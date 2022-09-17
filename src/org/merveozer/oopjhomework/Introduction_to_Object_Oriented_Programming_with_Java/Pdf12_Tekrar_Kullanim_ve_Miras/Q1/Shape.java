package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf12_Tekrar_Kullanim_ve_Miras.Q1;

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
