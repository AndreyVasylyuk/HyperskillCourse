package org.hyperskill.projects.steps;

/* 
 * Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains the elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.
 */

import java.util.Scanner;

public class SumArrayGreaterThenN {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        
        int n = scanner.nextInt();
        
        for (int num : array) {
            if (num > n) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
