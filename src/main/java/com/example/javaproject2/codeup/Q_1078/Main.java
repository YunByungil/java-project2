package com.example.javaproject2.codeup.Q_1078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
