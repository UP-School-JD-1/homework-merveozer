package org.merveozer.oopjhomework.chapter1.pdf12_tekrar_kullanim_ve_miras.question1;

public class ShapeTest {

	public static void main(String[] args) {
		
		Square spongeBob = new Square(2, "SquarePants");	
		double spongeBobArea = spongeBob.calculateArea();
		System.out.println("SpongeBob's area is: " + spongeBobArea);
	}

}
