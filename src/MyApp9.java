
package src; // package declaration

public class MyApp9 {
    public static void main(String[] args) {
        double money = 1_000_000.0;
        int year = 0;

        while (money < 2_000_000)  {
            money *= 1.05;
            year++;
            System.out.println(String.format("Year: %d, Money: %.2f", year, money));
        }
    }
}