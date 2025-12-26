package test;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import demo.DemoApp1;

class DemoApp1Test {
	int[]numbers = {10,20,30,40,50};
	int[]single = {100};
	int[]negative = {-10,-20,-30,-40,-50};
	int[]empty = {};


	@Test
	void testSumArrayPositiveCase() {
		assertEquals(150, DemoApp1.sumArray(numbers));
		assertEquals(100, DemoApp1.sumArray(single));
		assertEquals(-150, DemoApp1.sumArray(negative));
		assertEquals(0, DemoApp1.sumArray(empty));
	}

	@Test
	void testSumArrayNegativeCase() {
		assertThrows(NullPointerException.class, ()-> DemoApp1.sumArray(null));
		assertNotEquals(100, DemoApp1.sumArray(numbers));
		assertNotEquals(120, DemoApp1.sumArray(single));
		assertNotEquals(150, DemoApp1.sumArray(negative));
		assertNotEquals(100, DemoApp1.sumArray(empty));
	}
	void testAveragePositive() {
		double avg1 = DemoApp1.average(numbers);
		double avg2 = DemoApp1.average(single);
		double avg3 = DemoApp1.average(negative);
		assertEquals(30., avg1, 0.001);
		assertEquals(100., avg2, 0.001);
		assertEquals(-30., avg3, 0.001);
	}
	@Test
	void testAverageBug() {
	    assertEquals(30.0, DemoApp1.averageBug(numbers), 0.001);
	    assertEquals(100.0, DemoApp1.averageBug(single), 0.001);
	}


}
