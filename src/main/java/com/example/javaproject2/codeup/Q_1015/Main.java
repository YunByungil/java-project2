package com.example.javaproject2.codeup.Q_1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float num = Float.parseFloat(br.readLine());
        System.out.printf("%.2f", num);

    }
}
