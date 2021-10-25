package org.hyperskill.projects.steps;

import java.util.*;

/*
 * Future Value - to find in n years, i - annually interest rate.
 * FV = PV (1 +i)^n
 * PV = FV / (1 + i)^n
 * 
 */

public class FutureValueOfMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double M = scanner.nextDouble();
		double P = scanner.nextDouble();
		double K = scanner.nextDouble();
		int n = 0;
		

		while (M <= K) {
			if (K == M) {
				break;
			} else {
				M = M + M * P / 100;
				n++;
			}
		}
		System.out.println(n);
	}

}
