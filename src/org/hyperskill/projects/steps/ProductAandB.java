package org.hyperskill.projects.steps;

import java.util.Scanner;

public class ProductAandB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		long product = 1;
		for (; number1 < number2; number1++) {
			product *= number1;
		}
		System.out.println(product);


	}

}
