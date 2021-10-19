package org.hyperskill.projects.steps;

/* *
 * a, e, i, o, u
 */

import java.util.Scanner;

public class VowelOrNot {
	public static boolean isVowel(char ch) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char letter : vowels) {
        	if (ch == letter) {
        		return true;
        	}
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
