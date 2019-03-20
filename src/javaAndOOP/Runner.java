package javaAndOOP;
import javaAndOOP.circle.Circle;
import javaAndOOP.square.*;
import javaAndOOP.triangle.*;

@SuppressWarnings("unused")
public class Runner {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(5);
		System.out.println("the area of the circle is " + circle.getArea());
		
		Square square = new Square();
		square.setSide(2.5);
		System.out.println("the area of ​​the square is " + square.getArea());
		
		Triangle triangle = new Triangle();
		triangle.setWidth(28);
		triangle.setHeight(12.6);
		System.out.println("the area of ​​the triangle is equal to " + triangle.getArea());
		
		
		

	}

}
