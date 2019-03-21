package javaAndOOP.square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testGetArea() {
		Square square = new Square();
		square.setSide(10.0);
		double result = square.getArea();
		assertEquals(100.0, result, 0.1);
	}

}
