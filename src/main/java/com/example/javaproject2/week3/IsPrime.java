package com.example.javaproject2.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    public static void main(String[] args) throws IOException {
        int num = 6;
        int count = 0;
        for (int i = 2; i < num; i++) {
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
