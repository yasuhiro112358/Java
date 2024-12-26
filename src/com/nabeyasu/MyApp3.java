package com.nabeyasu;

public class MyApp3 {
    public static void main(String[] args) {
        // int[] scores; // Declare an array of int type
        // scores = new int[3]; // Create an array of int type with 3 elements
        // scores[0] = 70;
        // scores[1] = 90;
        // scores[2] = 80;
        
        int[] scores = {70, 90, 80};

        System.out.println(scores[0]); // 70
        System.out.println(scores[1]); // 90
        System.out.println(scores[2]); // 80

        scores[1] = 100;
        System.out.println(scores[1]); // 100

        System.out.println(scores.length); // 3
        
        // 2D array
        int[][] points = {
            {80, 90, 100}, // points[0]
            {70, 60, 50}, // points[1]
        };
        System.out.println(points[1][2]); // 50
    }
}