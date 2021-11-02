package org.hyperskill.projects.steps;

import java.util.Scanner;

public class NextEvenNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		int outputEvenNumber = inputNumber % 2 == 0 ? inputNumber + 2 : inputNumber + 1;
		System.out.println(outputEvenNumber);
	}
}
