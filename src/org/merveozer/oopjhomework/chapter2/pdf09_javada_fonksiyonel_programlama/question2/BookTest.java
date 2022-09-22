package org.merveozer.oopjhomework.chapter2.pdf09_javada_fonksiyonel_programlama.question2;

import java.util.function.BinaryOperator;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book("Lord of the Rings", 1184);
		Book b2 = new Book("Ince Memed", 436);
		
		BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println(op.apply(b1.getPages(), b2.getPages()));
		
	}

}
