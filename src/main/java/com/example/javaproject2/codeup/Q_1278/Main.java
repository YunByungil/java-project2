package com.example.javaproject2.codeup.Q_1278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}
