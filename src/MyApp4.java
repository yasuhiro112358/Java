package src; // package declaration

import java.util.Scanner; // input from console

public class MyApp4 {
    public static void main(String[] args) {
        System.out.print("Please input a score: ");
        int score = new Scanner(System.in).nextInt();

        if (score >= 90) {
            System.out.println("S");
        } else if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}