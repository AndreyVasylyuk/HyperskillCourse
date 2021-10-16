package org.hyperskill.projects.steps;

import java.util.Scanner;
import static java.lang.Math.*;

public class AreaFloorSpace {
	public static void main(String[] args) {
        double area = 0;
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double s = (a + b + c) / 2;
                area = sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                double n = scanner.nextInt();
                double m = scanner.nextInt();
                area = n * m;
                break;
            case "circle":
                double r = scanner.nextInt();
                area = 3.14 * r * r;
                break;
        }
        System.out.println(area);
    }
}
