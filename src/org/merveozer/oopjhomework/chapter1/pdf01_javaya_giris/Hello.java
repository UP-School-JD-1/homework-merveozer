package org.merveozer.oopjhomework.chapter1.pdf01_javaya_giris;

public class Hello {
	
	String world = "guys";

	public String sayHello(String who) {
		String sentence;
		if (who != "")
			sentence = "Hello " + who + " :)";
		else
			sentence = "Hello " + world + " :)";
		return sentence;
  }
}
