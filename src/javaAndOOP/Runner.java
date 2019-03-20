package javaAndOOP;
import java.util.logging.Logger;

import javaAndOOP.circle.Circle;
import javaAndOOP.square.*;
import javaAndOOP.triangle.*;

public class Runner {

	private static Logger logger = Logger.getLogger(Runner.class.getName());
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(5);
		logger.info("the area of the circle is " + circle.getArea());
		
		Square square = new Square();
		square.setSide(2.5);
		logger.info("the area of ​​the square is " + square.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setWidth(28);
		triangle.setHeight(12.6);
		logger.warning("the area of ​​the triangle is equal to " + triangle.getArea());
		
		
		

	}

}
