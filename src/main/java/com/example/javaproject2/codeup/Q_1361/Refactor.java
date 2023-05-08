package com.example.javaproject2.codeup.Q_1361;

public class Refactor {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
