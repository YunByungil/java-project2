package com.example.javaproject2.codeup.Q_1099;

import java.util.*;
import java.io.*;

public class Main {
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[11][11];
        for (int i = 1; i < 11; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 11; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs();

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dfs() {
        if (arr[2][2] == 2) {
            arr[2][2] = 9;
            return;
        }
        arr[2][2] = 9;
        int s = 2;
        int start = 3;
        for (int i = s; i <= s; i++) {
            if (s > 10) {
                break;
            }
            for (int j = start; j <= 10; j++) {
                if (arr[i][j] == 2) {
                    arr[i][j] = 9;
                    break;
                }
                if (arr[i][j] == 0) {
                    start = j;
                    arr[i][j] = 9;
                } else {
                    s++;
                    break;
                }
            }
        }
    }
}
