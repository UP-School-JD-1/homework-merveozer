package org.merveozer.oopjhomework.chapter1.pdf12_tekrar_kullanim_ve_miras.question1;

import java.util.Objects;

public class Triangle extends Shape {

	double side;

	Triangle(double side, String name) {
		super(name);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Triangle [side=" + side + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(side);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Double.doubleToLongBits(side) == Double.doubleToLongBits(other.side);
	}

	@Override
	double calculateArea() {
		return (side * side * Math.sqrt(3)) / 4;

	}

	@Override
	double calculateCircumference() {
		return 3 * side;

	}

}
