package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTest {
	@BeforeAll
	static void setBefore() {
	 System.out.println("Before all");
	}
	@BeforeEach
	void setUp() {
		System.out.println("@Before each");
	}
	@AfterEach
	void tearDown() {
		System.out.println("After Each");
	}
	@AfterAll
	static void testAfterAll() {
		System.out.println("After all");
	}
	

	@Test
	 void testEquals() {
		assertEquals(4, 2 + 2);
		assertNotEquals(4, 3+2);
		System.out.println("equals");
	}
	@Test
	void testEqualsDouble() {
		double x = 2.51;
		double y = 2.5;
		
		assertEquals(x, y, 0.01); 
		assertNotEquals(x, y, 0.001); 
		System.out.println("double");
	
	}
	@Test
	void testBoolean() {
		assertTrue(2 + 2 == 4);
		assertFalse(2 + 2 != 4);
		System.out.println("boolean");
	}
	@Test
	void testNull() {
		assertNull(null);
		assertNotNull("hello");
		System.out.println("null");
	}
	@Test
	void testSame() {
		String str = new String("hello");
		String str1 = new String("hello");
		String str3 = str;
		assertSame(str, str3);
		assertNotSame(str, str1);
		System.out.println("referrecense");
		
	}
	@Test
	void testArray_() {
		int[]arr1 = {1,2,3,4,5};
		int[]arr2 = {1,2,3,4,5};
		assertEquals(arr2.length, arr1.length);
		assertArrayEquals(arr2, arr1);
		System.out.println("arrays");
	}
	@Test
	void testVoid() {
		System.out.println("Void method");
	}

}
