package org.hyperskill.projects.steps;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("true,true,true gives: ");
		System.out.println(check(true, true, true));

		System.out.print("true,false,true gives: ");
		System.out.println(check(true, false, true));

		System.out.print("true,true,false gives: ");
		System.out.println(check(true, true, false));

		System.out.print("true,false,false gives: ");
		System.out.println(check(true, false, false));

		System.out.print("false,true,true gives: ");
		System.out.println(check(false, true, true));

		System.out.print("false,true,false gives: ");
		System.out.println(check(false, true, false));

		System.out.print("false,false,true gives: ");
		System.out.println(check(false, false, true));

		System.out.print("false,false,false gives: ");
		System.out.println(check(false, false, false));

	}

	public static boolean check(boolean b1, boolean b2, boolean b3) {
		return (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
	}

}
