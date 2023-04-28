package com.example.javaproject2.codeup.Q_1122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = n / 60;
        int sec = n % 60;

        System.out.printf("%d %d", min, sec);
    }
}
