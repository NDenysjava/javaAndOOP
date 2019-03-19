package javaAndOOP.Circle;

import javaAndOOP.AbstractShape;

public class Circle extends AbstractShape {
	private double radius;

	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {

		return Math.PI * radius *radius;
	}

}
