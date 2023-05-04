package com.example.javaproject2.codeup.Q_1098;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] arr = new int[h + 1][w + 1]; // 격자판

        int n = Integer.parseInt(br.readLine()); // 막대의 개수

        for (int j = 0; j < n; j++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // 막대의 길이
            int d = Integer.parseInt(st.nextToken()); // 방향 (가로: 0, 세로: 1)
            int y = Integer.parseInt(st.nextToken()); // 좌표
            int x = Integer.parseInt(st.nextToken()); // 좌표


            if (d == 0) { // d == 0, 가로
                for (int k = x; k < x + i; k++) {
                    arr[y][k] = 1;
                }
            } else { // d == 1, 세로
                for (int k = y; k < y + i; k++) {
                    arr[k][x] = 1;
                }
            }

        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}