package com.example.javaproject2.week3;

import java.util.LinkedList;

public class For {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < num.length; i+=2) {
            System.out.println("홀수: " + num[i]);
        }
    }
}
