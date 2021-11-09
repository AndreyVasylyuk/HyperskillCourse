package org.hyperskill.projects.steps;

import java.util.Scanner;

public class PalindromicNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Amazing Numbers!");
		System.out.println();
		System.out.println("Supported requests:");
		System.out.println("- enter a natural number to know its properties;");
		System.out.println("- enter 0 to exit.");
		System.out.println();

		while (true) {
			System.out.print("Enter a request: > ");
			
			long number = scanner.nextLong();

			if (number == 0) {
//				System.out.println("This number is not natural!");
				break;
			} else if (number < 0) {
				System.out.println();
				System.out.println("The first parameter should be a natural number or zero.");
				System.out.println();
			} else {
				System.out.println();
				System.out.println("Properties of " + number);
				if (number % 2 == 0) {
					System.out.println("        even: true");
					System.out.println("         odd: false");
				} else {
					System.out.println("        even: false");
					System.out.println("         odd: true");
				}

				if (number % 10 == 7 || number % 7 == 0) {
					System.out.println("        buzz: true");
				} else {
					System.out.println("        buzz: false");
				}

				String stringNumber = number + "";
				int zeroes = 0;

				for (int i = 0; i < stringNumber.length(); i++) {
					if (stringNumber.charAt(i) == '0') {
						zeroes++;
					}
				}

				if (zeroes > 0 && stringNumber.charAt(0) != 0) {
					System.out.println("        duck: true");
				} else {
					System.out.println("        duck: false");
				}

				// Palindromic block
				if (isPalindromicNumber(number)) {
					System.out.println(" palindromic: true");
				} else {
					System.out.println(" palindromic: false");
				}
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Goodbye!");
	}

	public static boolean isPalindromicNumber(long number) {
		long temp = number;
		long sum = 0;
		long r = 0;
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}
}
