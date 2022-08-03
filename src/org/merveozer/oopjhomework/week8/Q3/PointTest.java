package org.merveozer.oopjhomework.week8.Q3;

import org.merveozer.oopjhomework.week8.Q3.Point.Direction;

public class PointTest {

	public static void main(String[] args) {

		Point point1 = new Point(5, 12);
		Point point2 = new Point(3, 4);

		System.out.println(point1.getX());

		System.out.println(point2.getY());

		point1.fromOrigin();
		System.out.println(point1.fromOrigin());
		point2.fromOrigin();
		System.out.println(point2.fromOrigin());
		point1.fromAPoint(point2);
		System.out.println(point1.fromAPoint(point2));
		Point point3 = point1.clone(7, 24);
		System.out.println(point3.getX() + point3.getY());
		point3.move(Direction.X, 3);
		System.out.println(point3.getX() + point3.getY());
	}

}
