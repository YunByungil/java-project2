package com.example.javaproject2.codeup.Q_1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char a = st.nextToken().charAt(0);
        char b = st.nextToken().charAt(0);

        System.out.println(b + " " + a);
    }
}
