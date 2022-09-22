package org.merveozer.oopjhomework.chapter1.pdf01_javaya_giris;

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
