package com.example.javaproject2.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinuteSecond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int minute = n / 60;
        int second = n % 60;
        System.out.println(minute + "분 " + second + "초");
    }
}
