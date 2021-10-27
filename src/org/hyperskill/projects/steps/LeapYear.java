package org.hyperskill.projects.steps;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
		if (isLeap) {
			System.out.println("Leap");
		} else {
			System.out.println("Regular");
		}
	}
}
