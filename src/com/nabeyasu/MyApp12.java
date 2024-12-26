package com.nabeyasu; // package declaration

import java.util.Scanner; // import statement

public class MyApp12 {
    private static boolean isDividable(int dividend, int divisor) {
        if (divisor == 0) {
            return false;
        }

        if (dividend % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int dividend;
        int divisor;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please input a dividend: ");
            dividend = scanner.nextInt();
            System.out.print("Please input a divisor: ");
            divisor = scanner.nextInt();
        }

        if (isDividable(dividend, divisor)) {
            System.out.println("Dividable");
        } else {
            System.out.println("Not dividable");
        }
    }
}