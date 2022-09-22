package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf01_Javaya_Giris;

public class array {
	


	public static void main(String[] args) {
		int[] sayilar1 = {4,3,2,1};
		int[] sayilar2 = {40,30,20,10};
		
		sayilar1 = sayilar2;
		sayilar2[0]=2500;
		
		System.out.println(sayilar1[0]);

	}

}
