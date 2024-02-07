package com.tnsif.dayforteen.exception;

import java.util.Scanner;

public class PercentageValidator {
	static float acceptNumber() {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextFloat()) {
			System.out.println("Invalid input. Please enter a valid integer:");
			sc.next(); // Discard non-integer input
		}
		int n = sc.nextInt();
		sc.close();
		return n;
	}

	static void isValidPercentage(float per) throws ArithmeticException {
		if (per >= 0 && per <= 100) {
			System.out.println("Valid percentage: " + per);
		} else {
			throw new ArithmeticException("Percentage should be between 0 and 100");
		}
	}

}
