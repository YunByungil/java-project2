package com.example.javaproject2.codeup.Q_1041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.readLine().charAt(0) + 1;

        System.out.println((char) n);
    }
}
