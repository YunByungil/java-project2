package com.example.javaproject2.codeup.Q_1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int f = br.readLine().charAt(0);
        for (int i = 'a'; i <= f; i++) {
            System.out.println((char) i);
        }
    }
}
