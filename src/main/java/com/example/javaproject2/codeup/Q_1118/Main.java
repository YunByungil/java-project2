package com.example.javaproject2.codeup.Q_1118;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        float num1 = Float.parseFloat(st.nextToken());
        float num2 = Float.parseFloat(st.nextToken());

        System.out.printf("%.1f", (num1 * num2) / 2);
    }
}
