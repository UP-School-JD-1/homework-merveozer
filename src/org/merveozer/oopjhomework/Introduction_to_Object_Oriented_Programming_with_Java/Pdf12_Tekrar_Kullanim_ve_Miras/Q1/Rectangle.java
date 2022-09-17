package org.merveozer.oopjhomework.week12.Q1;

import java.util.Objects;

public class Rectangle extends Shape{

	double shortSide;
	double longSide;
	
	Rectangle(double shortSide,double longSide,String name) {
		super(name);
		this.shortSide = shortSide;
		this.longSide = longSide;
	}

	@Override
	double calculateArea() {
		return shortSide*longSide;
	}

	@Override
	double calculateCircumference() {
		return 2 * (shortSide + longSide);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(longSide, shortSide);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Double.doubleToLongBits(longSide) == Double.doubleToLongBits(other.longSide)
				&& Double.doubleToLongBits(shortSide) == Double.doubleToLongBits(other.shortSide);
	}

	@Override
	public String toString() {
		return "Rectangle [shortSide=" + shortSide + ", longSide=" + longSide + ", name=" + name + "]";
	}
	
}
