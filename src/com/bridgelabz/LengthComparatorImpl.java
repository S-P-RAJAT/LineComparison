package com.bridgelabz;

public class LengthComparatorImpl implements LengthComparatorIF {
	LengthCalculatorIF lengthCalculator = new LengthCalculatorImpl();

	@Override
	public void equals(Line firstLine, Line secondLine) {
		// Use case - 1
		Double lengthOfFirstLine = lengthCalculator.calculateLengthOfLine(firstLine);
		Double lengthOfSecondLine = lengthCalculator.calculateLengthOfLine(secondLine);

		// Inbuilt function equals()
		if (lengthOfFirstLine.equals(lengthOfSecondLine)) {
			System.out.println("Length of Line 1 is equal to Line 2.");

		} else {
			System.out.println("Length of Line 1 is not equal to Line 2.");

		}
	}

	@Override
	public void compareTo(Line firstLine, Line secondLine) {
		Double lengthOfFirstLine = lengthCalculator.calculateLengthOfLine(firstLine);
		Double lengthOfSecondLine = lengthCalculator.calculateLengthOfLine(secondLine);

		// Inbuilt function compareTo()
		if (lengthOfFirstLine.compareTo(lengthOfSecondLine) == 0) {
			System.out.println("Length of Line 1 is equal to Line 2.");

		} else if (lengthOfFirstLine.compareTo(lengthOfSecondLine) > 0) {
			System.out.println("Line 1 is longer than Line 2.");

		} else {
			System.out.println("Line 1 is smaller than Line 2.");
		}
	}

}
