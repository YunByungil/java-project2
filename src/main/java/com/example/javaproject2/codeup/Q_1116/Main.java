package com.example.javaproject2.codeup.Q_1116;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
        System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
        System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
        System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
    }
}
