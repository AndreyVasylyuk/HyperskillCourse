package org.hyperskill.projects.steps;

import java.util.Scanner;

public class Desks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int group1 = scanner.nextInt();
		int group2 = scanner.nextInt();
		int group3 = scanner.nextInt();
		
//		int desksToBuy = (int)(Math.round(group1 / (double) 2)) + (int)(Math.round(group2 / (double) 2))
//				+ (int)(Math.round(group3 / (double) 2));
//		
//		System.out.println(desksToBuy);
		
		 int forGroup1 = group1 / 2 + group1 % 2;
		 int forGroup2 = group2 / 2 + group2 % 2;
		 int forGroup3 = group3 / 2 + group3 % 2;
		 
		 System.out.println(forGroup1 + forGroup2 + forGroup3);
		 
		 
		
		
	}

}
