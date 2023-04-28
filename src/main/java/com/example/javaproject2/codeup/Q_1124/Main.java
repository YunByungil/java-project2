package com.example.javaproject2.codeup.Q_1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int index = str.indexOf("H");

        int a = Integer.parseInt(str.substring(1, index));
        int b = Integer.parseInt(str.substring(index + 1, str.length()));

        System.out.println((12 * a) + b);

    }
}
