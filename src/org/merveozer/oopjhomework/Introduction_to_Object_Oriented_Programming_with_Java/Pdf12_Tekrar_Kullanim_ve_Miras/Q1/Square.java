package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf12_Tekrar_Kullanim_ve_Miras.Q1;

import java.util.Objects;

class Square extends Shape {
	double side;

	Square(double side,String name) {
		super(name);
		this.side = side;
	}


	@Override
	public String toString() {
		return "Square [side=" + side + "]";
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
		return side*side;

	}

	@Override
	double calculateCircumference() {
		return 4 *side;

	}
	

}

