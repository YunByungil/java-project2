package com.example.javaproject2.codeup.Q_1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] date2 = date.split(":");
        int hour = Integer.parseInt(date2[0]);
        int min = Integer.parseInt(date2[1]);

        System.out.printf("%d:%d", hour, min);
    }
}
