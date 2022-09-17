package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf12_Tekrar_Kullanim_ve_Miras.Q1;

public class ShapeTest {

	public static void main(String[] args) {
		
		Square spongeBob = new Square(2, "SquarePants");	
		double spongeBobArea = spongeBob.calculateArea();
		System.out.println("SpongeBob's area is: " + spongeBobArea);
	}

}
