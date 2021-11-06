package org.hyperskill.projects.steps;

import java.util.Scanner;

public class NumOfDigits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfNumbers = number / 100 + number / 10 % 10 + number % 10;
        System.out.println(sumOfNumbers);
    }
}
