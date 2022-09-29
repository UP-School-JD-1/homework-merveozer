package org.merveozer.oopjhomework.chapter1.pdf11_sarmalama_ve_erisim_yontemi.question2;

public class Test {

	public static void main(String[] args) {
		
		Account a1 = new Account(800);
		AccountClient c1 = new AccountClient("Merve", a1);
		
		Account a2 = new Account(1000);
		AccountClient c2 = new AccountClient("Eda", a2);

		c1.deposit(200);
		c2.withDraw(300);
		c1.transfer(c2, 100);

	}

}
