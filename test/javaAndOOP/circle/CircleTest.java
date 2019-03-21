package javaAndOOP.circle;

import static org.junit.Assert.assertEquals;

public class CircleTest {
	
	void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(2.0);
		double result = circle.getArea();
		assertEquals(12.56, result, 0.1);
		
	}
}
