package com.bridgelabz;

class Point {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

public class Line {
	double x1, y1, x2, y2;

	private Point p1, p2;

	public Line(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	public double getLength() {
		return Math.round(Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)) * 1000000d) / 1000000d;
	}

	public boolean equals(Line L) {
		Double len1 = this.getLength();
		Double len2 = L.getLength();

		// Inbuilt function equals()
		return len1.equals(len2);
	}

	public int compareTo(Line L) {
		Double len1 = this.getLength();
		Double len2 = L.getLength();

		// Inbuilt function compareTo()
		return len1.compareTo(len2);
	}

	public static void main(String[] args) {
		Line L1 = new Line(-7, -4, 17, 6.5);
		Line L2 = new Line(17, 6.5, -7, -4);

		// Use case - 1
		System.out.println("Length of Line 1 = " + L1.getLength() + "\t" + "Length of Line 2 = " + L2.getLength());
		System.out.println();

		// Use case - 2
		boolean result1 = L1.equals(L2);
		if (result1 == true) {
			System.out.println("Length of Line 1 is equal to Line 2.");
			
		} else {
			System.out.println("Length of Line 1 is not equal to Line 2.");
			
		}

		// Use case - 3
		int result2 = L1.compareTo(L2);
		if (result2 == 0) {
			System.out.println("Length of Line 1 is equal to Line 2.");
			
		} else if (result2 > 0) {
			System.out.println("Line 1 is longer than Line 2.");

		} else {
			System.out.println("Line 1 is smaller than Line 2.");
		}
	}
}