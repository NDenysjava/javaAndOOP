package javaAndOOP.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
	
	void testGetArea() {
		
		Triangle triangle = new Triangle();
		triangle.setHeight(4.0);
		triangle.setWidth(10.0);
		double result = triangle.getArea();
		assertEquals(20.0, result, 0.1);
	}
}
