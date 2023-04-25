package com.example.javaproject2.codeup.Q_1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split("\\.");
        System.out.printf("%04d", Integer.parseInt(strArr[0]));
        System.out.printf(".%02d", Integer.parseInt(strArr[1]));
        System.out.printf(".%02d", Integer.parseInt(strArr[2]));
    }
}
