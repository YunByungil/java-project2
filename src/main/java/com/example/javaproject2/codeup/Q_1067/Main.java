package com.example.javaproject2.codeup.Q_1067;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        if (num1 > 0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }

        if (num1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}