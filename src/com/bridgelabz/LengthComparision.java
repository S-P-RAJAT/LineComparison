package com.bridgelabz;

import java.util.Scanner;

public class LengthComparision {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for first Line x1, y1, x2, y2:");
		Line firstLine = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter the value for first Line X1, Y1, X2, Y2:");
		Line secondLine = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		LengthCalculatorIF lengthCalculator = new LengthCalculatorImpl();
		LengthComparatorIF lengthComparator = new LengthComparatorImpl();

		// Use case - 1
		double lengthOfFirstLine = lengthCalculator.calculateLengthOfLine(firstLine);
		double lengthOfSecondLine = lengthCalculator.calculateLengthOfLine(secondLine);
		System.out.println("Length of Line1: " + lengthOfFirstLine + "\tLength of Line2: " + lengthOfSecondLine);

		// Use case - 2
		lengthComparator.equals(firstLine,secondLine);

		// Use case - 3
		lengthComparator.compareTo(firstLine,secondLine);

	}
}
