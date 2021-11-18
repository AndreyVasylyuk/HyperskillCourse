package org.hyperskill.projects.steps;

/*
 * Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.


 Sample Input 1:

6
1 2 5 2 3 7
2

 */


import java.util.Scanner;

public class CountNumberOccurs {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int intToCount = scanner.nextInt();
        int counter = 0;
        
        for (int num : array) {
            if (num == intToCount) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
