package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testEqualsSum() {
			assertEquals(4, Calculator.sum(2, 2));
			assertEquals(-4, Calculator.sum(-2, -2));
			assertEquals(0, Calculator.sum(0, 0));
			assertNotEquals(9, Calculator.sum(3, 7));
			System.out.println("Sum");
	}
	@Test
	void testEqualsSub() {
		assertEquals(0, Calculator.sub(2, 2));
		assertEquals(-4, Calculator.sub(-6, -2));
		assertEquals(0, Calculator.sub(0, 0));
		assertNotEquals(-5, Calculator.sub(3, 7));
		assertTrue(6 == Calculator.sub(9, 3));
		System.out.println("Sub");
		
	}
	@Test
	void testEqualsMul() {
		assertEquals(-12, Calculator.mul(-6, 2));
		assertEquals(0, Calculator.mul(0, 9));
		assertNotEquals(15, Calculator.mul(3, 6));
		assertTrue(9 == Calculator.mul(3, 3));
		System.out.println("Mul");
		
	}
	@Test
	void testEqualsDiv() {
		assertEquals(3, Calculator.div(9, 3));
		assertEquals(0, Calculator.div(0, 9));
		assertEquals(2.5, Calculator.div(5, 2));
		assertThrows(IllegalArgumentException.class,
	                () -> Calculator.div(5, 0));
		assertTrue(1 == Calculator.div(3, 3));
		System.out.println("Div");
		
	}

}
