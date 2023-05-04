package com.example.javaproject2.codeup.Q_1097;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[20][20]; // 바둑판


        StringTokenizer st;
        for (int i = 1; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 20; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//         for (int i = 1; i < 20; i++) {
//             for (int j = 1; j < 20; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }


        int n = Integer.parseInt(br.readLine()); // 십자 뒤집기 횟수
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = 1; j < 20; j++) {
                if (arr[a][j] == 0) {
                    arr[a][j] = 1;
                } else {
                    arr[a][j] = 0;
                }
            }

            for (int j = 1; j < 20; j++) {
                if (arr[j][b] == 0) {
                    arr[j][b] = 1;
                } else {
                    arr[j][b] = 0;
                }
            }
        }


        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
