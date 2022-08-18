package org.merveozer.oopjhomework.week12.Q1;

public class ShapeTest {

	public static void main(String[] args) {
		
		Square spongeBob = new Square(2, "SquarePants");	
		double spongeBobArea = spongeBob.calculateArea();
		System.out.println("SpongeBob's area is: " + spongeBobArea);
	}

}
