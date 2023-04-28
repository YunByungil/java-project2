package com.example.javaproject2.codeup.Q_1123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        float f = (9 / 5.0f) * n + 32.0f;
        System.out.printf("%.3f", f);

    }
}
