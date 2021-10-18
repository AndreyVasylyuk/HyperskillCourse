package org.hyperskill.projects.steps;

import java.util.Scanner;

public class RangeSum {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		int from = scanner.nextInt();
		int to = scanner.nextInt();

		System.out.println(sumInRange(from, to));
	}

	public static long sumInRange(int from, int to) {
		if (from > to)
			return 0;
		long sum = 0;
		for (int i = from; i < to; i++) {
			if (i == from) {
				sum = from;
				continue;
			}
			sum += i;
		}
		return sum;
	}
}