package org.hyperskill.projects.steps;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int daysToGetTop = 0;
		int sumToTop = 0;

		int[] feets = new int[3];
		feets[0] = scanner.nextInt();
		feets[1] = scanner.nextInt();
		feets[2] = scanner.nextInt();

		while (feets[0] > sumToTop) {
			if ((sumToTop + feets[1]) >= feets[0]) {
				daysToGetTop++;
				break;
			}
			sumToTop += feets[1] - feets[2];
			daysToGetTop++;
		}
		System.out.println(daysToGetTop);
	}
}
