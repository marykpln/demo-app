package demo;

public class Calculator {
	public static int sum(int x, int y) {
		return x + y;
	}
	public static int sub(int x, int y) {
		return x - y;
	}
	public static int mul(int x, int y) {
		return x * y;
	}
	public static int div(int x, int y) {
			if (y == 0) {
        throw new IllegalArgumentException("Division by zero");
    }
		return x / y;
	}


}
