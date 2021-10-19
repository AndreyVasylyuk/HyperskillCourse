package org.hyperskill.projects.steps;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (twoSidesLongerThanOne(a, b, c) && twoSidesLongerThanOne(b, c, a) && twoSidesLongerThanOne(c, a, b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		/* Simple variant */
		/*
		 * if (a + b > c && a + c > b && c + b > a) {
		 * 		System.out.println("YES"); 
		 * } else { 
		 * 		System.out.println("NO");
		 * }
		 */

	}

	public static boolean twoSidesLongerThanOne(int a, int b, int c) {
		return a + b > c;
	}

}
