package com.example.javaproject2.codeup.Q_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while (str.length() > 1) {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                num += str.charAt(i) - '0';
            }
            str = "" + num;
        }
        System.out.println(str);
    }
}
