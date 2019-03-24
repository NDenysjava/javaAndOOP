package javaAndOOP;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;

import javaAndOOP.Shape;
import javaAndOOP.circle.Circle;
import javaAndOOP.square.Square;
import javaAndOOP.triangle.Triangle;


public class RunnerPlus {
	
	 private static Logger logger = Logger.getLogger(RunnerPlus.class.getName());
	public static void main(String[] args) {
		
		
		 
		Circle circle77 = new Circle(2.0);
		Circle circle66 = new Circle(3.0);
		
		Triangle triangle77 = new Triangle(24.0 , 12.0);
		Triangle triangle66 = new Triangle(12.6 , 6.6);
		
		Square square77 = new Square(67.23);
		Square square66 = new Square(44.65);
		
		ArrayList <Shape> shaps = new ArrayList <Shape>();
		
		shaps.add(circle77);
		shaps.add(circle66);
		shaps.add(triangle77);
		shaps.add(triangle66);
		shaps.add(square77);
		shaps.add(square66);
						
		Shape minShape = shaps.get(0);
		Shape maxShape = shaps.get(0);
		
		for (Shape shape : shaps ) {
			if (maxShape.getArea() < shape.getArea()) {
				maxShape = shape;
			}
			
				if (minShape.getArea() > shape.getArea()) {
					minShape = shape;
				}
			
		}
		logger.info("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea() );
		logger.info("Min shape is " + minShape.getClass().getSimpleName() + " and has area " + minShape.getArea() );
		
	}

}
