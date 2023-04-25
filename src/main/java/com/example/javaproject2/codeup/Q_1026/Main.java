package com.example.javaproject2.codeup.Q_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(":");

        System.out.println(Integer.parseInt(strArr[1]));
    }
}
