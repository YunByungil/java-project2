package com.example.javaproject2.codeup.Q_1038;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long num1 = Long.parseLong(st.nextToken());
        Long num2 = Long.parseLong(st.nextToken());

        Long result = num1 + num2;
        System.out.println(result);
    }
}
