package com.example.javaproject2.codeup.Q_1091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 시작 값
        int m = Integer.parseInt(st.nextToken()); // 곱할 값
        int d = Integer.parseInt(st.nextToken()); // 더할 값
        int n = Integer.parseInt(st.nextToken()); // 몇 번째의 수
        long count = 0;
        for (long i = a; i <= Long.MAX_VALUE; i+= d) {
            count++;

            if (count == n) {
                System.out.println(i);
                break;
            }
            i *= m;
        }
    }
}
