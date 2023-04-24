package com.example.javaproject2.week2;

public class t {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2); // 1.52.5

        int result = Integer.parseInt(val1) + Integer.parseInt(val2);
        System.out.println("result = " + result); // NumberFormatException float or double로 바꿔야 함.
    }
}
