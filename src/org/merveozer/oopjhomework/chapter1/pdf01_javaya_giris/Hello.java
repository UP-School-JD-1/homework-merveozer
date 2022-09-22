package org.merveozer.oopjhomework.Introduction_to_Object_Oriented_Programming_with_Java.Pdf01_Javaya_Giris;

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
