package com.example.javaproject2.codeup.Q_1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(br.readLine());

        System.out.printf("%.11f", d);
    }
}
