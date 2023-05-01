package com.example.javaproject2.codeup.Q_1082;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine(), 16);
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", num1, i, (i * num1));
        }
    }
}
