package com.example.javaproject2.codeup.Q_1087;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            num += i;
            if (num >= n) {
                break;
            }
        }

        System.out.println(num);
    }
}
