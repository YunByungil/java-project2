package com.example.javaproject2.codeup.Q_1071;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = 0;
        do {
            a = Integer.parseInt(st.nextToken());
            if (a != 0) {
                System.out.println(a);
            }
        } while (a != 0);
    }
}
