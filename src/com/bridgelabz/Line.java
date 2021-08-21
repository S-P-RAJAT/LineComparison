package com.bridgelabz;

public class Line {
	double x1, y1, x2, y2;

	class Point {
		double x;
		double y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	Point p1, p2;

	public Line(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	public double getLength() {
		return Math.round(Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)) * 1000000d) / 1000000d;
	}

	

	public static void main(String[] args) {
		Line L1 = new Line(-7, -4, 17, 6.5);
		Line L2 = new Line(17, 6.5, -7, -4);
		
		System.out.println("Welcome to Line Comparison Computation Program\n");
		
		// Use case - 1
		System.out.println("Length of Line 1 = " + L1.getLength() + "\t" + "Length of Line 2 = " + L2.getLength());
		System.out.println();
		
		// Use case - 2
		Double len1 = L1.getLength();
		Double len2 = L2.getLength();

		// Inbuilt function equals()
		boolean result1 = len1.equals(len2);;
		if (result1 == true) {
			System.out.println("Length of Line 1 is equal to Line 2.");
		} else {
			System.out.println("Length of Line 1 is not equal to Line 2.");
		}
	}
}