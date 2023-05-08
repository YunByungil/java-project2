package com.example.javaproject2.week4;

public class Pyramid {
    public static void main(String[] args) {
        int n = 4; // 높이가 4인 피라미드

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("0");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // i = 0, j(공백) = 3, k(별개수) = 1, k의 개수 = 2n + 1 -> 피라미드

    }
}
