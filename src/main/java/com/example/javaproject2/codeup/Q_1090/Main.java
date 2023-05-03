package com.example.javaproject2.codeup.Q_1090;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken()); // 시작 값
        long r = Integer.parseInt(st.nextToken()); // 등비의 값
        long n = Integer.parseInt(st.nextToken()); // 몇 번째의 수
        long count = 0;
        for (long i = a; i <= Long.MAX_VALUE; i *= r) {
            count++;
            if (count == n) {
                System.out.println(i);
                break;
            }
        }
    }
}
