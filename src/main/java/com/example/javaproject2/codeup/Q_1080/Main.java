package com.example.javaproject2.codeup.Q_1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        int n = 1;
        int count = 0;
        while (num > sum) {
            count++;
            sum += n;
            n++;
        }

        System.out.println(count);
    }
}
