package org.merveozer.oopjhomework.week1;

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
