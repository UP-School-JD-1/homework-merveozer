package org.merveozer.oopjhomework.week8.Q3;

public class Point {

	enum Direction {
		X, Y
	}

	private int x;
	private int y;

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

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
	}
}
