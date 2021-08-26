package com.bridgelabz;


public class Line {

	final Point firstPoint, secondPoint;

	public Line(double x1, double y1, double x2, double y2) {
		this.firstPoint = new Point(x1, y1);
		this.secondPoint = new Point(x2, y2);
	}
}