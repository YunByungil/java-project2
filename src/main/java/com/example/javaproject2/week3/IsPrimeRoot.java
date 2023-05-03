package com.example.javaproject2.week3;

public class IsPrimeRoot {
    public static void main(String[] args) {
        int num = 15;
        int count = 0;
        for (int i = 2; i * i <= num; i++) {
            System.out.println("i = " + i);
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
