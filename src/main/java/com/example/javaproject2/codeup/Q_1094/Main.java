package com.example.javaproject2.codeup.Q_1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            arr[i] = m;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
