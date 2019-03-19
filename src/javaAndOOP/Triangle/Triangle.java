package javaAndOOP.Triangle;

import javaAndOOP.AbstractShape;

public class Triangle extends AbstractShape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		
		return width / 2 * height;
	}

}
