package org.merveozer.oopjhomework.week1;

public class array {
	


	public static void main(String[] args) {
		int[] sayilar1 = {4,3,2,1};
		int[] sayilar2 = {40,30,20,10};
		
		sayilar1 = sayilar2;
		sayilar2[0]=2500;
		
		System.out.println(sayilar1[0]);

	}

}
