package org.merveozer.oopjhomework.chapter1.pdf12_tekrar_kullanim_ve_miras.question1;

import java.util.Objects;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double radius,String name) {
		super(name);
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}

	

}
