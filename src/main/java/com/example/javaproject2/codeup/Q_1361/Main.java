package com.example.javaproject2.codeup.Q_1361;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = "";
        for (int i = 0; i < n; i++) {
            System.out.print(str);
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
            }
            System.out.println();
            str += " ";
        }
    }
}
