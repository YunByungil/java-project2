package com.example.javaproject2.codeup.Q_1367;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "*";
        }
        for (int i = 0; i < n; i++) {
            for (int j = count; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print(str);
            count++;
            System.out.println();
        }
    }
}
