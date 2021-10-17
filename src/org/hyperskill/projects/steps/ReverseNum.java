package org.hyperskill.projects.steps;

import java.util.Scanner;

class ReverseNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int originalNum = scanner.nextInt();
		int firstDig = originalNum / 100;
		int secondDig = originalNum / 10 % 10;
		int thirdDig = originalNum % 10;

		if (thirdDig == 0 && secondDig == 0) {
			System.out.println("" + firstDig);
		} else if (thirdDig == 0) {
			System.out.println("" + secondDig + firstDig);
		} else {
			System.out.println("" + thirdDig + secondDig + firstDig);
		}
	}
}