package src; // package declaration

// import java.util.Scanner; // import statement

public class MyApp14 {
    public static void main(String[] args) {
        User user1 = new User("Alice", new Score("Math", 70));
        User user2 = new User("Bob", new Score("English", 80));
        User.showUserCount();

        user1.showInfo();

        // user2.setScore(120);
        // user2.setScore(59);
        user2.showInfo();
    }
}