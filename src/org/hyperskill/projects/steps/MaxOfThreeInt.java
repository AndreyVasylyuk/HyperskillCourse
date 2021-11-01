package org.hyperskill.projects.steps;

import java.util.Scanner;

public class MaxOfThreeInt {
	public static int getNumberOfMaxParam(int a, int b, int c) {
        int firstMax = Math.max(a, b);
        int highMax = Math.max(firstMax, c);
        if (a == highMax) {
            return 1;
        } else if (b == highMax) {
            return 2;
        } else if (c == highMax) {
            return 3;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
