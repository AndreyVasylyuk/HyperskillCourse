package org.hyperskill.projects.steps;

import java.util.Scanner;

/*
 * System.out.println(Integer.MAX_VALUE) gives 2147483647
 * System.out.println(Integer.MIN_VALUE) gives -2147483648
 */

public class BoxingUnboxing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
	}
	
	public static int convert(Long val) {
        // write your code here
        if (val == null) {
            return 0;
        } else if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }
    }

}
