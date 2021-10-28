package org.hyperskill.projects.steps;


import java.util.Arrays;

public class LongArray {

    public static void main(String[] args) {

        long[] longNumbers = new long[3];
        longNumbers[0] = 100_000_000_001L;
        longNumbers[1] = 100000000002L;
        longNumbers[2] = 100000000003L;

        System.out.println(Arrays.toString(longNumbers));
    }
}
