package com.osmaga.HelloMaven;

/**
 * Hello Maven!
 *
 */
public class App {
	public static void main(String[] args) {
		long testNumber =  5;
		
		App obj = new App();
		System.out.println(String.format("Factorial de %d : %d", testNumber, obj.calculateFactorial(testNumber)));
	}

	public long calculateFactorial(long number) {
		if (number == 0) {
			return 1;
		}
		return number * calculateFactorial(--number);
	}
}
