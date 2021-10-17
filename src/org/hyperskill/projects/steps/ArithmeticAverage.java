package org.hyperskill.projects.steps;

import java.util.Scanner;

public class ArithmeticAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int leftEdge = scanner.nextInt();
		int rightEdge = scanner.nextInt();
		double sumNumbersDivisBy3 = 0;
		int quantytyNumbersDivBy3 = 0;
		double average = 0;

		for (int i = leftEdge; i <= rightEdge; i++) {
			if (i % 3 == 0) {
				sumNumbersDivisBy3 += i;
				quantytyNumbersDivBy3++;
			}
		}
		average = sumNumbersDivisBy3 / quantytyNumbersDivBy3;
		System.out.println(average);
	}

}
