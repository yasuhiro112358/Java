package src;

public class MyApp2 {
    public static void main(String[] args) {
        String firstName = "Yasuhiro";
        String lastName = "WATANABE";

        System.out.println("I'm " + firstName + " " + lastName + ".");
        System.out.println(String.format("I'm %s %s", firstName, lastName));
    }
}