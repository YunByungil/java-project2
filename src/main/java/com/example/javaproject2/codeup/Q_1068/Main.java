package com.example.javaproject2.codeup.Q_1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if (score / 10 >= 9) {
            System.out.println("A");
        } else if (score / 10 >= 7) {
            System.out.println("B");
        } else if (score / 10 >= 4) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }


    }
}
