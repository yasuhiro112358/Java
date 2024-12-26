package com.nabeyasu.myapp14;

public class User implements Loggable {
    private String name; // field, instance variable
    private Score score; // field, instance variable
    private static int count = 0; // class variable

    // constructor
    User(String name, Score score) {
        this.name = name;
        this.score = score;
        this.log();
        User.count++;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        this.score.setScore(score);
    }

    // instance method
    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Subject: " + this.score.getSubject());
        System.out.println("Score: " + this.score.getScore());
        System.out.println("Result: " + this.score.getResult());
    }

    // class method
    public static void showUserCount() {
        System.out.println("User count: " + User.count);
    }

    @Override
    public void log() {
        System.out.println("Instance created: " + this.name);
    }
}
