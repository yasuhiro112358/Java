package src; // package declaration

import java.util.Scanner; // import statement

public class MyApp10 {
    public static void main(String[] args) {
        final String PASSWORD = "password";
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter password: ");
                input = scanner.next();
                if (input.equals(PASSWORD)) {
                    break;
                } else {
                    System.out.println("Incorrect password, try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.next(); // clear the invalid input
            }
        }

        System.out.println("Password matched");
        scanner.close();
    }
}