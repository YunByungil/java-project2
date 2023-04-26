package com.example.javaproject2.week2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println(Arrays.toString(arr[5]));
        System.out.println(Arrays.toString(arr[6]));
        System.out.println(Arrays.toString(arr[7]));
        System.out.println(Arrays.toString(arr[8]));
        System.out.println(Arrays.toString(arr[9]));

        System.out.println("=========================================");

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}
