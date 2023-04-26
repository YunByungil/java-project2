package com.example.javaproject2.week2;

public class ModEx {
    public static void main(String[] args) {
        int n = 687;
        int first = n % 10;
        int sec = first % 10;
        int third = sec % 10;

        System.out.println(first + sec + third);
    }
}
