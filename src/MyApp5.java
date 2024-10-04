package src; // package declaration

import java.util.Scanner; // input from console

public class MyApp5 {
    public static void main(String[] args) {
        System.out.print("Please input a signal: ");
        String signal = new Scanner(System.in).next();

        if (signal.equals("red") == true) {
            System.out.println("Stop");
        } else {
            System.out.println("Not red");
        }
    }
}