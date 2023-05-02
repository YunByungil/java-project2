package com.example.javaproject2.codeup.Q_1086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        System.out.printf("%.2f MB", (w * h * b) / 8 / 1024 / 1024);

    }
}
