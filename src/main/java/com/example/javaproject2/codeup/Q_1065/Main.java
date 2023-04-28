package com.example.javaproject2.codeup.Q_1065;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        if (num1 % 2 == 0) {
            System.out.println(num1);
        }
        if (num2 % 2 == 0) {
            System.out.println(num2);
        }
        if (num3 % 2 == 0) {
            System.out.println(num3);
        }

    }
}
