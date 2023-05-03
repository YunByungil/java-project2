package com.example.javaproject2.week3;

public class IsPrimeDivide2 {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }
}
