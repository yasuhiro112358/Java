package com.nabeyasu; // package declaration

// import java.util.Scanner; // import statement

public class MyApp13 {
    private static void showSquare(int number) {
        double square = Math.pow(number, 2);
        System.out.println(square);
    }

    // Method overloading
    private static void showSquare(double number) {
        double square = Math.pow(number, 2);
        System.out.println(square);
    }

    public static void main(String[] args) {
        showSquare(3);
        showSquare(3.5);
    }
}