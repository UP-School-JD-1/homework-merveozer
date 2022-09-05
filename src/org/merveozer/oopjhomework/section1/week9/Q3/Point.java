package org.merveozer.oopjhomework.week9.Q3;

import java.util.Random;

public class Point {
	
	enum Direction {
		X, Y
	}

	private String name;
	private int x;
	private int y;
	
	//Initializaton 
	
	{
		name = "This is default point";
		
		Random random = new Random();
		int randomValue = random.nextInt();
		
		if(randomValue%2 == 0) 
			x = x + randomValue;
		else
			y = y + randomValue;
	}
	
	//Initializaton 


	//this kullanılan constructorlar
	public Point(int x, int y, String name) {

		this.name = name;
		this.x = x;
		this.y = y;
	}

	public Point(int y) {
		this(0, 1, "");
	}

	public Point(int x, String name) {
		this(2, 0, "My First Point");
	}

	public Point(int x, int y) {
		this(3,3,"");
	}

	public Point(String name) {
		this(0, 0, "My Second Point");
	}
	
	//this kullanılan constructorlar
	
	//getter&setter
	public int getX() {
		return x;
	}

	public void setX(int newValue) {
		this.x = newValue;
	}

	public int getY() {
		return y;
	}

	public void setY(int newValue) {
		this.y = newValue;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//getter&setter
	

	//methods
	public double fromOrigin() {
		int a = (this.x * this.x) + (this.y * this.y);
		return Math.sqrt(a);
	}

	public double fromAPoint(Point value) {

		double a = Math.pow((value.x - this.x), 2);
		double b = Math.pow((value.y - this.y), 2);
		return Math.sqrt(b + a);
	}

	public Point clone(int x, int y) {
		return new Point(x, y);
	}
	

	public void move(Direction direction, int value) {
		switch (direction) {
		case X:
			this.x = this.x + value;
			break;
		case Y:
			this.y = this.y + value;
			break;

		}
	//methods
	}
}


