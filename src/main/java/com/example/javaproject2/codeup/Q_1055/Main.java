package com.example.javaproject2.codeup.Q_1055;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        if (num1 == 1 || num2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
