package org.hyperskill.projects.steps;

import java.util.Scanner;
class IntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int barrier = 1000;
        int sum = 0;
        
        while (scanner.hasNext()) {
            int current = scanner.nextInt();
            if (current == 0) {
            	System.out.println(sum);
            	break;
            }
            
            sum += current;
            
            if (sum >= barrier) {
                System.out.println(sum - barrier);
                break;
            } 
        }
        
    }
}