package src; // package declaration

// import java.util.Scanner; // import statement

public class MyApp11 {
    private static int triple(int number) {
        return number * 3;
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static void showSum(int a, int b) {
        System.out.println(sum(a, b));
    }

    public static void main(String[] args) {
        System.out.println(triple(20));
        System.out.println(triple(19));
        System.out.println(triple(18));
        System.out.println(triple(17));
        System.out.println(triple(16));

        System.out.println(sum(3, 7));
        showSum(3, 7);
    }
}