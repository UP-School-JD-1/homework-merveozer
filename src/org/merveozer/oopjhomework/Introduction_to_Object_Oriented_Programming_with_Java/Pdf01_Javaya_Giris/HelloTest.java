package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf01_Javaya_Giris;

public class HelloTest {

	public static void main(String[] args) {
		Hello object = new Hello();

		String answer = object.sayHello("Ayþe");
		System.out.println(answer);
		
		answer = object.sayHello("Zeynep");
		System.out.println(answer);
//
		System.out.println("World: " + object.world);
//
		answer = object.sayHello("");
		System.out.println(answer);
	}

}
