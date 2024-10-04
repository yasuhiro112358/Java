
package src; // package declaration

import java.util.Scanner; // input from console

public class MyApp6 {
    public static void main(String[] args) {
        System.out.print("Please input a signal: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String signal = scanner.next();

            switch (signal) {
                case "red":
                    System.out.println("Stop");
                    break;
                case "yellow":
                    System.out.println("Slow down");
                    break;
                case "green":
                case "blue":
                    System.out.println("Go");
                    break;
                default:
                    System.out.println("Wrong signal");
                    break;
            }
        }
    }
}