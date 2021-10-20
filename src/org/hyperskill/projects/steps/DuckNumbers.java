package org.hyperskill.projects.steps;

import java.util.Scanner;

public class DuckNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		System.out.print("> ");
		int number = scanner.nextInt();

		if (number <= 0) {
			System.out.println("This number is not natural!");
		} else {
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
		}

	}

}
