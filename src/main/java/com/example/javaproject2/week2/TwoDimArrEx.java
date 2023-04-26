package com.example.javaproject2.week2;

import java.util.Arrays;

public class TwoDimArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;
        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
