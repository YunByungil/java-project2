package com.example.javaproject2.codeup.Q_1053;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
