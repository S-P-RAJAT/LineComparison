package com.bridgelabz;

public class LengthCalculatorImpl implements LengthCalculatorIF{

	@Override
	public double calculateLengthOfLine(Line line) {
		return Math.round(Math.sqrt(Math.pow(line.secondPoint.getXCoordinate() - line.firstPoint.getXCoordinate(), 2) + Math.pow(line.secondPoint.getYCoordinate() - line.firstPoint.getYCoordinate(), 2)) * 1000000d) / 1000000d;
	}
}
