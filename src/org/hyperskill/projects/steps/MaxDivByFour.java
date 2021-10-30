package org.hyperskill.projects.steps;

import java.util.Scanner;

public class MaxDivByFour {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int countNumbers = scanner.nextInt();

		while (countNumbers > 0) {
			int current = scanner.nextInt();
			if (current % 4 == 0 && current > max) {
				max = current;
			}
			countNumbers--;
		}
		System.out.println(max);
	}
}
